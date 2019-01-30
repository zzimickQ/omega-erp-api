package org.omega.hrm.services;

import org.omega.hrm.models.CauseForDisciplinary;
import org.omega.hrm.models.EmployeeDisciplinaryReports;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public abstract class DisciplinaryService {


    public abstract CauseForDisciplinary createCause
            (Integer empID, CauseForDisciplinary cause);

    public abstract List<CauseForDisciplinary> getCause(Integer empId);

    public abstract void deleteCause(Integer empId);

    public abstract CauseForDisciplinary editCause(Integer empId,CauseForDisciplinary cause);


    public abstract EmployeeDisciplinaryReports createEmployeeDisciplinaryReport
            (Integer empId, EmployeeDisciplinaryReports employeeDisciplinaryReports);

    public abstract List<EmployeeDisciplinaryReports> getEmployeeDisciplinaryReport(Integer empID);

    public abstract void deleteEmployeeDisciplinaryReport(Integer empId);

    public abstract EmployeeDisciplinaryReports editEmployeeDisciplinaryReport
            (Integer empId, EmployeeDisciplinaryReports employeeDisciplinary);


}
