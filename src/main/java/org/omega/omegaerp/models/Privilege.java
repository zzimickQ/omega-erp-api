package org.omega.omegaerp.models;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Quatra on 12/26/2018.
 */
@Entity
public class Privilege {

    @Id
    @GeneratedValue
    private Integer id;

    private String name;

    private String description;

    @ManyToMany
    @JoinTable(name = "user_privilegs",
            joinColumns = @JoinColumn(name = "privilege"),
            inverseJoinColumns = @JoinColumn(name = "user"))
    private List<User> users;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
