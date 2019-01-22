package org.omega.hrm.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * Created by Heka on 12/31/2018.
 */
@Entity
public class Address {

    @Id
    @GeneratedValue
    private Integer id;
    private Integer refersTo;
    private String country="Ethiopia";
    private String city;
    private String zone;
    private String subCity;
    private String wereda;
    private String kebele;
    private String houseNumber;
    private String streetName;
    private String blockNumber;


}
