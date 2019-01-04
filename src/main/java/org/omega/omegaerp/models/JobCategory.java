package org.omega.omegaerp.models;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Kass on 12/26/2018.
 */
@Entity
public class JobCategory {
    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private String description;

    @OneToMany
    @JoinColumn(name = "category")
    private List<JobPosition> jobPositions;


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

    public List<JobPosition> getJobPositions() {
        return jobPositions;
    }

    public void setJobPositions(List<JobPosition> jobPositions) {
        this.jobPositions = jobPositions;
    }
}
