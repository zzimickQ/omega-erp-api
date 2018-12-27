package org.omega.omegaerp.models;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Kass on 12/26/2018.
 */
@Entity
public class JobCategory {
    @Id
    @GeneratedValue
    private Integer id ;
    private String name;
    private String description;

    @OneToMany
    private List<JobPosition> jobPositions;


}
