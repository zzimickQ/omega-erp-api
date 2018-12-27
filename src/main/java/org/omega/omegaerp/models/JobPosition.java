package org.omega.omegaerp.models;

import javax.persistence.Entity;
import javax.persistence.*;
import java.util.List;


@Entity
public class JobPosition {
    @Id
    @GeneratedValue
    private Integer id;

    @OneToMany
    private List<User> users;

    private String title;
    private String description;

    @ManyToOne
    private JobCategory category;

    private Integer level = 0;

    @OneToMany
    private List<JobPosition> supervises;

    @ManyToOne
    private List<JobPosition> supervisedBy;

    @ManyToMany
    private List<Privilege> defaultPrivileges;

}
