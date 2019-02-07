package org.omega.hrm.controllers.writers;

import org.omega.hrm.models.PersonnelRequisition;
import org.omega.hrm.services.PersonnelRequisitionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/hrm")
public class PersonnelRequisitionControllerWriter {

    @Autowired
    private PersonnelRequisitionService personnelRequisitionService;

    @RequestMapping(value = "/personnel_requisition",method = RequestMethod.POST)
    public ResponseEntity<?> createPersonnelRequisition
            (@RequestBody PersonnelRequisition personnelRequisition){
        return ResponseEntity.ok(personnelRequisitionService.
                createPersonnelRequisition(personnelRequisition));
    }

    @RequestMapping(value = "/personnel_requisition/{id}",method = RequestMethod.PUT)
    public ResponseEntity<?> editPersonnelRequisition
            (@PathVariable Integer id, @RequestBody PersonnelRequisition personnelRequisition){
        return ResponseEntity.ok(personnelRequisitionService.
                editPersonnelRequisition(id,personnelRequisition));
    }

    @RequestMapping(value = "/personnel_requisition/{id}",method = RequestMethod.DELETE)
    public ResponseEntity<?> deletePersonnelRequisition
            (@PathVariable Integer id, @RequestBody PersonnelRequisition personnelRequisition){
        personnelRequisitionService.deletePersonnelRequisition(id);
        return ResponseEntity.ok().build();
    }


}
