package org.omega.omegaerp.controllers.readers;

import org.omega.omegaerp.coms.reponses.CommandResponse;
import org.omega.omegaerp.coms.requests.UserAuthRequest;
import org.omega.omegaerp.services.UserSessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class SessionControllerReader {
    @Autowired
    private UserSessionService userSessionService;

    @RequestMapping(value = "/privilege", method = RequestMethod.GET)
    public ResponseEntity<?> getLoggedInUserPrivileges() {
//        userSessionService.mustLogIn();
        return ResponseEntity.ok(userSessionService.getLoggedUser().getPrivileges());
    }

    @RequestMapping(value = "/loggedIn", method = RequestMethod.GET)
    public ResponseEntity<?> isLoggedIn() {
        if(userSessionService.isLoggedIn()) {
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.noContent().build();
        }
    }

}
