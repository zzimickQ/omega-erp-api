package org.omega.hrm.services;

import org.omega.hrm.models.Benefit;
import org.springframework.stereotype.Service;

/**
 * Created by Kass on 12/31/2018.
 */
@Service
public class BenefitService {
    public abstract Benefit createApplicants(Applicants applicants);

    public abstract Applicants getApplicants();

    public abstract void deleteApplicants(Integer id);

    public abstract Applicants editApplicants(Integer id,Applicants applicants);

}
