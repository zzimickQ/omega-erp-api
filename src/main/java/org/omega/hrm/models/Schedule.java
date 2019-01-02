package org.omega.hrm.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by Quatra on 1/2/2019.
 */
@Entity
public class Schedule {
    @Id
    @GeneratedValue
    private Integer id;
}
