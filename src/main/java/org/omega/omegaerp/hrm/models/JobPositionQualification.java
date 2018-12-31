package org.omega.omegaerp.hrm.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by Kass on 12/27/2018.
 */
@Entity
public class JobPositionQualification {

    @Id
    @GeneratedValue
    private Integer id;

    private Integer ageFrom;
    private Integer ageTo = 99;
    private String gender="none";
    private float experinceYears=0;
    private String others;
    private String qualificationDescription;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAgeFrom() {
        return ageFrom;
    }

    public void setAgeFrom(Integer ageFrom) {
        this.ageFrom = ageFrom;
    }

    public Integer getAgeTo() {
        return ageTo;
    }

    public void setAgeTo(Integer ageTo) {
        this.ageTo = ageTo;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public float getExperinceYears() {
        return experinceYears;
    }

    public void setExperinceYears(float experinceYears) {
        this.experinceYears = experinceYears;
    }

    public String getOthers() {
        return others;
    }

    public void setOthers(String others) {
        this.others = others;
    }

    public String getQualificationDescription() {
        return qualificationDescription;
    }

    public void setQualificationDescription(String qualificationDescription) {
        this.qualificationDescription = qualificationDescription;
    }
}
