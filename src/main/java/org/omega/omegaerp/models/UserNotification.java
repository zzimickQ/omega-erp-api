package org.omega.omegaerp.models;

import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

/**
 * Created by Heka on 12/26/2018.
 */
public class UserNotification {
    @ManyToOne
    private User user;
    @OneToOne
    private Notification notification;

    private boolean seen;
}
