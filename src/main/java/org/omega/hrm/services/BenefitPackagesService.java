package org.omega.hrm.services;

import org.springframework.stereotype.Service;
import org.omega.hrm.models.*;

/**
 * Created by Kass on 12/31/2018.
 */
@Service
public abstract class BenefitPackagesService {
    public abstract BenefitPackage createBenefitPackages(BenefitPackage benefitPackage);

    public abstract BenefitPackage getBenefitPackages();

    public abstract void deleteBenefitPackages(Integer id);

    public abstract BenefitPackage editBenefitPackages(Integer id, BenefitPackage benefitPackage);

}
