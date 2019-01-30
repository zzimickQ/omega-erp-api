package org.omega.hrm.controllers.writers;

import org.omega.hrm.models.Benefit;
import org.omega.hrm.models.BenefitPackage;
import org.omega.hrm.models.BenefitPackageLevel;
import org.omega.hrm.services.BenefitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/hrm")
public class BenefitControllerWriter {
    @Autowired
    private BenefitService benefitService;

    @RequestMapping(value = "/benefit", method = RequestMethod.POST)
    public ResponseEntity<?> createBenefit(@RequestBody Benefit benefit){
        return ResponseEntity.ok(benefitService.createBenefit(benefit));
    }

    @RequestMapping(value = "/benefit/{id}/employee/{empId}", method = RequestMethod.POST)
    public ResponseEntity<?> createBenefitForEmployee
            (@PathVariable Integer id, @PathVariable Integer empId){
        return ResponseEntity.ok(benefitService.createBenefitForEmployee(id, empId));
    }

    @RequestMapping(value = "/benefit/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<?> deleteBenefit
            (@PathVariable Integer id){
        benefitService.deleteBenefit(id);
        return ResponseEntity.ok().build();
    }

    @RequestMapping(value = "/benefit/{id}", method = RequestMethod.PUT)
    public ResponseEntity<?> editBenefit
            (@PathVariable Integer id,@RequestBody Benefit benefit){
        benefitService.editBenefit(id,benefit);
        return ResponseEntity.ok().build();
    }



    @RequestMapping(value = "/benefitpackage", method = RequestMethod.POST)
    public ResponseEntity<?> createBenefitPackage(@RequestBody BenefitPackage benefitPackage){
        return ResponseEntity.ok(benefitService.createBenefitPackages(benefitPackage));
    }

    @RequestMapping(value = "/benefitpackage/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<?> deleteBenefitPackage
            (@PathVariable Integer id){
        benefitService.deleteBenefitPackages(id);
        return ResponseEntity.ok().build();
    }

    @RequestMapping(value = "/benefitpackage/{id}", method = RequestMethod.PUT)
    public ResponseEntity<?> editBenefitPackage
            (@PathVariable Integer id,@RequestBody BenefitPackage benefitPackage){
        benefitService.editBenefitPackages(id,benefitPackage);
        return ResponseEntity.ok().build();
    }



    @RequestMapping(value = "/benefitpackagelevel", method = RequestMethod.POST)
    public ResponseEntity<?> createBenefitPackageLeve(@RequestBody BenefitPackageLevel benefitPackageLevel){
        return ResponseEntity.ok(benefitService.createBenefitPackageLevel(benefitPackageLevel));
    }

    @RequestMapping(value = "/benefitpackagelevel/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<?> deleteBenefitPackageLevel
            (@PathVariable Integer id){
        benefitService.deleteBenefitPackageLevel(id);
        return ResponseEntity.ok().build();
    }

    @RequestMapping(value = "/benefitpackagelevel/{id}", method = RequestMethod.PUT)
    public ResponseEntity<?> editBenefitPackageLevel
            (@PathVariable Integer id,@RequestBody BenefitPackageLevel benefitPackageLevel){
        benefitService.editBenefitPackageLevel(id,benefitPackageLevel);
        return ResponseEntity.ok().build();
    }

}
