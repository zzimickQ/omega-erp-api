package org.omega.hrm.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.sql.Date;

/**
 * Created by Heka on 1/1/2019.
 */
@Entity
public class Employees {

    @Id
    @GeneratedValue
    private Integer id;
    private String firstName;
    private String fatherName;
    private String grandFatherName;
    private String gender;
    private Date birthDate;
    private String email;

    @ManyToOne
    private PhoneNumbers primaryPhoneNumbers;

    @ManyToOne
    private Address primaryAddress;

    private Date firstRegisteredDate;
    private String meritalStatus;
    private String bankAccountNumber;
    private Integer entitledLeaveDays;
    private String nationality;



}
