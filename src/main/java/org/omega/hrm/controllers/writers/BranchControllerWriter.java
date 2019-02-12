package org.omega.hrm.controllers.writers;


import org.omega.hrm.models.Branch;
import org.omega.hrm.services.BranchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/hrm")
public class BranchControllerWriter {

    @Autowired
    private BranchService branchService;

    @RequestMapping(value = "/branch", method = RequestMethod.POST)
    public ResponseEntity<?> createBranch(@RequestBody Branch branch){
        return ResponseEntity.ok(branchService.creatBranch(branch));
    }

    @RequestMapping(value = "/branch/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<?> deleteBranch
            (@PathVariable Integer id){
        branchService.deleteBranch(id);
        return ResponseEntity.ok().build();
    }

    @RequestMapping(value = "/branch/{id}", method = RequestMethod.PUT)
    public ResponseEntity<?> editBranch
            (@PathVariable Integer id,@RequestBody Branch branch){
        branchService.editBranch(id,branch);
        return ResponseEntity.ok().build();
    }

}
