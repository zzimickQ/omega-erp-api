package org.omega.hrm.controllers.readers;


import org.omega.hrm.services.BranchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/hrm")
public class BranchControllerReader {

    @Autowired
    private BranchService branchService;

    @RequestMapping(value = "/branch", method = RequestMethod.GET)
    public ResponseEntity<?> getBranches(){
        return ResponseEntity.ok(branchService.getAllBranch());
    }

    @RequestMapping(value = "/branch/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> getBranchById(@PathVariable Integer id){
        return ResponseEntity.ok(branchService.getBranchById(id));
    }
}
