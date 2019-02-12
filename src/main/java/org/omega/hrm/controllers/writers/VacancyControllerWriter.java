package org.omega.hrm.controllers.writers;

import org.omega.hrm.models.Vacancy;
import org.omega.hrm.services.VacancyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/hrm")
public class VacancyControllerWriter {
    @Autowired
    private VacancyService vacancyService;

    @RequestMapping(value = "/vacancy/{vacId}",method = RequestMethod.PUT)
    public ResponseEntity<?> editVacancy
            (@PathVariable Integer vacId, @RequestBody Vacancy vacancy){
        return ResponseEntity.ok(vacancyService.editVacancy(vacId, vacancy));
    }

    @RequestMapping(value = "/vacancy/{vacId}",method = RequestMethod.DELETE)
    public ResponseEntity<?> deleteVacancy
            (@PathVariable Integer vacId){
        vacancyService.deleteVacancy(vacId);
        return ResponseEntity.ok().build();
    }


    @RequestMapping(value = "/vacancy/{vacId}",method = RequestMethod.POST)
    public ResponseEntity<?> rePostVacancy
            (@PathVariable Integer vacId, @RequestBody Vacancy vacancy){
        return ResponseEntity.ok(vacancyService.rePostVacancy(vacId, vacancy));
    }

    @RequestMapping(value = "/vacancy",method = RequestMethod.POST)
    public ResponseEntity<?> postVacancy(@RequestBody Vacancy vacancy){
        return ResponseEntity.ok(vacancyService.postVacancy(vacancy));
    }

}
