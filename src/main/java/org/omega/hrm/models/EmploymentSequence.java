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
    private Applicant applicant;

    @ManyToOne
    private Employee employee;

    @ManyToOne
    private EmploymentInfo employmentInfo;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public PersonnelRequisition getPersonnelRequisition() {
        return personnelRequisition;
    }

    public void setPersonnelRequisition(PersonnelRequisition personnelRequisition) {
        this.personnelRequisition = personnelRequisition;
    }

    public Vacancy getVacancy() {
        return vacancy;
    }

    public void setVacancy(Vacancy vacancy) {
        this.vacancy = vacancy;
    }

    public Boolean getApplicantSource() {
        return applicantSource;
    }

    public void setApplicantSource(Boolean applicantSource) {
        this.applicantSource = applicantSource;
    }

    public Applicant getApplicant() {
        return applicant;
    }

    public void setApplicant(Applicant applicant) {
        this.applicant = applicant;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public EmploymentInfo getEmploymentInfo() {
        return employmentInfo;
    }

    public void setEmploymentInfo(EmploymentInfo employmentInfo) {
        this.employmentInfo = employmentInfo;
    }
}
