package org.omega.hrm.controllers.readers;

import org.omega.hrm.services.CommitmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/hrm")
public class ComittmentControllerReader {

    @Autowired
    private CommitmentService commitmentService;

    @RequestMapping(value = "/commitment", method = RequestMethod.GET)
    public ResponseEntity<?> getAllCommitment(){
        return ResponseEntity.ok(commitmentService.getAllCommitment());
    }

    @RequestMapping(value = "/commitment/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> getCommitmentById(@PathVariable Integer id){
        return ResponseEntity.ok(commitmentService.getCommitmentById(id));
    }

    @RequestMapping(value = "/commitment/emp/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> getCommitmentsForEmployee(@PathVariable Integer id){
        return ResponseEntity.ok(commitmentService.getCommitmentsForEmployee(id));
    }

}
