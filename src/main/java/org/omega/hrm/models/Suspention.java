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
public class Suspention {

    @Id
    @GeneratedValue
    private Integer id;

    private Boolean salaryallowance;
    private Integer causeforsuspention;
    private Boolean warnedofsuspension;
    private Date startdate;
    private Date enddate;
    private String remark;
    @ManyToOne
    private Employee employee;

    @ManyToOne
    private Employee requestedByEmployee;


}
