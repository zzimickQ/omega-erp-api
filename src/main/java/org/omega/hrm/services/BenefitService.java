package org.omega.hrm.services;

import org.omega.hrm.models.Benefit;
import org.springframework.stereotype.Service;

/**
 * Created by Kass on 12/31/2018.
 */
@Service
public abstract class BenefitService {
    public abstract Benefit createBenefit(Benefit benefit);

    public abstract Benefit getBenefit();

    public abstract void deleteBenefit(Integer id);

    public abstract Benefit editBenefit(Integer id,Benefit benefit);

}
