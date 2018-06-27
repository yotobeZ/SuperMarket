package com.supermarket.pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Created By MBG-GUI-EXTENSION https://github.com/spawpaw/mybatis-generator-gui-extension
 * Description:
 * 
 *
 * @author 
 */
public class Changeprice implements Serializable {
    /**
     *
     *
     * @mbg.generated Wed Jun 27 15:10:05 CST 2018
     */
    private Integer proId;

    /**
     *
     *
     * @mbg.generated Wed Jun 27 15:10:05 CST 2018
     */
    private BigDecimal oldImpPrice;

    /**
     *
     *
     * @mbg.generated Wed Jun 27 15:10:05 CST 2018
     */
    private BigDecimal newImpPrice;

    /**
     *
     *
     * @mbg.generated Wed Jun 27 15:10:05 CST 2018
     */
    private BigDecimal oldSalePrice;

    /**
     *
     *
     * @mbg.generated Wed Jun 27 15:10:05 CST 2018
     */
    private BigDecimal newSalePrice;

    /**
     *
     *
     * @mbg.generated Wed Jun 27 15:10:05 CST 2018
     */
    private Date alterTime;

    /**
     *
     * @mbg.generated Wed Jun 27 15:10:05 CST 2018
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method returns the value of the database column changeprice.ProId
     *
     * @return the value of changeprice.ProId
     *
     * @mbg.generated Wed Jun 27 15:10:05 CST 2018
     */
    public Integer getProId() {
        return proId;
    }

    /**
     *
     * @mbg.generated Wed Jun 27 15:10:05 CST 2018
     */
    public Changeprice withProId(Integer proId) {
        this.setProId(proId);
        return this;
    }

    /**
     * This method sets the value of the database column changeprice.ProId
     *
     * @param proId the value for changeprice.ProId
     *
     * @mbg.generated Wed Jun 27 15:10:05 CST 2018
     */
    public void setProId(Integer proId) {
        this.proId = proId;
    }

    /**
     * This method returns the value of the database column changeprice.OldImpPrice
     *
     * @return the value of changeprice.OldImpPrice
     *
     * @mbg.generated Wed Jun 27 15:10:05 CST 2018
     */
    public BigDecimal getOldImpPrice() {
        return oldImpPrice;
    }

    /**
     *
     * @mbg.generated Wed Jun 27 15:10:05 CST 2018
     */
    public Changeprice withOldImpPrice(BigDecimal oldImpPrice) {
        this.setOldImpPrice(oldImpPrice);
        return this;
    }

    /**
     * This method sets the value of the database column changeprice.OldImpPrice
     *
     * @param oldImpPrice the value for changeprice.OldImpPrice
     *
     * @mbg.generated Wed Jun 27 15:10:05 CST 2018
     */
    public void setOldImpPrice(BigDecimal oldImpPrice) {
        this.oldImpPrice = oldImpPrice;
    }

    /**
     * This method returns the value of the database column changeprice.NewImpPrice
     *
     * @return the value of changeprice.NewImpPrice
     *
     * @mbg.generated Wed Jun 27 15:10:05 CST 2018
     */
    public BigDecimal getNewImpPrice() {
        return newImpPrice;
    }

    /**
     *
     * @mbg.generated Wed Jun 27 15:10:05 CST 2018
     */
    public Changeprice withNewImpPrice(BigDecimal newImpPrice) {
        this.setNewImpPrice(newImpPrice);
        return this;
    }

    /**
     * This method sets the value of the database column changeprice.NewImpPrice
     *
     * @param newImpPrice the value for changeprice.NewImpPrice
     *
     * @mbg.generated Wed Jun 27 15:10:05 CST 2018
     */
    public void setNewImpPrice(BigDecimal newImpPrice) {
        this.newImpPrice = newImpPrice;
    }

    /**
     * This method returns the value of the database column changeprice.OldSalePrice
     *
     * @return the value of changeprice.OldSalePrice
     *
     * @mbg.generated Wed Jun 27 15:10:05 CST 2018
     */
    public BigDecimal getOldSalePrice() {
        return oldSalePrice;
    }

    /**
     *
     * @mbg.generated Wed Jun 27 15:10:05 CST 2018
     */
    public Changeprice withOldSalePrice(BigDecimal oldSalePrice) {
        this.setOldSalePrice(oldSalePrice);
        return this;
    }

