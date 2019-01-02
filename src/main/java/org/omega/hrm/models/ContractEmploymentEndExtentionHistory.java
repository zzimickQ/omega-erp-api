package org.omega.hrm.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.sql.Date;

/**
 * Created by Heka on 12/31/2018.
 */
@Entity
public class ContractEmploymentEndExtentionHistory {

    @Id
    @GeneratedValue
    private Integer id;

    @ManyToOne
    private ContractEmploymentInfo contractEmploymentInfo;

    private Date fromEndDate;
    private Date toEndDate;
    private Float fromSalary;
    private Float toSalary;

    @ManyToOne
    private BenefitPackage toBenefitPackages;

    @ManyToOne
    private BenefitPackage fromBenefitPackages;

    private String remark;





}
