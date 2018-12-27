package org.omega.omegaerp.dal;

import org.omega.omegaerp.models.Notification;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Heka on 12/26/2018.
 */
@Repository
public interface NotificationRepostary extends CrudRepository<Notification, Integer>{

}
