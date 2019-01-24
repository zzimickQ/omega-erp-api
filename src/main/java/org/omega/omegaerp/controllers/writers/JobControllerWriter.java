package org.omega.omegaerp.controllers.writers;

import org.omega.omegaerp.constants.Privileges;
import org.omega.omegaerp.models.JobCategory;
import org.omega.omegaerp.models.JobPosition;
import org.omega.omegaerp.models.Privilege;
import org.omega.omegaerp.services.JobService;
import org.omega.omegaerp.services.UserSessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/jobs")
public class JobControllerWriter {

    @Autowired
    private JobService jobService;

    @Autowired
    private UserSessionService userSessionService;

    @RequestMapping(value = "/category", method = RequestMethod.POST)
    public ResponseEntity<?> createJobCategory
            (@RequestBody JobCategory jobCategory) {
        userSessionService.checkUserHasPrivilage(Privileges.CREATE_JOB_CATEGORY);

        // validation
        JobCategory newJobCat = jobService.createCategory(jobCategory);

        return ResponseEntity.ok(newJobCat);
    }

    @RequestMapping(value = "/category/{id}", method = RequestMethod.PUT)
    public ResponseEntity<?> editCategory
            (@PathVariable Integer id, @RequestBody JobCategory jobCategory){
        userSessionService.checkUserHasPrivilage(Privileges.EDIT_JOB_CATEGORY);
        return ResponseEntity.ok(jobService.editCategory(id , jobCategory));
    }

    @RequestMapping(value = "/category/{id}", method = RequestMethod.DELETE)
    public void deleteCategory(@PathVariable Integer id){
        userSessionService.checkUserHasPrivilage(Privileges.DELETE_JOB_CATEGORY);
        jobService.deleteCategory(id);
    }

    @RequestMapping(value = "/jobpos", method = RequestMethod.POST)

    public ResponseEntity<?> createJobPositions
            (@PathVariable Integer id, @RequestBody JobPosition jobPosition){
        userSessionService.checkUserHasPrivilage(Privileges.CREATE_JOB_POSITIONS);
        return ResponseEntity.ok(jobService.createJobPosition( id, jobPosition));
    }

    @RequestMapping(value = "/jobpos/{id}", method = RequestMethod.PUT)

    public ResponseEntity<?> editJobPosition
            (@PathVariable Integer id, @RequestBody JobPosition jobPosition){
        userSessionService.checkUserHasPrivilage(Privileges.EDIT_JOB_POSITION);
        return ResponseEntity.ok(jobService.editJobPosition(id,jobPosition));
    }

    @RequestMapping(value = "/jobpos/{id}")

    public void deleteJobPosition(@PathVariable Integer id) {
        userSessionService.checkUserHasPrivilage(Privileges.DELETE_JOB_POSITIONS);
        jobService.deleteJobPosition(id);
    }

    @RequestMapping(value = "/jobpos/{jobId}/priv/{prevId}",method = RequestMethod.POST)

    public void assignPrivilege(@PathVariable Integer jobId,@PathVariable Integer prevId){
        userSessionService.checkUserHasPrivilage(Privileges.ASSIGN_PRIVILEGE_FOR_JOB_POSITIONS);
        jobService.assignJobPrivilege(jobId,prevId);
    }

    @RequestMapping(value = "/jobpos/{jobId}/priv/{prevId}",method = RequestMethod.DELETE)

    public void removePrivilege(@PathVariable Integer jobId, @PathVariable Integer prevId){
        userSessionService.checkUserHasPrivilage(Privileges.REMOVE_PRIVILEGE_FOR_JOB_POSITIONS);
        jobService.removeJobPrivilege(jobId,prevId);
    }
}
