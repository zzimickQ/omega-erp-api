package org.omega.omegaerp.models;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Heka on 12/26/2018.
 */
@Entity
public class NotificationGroup {
    @Id
    @GeneratedValue
    private int id;
    private String name;

    @OneToMany
    @JoinColumn(name = "notification_group")
    private List<User> users;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}
