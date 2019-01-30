package org.omega.hrm.controllers.readers;

import org.omega.hrm.services.DisciplinaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/hrm")
public class DisciplinaryControllerReader {
    @Autowired
    private DisciplinaryService disciplinaryService;

    @RequestMapping(value = "/disciplinary/cause/{empId}", method = RequestMethod.GET)
    public ResponseEntity<?> getCause(@PathVariable Integer empId){
        return ResponseEntity.ok(disciplinaryService.getCause(empId));
    }

    @RequestMapping(value = "/disciplinary/report/{empId}", method = RequestMethod.GET)
    public ResponseEntity<?> getEmployeeDisciplinary(@PathVariable Integer empId){
        return ResponseEntity.ok(disciplinaryService.getEmployeeDisciplinaryReport(empId));
    }



}
