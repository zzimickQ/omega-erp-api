package org.omega.hrm.controllers.writers;

import org.omega.hrm.models.PerformanceEvaluation;
import org.omega.hrm.services.PerformanceEvaluationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/hrm")
public class PerformanceEvaluationControllerWriter {
    @Autowired
    private PerformanceEvaluationService performanceEvaluationService;

    @RequestMapping(value = "/performance_evaluation/evaluatingEmpId/" +
            "{evaluatingEmpId}/evaluatedEmpId/{evaluatedEmpId}",method = RequestMethod.POST)
    public ResponseEntity<?> createPerformanceEvaluation
            ( @PathVariable Integer evaluatingEmpId, @PathVariable Integer evaluatedEmpId,
             @RequestBody PerformanceEvaluation performanceEvaluation){
        return ResponseEntity.ok
                (performanceEvaluationService.createPerformanceEvaluation
                        (evaluatingEmpId,evaluatedEmpId,performanceEvaluation));
    }

    @RequestMapping(value = "/performance_evaluation/{pEvaluationId}",method = RequestMethod.PUT)
    public ResponseEntity<?> editPerformanceEvaluation
            (@PathVariable Integer pEvaluationId,
             @RequestBody PerformanceEvaluation performanceEvaluation){

        return ResponseEntity.ok(performanceEvaluationService.editPerformanceEvaluation
                (pEvaluationId,performanceEvaluation));
    }

    @RequestMapping(value = "/performance_evaluation/{pEvaluationId}",method = RequestMethod.DELETE)
    public ResponseEntity<?> deletePerformanceEvaluation(@PathVariable Integer pEvaluationId){
        performanceEvaluationService.deletePerformanceEvaluation(pEvaluationId);
        return ResponseEntity.ok().build();
    }
}
