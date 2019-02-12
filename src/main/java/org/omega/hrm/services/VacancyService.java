package org.omega.hrm.services;

import org.omega.hrm.models.PersonnelRequisition;
import org.omega.hrm.models.Vacancy;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Heka on 12/27/2018.
 */
@Service
public abstract class VacancyService {

    public abstract Vacancy postVacancy(Vacancy vacancy);

    public abstract Vacancy postVacancy(PersonnelRequisition requisition, Vacancy vacancy);

    public abstract Vacancy editVacancy(Integer id, Vacancy vacancy);

    public abstract void deleteVacancy(Integer id);

    public abstract Vacancy getVacancyById(Integer id);

    public abstract List<Vacancy> getAllVacancy();

    public abstract Vacancy rePostVacancy(Integer vacId, Vacancy vacancy);


}

