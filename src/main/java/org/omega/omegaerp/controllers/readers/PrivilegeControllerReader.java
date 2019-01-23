package org.omega.omegaerp.controllers.readers;

import org.omega.omegaerp.models.Privilege;
import org.omega.omegaerp.services.PrivilegeService;
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

    @RequestMapping(method = RequestMethod.GET)
    public List<Privilege> allPrivileges(){
        return privilegeService.getAllPrivileges();
    }

}
