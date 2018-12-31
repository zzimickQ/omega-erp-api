package org.omega.hrm.services;

import org.omega.hrm.models.LaborLaw;
import org.springframework.stereotype.Service;

/**
 * Created by Kass on 12/31/2018.
 */
@Service
public abstract class LaborLawService {
    public abstract LaborLaw geLaborLawValues();

    public abstract LaborLaw createLaborLaw
            (LaborLaw laborLaw);

    public abstract void deleteInternalApplicants(Integer id);

    public abstract LaborLaw editLaborLaw
            (Integer id, LaborLaw laborLaw);
}
