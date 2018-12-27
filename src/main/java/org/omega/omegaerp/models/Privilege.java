package org.omega.omegaerp.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by Quatra on 12/26/2018.
 */
@Entity
public class Privilege {

    @Id
    @GeneratedValue
    private Integer id;

    private String name;

    private String description;

    public Integer getId() {
        return id;
    }


}
