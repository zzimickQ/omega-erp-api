package org.omega.omegaerp.controllers.writers;

import org.omega.omegaerp.constants.Privileges;
import org.omega.omegaerp.models.JobPosition;
import org.omega.omegaerp.services.OrganizationalStructureService;
import org.omega.omegaerp.services.UserSessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/orgstruct")
public class OrganizationalStructureControllerWriter {
    @Autowired
    OrganizationalStructureService organizationalStructureService;

    @Autowired
    private UserSessionService userSessionService;

    @RequestMapping(value = "/orghead",method = RequestMethod.POST)
    public ResponseEntity<?> setHeadOfOrg(@RequestBody JobPosition jobPosition){
        userSessionService.checkUserHasPrivilage(Privileges.SET_HEAD_OF_ORG);
        organizationalStructureService.setHeadOfOrg(jobPosition);
        return ResponseEntity.ok().build();
    }

    @RequestMapping(value = "/supervisor/{supervisorJobPosId}" +
            "/supervised/{supervisedJobPosId}",
            method = RequestMethod.POST)

    public ResponseEntity<?> setSupervisor
            (@PathVariable Integer supervisorJobPosId,
             @PathVariable Integer supervisedJobPosId) {
        userSessionService.checkUserHasPrivilage(Privileges.SET_SUPERVISOR);
        organizationalStructureService.setSupervisor
                (supervisorJobPosId, supervisedJobPosId);

        return ResponseEntity.ok().build();
    }

    /*@RequestMapping(value = "/supervisor/{supervisorJobPosId}/newsupervisor/{id}",
            method = RequestMethod.PUT)
    public ResponseEntity<?> changeSupervisor
            (@PathVariable Integer supervisorJobPosId, @PathVariable Integer id) {
        organizationalStructureService.changeSupervisor(supervisorJobPosId,id);
        return ResponseEntity.ok().build();
    }*/

    @RequestMapping(value = "/supervisor/supervisorJobPositionId",
            method = RequestMethod.DELETE)

    public ResponseEntity<?> deleteWithSupervisedJobPosition
            (@PathVariable Integer supervisorJobPositionId){
        userSessionService.checkUserHasPrivilage(Privileges.DELETE_SUPERVISED_JOB_POSITION);
        organizationalStructureService.deleteWithSupervisedJobPosition
                (supervisorJobPositionId);

        return ResponseEntity.ok().build();
    }

    @RequestMapping(value = "/jobpos/{jobPositionId}")
    public ResponseEntity<?> deleteJobPosition(@PathVariable Integer jobPositionId){
        userSessionService.checkUserHasPrivilage(Privileges.DELETE_JOB_POSITIONS);
        return  ResponseEntity.ok(organizationalStructureService.deleteJobPosition(jobPositionId));
    }


}
