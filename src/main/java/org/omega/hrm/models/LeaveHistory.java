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
    private Integer leaveType;
    private Boolean state;
    private Date startDate;
    private Date endDate;
    private String remark;
    @ManyToOne
    private Employee requstedByEmployee;
    @ManyToOne
    private Employee employee;

}

