package org.omega.hrm.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.Date;

/**
 * Created by Kass on 12/27/2018.
 */
@Entity
public class PerformanceEvaluation {


    @Id
    @GeneratedValue
    private Integer id;
    private float grade;
    private String remark;
    private Date evaluationDate;

    @ManyToOne
    private Employee evaluatingEmployee;
    @ManyToOne
    private Employee employee;


//    whether the report was done as periodically or on demand
    private boolean method;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Employee getEvaluatingEmployee() {
        return evaluatingEmployee;
    }

    public void setEvaluatingEmployee(Employee evaluatingEmployee) {
        this.evaluatingEmployee = evaluatingEmployee;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
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
