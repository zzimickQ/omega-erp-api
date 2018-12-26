package org.omega.omegaerp.dal;

import org.omega.omegaerp.models.JobCategory;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


/**
 * Created by Kass on 12/26/2018.
 */
@Repository
public interface JobCategoryRepository extends CrudRepository<JobCategory,Integer> {

}
