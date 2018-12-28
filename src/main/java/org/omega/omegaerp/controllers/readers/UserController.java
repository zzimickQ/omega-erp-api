package org.omega.omegaerp.controllers.readers;

import org.omega.omegaerp.constants.Privileges;
import org.omega.omegaerp.exception.UserNotFoundExceptoin;
import org.omega.omegaerp.models.User;
import org.omega.omegaerp.services.PrivilegeService;
import org.omega.omegaerp.services.UserService;
import org.omega.omegaerp.exception.PrivilegeViolationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Kass on 12/26/2018.
 */
@RestController
public class UserController{

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
    }
}
