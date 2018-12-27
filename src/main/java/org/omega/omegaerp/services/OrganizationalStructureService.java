package org.omega.omegaerp.services;

import org.omega.omegaerp.models.JobPosition;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by Kass on 12/27/2018.
 */
public abstract class OrganizationalStructureService {

    public abstract void setSupervisor
            (JobPosition supervisorJobPosition,
             JobPosition supervisedJobPosition);

    public abstract List<JobPosition> getSupervisor();

    public abstract List<JobPosition> getSupervised();

    public abstract List<JobPosition > getSupervisorByJobPositionId(Integer jobPositionId);

    public abstract List<JobPosition > getSupervisedByJobPositionId(Integer jobPositionId);

    public abstract JobPosition getSupervisorById(Integer supervisedId);

    public abstract void setHeadOfOrg(JobPosition jobPosition);

    public abstract void changeSupervisor
            (JobPosition jobPosition,
             JobPosition newSupervisorJobPosition);

    public abstract void deleteWithSupervisedJobPosition
            (Integer supervisorJobPositionId);

    public abstract void deleteJobPosition(Integer jobPositionId);

    public abstract JobPosition getHierarchyTree();


}
