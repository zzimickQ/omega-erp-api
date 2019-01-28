package org.omega.hrm.services;

import org.omega.hrm.models.CauseForDisciplinary;
import org.omega.hrm.models.EmployeeDisciplinaryReports;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public abstract class DsciplinaryService {

    public abstract CauseForDisciplinary createCause
            (String empID, CauseForDisciplinary cause);
    public abstract List<CauseForDisciplinary> getCause(String empId);
    public abstract void deleteCause(String empId);
    public abstract CauseForDisciplinary editCause(String empId,CauseForDisciplinary cause);


    public abstract EmployeeDisciplinaryReports createEmployeeDisciplinary
            (String empId, EmployeeDisciplinaryReports employeeDisciplinaryReports);
    public abstract List<EmployeeDisciplinaryReports> getEmployeeDisciplinary(String empID);
    public abstract void deleteEmployeeDisciplinary(String empId);
    public abstract EmployeeDisciplinaryReports editEmployeeDisciplinary
            (String empId, EmployeeDisciplinaryReports employeeDisciplinary);


}
