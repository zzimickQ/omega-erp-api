package org.omega.hrm.controllers.writers;

import org.omega.hrm.models.PDTRequests;
import org.omega.hrm.services.PDTService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/hrm")
public class PDTControllerWriter {
    @Autowired
    private PDTService pdtService;

    @RequestMapping(value = "/pdt/{empId}", method = RequestMethod.POST)
    public ResponseEntity<?> setPdt
            (@PathVariable Integer empId, @RequestBody PDTRequests pdtRequests){
        return ResponseEntity.ok(pdtService.setPDT(empId, pdtRequests));
    }

    @RequestMapping(value = "/pdt/{empId}", method = RequestMethod.PUT)
    public ResponseEntity<?> editPDT
            (@PathVariable Integer empId, @RequestBody PDTRequests pdtRequests){
        return ResponseEntity.ok(pdtService.editPDT(empId, pdtRequests));
    }

    @RequestMapping(value = "/pdt/{empId}", method = RequestMethod.DELETE)
    public ResponseEntity<?> deletePDT
            (@PathVariable Integer empId){
        pdtService.deletePDT(empId);
        return ResponseEntity.ok().build();
    }

}