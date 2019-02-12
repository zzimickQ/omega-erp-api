package org.omega.omegaerp.controllers.writers;

import org.omega.omegaerp.exception.UserNotLoggedException;
import org.omega.omegaerp.models.User;
import org.omega.omegaerp.services.UserService;
import org.omega.omegaerp.services.UserSessionService;
import org.omega.omegaerp.constants.Privileges;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
public class UserControllerWriter {

    @Autowired
    private UserService userService;

    @Autowired
    private UserSessionService userSessionService;

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<?> registerNewUser(@RequestBody User user) {
        userSessionService.checkUserHasPrivilage(Privileges.CREATE_USER);

        // TODO: validation done here
        userService.createUser(user);

        return ResponseEntity.ok(user);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/{id}")
    public ResponseEntity<?> updateUserProfile(@PathVariable Integer id, @RequestBody User user) throws UserNotLoggedException {
//        userSessionService.mustLogIn();

//        if (userSessionService.getLoggedUser().getUser().getId() == id) {
//            userSessionService.checkUserHasPrivilage(Privileges.UPDATE_SELF_USER);
//        } else {
//            userSessionService.checkUserHasPrivilage(Privileges.UPDATE_OTHER_USER);
//        }

        User updatedUser = userService.updateUser(id, user);
        return ResponseEntity.ok(updatedUser);
    }


}
