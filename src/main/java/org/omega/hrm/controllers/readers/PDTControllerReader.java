package org.omega.hrm.controllers.readers;

import org.omega.hrm.services.PDTService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/hrm")
public class PDTControllerReader {

    @Autowired
    private PDTService pdtService;

    @RequestMapping(value = "/pDT", method = RequestMethod.GET)
    public ResponseEntity<?> getPDT(){
        return ResponseEntity.ok(pdtService.getPDTRequests());
    }

    @RequestMapping(value = "/pDT/{empId}", method = RequestMethod.GET)
    public ResponseEntity<?> getPDTRequestForEmp(@PathVariable Integer empId){
        return ResponseEntity.ok(pdtService.getPDTRequestForEmp(empId));
    }
}
