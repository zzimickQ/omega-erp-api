package org.omega.omegaerp.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.List;

/**
 * Created by Kass on 12/26/2018.
 */
@Entity
public class OrganizationalStructure {
    @Id
    @GeneratedValue
    private int orgStructureId;
    @ManyToMany
    private List<JobPosition> supervisorJobPosition;
    @ManyToMany
    private List<JobPosition> supervisedJobPositionId;


}
