package org.omega.omegaerp.models;

import javax.persistence.Entity;
import javax.persistence.*;
import java.util.List;


@Entity
public class JobPosition {
    @Id
    @GeneratedValue
    private int jobPositionId;

    @OneToMany
    private List<User> users;

    private String jobTitle;

    @ManyToOne
    private JobCategory jobCategory;

    private int jobLevel = 0;
}
