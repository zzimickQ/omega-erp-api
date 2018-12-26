package org.omega.omegaerp.dal;

import org.omega.omegaerp.models.Notification;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Heka on 12/26/2018.
 */
public interface NotificationRepostary extends CrudRepository<Notification, String>{
}
