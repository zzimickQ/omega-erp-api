package org.omega.hrm.services;

import org.omega.hrm.model.Vacancy;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Heka on 12/27/2018.
 */
@Service
public  abstract class VacancyService {

    public abstract Vacancy creatVacancy(Vacancy vacancy);

    public abstract Vacancy editVacancy (Integer id, Vacancy vacancy);

    public abstract void deleteVacancy(Integer id);

    public abstract Vacancy getVacancyById(Integer id);

    public abstract List<Vacancy> getAllVacancy();

    public abstract Vacancy repostVacancy(Integer id, Vacancy vacancy);



}

