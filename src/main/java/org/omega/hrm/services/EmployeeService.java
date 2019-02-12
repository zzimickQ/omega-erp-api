package org.omega.hrm.services;

import org.omega.hrm.models.*;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public abstract class EmployeeService {
    public abstract List<Employee> getEmployees();
    public abstract Employee getEmployeeById(Integer empId);
    public abstract Vacancy getVacancyDetailForEmp(Integer empId);

    public abstract Employee createEmployee(Employee employee);
    public abstract Employee editEmployee(Integer empId, Employee employee);
    public abstract void deleteEmployee(Integer empId);



    public abstract EmployeeEmergencyContact getEmployeeEmergencyContact(Integer empID);
    public abstract EmployeeEmergencyContact setEmployeeEmergencyContact
            (Integer empID, EmployeeEmergencyContact employeeEmergencyContact);
    public abstract EmployeeEmergencyContact editEmployeeEmergencyContact
            (Integer empID,EmployeeEmergencyContact employeeEmergencyContact);

    public abstract void deleteEmployeeEmergencyContact(Integer empID);



    public abstract List<PhoneNumbers> getPhoneNumbers(Integer empId);
    public abstract void deletePhoneNumber(Integer empId);
    public abstract PhoneNumbers createPhoneNumber(Integer empId, PhoneNumbers phoneNumbers);
    public abstract PhoneNumbers editPhoneNumber(Integer empId, PhoneNumbers phoneNumbers);

    public abstract List<LeaveHistory> getLeaveHistoryForEmployee
            (Integer empId);


}
