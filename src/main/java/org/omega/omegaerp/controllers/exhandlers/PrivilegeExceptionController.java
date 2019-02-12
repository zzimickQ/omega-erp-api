package org.omega.omegaerp.controllers.exhandlers;


import org.omega.omegaerp.exception.PrivilegeViolationException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestController
@RestControllerAdvice
public class PrivilegeExceptionController {

    @ExceptionHandler(PrivilegeViolationException.class)
    public ResponseEntity<?> violatedPrivilegeExceptionHandler(PrivilegeViolationException e) {
        return ResponseEntity.badRequest().body(e.getMessage());
    }


}
