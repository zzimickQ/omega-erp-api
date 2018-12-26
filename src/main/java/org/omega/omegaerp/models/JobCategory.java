package org.omega.omegaerp.models;

import javax.persistence.*;

/**
 * Created by Kass on 12/26/2018.
 */
@Entity
public class JobCategory {
    @Id
    @GeneratedValue
    private int jobCatId ;
    private String catName;
}
