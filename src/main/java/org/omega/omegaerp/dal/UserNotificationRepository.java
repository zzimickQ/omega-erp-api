package org.omega.omegaerp.dal;

import org.omega.omegaerp.models.UserNotification;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Quatra on 12/27/2018.
 */
public interface UserNotificationRepository extends CrudRepository<UserNotification, Integer> {


    List<UserNotification> findAllByUserId(Integer id);

}
