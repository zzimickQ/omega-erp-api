package org.omega.hrm.controllers.readers;

import org.omega.hrm.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/hrm")
public class EmployeeControllerReader {
    @Autowired
    private EmployeeService employeeService;

    @RequestMapping(value = "/employee",method = RequestMethod.GET)
    public ResponseEntity<?> getAllEmployees(){
        return ResponseEntity.ok(employeeService.getEmployees());
    }

    @RequestMapping(value = "/employee/{empId}",method = RequestMethod.GET)
    public ResponseEntity<?> getEmployeeById(@PathVariable Integer empId){

        return ResponseEntity.ok(employeeService.getEmployeeById(empId));
    }

    @RequestMapping(value = "/employee/{empId}/vacDetail",method = RequestMethod.GET)
    public ResponseEntity<?> getVacancyDetailForEmp(@PathVariable Integer empId){
        return ResponseEntity.ok(employeeService.getVacancyDetailForEmp(empId));
    }


    @RequestMapping(value = "/employee/{empId}/emergContact",method = RequestMethod.GET)
    public ResponseEntity<?> getEmployeeEmergencyContact(@PathVariable Integer empId){
        return ResponseEntity.ok(employeeService.getEmployeeEmergencyContact(empId));
    }


    @RequestMapping(value = "/employee/{empId}/phoneNumber",method = RequestMethod.GET)
    public ResponseEntity<?> getPhoneNumbers(@PathVariable Integer empId){
        return ResponseEntity.ok(employeeService.getPhoneNumbers(empId));
    }


    @RequestMapping(value = "/employee/{empId}/leave",method = RequestMethod.GET)
    public ResponseEntity<?> getLeaveHistoryForEmployee(@PathVariable Integer empId){
        return ResponseEntity.ok(employeeService.getLeaveHistoryForEmployee(empId));
    }
}
