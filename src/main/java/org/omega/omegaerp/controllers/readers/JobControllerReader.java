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

        return ResponseEntity.ok(jobService.getAllCategories());
    }

    @RequestMapping(value = "/jobpos/", method = RequestMethod.GET)
    public ResponseEntity<?> getAllJobPositions() {
        return ResponseEntity.ok(jobService.getAllJobPosition());
    }

    @RequestMapping(value = "/jobpos/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> getJobPositionById(@PathVariable Integer id) {

        return ResponseEntity.ok(jobService.getJobPositionById(id));
    }

    @RequestMapping(value = "/jobpos/cat/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> getJobPositionByCategoryId(@PathVariable Integer id) {
        return ResponseEntity.ok(jobService.getAllJobPositionInCategory(id));
    }


}
