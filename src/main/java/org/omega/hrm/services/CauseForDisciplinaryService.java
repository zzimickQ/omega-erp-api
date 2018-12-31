package org.omega.hrm.services;

import org.omega.hrm.models.CauseForDisciplinary;
import org.springframework.stereotype.Service;

/**
 * Created by Kass on 12/31/2018.
 */
@Service
public abstract class CauseForDisciplinaryService {
    public abstract CauseForDisciplinary createCause
            (CauseForDisciplinary cause);

    public abstract CauseForDisciplinary getCause();

    public abstract void deleteCause(Integer id);

    public abstract CauseForDisciplinary editCause(Integer id,CauseForDisciplinary cause);

}
