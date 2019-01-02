package org.omega.hrm.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.sql.Date;

/**
 * Created by Kass on 12/31/2018.
 */
@Entity
public class TimeSchedule {
    @Id
    @GeneratedValue
    private Integer id;

    private int scheduledFor;
    // 'it could be either weekly or monthly schedule',

    @ManyToOne
    private MonthlySchedule monthId;

    private Date startTime;
    private Date endTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getScheduledFor() {
        return scheduledFor;
    }

    public void setScheduledFor(int scheduledFor) {
        this.scheduledFor = scheduledFor;
    }

    public MonthlySchedule getMonthId() {
        return monthId;
    }

    public void setMonthId(MonthlySchedule monthId) {
        this.monthId = monthId;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }
}
