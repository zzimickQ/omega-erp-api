package org.omega.omegaerp.services;

import org.omega.omegaerp.dal.JobCategoryRepository;
import org.omega.omegaerp.dal.JobPositionRepository;
import org.omega.omegaerp.dal.PrivilegeRepository;
import org.omega.omegaerp.models.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Created by Kass on 12/26/2018.
 */
@Service
public class JobService {

    @Autowired
    private JobCategoryRepository jobCategoryRepository;

    @Autowired
    private JobPositionRepository jobPositionRepository;

    @Autowired
    private PrivilegeRepository privilegeRepository;

    public JobCategory createCategory
            (JobCategory jobCategory) {
        return jobCategoryRepository.save(jobCategory);
    }

    public JobCategory editCategory
            (Integer id,JobCategory jobCategory) {
        Optional<JobCategory> correctJobCategory = jobCategoryRepository.findById(id);
        if (correctJobCategory.isPresent()) {
            JobCategory jobCategoryToSave = correctJobCategory.get();
            jobCategoryToSave.setName(jobCategory.getName());
            jobCategoryToSave.setDescription(jobCategory.getDescription());
            return jobCategoryRepository.save(jobCategoryToSave);
        }
        return null;
    }

    public void deleteCategory(Integer id) {
        jobCategoryRepository.delete(new JobCategory(id));
    }

    public JobPosition createJobPosition
            (Integer jobCategoryId, JobPosition jobPosition) {
        Optional<JobCategory> optionalJobCategory = jobCategoryRepository.findById(jobCategoryId);
        if (optionalJobCategory.isPresent()) {
            JobCategory jobCategory = optionalJobCategory.get();
            jobPosition.setCategory(jobCategory);
            return jobPositionRepository.save(jobPosition);
        }
        return null;
    }

    public JobPosition editJobPosition
            (Integer jobPositionId, JobPosition jobPosition) {
        Optional<JobPosition> optionalJobPosition = jobPositionRepository.findById(jobPositionId);
        if (optionalJobPosition.isPresent()) {
            JobPosition position = optionalJobPosition.get();
            position.setLevel(jobPosition.getLevel());
            position.setTitle(jobPosition.getTitle());
            position.setDescription(jobPosition.getDescription());
            return jobPositionRepository.save(position);
        }
        return null;
    }

    public void deleteJobPosition(Integer jobPositionId) {
        jobPositionRepository.delete(new JobPosition(jobPositionId));
    }

    public void assignJobPrivilege(Integer jobId, Integer privilegeId) {
        Optional<JobPosition> optionalJobPosition = jobPositionRepository.findById(jobId);
        Optional<Privilege> optionalPrivilege = privilegeRepository.findById(privilegeId);
        if (optionalJobPosition.isPresent() && optionalPrivilege.isPresent()) {
            JobPosition jobPosition = optionalJobPosition.get();
            Privilege privilege = optionalPrivilege.get();
            jobPosition.getDefaultPrivileges().add(privilege);
            jobPositionRepository.save(jobPosition);
        }
    }

    public void removeJobPrivilege(Integer jobId, Integer privilegeId) {
        Optional<JobPosition> optionalJobPosition = jobPositionRepository.findById(jobId);
        Optional<Privilege> optionalPrivilege = privilegeRepository.findById(privilegeId);
        if (optionalJobPosition.isPresent() && optionalPrivilege.isPresent()) {
            JobPosition jobPosition = optionalJobPosition.get();
            Privilege privilege = optionalPrivilege.get();
            jobPosition.getDefaultPrivileges().remove(privilege);
            jobPositionRepository.save(jobPosition);
        }
    }

    public List<JobCategory> getAllCategories() {
        return (List<JobCategory>) jobCategoryRepository.findAll();
    }

    public List<JobPosition> getAllJobPosition() {
        return (List<JobPosition>) jobPositionRepository.findAll();
    }

    public List<JobPosition> getAllJobPositionInCategory(Integer categoryId) {
        return jobPositionRepository.findByCategoryId(categoryId);
    }

    public JobPosition getJobPositionById(Integer jobPositionId) {
        Optional<JobPosition> optionalJobPosition = jobPositionRepository.findById(jobPositionId);
        if (optionalJobPosition.isPresent()) {
            return optionalJobPosition.get();
        }
        return null;
    }

}
