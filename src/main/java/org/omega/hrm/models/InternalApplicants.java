package org.omega.hrm.models;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Kass on 12/27/2018.
 */
@Entity
public class InternalApplicants {
    @Id
    @GeneratedValue
    private Integer id;
    private Date applyDate;
    private float interviewResult;
    private String interviewRemark;
    private float testResult;
    private boolean state;

    @OneToOne
    private Employee employee;
    @ManyToOne
    private Vacancy vacancy;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Vacancy getVacancy() {
        return vacancy;
    }

    public void setVacancy(Vacancy vacancy) {
        this.vacancy = vacancy;
    }

    public Date getApplyDate() {
        return applyDate;
    }

    public void setApplyDate(Date applyDate) {
        this.applyDate = applyDate;
    }

    public float getInterviewResult() {
        return interviewResult;
    }

    public void setInterviewResult(float interviewResult) {
        this.interviewResult = interviewResult;
    }

    public String getInterviewRemark() {
        return interviewRemark;
    }

    public void setInterviewRemark(String interviewRemark) {
        this.interviewRemark = interviewRemark;
    }

    public float getTestResult() {
        return testResult;
    }

    public void setTestResult(float testResult) {
        this.testResult = testResult;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }
}
