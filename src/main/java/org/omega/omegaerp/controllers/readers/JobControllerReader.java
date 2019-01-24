package org.omega.omegaerp.controllers.readers;

import org.omega.omegaerp.constants.Privileges;
import org.omega.omegaerp.models.JobCategory;
import org.omega.omegaerp.models.JobPosition;
import org.omega.omegaerp.services.JobService;
import org.omega.omegaerp.services.UserSessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/jobs")

public class JobControllerReader {

    @Autowired
    private JobService jobService;

    @Autowired
    private UserSessionService userSessionService;

    @RequestMapping(value = "/category", method = RequestMethod.GET)
    public ResponseEntity<?> getAllCategories() {

        userSessionService.checkUserHasPrivilage(Privileges.GET_CATEGORIES);

        return ResponseEntity.ok(jobService.getAllCategories());
    }

    @RequestMapping(value = "/jobpos/", method = RequestMethod.GET)
    public ResponseEntity<?> getAllJobPositions() {
        userSessionService.checkUserHasPrivilage(Privileges.GET_JOB_POISITIONS);
        return ResponseEntity.ok(jobService.getAllJobPosition());
    }

    @RequestMapping(value = "/jobpos/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> getJobPositionById(@PathVariable Integer id) {
        userSessionService.checkUserHasPrivilage(Privileges.GET_JOB_POISITIONS);
        userSessionService.checkUserHasPrivilage(Privileges.GET_ONE_JOB_POISITIONS);

        return ResponseEntity.ok(jobService.getJobPositionById(id));
    }

    @RequestMapping(value = "/jobpos/cat/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> getJobPositionByCategoryId(@PathVariable Integer id) {
        userSessionService.checkUserHasPrivilage(Privileges.GET_CATEGORIES);
        userSessionService.checkUserHasPrivilage(Privileges.GET_JOB_POISITIONS);


        return ResponseEntity.ok(jobService.getAllJobPositionInCategory(id));
    }

    @RequestMapping(value = "/jobpos/s/{search}")
    public ResponseEntity<?> searchJobPosition(@PathVariable String search) {
        userSessionService.checkUserHasPrivilage(Privileges.GET_JOB_POISITIONS);
        return null;

    }


}
