package org.omega.hrm.services;

import org.omega.hrm.models.InternalApplicants;
import org.springframework.stereotype.Service;

/**
 * Created by Kass on 12/31/2018.
 */
@Service
public abstract class InternalApplicantsService {

    public abstract InternalApplicants getInternalApplicants();

    public abstract InternalApplicants createInternalApplicants
            (InternalApplicants internalApplicants);

    public abstract void deleteInternalApplicants(Integer id);

    public abstract InternalApplicants editInternalApplicants
            (Integer id, InternalApplicants internalApplicants);

}
