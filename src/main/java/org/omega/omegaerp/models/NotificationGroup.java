package org.omega.omegaerp.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * Created by Heka on 12/26/2018.
 */
@Entity
public class NotificationGroup {
    @Id
    @GeneratedValue
    private int id;
    private String groupname;

    @OneToMany
    private List<User> users;

}
