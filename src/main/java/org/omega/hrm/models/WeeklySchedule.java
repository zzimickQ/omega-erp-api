package org.omega.hrm.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * Created by Heka on 1/1/2019.
 */
@Entity
public class WeeklySchedule {

    @Id
    @GeneratedValue
    private Integer id;
    private Integer dayOfTheWeek;

    @ManyToOne
    private Schedule schedule;



}
