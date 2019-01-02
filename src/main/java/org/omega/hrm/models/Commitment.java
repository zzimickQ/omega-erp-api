package org.omega.hrm.models;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.sql.Date;

/**
 * Created by Heka on 12/27/2018.
 */
@Entity
public class Commitment {

    @Id
    @GeneratedValue
    private Integer id;

    @ManyToOne
    private Employee employee;

    private Integer type;
    private String discription;
    private Float deptAmount;
    private Float deptpayed;
    private Date startDate;
    private Date endDate;
    private Integer paymentInterval;

    private Boolean state;
    //is the commitment completed

}

