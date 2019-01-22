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
public class LeaveHistory {
    @Id
    @GeneratedValue
    private Integer id;

    @ManyToOne
    private Employee employee;

    private Integer leavetype;

    @ManyToOne
    private Employee requstedByEmployee;
    private Boolean state;
    private Date startdate;
    private Date enddate;
    private String remark;

}

