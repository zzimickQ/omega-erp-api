package org.omega.omegaerp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;
import org.omega.omegaerp.models.User;

/**
 * Created by Kass on 12/26/2018.
 */
@Service
public class UserSession {
    @Autowired
    private HttpSession userSessionHolder;

    public org.omega.omegaerp.models.User getUser() {

        return (User) userSessionHolder.getAttribute("loggedUser");

    }
}
