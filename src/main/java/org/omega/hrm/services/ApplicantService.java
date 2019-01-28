package org.omega.hrm.services;

import org.omega.hrm.models.Applicant;
import org.omega.hrm.models.Vacancy;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Kass on 12/31/2018.
 */
@Service
public abstract class ApplicantService {

    public abstract Applicant registerApplicant(Vacancy vacancy, Applicant applicant);

    public abstract List<Applicant> getApplicantsForVacancy(Vacancy vacancy);

    public abstract List<Applicant> getApplicant();

    public abstract void deleteApplicant (Integer id);

    public abstract Applicant editApplicant(Integer id, Applicant applicant);

}
