package org.omega.omegaerp.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Quatra on 12/26/2018.
 */
@Entity
public class PrivilegeGroup {

    @Id
    @GeneratedValue
    private Integer id;

    private String name;

    private String description;

    @OneToMany
    @JoinColumn(name = "privilege_group")
    private List<Privilege> privileges = new ArrayList<>();

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

    public List<Privilege> getPrivileges() {
        return privileges;
    }

    public void setPrivileges(List<Privilege> privileges) {
        this.privileges = privileges;
    }
}
