package org.omega.hrm.controllers.readers;

import org.omega.hrm.services.PerformanceEvaluationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/hrm")
public class PerformanceEvaluationControllerReader {
    @Autowired
    private PerformanceEvaluationService performanceEvaluationService;

    @RequestMapping(value = "/performance_evaluation",method = RequestMethod.GET)
    public ResponseEntity<?> getPerformanceEvaluation(){
        return ResponseEntity.ok(performanceEvaluationService.getPerformanceEvaluation());
    }

    @RequestMapping(value = "/performance_evaluation/{evaluatedEmpId}",method = RequestMethod.GET)
    public ResponseEntity<?> getEvaluationByEvaluatedEmpId(@PathVariable Integer evaluatedEmpId){
        return ResponseEntity.ok(performanceEvaluationService.getEvaluationByEvaluatedEmpId(evaluatedEmpId));
    }

    @RequestMapping(value = "/performance_evaluation/{evaluatingEmpId}",method = RequestMethod.GET)
    public ResponseEntity<?> getEvaluationByEvaluatingEmpId(@PathVariable Integer evaluatingEmpId){
        return ResponseEntity.ok(performanceEvaluationService.getEvaluationByEvaluatingEmpId(evaluatingEmpId));
    }


}
