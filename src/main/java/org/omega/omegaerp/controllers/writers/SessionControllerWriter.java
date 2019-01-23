package org.omega.omegaerp.controllers.writers;

import org.omega.omegaerp.coms.reponses.CommandResponse;
import org.omega.omegaerp.services.UserSessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class SessionControllerWriter {

    @Autowired
    private UserSessionService userSessionService;

    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    public ResponseEntity<?> logoutUser() {
        userSessionService.logout();
        return ResponseEntity.ok(new CommandResponse("logout"));
    }


}
