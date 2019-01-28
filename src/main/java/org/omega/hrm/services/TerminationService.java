package org.omega.hrm.services;

import org.omega.hrm.models.TerminationRequest;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Kass on 12/31/2018.
 */
@Service
public abstract  class TerminationService {

    public abstract TerminationRequest createTermination
            (TerminationRequest termination, String empId);

    public abstract void deleteTermination(Integer id);

    public abstract TerminationRequest editTermination
            (Integer id, TerminationRequest terminationRequest);

    public abstract List<TerminationRequest> getTermination();
    public abstract List<TerminationRequest> getTerminationForEmployee(String empId);


}
