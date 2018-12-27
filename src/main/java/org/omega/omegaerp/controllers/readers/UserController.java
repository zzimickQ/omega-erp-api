package org.omega.omegaerp.controllers.readers;

import org.omega.omegaerp.exception.UserNotFoundExceptoin;
import org.omega.omegaerp.services.PrivilegeService;
import org.omega.omegaerp.services.User;
import org.omega.omegaerp.exception.PrivilegeViolationException;
import org.omega.omegaerp.constants.Previleges;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Kass on 12/26/2018.
 */
public class UserController{
    @Autowired
    private PrivilegeService privilegeService;
    @Autowired
    private User userService;
    @ExceptionHandler(UserNotFoundExceptoin.class)
    String notFoundExceptionHandler(UserNotFoundExceptoin e){
        return e.getMessage();
    }

    @ExceptionHandler(PrivilegeViolationException.class)
    String privilegeExceptionHandler(PrivilegeViolationException e){
        return "you dont have privilege for " + e.getMessage();
    }


    @RequestMapping("users/findallusers")
    public Iterable<User> getAllUsers() throws PrivilegeViolationException {
        privilegeService.checkPrivilege(Previleges.READ_ALL_USERS);
        return userService.getAll();
    }
}
