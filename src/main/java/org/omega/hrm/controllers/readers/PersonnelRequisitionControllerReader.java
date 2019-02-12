package org.omega.hrm.controllers.readers;

import org.omega.hrm.services.PersonnelRequisitionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/hrm")
public class PersonnelRequisitionControllerReader {
    @Autowired
    private PersonnelRequisitionService personnelRequisitionService;

    @RequestMapping(value = "/personnel_requisition",method = RequestMethod.GET)
    public ResponseEntity<?> getPersonnelRequisition(){
        return ResponseEntity.ok(personnelRequisitionService.getPersonnelRequisition());
    }
}
