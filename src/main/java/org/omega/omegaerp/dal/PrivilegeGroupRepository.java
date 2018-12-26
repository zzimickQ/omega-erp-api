package org.omega.omegaerp.dal;

import org.omega.omegaerp.models.PrivilegeGroup;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

/**
 * Created by Quatra on 12/26/2018.
 */
public interface PrivilegeGroupRepository extends CrudRepository<PrivilegeGroup, Integer> {


    Optional<PrivilegeGroup> findByName(String name);

    boolean existsByName(String name);

}
