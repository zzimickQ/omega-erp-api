package org.omega.omegaerp.models;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Kass on 12/26/2018.
 */
@Entity
public class UserAccessMac {
    @Id
    @ManyToOne
    private User user;

    private String macAddress;

}
