package org.omega.hrm.controllers.readers;

import org.omega.hrm.models.Vacancy;
import org.omega.hrm.services.VacancyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/hrm")
public class VacancyControllerReader {
    @Autowired
    private VacancyService vacancyService;

    @RequestMapping(value = "/vacancy/{vacId}",method = RequestMethod.GET)
    public ResponseEntity<?> getVacancyById
            (@PathVariable Integer vacId){
        return ResponseEntity.ok(vacancyService.getVacancyById(vacId));
    }


    @RequestMapping(value = "/vacancy",method = RequestMethod.GET)
    public ResponseEntity<?> getAllVacancies(){
        return ResponseEntity.ok(vacancyService.getAllVacancy());
    }

}
