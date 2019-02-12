package org.omega.hrm.models;

import org.omega.omegaerp.models.JobPosition;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;

/**
 * Created by Kass on 12/31/2018.
 */
@Entity
public class ContractEmploymentInfo {

    @Id
    @GeneratedValue
    private Integer id;
    @OneToOne
    private Employee employeeId;
    @OneToOne
    private JobPosition jobPositionId;
    private float salary;
    private Date startDate;
    private Date endDate;
    @OneToOne
    private Branch branchId;

    @OneToMany
    private List<BenefitPackage> benefitPackageId;



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

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
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

    public Branch getBranchId() {
        return branchId;
    }

    public void setBranchId(Branch branchId) {
        this.branchId = branchId;
    }

    public List<BenefitPackage> getBenefitPackageId() {
        return benefitPackageId;
    }

    public void setBenefitPackageId(List<BenefitPackage> benefitPackageId) {
        this.benefitPackageId = benefitPackageId;
    }
}
