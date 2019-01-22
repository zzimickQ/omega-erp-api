package org.omega.hrm.models;

import javax.persistence.*;

/**
 * Created by Kass on 12/27/2018.
 */
@Entity
public class BenefitPackage {
    @Id
    @GeneratedValue
    private Integer id ;

    private String name;

    @ManyToOne
    private BenefitPackageLevel benefitPackageLevel;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BenefitPackageLevel getBenefitPackageLevel() {
        return benefitPackageLevel;
    }

    public void setBenefitPackageLevel(BenefitPackageLevel benefitPackageLevel) {
        this.benefitPackageLevel = benefitPackageLevel;
    }
}
