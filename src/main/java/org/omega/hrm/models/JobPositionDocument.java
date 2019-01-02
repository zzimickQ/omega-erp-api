package org.omega.hrm.models;

import org.omega.omegaerp.models.JobPosition;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 * Created by Kass on 12/27/2018.
 */
@Entity
public class JobPositionDocument {
    @Id
    @GeneratedValue
    private Integer id;

    @OneToOne
    private JobPosition jobPosition;
    private String docType;
    private boolean mandatory;
    private Integer deadlineDays;
    private Integer remindInDays;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public JobPosition getJobPosition() {
        return jobPosition;
    }

    public void setJobPosition(JobPosition jobPosition) {
        this.jobPosition = jobPosition;
    }

    public String getDocType() {
        return docType;
    }

    public void setDocType(String docType) {
        this.docType = docType;
    }

    public boolean isMandatory() {
        return mandatory;
    }

    public void setMandatory(boolean mandatory) {
        this.mandatory = mandatory;
    }

    public Integer getDeadlineDays() {
        return deadlineDays;
    }

    public void setDeadlineDays(Integer deadlineDays) {
        this.deadlineDays = deadlineDays;
    }

    public Integer getRemindInDays() {
        return remindInDays;
    }

    public void setRemindInDays(Integer remindInDays) {
        this.remindInDays = remindInDays;
    }
}
