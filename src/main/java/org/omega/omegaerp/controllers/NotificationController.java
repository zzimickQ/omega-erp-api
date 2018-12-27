package org.omega.omegaerp.controllers;

import org.omega.omegaerp.models.Notification;
import org.omega.omegaerp.services.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Heka on 12/26/2018.
 */
@RestController
public class NotificationController {

    @Autowired
    private NotificationService notificationService;

    @RequestMapping("/notif")
    public List<Notification> allnotif(){
        return notificationService.getNotifications();

    }

    @RequestMapping("/notif/{id}")
    public org.omega.omegaerp.models.Notification getNotification(@PathVariable int id){
        return notificationService.getNotification(id);

    }



    @RequestMapping(method = RequestMethod.POST, value ="/notif" )
    public void addNotification(@RequestBody Notification notification) {
        notificationService.addNotification(notification);

    }

    @RequestMapping(method = RequestMethod.PUT, value ="/notif/{id}" )
    public void updateNotification(@RequestBody Notification notification, @PathVariable int id){
        notificationService.updateNotification(id, notification);
    }


    @RequestMapping(method = RequestMethod.DELETE, value = "/notif/{id}")
    public void deleteNotification(@PathVariable int id){
        notificationService.deleteNotification(id);
    }




}
