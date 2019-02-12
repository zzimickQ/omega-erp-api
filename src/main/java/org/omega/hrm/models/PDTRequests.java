package org.omega.hrm.models;

import org.omega.omegaerp.models.JobPosition;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;

/**
 * Created by Kass on 12/31/2018.
 */
public class PDTRequests {

    @Id
    @GeneratedValue
    private Integer id;
    private int type;
    private Date requestDate;
    private Integer requestingDepartment;
    private String reason;
    private  Float toSalary;
    private Boolean state;
    private Date finalizedDate;
    private String remark;

    @ManyToOne
    private Employee requestedEmployee;
    @ManyToOne
    private Employee initiatedByEmployee;
    @ManyToOne
    private Employee employee;
    @OneToOne
    private Branch toBranch;
    @OneToOne
    private JobPosition toJobPosition;
    @OneToMany
    private List<BenefitPackage> toBenefitPackage;



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public Date getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(Date requestDate) {
        this.requestDate = requestDate;
    }

    public Integer getRequestingDepartment() {
        return requestingDepartment;
    }

    public void setRequestingDepartment(Integer requestingDepartment) {
        this.requestingDepartment = requestingDepartment;
    }

    public Employee getRequestedEmployee() {
        return requestedEmployee;
    }

    public void setRequestedEmployee(Employee requestedEmployee) {
        this.requestedEmployee = requestedEmployee;
    }

    public Employee getInitiatedByEmployee() {
        return initiatedByEmployee;
    }

    public void setInitiatedByEmployee(Employee initiatedByEmployee) {
        this.initiatedByEmployee = initiatedByEmployee;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Branch getToBranch() {
        return toBranch;
    }

    public void setToBranch(Branch toBranch) {
        this.toBranch = toBranch;
    }

    public JobPosition getToJobPosition() {
        return toJobPosition;
    }

    public void setToJobPosition(JobPosition toJobPosition) {
        this.toJobPosition = toJobPosition;
    }

    public List<BenefitPackage> getToBenefitPackage() {
        return toBenefitPackage;
    }

    public void setToBenefitPackage(List<BenefitPackage> toBenefitPackage) {
        this.toBenefitPackage = toBenefitPackage;
    }

    public Float getToSalary() {
        return toSalary;
    }

    public void setToSalary(Float toSalary) {
        this.toSalary = toSalary;
    }

    public Boolean getState() {
        return state;
    }

    public void setState(Boolean state) {
        this.state = state;
    }

    public Date getFinalizedDate() {
        return finalizedDate;
    }

    public void setFinalizedDate(Date finalizedDate) {
        this.finalizedDate = finalizedDate;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
