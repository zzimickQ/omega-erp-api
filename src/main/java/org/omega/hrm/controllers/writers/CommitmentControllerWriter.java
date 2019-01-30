package org.omega.hrm.controllers.writers;


import org.omega.hrm.models.Commitment;
import org.omega.hrm.services.CommitmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/hrm")
public class CommitmentControllerWriter {
    @Autowired
    private CommitmentService commitmentService;

    @RequestMapping(value = "/commitment", method = RequestMethod.POST)
    public ResponseEntity<?> createBranch(@RequestBody Commitment commitment){
        return ResponseEntity.ok(commitmentService.creatCommitment(commitment));
    }

    @RequestMapping(value = "/commitment/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<?> deleteCommitment
            (@PathVariable Integer id){
        commitmentService.deleteCommitment(id);
        return ResponseEntity.ok().build();
    }

    @RequestMapping(value = "/commitment/{id}", method = RequestMethod.PUT)
    public ResponseEntity<?> editCommitment
            (@PathVariable Integer id,@RequestBody Commitment commitment){
        commitmentService.editCommitment(id,commitment);
        return ResponseEntity.ok().build();
    }
}
