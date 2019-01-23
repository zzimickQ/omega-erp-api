package org.omega.omegaerp.controllers.exhandlers;


import org.omega.omegaerp.exception.UserNotLoggedException;
import org.omega.omegaerp.reponses.CommandResponse;
import org.omega.omegaerp.reponses.ErrorResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

public class UserNotLoggedExceptionController {

    @ExceptionHandler(UserNotLoggedException.class)
    public ResponseEntity<?> userNotLoggedExceptionHandler(UserNotLoggedException e) {
        return ResponseEntity.badRequest().body(new CommandResponse("login page"));
    }

}
