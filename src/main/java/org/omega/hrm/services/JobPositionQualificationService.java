package org.omega.hrm.services;

import org.omega.hrm.models.JobPositionQualification;
import org.omega.omegaerp.models.JobPosition;
import org.springframework.stereotype.Service;


@Service
public abstract class JobPositionQualificationService {


    public abstract JobPositionQualification editJobPositionQualification
            (Integer jobPositionId, JobPositionQualification jobPositionQualification);
    public abstract JobPositionQualification setJobPositionQualification
            (Integer jobPositionId, JobPositionQualification jobPositionQualification);
    public abstract void deleteJobPositionQualification
            (Integer id);
    public abstract JobPositionQualification getJOJobPositionQualificationForEmployee
            (String empId);
    public abstract JobPositionQualification getJobPositionQualificationForJobPositionQua
            (Integer jobPositionId);

}
