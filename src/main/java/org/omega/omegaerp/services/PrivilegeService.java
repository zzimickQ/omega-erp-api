package org.omega.omegaerp.services;

import org.omega.omegaerp.exception.PrivilegeViolationException;
import org.omega.omegaerp.models.Privilege;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Quatra on 12/26/2018.
 */
public class PrivilegeService {
    @Autowired
    private UserSession userSession;

    public void checkPrivilege(int privilege) throws PrivilegeViolationException {
        for (Privilege p : userSession.getUser().getPrivileges())
            if (p.getId() == privilege)
                return;

        throw new PrivilegeViolationException
                ("violation of privilege id '" + privilege + "'");
    }
}
