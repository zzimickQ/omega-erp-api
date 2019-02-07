package org.omega.hrm.controllers.writers;

import org.omega.hrm.models.MonthlySchedule;
import org.omega.hrm.models.TimeSchedule;
import org.omega.hrm.models.WeeklySchedule;
import org.omega.hrm.services.ScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/hrm/schedule")
public class ScheduleControllerWriter {
    @Autowired
    private ScheduleService scheduleService;

    @RequestMapping(value = "/time_schedule",method = RequestMethod.POST)
    public ResponseEntity<?> setTimeSchedule(@RequestBody TimeSchedule timeSchedule){
        return ResponseEntity.ok(scheduleService.setTimeSchedule(timeSchedule));
    }

    @RequestMapping(value = "/time_schedule/{id}",method = RequestMethod.PUT)
    public ResponseEntity<?> editTimeSchedule(@PathVariable Integer id, @RequestBody TimeSchedule timeSchedule){
        return ResponseEntity.ok(scheduleService.editTimeSchedule(id,timeSchedule));
    }

    @RequestMapping(value = "/time_schedule/{id}",method = RequestMethod.DELETE)
    public ResponseEntity<?> deleteTimeSchedule(@PathVariable Integer id){
        return ResponseEntity.ok(scheduleService.deleteTimeSchedule(id));
    }



    @RequestMapping(value = "/weekly_schedule",method = RequestMethod.POST)
    public ResponseEntity<?> setWeeklySchedule(@RequestBody WeeklySchedule weeklySchedule){
        return ResponseEntity.ok(scheduleService.setWeeklySchedule(weeklySchedule));
    }

    @RequestMapping(value = "/weekly_schedule/{id}",method = RequestMethod.PUT)
    public ResponseEntity<?> editWeeklySchedule(@PathVariable Integer id, @RequestBody WeeklySchedule weeklySchedule){
        return ResponseEntity.ok(scheduleService.editWeeklySchedule(id,weeklySchedule));
    }

    @RequestMapping(value = "/weekly_schedule/{id}",method = RequestMethod.DELETE)
    public ResponseEntity<?> deleteWeeklySchedule(@PathVariable Integer id){
        return ResponseEntity.ok(scheduleService.deleteWeeklySchedule(id));
    }



    @RequestMapping(value = "/monthly_schedule",method = RequestMethod.POST)
    public ResponseEntity<?> setMonthlySchedule(@RequestBody MonthlySchedule monthlySchedule){
        return ResponseEntity.ok(scheduleService.setMonthlySchedule(monthlySchedule));
    }

    @RequestMapping(value = "/monthly_schedule/{id}",method = RequestMethod.PUT)
    public ResponseEntity<?> editMonthlySchedule
            (@PathVariable Integer id, @RequestBody MonthlySchedule monthlySchedule){
        return ResponseEntity.ok(scheduleService.editMonthlySchedule(id,monthlySchedule));
    }

    @RequestMapping(value = "/monthly_schedule/{id}",method = RequestMethod.DELETE)
    public ResponseEntity<?> deleteMonthlySchedule(@PathVariable Integer id){
        return ResponseEntity.ok(scheduleService.deleteMonthlySchedule(id));
    }

    @RequestMapping(value = "/time_schedule/emp/{empId}",method = RequestMethod.DELETE)
    public ResponseEntity<?> deleteTimeScheduleForEmployee(@PathVariable Integer empId){
        return ResponseEntity.ok(scheduleService.deleteTimeScheduleForEmployee(empId));
    }

    @RequestMapping(value = "/weekly_schedule/emp/{empId}",method = RequestMethod.DELETE)
    public ResponseEntity<?> deleteWeeklyScheduleForEmployee(@PathVariable Integer empId){
        return ResponseEntity.ok(scheduleService.deleteWeeklyScheduleForEmployee(empId));
    }

    @RequestMapping(value = "/monthly_schedule/emp/{empId}",method = RequestMethod.DELETE)
    public ResponseEntity<?> deleteMonthlyScheduleForEmployee(@PathVariable Integer empId){
        return ResponseEntity.ok(scheduleService.deleteMonthlyScheduleForEmployee(empId));
    }




    @RequestMapping(value = "/time_schedule/emp/{empId}",method = RequestMethod.POST)
    public ResponseEntity<?> setTimeScheduleForEmployee(@PathVariable Integer empId){
        return ResponseEntity.ok(scheduleService.setTimeScheduleForEmployee(empId));
    }

    @RequestMapping(value = "/weekly_schedule/emp/{empId}",method = RequestMethod.POST)
    public ResponseEntity<?> setWeeklyScheduleForEmployee(@PathVariable Integer empId){
        return ResponseEntity.ok(scheduleService.setWeeklyScheduleForEmployee(empId));
    }


    @RequestMapping(value = "/monthly_schedule/emp/{empId}",method = RequestMethod.POST)
    public ResponseEntity<?> setMonthlyScheduleForEmployee(@PathVariable Integer empId){
        return ResponseEntity.ok(scheduleService.setMonthlyScheduleForEmployee(empId));
    }

}
