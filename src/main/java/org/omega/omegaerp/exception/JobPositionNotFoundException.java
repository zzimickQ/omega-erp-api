package org.omega.omegaerp.exception;

/**
 * Created by Kass on 12/26/2018.
 */
public class JobPositionNotFoundException extends Exception {
    public JobPositionNotFoundException() {

        super();
    }

    public JobPositionNotFoundException(int id) {

        super("error code 1: job position of id '" + id + "' not found");
    }
}
