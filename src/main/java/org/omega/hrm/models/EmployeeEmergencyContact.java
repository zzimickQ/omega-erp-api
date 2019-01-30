package org.omega.hrm.models;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * Created by Heka on 12/27/2018.
 */
@Entity
public class EmployeeEmergencyContact {

    @Id
    @GeneratedValue
    private Integer id;

    @ManyToOne
    private Employee employee;
    private String firstname;
    private String fathername;
    private String grandfathername;
    private String relationtoemp;
    private String nationality="Ethiopia";




}
