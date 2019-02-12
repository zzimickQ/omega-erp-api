package org.omega.hrm.controllers.writers;

import org.omega.hrm.models.JobPositionQualification;
import org.omega.hrm.services.JobPositionQualificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/hrm")
public class JobPositionQualificationControllerWriter {
    @Autowired
    private JobPositionQualificationService jobPositionQualificationService;

    @RequestMapping(value ="/jobPosition/{id}/qualification" , method = RequestMethod.POST)
    public ResponseEntity<?> setJobQualification
            (@PathVariable Integer id,
             @RequestBody JobPositionQualification jobPositionQualification){
        return ResponseEntity.ok(jobPositionQualificationService.setJobPositionQualification
                (id, jobPositionQualification));
    }

    @RequestMapping(value = "/jobPosition/{id}/qualification", method = RequestMethod.PUT)
    public ResponseEntity<?> editJobQualification
            (@PathVariable Integer id,
             @RequestBody JobPositionQualification jobPositionQualification){
        return ResponseEntity.ok(jobPositionQualificationService.editJobPositionQualification
                (id, jobPositionQualification));
    }

    @RequestMapping(value = "/jobPosition/{id}/qualification",method = RequestMethod.DELETE)
    public ResponseEntity<?> deleteJobPositionQualification(@PathVariable Integer id){
        jobPositionQualificationService.deleteJobPositionQualification(id);
        return ResponseEntity.ok().build();
    }

}
