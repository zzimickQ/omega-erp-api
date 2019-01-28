package org.omega.hrm.services;

import org.omega.hrm.models.PerformanceEvaluation;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Kass on 12/31/2018.
 */
@Service
public abstract class PerformanceEvaluationService {


    public abstract PerformanceEvaluation createPerformanceEvaluation
            (Integer evaluatingEmpId, Integer evaluatedEmpId,
             PerformanceEvaluation performanceEvaluation) ;

    public abstract List<PerformanceEvaluation> getPerformanceEvaluation();

    public abstract PerformanceEvaluation getEvaluationByEvaluatedEmpId(Integer id);

    public abstract PerformanceEvaluation getEvaluationByEvaluatingEmpId(Integer id);

    public abstract void deletePerformanceEvaluation(Integer id);

    public abstract PerformanceEvaluation editPerformanceEvaluation
            (Integer pEvaluationId, PerformanceEvaluation performanceEvaluation);
}
