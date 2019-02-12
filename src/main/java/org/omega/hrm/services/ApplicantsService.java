package org.omega.hrm.services;

import org.omega.hrm.models.Applicant;
import org.omega.hrm.models.Vacancy;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Kass on 12/31/2018.
 */
@Service
public abstract class ApplicantsService {

    public abstract Applicant registerApplication(Vacancy vacancy, Applicant applicant);

    public abstract List<Applicant> getApplicantsForVacancy(Vacancy vacancy);

    public abstract List<Applicant> getApplicants();

    public abstract Applicant getApplicant(Integer applicantId);

    public abstract void deleteApplicants(Integer id);

    public abstract Applicant editApplicants(Integer id, Applicant applicants);

}
