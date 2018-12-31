package org.omega.hrm.services;

import org.omega.hrm.models.PersonnelRequisition;
import org.springframework.stereotype.Service;

/**
 * Created by Kass on 12/31/2018.
 */
@Service
public abstract class PersonnelRequisitionService {
    public abstract PersonnelRequisition getPersonnelRequisition();

    public abstract PersonnelRequisition createPersonnelRequisition
            (PersonnelRequisition internalApplicants);

    public abstract void deleteInternalApplicants(Integer id);

    public abstract PersonnelRequisition editPersonnelRequisition
            (Integer id, PersonnelRequisition personnelRequisition);
}
