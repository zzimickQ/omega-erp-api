package org.omega.omegaerp.models;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

/**
 * Created by Quatra on 12/26/2018.
 */
@Entity
public class User {



    @OneToMany
    private List<Privilege> privileges;

}
