package org.omega.hrm.services;

import org.omega.hrm.models.*;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public abstract class ScheduleService {
    public abstract List<TimeSchedule> getTimeSchedule();
    public abstract TimeSchedule editTimeSchedule(Integer id, TimeSchedule timeSchedule);
    public abstract TimeSchedule deleteTimeSchedule(Integer id);
    public abstract TimeSchedule setTimeSchedule(TimeSchedule timeSchedule);


    public abstract List<WeeklySchedule> getWeeklySchedule();
    public abstract WeeklySchedule editWeeklySchedule(Integer id, WeeklySchedule weeklySchedule);
    public abstract WeeklySchedule deleteWeeklySchedule(Integer id);
    public abstract WeeklySchedule setWeeklySchedule(WeeklySchedule weeklySchedule);

    public abstract List<MonthlySchedule> getMonthlySchedule();
    public abstract MonthlySchedule editMonthlySchedule(Integer id, MonthlySchedule monthlySchedule);
    public abstract MonthlySchedule deleteMonthlySchedule(Integer id);
    public abstract MonthlySchedule setMonthlySchedule(MonthlySchedule monthlySchedule);

    public abstract TimeSchedule getTimeScheduleForEmployee(Integer empId);
    public abstract TimeSchedule getWeeklyScheduleForEmployee(Integer empId);
    public abstract TimeSchedule getMonthlyScheduleForEmployee(Integer empId);

    public abstract TimeSchedule setTimeScheduleForEmployee(Integer empId);
    public abstract TimeSchedule setWeeklyScheduleForEmployee(Integer empId);
    public abstract TimeSchedule setMonthlyScheduleForEmployee(Integer empId);

    public abstract TimeSchedule deleteTimeScheduleForEmployee(Integer empId);
    public abstract TimeSchedule deleteWeeklyScheduleForEmployee(Integer empId);
    public abstract TimeSchedule deleteMonthlyScheduleForEmployee(Integer empId);


}
