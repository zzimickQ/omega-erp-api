package org.omega.omegaerp.services;

import org.omega.omegaerp.dal.NotificationRepostary;
import org.omega.omegaerp.models.Notification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Heka on 12/26/2018.
 */
@Service
public class NotificationService {

    @Autowired
     private NotificationRepostary notificationRepostary;

    private List<Notification> notifications = new ArrayList<>(Arrays.asList(

//            new Notification()
    ));
    public List<Notification> getNotifications(){
        List<Notification> notifications = new ArrayList<>();
        notificationRepostary.findAll()
                .forEach(notifications::add);
        return notifications;
    }

    public Notification getNotification(int id) {
        return notificationRepostary.findById(id).get();
    }


    public void addNotification (Notification notification){
       notificationRepostary.save(notification);
    }


    public void updateNotification(int id, Notification notification) {
        notificationRepostary.save(notification);
    }


    public void deleteNotification(int id){
        notificationRepostary.deleteById(id);
    }



}
