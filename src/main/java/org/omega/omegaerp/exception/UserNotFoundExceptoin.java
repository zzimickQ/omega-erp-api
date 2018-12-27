package org.omega.omegaerp.exception;

/**
 * Created by Kass on 12/26/2018.
 */
public class UserNotFoundExceptoin extends Exception {
    public UserNotFoundExceptoin() {
        super();
    }

    public UserNotFoundExceptoin(int id) {
        super("error code 1: User of id '" + id + "' not found");
    }
}
