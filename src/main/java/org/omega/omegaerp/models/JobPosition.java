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
    @JoinColumn(name = "job_position")
    private List<User> users;

    private String title;
    private String description;

    @ManyToOne
    @JoinColumn(name = "category")
    private JobCategory category;

    private Integer level = 0;

    @OneToMany
    @JoinColumn(name = "supervisor")
    private List<JobPosition> supervises;

    @ManyToOne
    @JoinColumn(name = "supervisor")
    private JobPosition supervisor;

    @ManyToMany
    @JoinColumn(name = "job_position", table = "default_job_position_privileges")
    private List<Privilege> defaultPrivileges;

    public JobPosition(Integer jobPositionId) {
        this.id = jobPositionId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public JobCategory getCategory() {
        return category;
    }

    public void setCategory(JobCategory category) {
        this.category = category;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public List<JobPosition> getSupervises() {
        return supervises;
    }

    public void setSupervises(List<JobPosition> supervises) {
        this.supervises = supervises;
    }

    public JobPosition getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(JobPosition supervisor) {
        this.supervisor = supervisor;
    }

    public List<Privilege> getDefaultPrivileges() {
        return defaultPrivileges;
    }

    public void setDefaultPrivileges(List<Privilege> defaultPrivileges) {
        this.defaultPrivileges = defaultPrivileges;
    }
}
