package org.omega.hrm.controllers.readers;

import org.omega.hrm.models.Vacancy;
import org.omega.hrm.services.ApplicantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/applicant")
public class ApplicantControllerReader {

    @Autowired
    private ApplicantService applicantService;

    @RequestMapping(value = "/applicant", method = RequestMethod.GET)
    public ResponseEntity<?> getApplicants() {
        return ResponseEntity.ok(applicantService.getApplicants());
    }

    @RequestMapping(value = "/applicant/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> getApplicant(@PathVariable Integer id) {
        return ResponseEntity.ok(applicantService.getApplicant(id));
    }

    @RequestMapping(value = "/applicant/{vacancy}", method = RequestMethod.GET)
    public ResponseEntity<?> getApplicantsForVacancy(@PathVariable Vacancy vacancy) {
        return ResponseEntity.ok(applicantService.getApplicantsForVacancy(vacancy));
    }


}
