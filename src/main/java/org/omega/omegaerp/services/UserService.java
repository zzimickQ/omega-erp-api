package org.omega.omegaerp.services;

import org.omega.omegaerp.dal.PrivilegeRepository;
import org.omega.omegaerp.dal.UserRepository;
import org.omega.omegaerp.models.Privilege;
import org.omega.omegaerp.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


/**
 * <h1>User Service</h1>
 * is responsible for the user entity manipulation with respect to the business logic of the system.
 * form those responsibilities here are a few
 * <ul>
 * <li>create user</li>
 * <li>delete user</li>
 * <li>update user</li>
 * <li>update personal user </li>
 * <li>give and take privilege to user</li>
 * <li>get users with filter</li>
 * <li>get one user data</li>
 * <li>get user related information as we continue</li>
 * </ul>
 */
@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private PrivilegeRepository privilegeRepository;

    public User createUser(User user) {

        // TODO: check that all user related info are correct

        return userRepository.save(user);
    }

    public boolean deleteUser(Integer userId) {
        // TODO: check that user doesn't have any action in his pocket.
        // if user has actions or other data recommend to deactivate account
        // return false;

        userRepository.deleteById(userId);
        return true;
    }

    public User updateUser(Integer userId, User newUserDetail) {
        Optional<User> userOptional = userRepository.findById(userId);
        if (userOptional.isPresent()) {
            User user = userOptional.get();
            // TODO: copy only things that are to be edited from newUserDetail to user
            user.setEmail(newUserDetail.getEmail());
            user.setFirstName(newUserDetail.getFirstName());
            user.setLastName(newUserDetail.getLastName());
            // ...
            return userRepository.save(user);
        }
        return null;
    }

    public boolean setUserStatus(Integer userId, boolean active) {
        Optional<User> userOptional = userRepository.findById(userId);
        if (userOptional.isPresent()) {
            User user = userOptional.get();
            user.setAccountStatus(active);
            userRepository.save(user);
            return true;
        }
        return false;
    }

    public User updatePersonalUser(Integer userId, User newUserDetail) {
        Optional<User> userOptional = userRepository.findById(userId);
        if (userOptional.isPresent()) {
            User user = userOptional.get();
            // TODO: copy only things that can be edited from newUserDetail to user
            user.setPassword(newUserDetail.getPassword());
            // ...
            userRepository.save(user);
        }
        return null;
    }

    public void resetPassword(Integer userId) {
        // TODO: will reset the user id password with random text and send it through email or printout
    }

    public boolean giveUserPrivilege(Integer userId, Integer privilegeId) {
        Optional<User> userOptional = userRepository.findById(userId);
        Optional<Privilege> privilegeOptional = privilegeRepository.findById(privilegeId);
        if (privilegeOptional.isPresent() && userOptional.isPresent()) {
            User user = userOptional.get();
            Privilege privilege = privilegeOptional.get();

            if (user.getPrivileges().contains(privilege)) {
                return false;
            }

            user.getPrivileges().add(privilege);

            userRepository.save(user);
            return true;
        }


        return false;
    }

    public boolean removeUserPrivilege(Integer userId, Integer privilegeId) {
        Optional<User> userOptional = userRepository.findById(userId);
        Optional<Privilege> privilegeOptional = privilegeRepository.findById(privilegeId);
        if (privilegeOptional.isPresent() && userOptional.isPresent()) {
            User user = userOptional.get();
            Privilege privilege = privilegeOptional.get();

            // check user have privilege
            if (user.getPrivileges().contains(privilege)) {

                user.getPrivileges().remove(privilege);

                userRepository.save(user);
                return true;

            }
        }


        return false;
    }

    // TODO: support pagination
    public List<User> getUsers() {
        return (List<User>) userRepository.findAll();
    }

    public User getUser(Integer userId) {
        Optional<User> userOptional = userRepository.findById(userId);
        return userOptional.isPresent() ? userOptional.get() : null;
    }

    public User getUser(String username) {
        Optional<User> userOptional = userRepository.findByUsername(username);
        return userOptional.isPresent() ? userOptional.get() : null;
    }

}
