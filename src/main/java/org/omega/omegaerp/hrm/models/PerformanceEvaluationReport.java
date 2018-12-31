package org.omega.omegaerp.hrm.models;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.util.Date;
import java.util.List;

/**
 * Created by Kass on 12/27/2018.
 */
@Entity
public class PerformanceEvaluationReport {


    private Integer id;

    @ManyToOne
    private List<Employee> evaluatingEmployee;

    @ManyToOne
    private List<Employee> employee;
    private float grade;
    private String remark;
    private Date evaluationDate;

//    whether the report was done as periodically or on demand
    private boolean method;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<Employee> getEvaluatingEmployee() {
        return evaluatingEmployee;
    }

    public void setEvaluatingEmployee(List<Employee> evaluatingEmployee) {
        this.evaluatingEmployee = evaluatingEmployee;
    }

    public List<Employee> getEmployee() {
        return employee;
    }

    public void setEmployee(List<Employee> employee) {
        this.employee = employee;
    }

    public float getGrade() {
        return grade;
    }

    public void setGrade(float grade) {
        this.grade = grade;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Date getEvaluationDate() {
        return evaluationDate;
    }

    public void setEvaluationDate(Date evaluationDate) {
        this.evaluationDate = evaluationDate;
    }

    public boolean isMethod() {
        return method;
    }

    public void setMethod(boolean method) {
        this.method = method;
    }
}
