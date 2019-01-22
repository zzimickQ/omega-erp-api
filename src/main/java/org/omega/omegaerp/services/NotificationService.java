package org.omega.omegaerp.services;

import org.springframework.stereotype.Service;

/**
 * Created by Heka on 12/26/2018.
 */
@Service
public class NotificationService {
/*

    @Autowired
    private NotificationRepository notificationRepository;


    @Autowired
    private UserNotificationRepository userNotificationRepository;

    public List<UserNotification> getNotifications(User forUser) {
        return userNotificationRepository
                .findAllByUserId(forUser.getId());
    }

    public List<Notification> getSentNotifications(User forUser) {
        return notificationRepository.findAllByUserId(forUser.getId());
    }

    public void sendNotification(Notification notification, List<User> forUsers) {
        notificationRepository.save(notification);
        List<UserNotification> notifs = new ArrayList<>();
        for (User user : forUsers) {
            UserNotification uNotif = new UserNotification();
            uNotif.setUser(user);
            uNotif.setNotification(notification);
            notifs.add(uNotif);
        }
        userNotificationRepository.saveAll(notifs);
    }

    public void updateNotification(Notification notification) {
        notificationRepository.save(notification);
    }


    public void deleteNotification(int id) {
        notificationRepository.deleteById(id);
    }

*/

}
