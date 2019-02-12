package org.omega.omegaerp.controllers.readers;

import org.omega.omegaerp.constants.Privileges;
import org.omega.omegaerp.services.OrganizationalStructureService;
import org.omega.omegaerp.services.UserSessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/orgstruct")
public class OrganizationalStructureControllerReader {
    @Autowired
    private OrganizationalStructureService organizationalStructureService;

    @Autowired
    private UserSessionService userSessionService;


    @RequestMapping(value = "/supervisor/{id}",method = RequestMethod.GET)
    public ResponseEntity<?> getSupervisorById(@PathVariable Integer id){
        userSessionService.checkUserHasPrivilage(Privileges.GET_SUPERVISORS);
        userSessionService.checkUserHasPrivilage(Privileges.GET_ONE_SUPERVISOR);
        return ResponseEntity.ok(organizationalStructureService.getSupervisorById(id));
    }

    @RequestMapping(value = "/tree",method = RequestMethod.GET)
    public ResponseEntity<?> getHierarchyTree(){
        userSessionService.checkUserHasPrivilage(Privileges.GET_HIERARCHY_TREE);
        return ResponseEntity.ok(organizationalStructureService.getHierarchyTree());
    }



}
