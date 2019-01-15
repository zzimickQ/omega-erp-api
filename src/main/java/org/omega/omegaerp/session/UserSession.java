package org.omega.omegaerp.session;

import org.omega.omegaerp.models.User;

/**
 * Created by Zzimick on 1/15/2019.
 */
public class UserSession {
    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
