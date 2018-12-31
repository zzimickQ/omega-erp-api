package org.omega.hrm.services;

import org.springframework.stereotype.Service;

/**
 * Created by Kass on 12/31/2018.
 */
@Service
public abstract class BenefitPackageLevelService {
    public abstract Applicants createApplicants(Applicants applicants);

    public abstract Applicants getApplicants();

    public abstract void deleteApplicants(Integer id);

    public abstract Applicants editApplicants(Integer id,Applicants applicants);

}
