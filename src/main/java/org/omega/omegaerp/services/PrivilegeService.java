package org.omega.omegaerp.services;

import org.omega.omegaerp.exception.PrivilegeViolationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Quatra on 12/26/2018.
 */
@Service
public class PrivilegeService {
    @Autowired
    private UserSessionService userSessionService;

    public void checkPrivilege(int privilege) throws PrivilegeViolationException {
//        for (Privilege p : userSession.getUser().getPrivileges())
//            if (p.getId() == privilege)
//                return;

        throw new PrivilegeViolationException
                ("violation of privilege id '" + privilege + "'");
    }
}
