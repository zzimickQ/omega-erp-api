package org.omega.hrm.services;

import org.omega.hrm.models.EmployeeDisciplinaryReports;
import org.springframework.stereotype.Service;

/**
 * Created by Kass on 12/31/2018.
 */
@Service
public abstract class EmployeeDisciplinaryService {
    public abstract EmployeeDisciplinaryReports createEmployeeDisciplinary
            (EmployeeDisciplinaryReports employeeDisciplinaryReports);

    public abstract EmployeeDisciplinaryReports getEmployeeDisciplinary();

    public abstract void deleteEmployeeDisciplinary(Integer id);

    public abstract EmployeeDisciplinaryReports editEmployeeDisciplinary
            (Integer id,EmployeeDisciplinaryReports employeeDisciplinary);

}
