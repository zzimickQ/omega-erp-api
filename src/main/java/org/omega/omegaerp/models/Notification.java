package org.omega.omegaerp.models;

import org.hibernate.annotations.Table;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.sql.Date;

/**
 * Created by Heka on 12/26/2018.
 */
@Entity
public class Notification {
    @Id
    @GeneratedValue
    private int id;

    private String title;
    private String details;
    private Date postdate;
    private User source;



}
