package org.omega.hrm.models;


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
    private Employee employee;

    private String firstName;
    private String fatherName;
    private String grandFatherName;
    private String relationToEmployee;
    private String nationality="Ethiopia";




}
