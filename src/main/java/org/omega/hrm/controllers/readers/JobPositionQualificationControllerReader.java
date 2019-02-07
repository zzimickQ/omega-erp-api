package org.omega.hrm.controllers.readers;

import org.omega.hrm.services.JobPositionQualificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/hrm")
public class JobPositionQualificationControllerReader {
    @Autowired
    private JobPositionQualificationService jobPositionQualificationService;

    @RequestMapping(value = "/emp/{empId}/jobPosition/qualification", method = RequestMethod.GET)
    public ResponseEntity<?> getJOJobPositionQualificationForEmployeeResponseEntity
            (@PathVariable Integer empId){
        return ResponseEntity.ok(jobPositionQualificationService.getJOJobPositionQualificationForEmployee(empId));
    }

    @RequestMapping(value = "/jobPosition/{id}/qualification", method = RequestMethod.GET)
    public ResponseEntity<?> getJobPositionQualificationForJobPosition
            (@PathVariable Integer id){
        return ResponseEntity.ok(jobPositionQualificationService.getJobPositionQualificationForJobPosition(id));
    }
}
