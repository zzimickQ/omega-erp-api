package org.omega.omegaerp.services;

import org.omega.omegaerp.dal.JobPositionRepository;
import org.omega.omegaerp.exception.JobPositionNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * Created by Kass on 12/26/2018.
 */
@Service
public class JobPositionService {
    @Autowired
    private JobPositionRepository jobPositionRepository;

    @Autowired
    private UserSession userSession;

    public Iterable<org.omega.omegaerp.models.JobPosition> getAll() {
        return jobPositionRepository.findBySupervisor(userSession.getUser().getJobPosition());
    }

    public org.omega.omegaerp.models.JobPosition getById(int id) throws JobPositionNotFoundException {
        Optional<org.omega.omegaerp.models.JobPosition> jobPosition
                = jobPositionRepository.findById(id);
        if(jobPosition.isPresent())
            return jobPosition.get();
        else
            throw new JobPositionNotFoundException(id);
    }



}
