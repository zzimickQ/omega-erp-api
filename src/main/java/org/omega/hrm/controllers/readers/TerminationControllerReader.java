package org.omega.hrm.controllers.readers;

import org.omega.hrm.models.TerminationRequest;
import org.omega.hrm.services.TerminationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/hrm")
public class TerminationControllerReader {
    @Autowired
    private TerminationService terminationService;

    @RequestMapping(value = "/termination",method = RequestMethod.GET)
    public ResponseEntity<?> getTermination(){
        return ResponseEntity.ok(terminationService.getTermination());
    }

    @RequestMapping(value = "/termination/emp/{empId}",method = RequestMethod.GET)
    public ResponseEntity<?> getTerminationForEmployee(@PathVariable Integer empId){
        return ResponseEntity.ok(terminationService.getTerminationForEmployee(empId));
    }
}
