package org.omega.omegaerp.services;

import org.omega.omegaerp.dal.PrivilegeRepository;
import org.omega.omegaerp.dal.UserAccessMacRepository;
import org.omega.omegaerp.dal.UserRepository;
import org.omega.omegaerp.exception.UserNotLoggedException;
import org.omega.omegaerp.models.Privilege;
import org.omega.omegaerp.models.UserAccessMac;
import org.omega.omegaerp.session.UserSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;

import org.omega.omegaerp.models.User;

import java.util.List;
import java.util.Optional;

/**
 * Created by Kass on 12/26/2018.
 */
@Service
public class UserSessionService {

    private static final String USER_LOGIN_SESSION_NAME = "loggedUser";

    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    @Autowired
    private HttpSession httpSession;

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private UserAccessMacRepository userAccessMacRepository;

    @Autowired
    private PrivilegeRepository privilegeRepository;

    public UserSession getLoggedUser() {
        return (UserSession) httpSession.getAttribute(USER_LOGIN_SESSION_NAME);
    }

    public boolean isLoggedIn() {
        return null != httpSession.getAttribute(USER_LOGIN_SESSION_NAME);
    }

    public boolean login(String username, String password, String macAddess) {
        Optional<User> userOptional = userRepository.findByUsername(username);
        if (userOptional.isPresent()) {
            User user = userOptional.get();
            // TODO: check with hash encryption the password is correct
            if (user.getPassword().equals(password)) {
                List<UserAccessMac> userAccessMacs =
                        userAccessMacRepository.findByUserIdAndActive(user.getId(), true);
                if (userAccessMacs.isEmpty()) {
                    createSessionForUser(user);
                    return true;
                } else {
                    for (UserAccessMac mac : userAccessMacs) {
                        if (mac.equals(macAddess)) {
                            createSessionForUser(user);
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    private void createSessionForUser(User user) {
        UserSession userSession = new UserSession();
        userSession.setUser(user);
        // TODO: add more initialization action here
        httpSession.setAttribute(USER_LOGIN_SESSION_NAME, userSession);
    }

    public void logout() {
        httpSession.removeAttribute(USER_LOGIN_SESSION_NAME);
    }

    public boolean checkUserHasPrivilage(Integer privilegeId) {
        if ( !isLoggedIn() ) return false;
        Optional<Privilege> privilegeOptional = privilegeRepository.findById(privilegeId);
        if (privilegeOptional.isPresent()) {
            Privilege privilege = privilegeOptional.get();
            List<User> users = userRepository.findAllByPrivilegesContains(privilege);
            return !users.isEmpty();
        }
        return false;
    }

    public void mustLogIn() throws UserNotLoggedException {
        if(isLoggedIn()) return;
        throw new UserNotLoggedException();
    }
}
