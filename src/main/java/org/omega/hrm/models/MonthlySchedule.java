package org.omega.hrm.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

/**
 * Created by Kass on 12/31/2018.
 */
@Entity
public class MonthlySchedule {
    @Id
    @GeneratedValue
    private Integer id;

    private Integer dayOfMonth;

    @OneToMany
    private List<Schedule> scheduleId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDayOfMonth() {
        return dayOfMonth;
    }

    public void setDayOfMonth(Integer dayOfMonth) {
        this.dayOfMonth = dayOfMonth;
    }

    public List<Schedule> getScheduleId() {
        return scheduleId;
    }

    public void setScheduleId(List<Schedule> scheduleId) {
        this.scheduleId = scheduleId;
    }
}
