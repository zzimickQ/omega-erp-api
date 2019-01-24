package org.omega.omegaerp.services;

import org.omega.omegaerp.dal.JobPositionRepository;
import org.omega.omegaerp.models.JobPosition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Created by Kass on 12/27/2018.
 */
@Service
public class OrganizationalStructureService {

    @Autowired
    private JobPositionRepository jobPositionRepository;

    public void setSupervisor
            (Integer supervisorJobPositionId,
             Integer supervisedJobPositionId) {
        Optional<JobPosition> jobPositionOptional = jobPositionRepository.findById(supervisedJobPositionId);
        Optional<JobPosition> newSupervisorJobPositionOptional =
                jobPositionRepository.findById(supervisorJobPositionId);

        if (jobPositionOptional.isPresent() && newSupervisorJobPositionOptional.isPresent()) {
            JobPosition jobPosition = jobPositionOptional.get();
            JobPosition newSupervisorJobPosition = newSupervisorJobPositionOptional.get();

            jobPosition.setSupervisor(newSupervisorJobPosition);
            jobPositionRepository.save(jobPosition);
        }
    }

    public JobPosition getSupervisorById(Integer supervisedId) {
        Optional<JobPosition> jobPositionOptional = jobPositionRepository.findById(supervisedId);
        if (jobPositionOptional.isPresent()) {
            return jobPositionOptional.get().getSupervisor();
        }
        return null;
    }

    public void setHeadOfOrg(JobPosition jobPosition) {
        if (isOrgHeadSet()) {
            return;
        }

        jobPosition.setSupervisor(null);
        jobPositionRepository.save(jobPosition);

    }

    public boolean isOrgHeadSet() {
        return getHierarchyTree() != null;
    }

    public void changeSupervisor
            (Integer jobPositionId,
             Integer newSupervisorJobPositionId) {
        Optional<JobPosition> jobPositionOptional = jobPositionRepository.findById(jobPositionId);
        Optional<JobPosition> newSupervisorJobPositionOptional =
                jobPositionRepository.findById(newSupervisorJobPositionId);

        if (jobPositionOptional.isPresent() && newSupervisorJobPositionOptional.isPresent()) {
            JobPosition jobPosition = jobPositionOptional.get();
            JobPosition newSupervisorJobPosition = newSupervisorJobPositionOptional.get();

            jobPosition.setSupervisor(newSupervisorJobPosition);
            jobPositionRepository.save(jobPosition);
        }

    }

    public void deleteWithSupervisedJobPosition
            (Integer supervisorJobPositionId) {
        Optional<JobPosition> jobPositionOptional = jobPositionRepository.findById(supervisorJobPositionId);
        if (jobPositionOptional.isPresent()) {
            JobPosition jobPosition = jobPositionOptional.get();
            jobPositionRepository.delete(jobPosition);
        }
    }

    public boolean deleteJobPosition(Integer jobPositionId) {
        Optional<JobPosition> jobPositionOptional = jobPositionRepository.findById(jobPositionId);
        if (jobPositionOptional.isPresent()) {
            JobPosition jobPosition = jobPositionOptional.get();
            if (jobPosition.getSupervises().isEmpty()) {
                jobPositionRepository.delete(jobPosition);
                return true;
            }
        }
        return false; // cant delete jobposition because it is a supervising job.
    }

    public JobPosition getHierarchyTree() {
        List<JobPosition> jobPositions = jobPositionRepository.findBySupervisor(null);
        if (!jobPositions.isEmpty()) {
            return jobPositions.get(0);
        }
        return null;
    }

    public void getHeadOfOrg(){


    }


}
