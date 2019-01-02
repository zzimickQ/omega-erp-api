package org.omega.hrm.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by Heka on 1/1/2019.
 */
@Entity
public class Schedule {

    @Id
    @GeneratedValue
    private Integer id;

    private String scheduleType;
    private String repeatsEvery;



}
