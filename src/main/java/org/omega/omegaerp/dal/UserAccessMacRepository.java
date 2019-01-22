package org.omega.omegaerp.dal;

import org.omega.omegaerp.models.UserAccessMac;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Zzimick on 1/15/2019.
 */
public interface UserAccessMacRepository extends CrudRepository<UserAccessMac, Integer> {

    List<UserAccessMac> findByUserIdAndActive(Integer userId, boolean active);

}
