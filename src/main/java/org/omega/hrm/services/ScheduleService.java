package org.omega.hrm.services;

import org.omega.hrm.models.*;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public abstract class ScheduleService {
    public abstract List<TimeSchedule> getTimeSchedule();
    public abstract TimeSchedule editTimeSchude(Integer id, TimeSchedule timeSchedule);
    public abstract TimeSchedule deleteTimeSchedule(Integer id);
    public abstract TimeSchedule setTimeSchedule(TimeSchedule timeSchedule);


    public abstract List<WeeklySchedule> getWeeklySchedule();
    public abstract WeeklySchedule editWeeklySchude(Integer id, WeeklySchedule weeklySchedule);
    public abstract WeeklySchedule deleteWeeklySchedule(Integer id);
    public abstract WeeklySchedule setWeeklySchedule(WeeklySchedule weeklySchedule);

    public abstract List<MonthlySchedule> getMonthlySchedule();
    public abstract MonthlySchedule editMonthlySchude(Integer id, MonthlySchedule monthlySchedule);
    public abstract MonthlySchedule deleteMonthlySchedule(Integer id);
    public abstract MonthlySchedule setMonthlySchedule(MonthlySchedule monthlySchedule);

    public abstract TimeSchedule getTimeScheduleForEmployee(String empId);
    public abstract TimeSchedule getWeeklyScheduleForEmployee(String empId);
    public abstract TimeSchedule getMonthlyScheduleForEmployee(String empId);

    public abstract TimeSchedule setTimeScheduleForEmployee(String empId);
    public abstract TimeSchedule setWeeklyScheduleForEmployee(String empId);
    public abstract TimeSchedule setMonthlyScheduleForEmployee(String empId);

    public abstract TimeSchedule deleteTimeScheduleForEmployee(String empId);
    public abstract TimeSchedule deleteWeeklyScheduleForEmployee(String empId);
    public abstract TimeSchedule deleteMonthlyScheduleForEmployee(String empId);


}
