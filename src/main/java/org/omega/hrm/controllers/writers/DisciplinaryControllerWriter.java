package org.omega.hrm.controllers.writers;

import org.omega.hrm.models.CauseForDisciplinary;
import org.omega.hrm.models.EmployeeDisciplinaryReport;
import org.omega.hrm.services.DisciplinaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/hrm")
public class DisciplinaryControllerWriter {
    @Autowired
    private  DisciplinaryService disciplinaryService;

    @RequestMapping(value = "/disciplinary/cause/{empId}", method = RequestMethod.POST)
    public ResponseEntity<?> createCause
            (@PathVariable Integer empId,
             @RequestBody CauseForDisciplinary causeForDisciplinary){
        return ResponseEntity.ok(disciplinaryService.createCause(empId, causeForDisciplinary));
    }

    @RequestMapping(value = "/disciplinary/cause/{empId}", method = RequestMethod.DELETE)
    public ResponseEntity<?> deleteCause(@PathVariable Integer empId){
        disciplinaryService.deleteCause(empId);
        return ResponseEntity.ok().build();
    }

    @RequestMapping(value = "/disciplinary/cause/{empId}", method = RequestMethod.PUT)
    public ResponseEntity<?> editCause
            (@PathVariable Integer empId,
             @RequestBody CauseForDisciplinary causeForDisciplinary){
        return ResponseEntity.ok(disciplinaryService.editCause(empId, causeForDisciplinary));
    }


    @RequestMapping(value = "/disciplinary/report/{empId}", method = RequestMethod.POST)
    public ResponseEntity<?> createEmployeeDisciplinaryReportCause
            (@PathVariable Integer empId,
             @RequestBody EmployeeDisciplinaryReport causeForDisciplinary){
        return ResponseEntity.ok(disciplinaryService.createEmployeeDisciplinaryReport(empId, causeForDisciplinary));
    }

    @RequestMapping(value = "/disciplinary/report/{empId}", method = RequestMethod.DELETE)
    public ResponseEntity<?> deleteEmployeeDisciplinaryReport(@PathVariable Integer empId){
        disciplinaryService.deleteEmployeeDisciplinaryReport(empId);
        return ResponseEntity.ok().build();
    }

    @RequestMapping(value = "/disciplinary/report/{empId}", method = RequestMethod.PUT)
    public ResponseEntity<?> editEmployeeDisciplinaryReport
            (@PathVariable Integer empId,
             @RequestBody EmployeeDisciplinaryReport causeForDisciplinary){
        return ResponseEntity.ok(disciplinaryService.editEmployeeDisciplinaryReport(empId, causeForDisciplinary));
    }
}
