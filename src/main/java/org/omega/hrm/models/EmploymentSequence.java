package org.omega.hrm.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * Created by Heka on 1/1/2019.
 */
@Entity
public class EmploymentSequence {

    @Id
    @GeneratedValue
    private Integer id;

    @ManyToOne
    private PersonnelRequisition personnelRequisition;

    @ManyToOne
    private Vacancy vacancy;

    private Boolean applicantSource;

    @ManyToOne
    private Applicants applicants;

    @ManyToOne
    private Employee employee;

    @ManyToOne
    private EmploymentInfo employmentInfo;



}
