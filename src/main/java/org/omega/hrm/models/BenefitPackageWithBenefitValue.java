package org.omega.hrm.models;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Kass on 12/27/2018.
 */
@Entity
public class BenefitPackageWithBenefitValue {
    @Id
    @GeneratedValue
    private Integer id;

    @ManyToMany
    private List<Benefit> benefits;

    @ManyToMany
    private List<BenefitPackage> benefitPackages;

    private float amount;

    private String remark;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<Benefit> getBenefits() {
        return benefits;
    }

    public void setBenefits(List<Benefit> benefits) {
        this.benefits = benefits;
    }

    public List<BenefitPackage> getBenefitPackages() {
        return benefitPackages;
    }

    public void setBenefitPackages(List<BenefitPackage> benefitPackages) {
        this.benefitPackages = benefitPackages;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
