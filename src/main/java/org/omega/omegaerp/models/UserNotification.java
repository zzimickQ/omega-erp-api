package org.omega.omegaerp.models;

import javax.persistence.*;

/**
 * Created by Heka on 12/26/2018.
 */
@Entity
public class UserNotification {
    @Id
    @GeneratedValue
    private Integer id;

    @ManyToOne
    private User user;

    @OneToOne
    private Notification notification;

    private boolean seen = false;


    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Notification getNotification() {
        return notification;
    }

    public void setNotification(Notification notification) {
        this.notification = notification;
    }

    public boolean isSeen() {
        return seen;
    }

    public void setSeen(boolean seen) {
        this.seen = seen;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
