package org.omega.hrm.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Date;
import java.util.List;

/**
 * Created by Kass on 12/27/2018.
 */
@Entity
public class EmployeeDesciplinaryReports {

    @Id
    @GeneratedValue
    private Integer id;

    @OneToMany
    private List<Employee> employee;

    @OneToMany
    private List<Employee> reporterEmployee;

    private Date reportedDate;

    private Date employeeNotifiedDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<Employee> getEmployee() {
        return employee;
    }

    public void setEmployee(List<Employee> employee) {
        this.employee = employee;
    }

    public List<Employee> getReporterEmployee() {
        return reporterEmployee;
    }

    public void setReporterEmployee(List<Employee> reporterEmployee) {
        this.reporterEmployee = reporterEmployee;
    }

    public Date getReportedDate() {
        return reportedDate;
    }

    public void setReportedDate(Date reportedDate) {
        this.reportedDate = reportedDate;
    }

    public Date getEmployeeNotifiedDate() {
        return employeeNotifiedDate;
    }

    public void setEmployeeNotifiedDate(Date employeeNotifiedDate) {
        this.employeeNotifiedDate = employeeNotifiedDate;
    }
}
