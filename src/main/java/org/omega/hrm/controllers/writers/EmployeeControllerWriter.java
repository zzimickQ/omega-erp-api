package org.omega.hrm.controllers.writers;

import org.omega.hrm.models.Employee;
import org.omega.hrm.models.EmployeeEmergencyContact;
import org.omega.hrm.models.PhoneNumbers;
import org.omega.hrm.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/hrm")
public class EmployeeControllerWriter {

    @Autowired
    private EmployeeService employeeService;

    @RequestMapping(value = "/employee",method = RequestMethod.POST)
    public ResponseEntity<?> createEmployee(@RequestBody Employee employee){
        return ResponseEntity.ok(employeeService.createEmployee(employee));
    }

    @RequestMapping(value = "/employee/{empId}",method = RequestMethod.DELETE)
    public ResponseEntity<?> deleteEmployee(@PathVariable Integer empId){
        employeeService.deleteEmployee(empId);
        return ResponseEntity.ok().build();
    }

    @RequestMapping(value = "/employee/{empId}",method = RequestMethod.PUT)
    public ResponseEntity<?> editEmployee(@PathVariable Integer empId, @RequestBody Employee employee){
        return ResponseEntity.ok(employeeService.editEmployee(empId, employee));
    }


    @RequestMapping(value = "/employee/{empId}/emergContact",method = RequestMethod.POST)
    public ResponseEntity<?> setEmployeeEmergencyContact
            (@PathVariable Integer empId,
             @RequestBody EmployeeEmergencyContact employeeEmergencyContact){

            return ResponseEntity.ok(employeeService.setEmployeeEmergencyContact(empId,employeeEmergencyContact));
    }

    @RequestMapping(value = "/employee/{empId}/emergContact",method = RequestMethod.DELETE)
    public ResponseEntity<?> deleteEmployeeEmergencyContact(@PathVariable Integer empId){
        employeeService.deleteEmployeeEmergencyContact(empId);
        return ResponseEntity.ok().build();
    }

    @RequestMapping(value = "/employee/{empId}/emergContact",method = RequestMethod.PUT)
    public ResponseEntity<?> editEmployeeEmergencyContact
            (@PathVariable Integer empId,
             @RequestBody EmployeeEmergencyContact employeeEmergencyContact){

        return ResponseEntity.ok(employeeService.editEmployeeEmergencyContact(empId,employeeEmergencyContact));

    }



    @RequestMapping(value = "/employee/{empId}/phoneNumber",method = RequestMethod.POST)
    public ResponseEntity<?> createPhoneNumber
            (@PathVariable Integer empId, @RequestBody PhoneNumbers phoneNumbers){
        return ResponseEntity.ok(employeeService.createPhoneNumber(empId, phoneNumbers));
    }

    @RequestMapping(value = "/employee/{empId}/phoneNumber",method = RequestMethod.DELETE)
    public ResponseEntity<?> deletePhoneNumber(@PathVariable Integer empId){
        employeeService.deletePhoneNumber(empId);
        return ResponseEntity.ok().build();
    }

    @RequestMapping(value = "/employee/{empId}/phoneNumber",method = RequestMethod.PUT)
    public ResponseEntity<?> editPhoneNumber
            (@PathVariable Integer empId, @RequestBody PhoneNumbers phoneNumbers){
            return ResponseEntity.ok(employeeService.editPhoneNumber(empId, phoneNumbers));
    }

}
