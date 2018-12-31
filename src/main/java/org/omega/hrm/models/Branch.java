package org.omega.hrm.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * Created by Heka on 12/27/2018.
 */
@Entity
public class Branch {

    @Id
    @GeneratedValue
    private Integer id;
    private String name;

    @ManyToOne
    private Address address;

    private String discription;


}
