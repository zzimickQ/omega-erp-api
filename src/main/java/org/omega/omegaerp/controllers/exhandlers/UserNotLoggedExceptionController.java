package org.omega.omegaerp.controllers.exhandlers;


import org.omega.omegaerp.exception.UserNotLoggedException;
import org.omega.omegaerp.coms.reponses.CommandResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

public class UserNotLoggedExceptionController {

    @ExceptionHandler(UserNotLoggedException.class)
    public ResponseEntity<?> userNotLoggedExceptionHandler(UserNotLoggedException e) {
        return ResponseEntity.badRequest().body(new CommandResponse("login page"));
    }

}
