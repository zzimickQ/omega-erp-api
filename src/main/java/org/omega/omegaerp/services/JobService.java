package org.omega.omegaerp.services;

import org.omega.omegaerp.models.*;
import org.omega.omegaerp.models.JobPosition;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Kass on 12/26/2018.
 */
@Service
public abstract class JobService {

    public abstract JobCategory createCategory
            (JobCategory jobCategory);

    public abstract JobCategory editCategory
            (Integer id,JobCategory jobCategory);

    public abstract void deleteCategory(Integer id);

    public abstract JobPosition createJobPosition
            (Integer id, JobPosition jobPosition);

    public abstract JobCategory editJobPosition
            (Integer id,JobPosition jobPosition);

    public abstract void deleteJobPosition(Integer id);

    public abstract void assignJobPrivilege(Integer jobId, Integer privilegeId);

    public abstract void removeJobPrivilege(Integer jobId, Integer privilegeId);

    public abstract List<JobCategory> getAllCategories();

    public abstract List<JobPosition> getAllJobPosition();

    public abstract List<JobPosition> getAllJobPositionInCategories();

    public abstract JobPosition getJobPositionById();
}
