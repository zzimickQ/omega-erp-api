package org.omega.omegaerp.models;

import javax.persistence.Entity;
<<<<<<< HEAD
import javax.persistence.OneToMany;
import java.util.List;

/**
 * Created by Quatra on 12/26/2018.
 */
@Entity
public class User {



    @OneToMany
    private List<Privilege> privileges;
=======
import javax.persistence.*;
import java.util.Date;

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
>>>>>>> 14443a80cc4da24bd88880fcf49f3234d27a75df

}
