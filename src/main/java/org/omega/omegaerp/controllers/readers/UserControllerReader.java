package org.omega.omegaerp.controllers.readers;

import org.omega.omegaerp.constants.Privileges;
import org.omega.omegaerp.dal.UserRepository;
import org.omega.omegaerp.exception.UserNotFoundExceptoin;
import org.omega.omegaerp.models.User;
import org.omega.omegaerp.services.PrivilegeService;
import org.omega.omegaerp.services.UserService;
import org.omega.omegaerp.exception.PrivilegeViolationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 * Created by Kass on 12/26/2018.
 */
@RestController
@RequestMapping("/api/user")
public class UserControllerReader {
/*
    @Autowired
    private PrivilegeService privilegeService;
    @Autowired
    private UserService userService;
    @ExceptionHandler(UserNotFoundExceptoin.class)
    String notFoundExceptionHandler(UserNotFoundExceptoin e){
        return e.getMessage();
    }

    @RequestMapping("users/findallusers")
    public Iterable<User> getAllUsers() throws PrivilegeViolationException {
        privilegeService.checkPrivilege(Privileges.privilegeId);
        return userService.getAll();
    }*/


    @Autowired
    private UserRepository userRepository;

    @RequestMapping(value = "/{userId}", method = RequestMethod.GET)
    public User getUser(@PathVariable Integer userId) {
        Optional<User> u = userRepository.findById(userId);
        return u.isPresent() ? u.get() : null;
    }


    @RequestMapping(method = RequestMethod.GET)
    public List<User> getUsers() {
        return (List<User>) userRepository.findAll();
    }



}