    /**
     * This method sets the value of the database column changeprice.OldSalePrice
     *
     * @param oldSalePrice the value for changeprice.OldSalePrice
     *
     * @mbg.generated Wed Jun 27 15:10:05 CST 2018
     */
    public void setOldSalePrice(BigDecimal oldSalePrice) {
        this.oldSalePrice = oldSalePrice;
    }

    /**
     * This method returns the value of the database column changeprice.NewSalePrice
     *
     * @return the value of changeprice.NewSalePrice
     *
     * @mbg.generated Wed Jun 27 15:10:05 CST 2018
     */
    public BigDecimal getNewSalePrice() {
        return newSalePrice;
    }

    /**
     *
     * @mbg.generated Wed Jun 27 15:10:05 CST 2018
     */
    public Changeprice withNewSalePrice(BigDecimal newSalePrice) {
        this.setNewSalePrice(newSalePrice);
        return this;
    }

    /**
     * This method sets the value of the database column changeprice.NewSalePrice
     *
     * @param newSalePrice the value for changeprice.NewSalePrice
     *
     * @mbg.generated Wed Jun 27 15:10:05 CST 2018
     */
    public void setNewSalePrice(BigDecimal newSalePrice) {
        this.newSalePrice = newSalePrice;
    }

    /**
     * This method returns the value of the database column changeprice.AlterTime
     *
     * @return the value of changeprice.AlterTime
     *
     * @mbg.generated Wed Jun 27 15:10:05 CST 2018
     */
    public Date getAlterTime() {
        return alterTime;
    }

    /**
     *
     * @mbg.generated Wed Jun 27 15:10:05 CST 2018
     */
    public Changeprice withAlterTime(Date alterTime) {
        this.setAlterTime(alterTime);
        return this;
    }

    /**
     * This method sets the value of the database column changeprice.AlterTime
     *
     * @param alterTime the value for changeprice.AlterTime
     *
     * @mbg.generated Wed Jun 27 15:10:05 CST 2018
     */
    public void setAlterTime(Date alterTime) {
        this.alterTime = alterTime;
    }

    /**
     *
     * @mbg.generated Wed Jun 27 15:10:05 CST 2018
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", proId=").append(proId);
        sb.append(", oldImpPrice=").append(oldImpPrice);
        sb.append(", newImpPrice=").append(newImpPrice);
        sb.append(", oldSalePrice=").append(oldSalePrice);
        sb.append(", newSalePrice=").append(newSalePrice);
        sb.append(", alterTime=").append(alterTime);
        sb.append("]");
        return sb.toString();
    }

    /**
     *
     * @mbg.generated Wed Jun 27 15:10:05 CST 2018
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Changeprice other = (Changeprice) that;
        return (this.getProId() == null ? other.getProId() == null : this.getProId().equals(other.getProId()))
            && (this.getOldImpPrice() == null ? other.getOldImpPrice() == null : this.getOldImpPrice().equals(other.getOldImpPrice()))
            && (this.getNewImpPrice() == null ? other.getNewImpPrice() == null : this.getNewImpPrice().equals(other.getNewImpPrice()))
            && (this.getOldSalePrice() == null ? other.getOldSalePrice() == null : this.getOldSalePrice().equals(other.getOldSalePrice()))
            && (this.getNewSalePrice() == null ? other.getNewSalePrice() == null : this.getNewSalePrice().equals(other.getNewSalePrice()))
            && (this.getAlterTime() == null ? other.getAlterTime() == null : this.getAlterTime().equals(other.getAlterTime()));
    }

    /**
     *
     * @mbg.generated Wed Jun 27 15:10:05 CST 2018
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getProId() == null) ? 0 : getProId().hashCode());
        result = prime * result + ((getOldImpPrice() == null) ? 0 : getOldImpPrice().hashCode());
        result = prime * result + ((getNewImpPrice() == null) ? 0 : getNewImpPrice().hashCode());
        result = prime * result + ((getOldSalePrice() == null) ? 0 : getOldSalePrice().hashCode());
        result = prime * result + ((getNewSalePrice() == null) ? 0 : getNewSalePrice().hashCode());
        result = prime * result + ((getAlterTime() == null) ? 0 : getAlterTime().hashCode());
        return result;
    }
}