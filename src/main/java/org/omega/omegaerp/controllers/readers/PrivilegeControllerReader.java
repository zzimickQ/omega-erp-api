package org.omega.omegaerp.controllers.readers;

import org.omega.omegaerp.constants.Privileges;
import org.omega.omegaerp.models.Privilege;
import org.omega.omegaerp.services.PrivilegeService;
import org.omega.omegaerp.services.UserSessionService;
import org.omega.omegaerp.session.UserSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Quatra on 12/26/2018.
 */
@RestController
@RequestMapping("/api/priv")
public class PrivilegeControllerReader {
    @Autowired
    private PrivilegeService privilegeService;
    @Autowired
    private UserSessionService userSessionService;

    @RequestMapping(method = RequestMethod.GET)
    public List<Privilege> allPrivileges(){
        userSessionService.checkUserHasPrivilage(Privileges.GET_PRIVILEGES);
        return privilegeService.getAllPrivileges();
    }

}
