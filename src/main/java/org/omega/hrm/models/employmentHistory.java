package org.omega.hrm.models;

import org.omega.omegaerp.models.JobPosition;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * Created by Kass on 12/31/2018.
 */
@Entity
public class employmentHistory {
    @Id
    @GeneratedValue
    private Integer id;

    @ManyToOne
    private Employee employeeId;

    @ManyToOne
    private JobPosition jobPositionId;

    @ManyToOne
    private BenefitPackage benefitPackageId;

    @NotNull
    private Date startDate;

    private Date endDate;

    private float salary;

    private String empType;

    private String causeOfEnd;

    @OneToOne
    private Employee responsibleForEndEmployeeId;

    private String remark;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Employee getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Employee employeeId) {
        this.employeeId = employeeId;
    }

    public JobPosition getJobPositionId() {
        return jobPositionId;
    }

    public void setJobPositionId(JobPosition jobPositionId) {
        this.jobPositionId = jobPositionId;
    }

    public BenefitPackage getBenefitPackageId() {
        return benefitPackageId;
    }

    public void setBenefitPackageId(BenefitPackage benefitPackageId) {
        this.benefitPackageId = benefitPackageId;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public String getEmpType() {
        return empType;
    }

    public void setEmpType(String empType) {
        this.empType = empType;
    }

    public String getCauseOfEnd() {
        return causeOfEnd;
    }

    public void setCauseOfEnd(String causeOfEnd) {
        this.causeOfEnd = causeOfEnd;
    }

    public Employee getResponsibleForEndEmployeeId() {
        return responsibleForEndEmployeeId;
    }

    public void setResponsibleForEndEmployeeId(Employee responsibleForEndEmployeeId) {
        this.responsibleForEndEmployeeId = responsibleForEndEmployeeId;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
