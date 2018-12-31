package org.omega.hrm.models;

import org.omega.hrm.model.*;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * Created by Heka on 12/27/2018.
 */
@Entity
public class Leave {
    @Id
    @GeneratedValue
    private Integer id;

    @ManyToOne
    private org.omega.hrm.model.Employee employee;

    private Integer leavetype;

    @ManyToOne
    private RequstedByEmployee requstedByEmployee;
    private Boolean state;
    private DateTimeFormat startdate;
    private DateTimeFormat enddate;
    private String remark;



}

