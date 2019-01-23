package org.omega.omegaerp.controllers.readers;

import org.omega.omegaerp.models.User;
import org.omega.omegaerp.services.UserService;
import org.omega.omegaerp.services.UserSessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
public class UserControllerReader {

    @Autowired
    private UserService userService;

    @Autowired
    private UserSessionService userSessionService;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<?> getAllUsers() {
        return ResponseEntity.ok(userService.getUsers());
    }

    @RequestMapping(method = RequestMethod.GET, value = "/name/{username}")
    public ResponseEntity<?> checkUserWithUserNameExists(String username) {
        User user = userService.getUser(username);
        if (user != null) {
            return ResponseEntity.ok("");
        } else {
            return ResponseEntity.notFound().build();
        }
    }

}
