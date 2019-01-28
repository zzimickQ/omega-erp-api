package org.omega.hrm.services;

import org.omega.hrm.models.*;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public abstract class EmployeeService {
    public abstract List<Employee> getEmployees();
    public abstract Employee getEmployeeById(String empId);
    public abstract Vacancy getVacancydetailForEmp(String empId);

    public abstract Employee createEmployee(Employee employee);
    public abstract Employee editEmployee(String empId, Employee employee);
    public abstract void delteEmployee(String empId);



    public abstract EmployeeEmergancyContact getEmployeeEmergancyContact(String empID);
    public abstract EmployeeEmergancyContact setEmployeeEmergancyContact
            (String empID, EmployeeEmergancyContact employeeEmergancyContact);
    public abstract EmployeeEmergancyContact editEmployeeEmergancyContact(String empID);
    public abstract void deleteEmployeeEmergancyContact(String empID);



    public abstract List<PhoneNumbers> getPhoneNumbers(String empId);
    public abstract void deletePhoneNumber(String empId);
    public abstract PhoneNumbers createPhoneNumber(String empId, PhoneNumbers phoneNumbers);
    public abstract PhoneNumbers editPhoneNumber(String empId, PhoneNumbers phoneNumbers);

    public abstract List<LeaveHistory> getLeaveHistoryForEmployee
            (String empId);


}
