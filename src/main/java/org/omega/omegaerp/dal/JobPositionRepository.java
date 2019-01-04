package org.omega.omegaerp.dal;

import org.omega.omegaerp.models.JobPosition;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Kass on 12/26/2018.
 */
@Repository
public interface JobPositionRepository extends CrudRepository<JobPosition,Integer> {
    List<JobPosition> findBySupervisor(JobPosition jp);
    List<JobPosition> findByCategoryId(Integer categoryId);
}
