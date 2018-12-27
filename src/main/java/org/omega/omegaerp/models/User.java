package org.omega.omegaerp.models;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;
import javax.persistence.*;
import java.util.Date;

/**
 * Created by Quatra on 12/26/2018.
 */
/**
 * Created by Kass on 12/26/2018.
 */
@Entity
public class User {


    @Id
    @GeneratedValue
    private int userId;

    private String employeeId;

    @ManyToOne
    private JobPosition jobPosition;

    private String username;
    private String password;
    private String email;
    private String firstName;
    private String lastName;
    private String phoneNumberMobile;
    private String phoneNumberLocal;
    private Date regDate;
    private boolean accountStatus;
    private String profileUrl;
    private boolean forceResetPassword;

    @OneToMany
    private List<Privilege> privileges;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public JobPosition getJobPosition() {
        return jobPosition;
    }

    public void setJobPosition(JobPosition jobPosition) {
        this.jobPosition = jobPosition;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumberMobile() {
        return phoneNumberMobile;
    }

    public void setPhoneNumberMobile(String phoneNumberMobile) {
        this.phoneNumberMobile = phoneNumberMobile;
    }

    public String getPhoneNumberLocal() {
        return phoneNumberLocal;
    }

    public void setPhoneNumberLocal(String phoneNumberLocal) {
        this.phoneNumberLocal = phoneNumberLocal;
    }

    public Date getRegDate() {
        return regDate;
    }

    public void setRegDate(Date regDate) {
        this.regDate = regDate;
    }

    public boolean isAccountStatus() {
        return accountStatus;
    }

    public void setAccountStatus(boolean accountStatus) {
        this.accountStatus = accountStatus;
    }

    public String getProfileUrl() {
        return profileUrl;
    }

    public void setProfileUrl(String profileUrl) {
        this.profileUrl = profileUrl;
    }

    public boolean isForceResetPassword() {
        return forceResetPassword;
    }

    public void setForceResetPassword(boolean forceResetPassword) {
        this.forceResetPassword = forceResetPassword;
    }

    public List<Privilege> getPrivileges() {
        return privileges;
    }

    public void setPrivileges(List<Privilege> privileges) {
        this.privileges = privileges;
    }
}
