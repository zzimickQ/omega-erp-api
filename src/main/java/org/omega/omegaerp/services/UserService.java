package org.omega.omegaerp.services;

import org.omega.omegaerp.dal.PrivilegeRepository;
import org.omega.omegaerp.dal.UserRepository;
import org.omega.omegaerp.models.Privilege;
import org.omega.omegaerp.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * Created by Kass on 12/27/2018.
 */
@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private PrivilegeRepository privilegeRepository;

    void enableUserPrivilege(Integer userId, Integer privilegeId) {
        Optional<User> user = userRepository.findById(userId);
        Optional<Privilege> privilege = privilegeRepository.findById(privilegeId);
        if(user.isPresent() && privilege.isPresent()) {
            user.get().getPrivileges().add(privilege.get());
        } else {
            // throw
        }
    }


    public Iterable<User> getAll() {

        return userRepository.findAll();
    }
}
