package org.omega.hrm.controllers.readers;

import org.omega.hrm.services.ScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/hrm/schedule")
public class ScheduleControllerReader {
    @Autowired
    private ScheduleService scheduleService;

    @RequestMapping(value = "/time_schedule",method = RequestMethod.GET)
    public ResponseEntity<?> getTimeSchedule(){
        return ResponseEntity.ok(scheduleService.getTimeSchedule());
    }

    @RequestMapping(value = "/time_schedule/emp/{empId}",method = RequestMethod.GET)
    public ResponseEntity<?> getTimeScheduleForEmployee(@PathVariable Integer empId){
        return ResponseEntity.ok(scheduleService.getTimeScheduleForEmployee(empId));
    }

    @RequestMapping(value = "/weekly_schedule",method = RequestMethod.GET)
    public ResponseEntity<?> getWeeklySchedule(){
        return ResponseEntity.ok(scheduleService.getWeeklySchedule());
    }

    @RequestMapping(value = "/time_schedule/emp/{empId}",method = RequestMethod.GET)
    public ResponseEntity<?> getWeeklyScheduleForEmployee(@PathVariable Integer empId){
        return ResponseEntity.ok(scheduleService.getWeeklyScheduleForEmployee(empId));
    }

    @RequestMapping(value = "/monthly_schedule",method = RequestMethod.GET)
    public ResponseEntity<?> getMonthlySchedule(){
        return ResponseEntity.ok(scheduleService.getMonthlySchedule());
    }

    @RequestMapping(value = "/monthly_schedule/emp/{empId}",method = RequestMethod.GET)
    public ResponseEntity<?> getMonthlyScheduleForEmployee(@PathVariable Integer empId){
        return ResponseEntity.ok(scheduleService.getMonthlyScheduleForEmployee(empId));
    }
}
