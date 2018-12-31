package org.omega.hrm.services;

import org.omega.hrm.models.PerformanceEvaluation;
import org.springframework.stereotype.Service;

/**
 * Created by Kass on 12/31/2018.
 */
@Service
public abstract class PerformanceEvaluationService {
    public abstract PerformanceEvaluation getPerformanceEvaluation();

    public abstract PerformanceEvaluation createPerformanceEvaluation
            (PerformanceEvaluation performanceEvaluation);

    public abstract void deletePerformanceEvaluation(Integer id);

    public abstract PerformanceEvaluation editPerformanceEvaluation
            (Integer id, PerformanceEvaluation performanceEvaluation);
}
