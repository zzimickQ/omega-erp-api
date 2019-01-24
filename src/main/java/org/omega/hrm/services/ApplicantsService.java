package org.omega.hrm.services;

import org.omega.hrm.models.Applicants;
import org.omega.hrm.models.Vacancy;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Kass on 12/31/2018.
 */
@Service
public abstract class ApplicantsService {

    public abstract Applicants registerApplication(Vacancy vacancy, Applicants applicant);

    public abstract List<Applicants> getApplicantsForVacancy(Vacancy vacancy);

    public abstract List<Applicants> getApplicants();

    public abstract Applicants getApplicant(Integer applicantId);

    public abstract void deleteApplicants(Integer id);

    public abstract Applicants editApplicants(Integer id,Applicants applicants);

}
