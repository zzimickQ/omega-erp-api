package org.omega.hrm.services;

import org.omega.hrm.models.Benefit;
import org.omega.hrm.models.BenefitPackage;
import org.omega.hrm.models.BenefitPackageLevel;
import org.springframework.stereotype.Service;

/**
 * Created by Kass on 12/31/2018.
 */
@Service
public abstract class BenefitService {
    public abstract Benefit createBenefit(Benefit benefit);
    public abstract Benefit createBenefitForEmployee(Integer benefitId, Integer empId);

    public abstract Benefit getBenefitForEmployee(Integer empId);

    public abstract Benefit getBenefit();

    public abstract void deleteBenefit(Integer id);

    public abstract Benefit editBenefit(Integer id,Benefit benefit);


    public abstract BenefitPackage createBenefitPackages(BenefitPackage benefitPackage);

    public abstract BenefitPackage getBenefitPackages();

    public abstract void deleteBenefitPackages(Integer id);

    public abstract BenefitPackage editBenefitPackages(Integer id, BenefitPackage benefitPackage);


    public abstract BenefitPackageLevel createBenefitPackageLevel
            (BenefitPackageLevel benefitPackageLevel);

    public abstract BenefitPackageLevel getBenefitPackageLevel();

    public abstract void deleteBenefitPackageLevel(Integer id);

    public abstract BenefitPackageLevel editBenefitPackageLevel
            (Integer id,BenefitPackageLevel benefitPackageLevel);

}
