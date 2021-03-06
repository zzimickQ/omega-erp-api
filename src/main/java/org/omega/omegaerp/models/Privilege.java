package org.omega.omegaerp.models;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

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


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Privilege)) return false;
        Privilege privilege = (Privilege) o;
        return Objects.equals(id, privilege.id) &&
                Objects.equals(name, privilege.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
