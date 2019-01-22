package org.omega.hrm.models;

import org.omega.omegaerp.models.JobPosition;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.Date;
import java.util.List;

/**
 * Created by Kass on 12/27/2018.
 */
@Entity
public class PersonnelRequisition {
    @Id
    @GeneratedValue
    private Integer id;
    private Date requestDate;
    private Date requestSubmitionDate;
    private Integer requestingDepartment;

    @ManyToOne
    private Employee initiatedBy;

    @ManyToOne
    private Employee requested_by_employee;

    private Integer quantity;
    private String reason_for_request;
    private String employment_type;

    @ManyToOne
    private JobPosition job_position;
    private String reccruit_from;
    private Integer request_status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(Date requestDate) {
        this.requestDate = requestDate;
    }

    public Date getRequestSubmitionDate() {
        return requestSubmitionDate;
    }

    public void setRequestSubmitionDate(Date requestSubmitionDate) {
        this.requestSubmitionDate = requestSubmitionDate;
    }

    public Integer getRequestingDepartment() {
        return requestingDepartment;
    }

    public void setRequestingDepartment(Integer requestingDepartment) {
        this.requestingDepartment = requestingDepartment;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getReason_for_request() {
        return reason_for_request;
    }

    public void setReason_for_request(String reason_for_request) {
        this.reason_for_request = reason_for_request;
    }

    public String getEmployment_type() {
        return employment_type;
    }

    public void setEmployment_type(String employment_type) {
        this.employment_type = employment_type;
    }


    public String getReccruit_from() {
        return reccruit_from;
    }

    public void setReccruit_from(String reccruit_from) {
        this.reccruit_from = reccruit_from;
    }

    public Integer getRequest_status() {
        return request_status;
    }

    public void setRequest_status(Integer request_status) {
        this.request_status = request_status;
    }

    public Employee getInitiatedBy() {
        return initiatedBy;
    }

    public void setInitiatedBy(Employee initiatedBy) {
        this.initiatedBy = initiatedBy;
    }

    public Employee getRequested_by_employee() {

        return requested_by_employee;
    }

    public void setRequested_by_employee(Employee requested_by_employee) {
        this.requested_by_employee = requested_by_employee;
    }

    public JobPosition getJob_position() {
        return job_position;
    }

    public void setJob_position(JobPosition job_position) {
        this.job_position = job_position;
    }
}
