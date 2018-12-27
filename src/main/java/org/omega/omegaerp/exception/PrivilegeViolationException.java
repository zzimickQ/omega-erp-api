package org.omega.omegaerp.exception;


/**
 * Created by Kass on 12/26/2018.
 */
public class PrivilegeViolationException extends Exception{
    public PrivilegeViolationException(String reason) {
        super(reason);
    }
}
