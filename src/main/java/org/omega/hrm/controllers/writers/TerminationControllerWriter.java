package org.omega.hrm.controllers.writers;

import org.omega.hrm.models.TerminationRequest;
import org.omega.hrm.services.TerminationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/hrm")
public class TerminationControllerWriter {
    @Autowired
    private TerminationService terminationService;

    @RequestMapping(value = "/termination/emp/{empId}",method = RequestMethod.POST)
    public ResponseEntity<?> createTermination
            (@PathVariable Integer empId, @RequestBody TerminationRequest terminationRequest){
        return ResponseEntity.ok(terminationService.createTermination(terminationRequest, empId));
    }


    @RequestMapping(value = "/termination/emp/{empId}",method = RequestMethod.PUT)
    public ResponseEntity<?> editTermination
            (@PathVariable Integer empId, @RequestBody TerminationRequest terminationRequest){
        return ResponseEntity.ok(terminationService.editTermination(empId, terminationRequest));
    }

    @RequestMapping(value = "/termination/emp/{empId}",method = RequestMethod.DELETE)
    public ResponseEntity<?> deleteTermination (@PathVariable Integer empId){
        terminationService.deleteTermination(empId);
        return ResponseEntity.ok().build();
    }
}
