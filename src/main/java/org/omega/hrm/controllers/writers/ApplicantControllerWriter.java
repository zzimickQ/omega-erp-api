package org.omega.hrm.controllers.writers;

import org.omega.hrm.models.Applicant;
import org.omega.hrm.services.ApplicantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/hrm")
public class ApplicantControllerWriter {
    @Autowired
    private ApplicantService applicantService;

    @RequestMapping(value = "/applicant/{vacId}", method = RequestMethod.POST)
    public ResponseEntity<?> createApplicant(@PathVariable Integer vacId, @RequestBody Applicant applicant){
        return ResponseEntity.ok(applicantService.registerApplicant(vacId, applicant));
    }

    @RequestMapping(value = "/applicant/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<?> deleteApplicant(@PathVariable Integer id){
        applicantService.deleteApplicant(id);
        return ResponseEntity.ok().build();
    }

    @RequestMapping(value = "/applicant/{id}", method = RequestMethod.PUT)
    public ResponseEntity<?> editApplicant(@PathVariable Integer id, @RequestBody Applicant applicant){
        return ResponseEntity.ok(applicantService.editApplicant(id, applicant));
    }
}
