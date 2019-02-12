package org.omega.hrm.controllers.writers;

import org.omega.hrm.models.LaborLaw;
import org.omega.hrm.services.LaborLawService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/hrm")

public class LaborLawControllerWriter {
    @Autowired
    private LaborLawService laborLawService;

    @RequestMapping(value = "/labor_law/{labLawId}",method = RequestMethod.PUT)
    public ResponseEntity<?> editLaborLaw
            (@PathVariable Integer labLawId, @RequestBody LaborLaw laborLaw){
        return ResponseEntity.ok(laborLawService.editLaborLaw(labLawId, laborLaw));
    }

    @RequestMapping(value = "/labor_law/{labLawId}",method = RequestMethod.DELETE)
    public ResponseEntity<?> deleteLaborLaw(@PathVariable Integer labLawId){

        laborLawService.deleteLaborLawValues(labLawId);
        return ResponseEntity.ok().build();
    }

    @RequestMapping(value = "/labor_law",method = RequestMethod.POST)
    public ResponseEntity<?> createLaborLaw(@RequestBody LaborLaw laborLaw){

        return ResponseEntity.ok(laborLawService.createLaborLaw(laborLaw));
    }


}
