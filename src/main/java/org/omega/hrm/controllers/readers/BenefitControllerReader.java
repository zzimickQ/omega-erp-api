package org.omega.hrm.controllers.readers;

import org.omega.hrm.services.BenefitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/hrm")
public class BenefitControllerReader {
    @Autowired
    private BenefitService benefitService;

    @RequestMapping(value = "/benefit", method = RequestMethod.GET)
    public ResponseEntity<?> getBenefit(){
        return ResponseEntity.ok(benefitService.getBenefit());
    }

    @RequestMapping(value = "/benefit/{empId}", method = RequestMethod.GET)
    public ResponseEntity<?> getBenefitForEmployee(@PathVariable Integer empId){
        return ResponseEntity.ok(benefitService.getBenefitForEmployee(empId));
    }

    @RequestMapping(value = "/benefitpackage", method = RequestMethod.GET)
    public ResponseEntity<?> getBenefitPackage(){
        return ResponseEntity.ok(benefitService.getBenefitPackages());
    }


    @RequestMapping(value = "/benefitpackagelevel", method = RequestMethod.GET)
    public ResponseEntity<?> getBenefitPackageLevel(){
        return ResponseEntity.ok(benefitService.getBenefitPackageLevel());
    }
}
