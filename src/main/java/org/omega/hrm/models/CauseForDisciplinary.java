package org.omega.hrm.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.Date;
import java.util.List;

/**
 * Created by Kass on 12/27/2018.
 */
@Entity
public class CauseForDisciplinary {
    @Id
    @GeneratedValue
    private Integer id;

    @ManyToMany
    private List<EmployeeDisciplinaryReport> employeeDesciplinaryReports;
    private Integer causeType;
    private Date startDate;
    private Date endDate;
    private String remark;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<EmployeeDisciplinaryReport> getEmployeeDesciplinaryReports() {
        return employeeDesciplinaryReports;
    }

    public void setEmployeeDesciplinaryReports(List<EmployeeDisciplinaryReport> employeeDesciplinaryReports) {
        this.employeeDesciplinaryReports = employeeDesciplinaryReports;
    }

    public Integer getCauseType() {
        return causeType;
    }

    public void setCauseType(Integer causeType) {
        this.causeType = causeType;
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

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
