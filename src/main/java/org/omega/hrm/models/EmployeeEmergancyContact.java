package org.omega.hrm.models;

import org.omega.hrm.model.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * Created by Heka on 12/27/2018.
 */
@Entity
public class EmployeeEmergancyContact {

    @Id
    @GeneratedValue
    private Integer id;

    @ManyToOne
    private org.omega.hrm.model.Employee employee;
    private String firstname;
    private String fathername;
    private String grandfathername;
    private String relationtoemp;
    private String nationality="Ethiopia";




}
