package org.omega.omegaerp.hrm.models;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Kass on 12/27/2018.
 */
@Entity
public class Applicants {
    @Id
    @GeneratedValue
    private Integer id;

    @ManyToOne
    private Vacancy vacancy;

    private Date apply_date ;

    private String first_name;

    private String last_name;

    private String g_father_name;

    private String sex;
    private Date birth_date;

    private String email;

    private float interview_result;
    private String interview_remark;
    private float test_result;
    private int passed;
    private boolean black_listed;

    @OneToOne
    private PhoneNumbers primaryPhoneNumber;

    @ManyToOne
    private Address primaryAddress;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Vacancy getVacancy() {
        return vacancy;
    }

    public void setVacancy(Vacancy vacancy) {
        this.vacancy = vacancy;
    }

    public Date getApply_date() {
        return apply_date;
    }

    public void setApply_date(Date apply_date) {
        this.apply_date = apply_date;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getG_father_name() {
        return g_father_name;
    }

    public void setG_father_name(String g_father_name) {
        this.g_father_name = g_father_name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getBirth_date() {
        return birth_date;
    }

    public void setBirth_date(Date birth_date) {
        this.birth_date = birth_date;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public float getInterview_result() {
        return interview_result;
    }

    public void setInterview_result(float interview_result) {
        this.interview_result = interview_result;
    }

    public String getInterview_remark() {
        return interview_remark;
    }

    public void setInterview_remark(String interview_remark) {
        this.interview_remark = interview_remark;
    }

    public float getTest_result() {
        return test_result;
    }

    public void setTest_result(float test_result) {
        this.test_result = test_result;
    }

    public int getPassed() {
        return passed;
    }

    public void setPassed(int passed) {
        this.passed = passed;
    }

    public boolean isBlack_listed() {
        return black_listed;
    }

    public void setBlack_listed(boolean black_listed) {
        this.black_listed = black_listed;
    }

    public PhoneNumbers getPrimaryPhoneNumber() {
        return primaryPhoneNumber;
    }

    public void setPrimaryPhoneNumber(PhoneNumbers primaryPhoneNumber) {
        this.primaryPhoneNumber = primaryPhoneNumber;
    }

    public Address getPrimaryAddress() {
        return primaryAddress;
    }

    public void setPrimaryAddress(Address primaryAddress) {
        this.primaryAddress = primaryAddress;
    }
}
