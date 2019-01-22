package org.omega.hrm.models;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.sql.Date;

/**
 * Created by Heka on 12/27/2018.
 */
@Entity
public class Vacancy {

    @Id
    @GeneratedValue
    private Integer id;


    private String recruitFrom;
    //this recruit form is a desicion made by human resource to hire from
        //intenal, external or both aplicants

    private Date postDate;
    private Date updateDate;
    private String appProcessDiscription;
    private Integer requestedQuantity;
    private Date deadLine;
    private Integer reanounce = 0 ;
    private String remark;

    @ManyToOne
    private PersonnelRequisition requisition;

}
