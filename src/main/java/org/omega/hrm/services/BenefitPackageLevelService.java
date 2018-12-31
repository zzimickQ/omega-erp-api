package org.omega.hrm.services;

import org.omega.hrm.models.BenefitPackageLevel;
import org.springframework.stereotype.Service;

/**
 * Created by Kass on 12/31/2018.
 */
@Service
public abstract class BenefitPackageLevelService {
    public abstract BenefitPackageLevel createBenefitPackageLevel
            (BenefitPackageLevel applicants);

    public abstract BenefitPackageLevel getBenefitPackageLevel();

    public abstract void deleteBenefitPackageLevel(Integer id);

    public abstract BenefitPackageLevel editBenefitPackageLevel
            (Integer id,BenefitPackageLevel benefitPackageLevel);

}
