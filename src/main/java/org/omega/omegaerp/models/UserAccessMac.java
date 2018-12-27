package org.omega.omegaerp.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 * Created by Kass on 12/26/2018.
 */
@Entity
public class UserAccessMac {
    @Id
    @OneToOne
    private User userIdRel;
    private String macAddress;
}
