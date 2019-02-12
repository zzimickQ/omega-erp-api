package org.omega.hrm.controllers.readers;

import org.omega.hrm.models.LaborLaw;
import org.omega.hrm.services.LaborLawService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/hrm")
public class LaborLawControllerReader {
    @Autowired
    private LaborLawService laborLawService;



    @RequestMapping("/labor_law")
    public ResponseEntity<?> getLaborLaw(){
        return ResponseEntity.ok(laborLawService.getLaborLawValues());
    }

}
