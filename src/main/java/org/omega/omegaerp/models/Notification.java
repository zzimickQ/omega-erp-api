package org.omega.omegaerp.models;


import javax.persistence.*;
import java.sql.Date;

/**
 * Created by Heka on 12/26/2018.
 */
@Entity
public class Notification {
    @Id
    @GeneratedValue
    private Integer id;

    private String title;
    private String details;
    private Date postdate;

    @ManyToOne
    @JoinColumn(name = "source_user")
    private User sourceUser;

    public Notification() {  }

    public Notification(String title, String details, User sourceUser) {
        super();
        this.title = title;
        this.details = details;
        this.postdate = (Date) new java.util.Date();
        this.sourceUser = sourceUser;
    }

    public Notification(String title, String details) {
        super();
        this.title = title;
        this.details = details;
        this.postdate = (Date) new java.util.Date();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public Date getPostdate() {
        return postdate;
    }

    public void setPostdate(Date postdate) {
        this.postdate = postdate;
    }

    public User getSourceUser() {
        return sourceUser;
    }

    public void setSourceUser(User sourceUser) {
        this.sourceUser = sourceUser;
    }
}
