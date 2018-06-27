package com.supermarket.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * Created By MBG-GUI-EXTENSION https://github.com/spawpaw/mybatis-generator-gui-extension
 * Description:
 * 
 *
 * @author 
 */
public class Sales extends SalesKey implements Serializable {
    /**
     *
     *
     * @mbg.generated Wed Jun 27 15:47:09 CST 2018
     */
    private String promotion;

    /**
     *
     *
     * @mbg.generated Wed Jun 27 15:47:09 CST 2018
     */
    private Date saleDate;

    /**
     *
     * @mbg.generated Wed Jun 27 15:47:09 CST 2018
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method returns the value of the database column sales.Promotion
     *
     * @return the value of sales.Promotion
     *
     * @mbg.generated Wed Jun 27 15:47:09 CST 2018
     */
    public String getPromotion() {
        return promotion;
    }

    /**
     *
     * @mbg.generated Wed Jun 27 15:47:09 CST 2018
     */
    public Sales withPromotion(String promotion) {
        this.setPromotion(promotion);
        return this;
    }

    /**
     * This method sets the value of the database column sales.Promotion
     *
     * @param promotion the value for sales.Promotion
     *
     * @mbg.generated Wed Jun 27 15:47:09 CST 2018
     */
    public void setPromotion(String promotion) {
        this.promotion = promotion;
    }

    /**
     * This method returns the value of the database column sales.SaleDate
     *
     * @return the value of sales.SaleDate
     *
     * @mbg.generated Wed Jun 27 15:47:09 CST 2018
     */
    public Date getSaleDate() {
        return saleDate;
    }

    /**
     *
     * @mbg.generated Wed Jun 27 15:47:09 CST 2018
     */
    public Sales withSaleDate(Date saleDate) {
        this.setSaleDate(saleDate);
        return this;
    }

    /**
     * This method sets the value of the database column sales.SaleDate
     *
     * @param saleDate the value for sales.SaleDate
     *
     * @mbg.generated Wed Jun 27 15:47:09 CST 2018
     */
    public void setSaleDate(Date saleDate) {
        this.saleDate = saleDate;
    }

    /**
     *
     * @mbg.generated Wed Jun 27 15:47:09 CST 2018
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", promotion=").append(promotion);
        sb.append(", saleDate=").append(saleDate);
        sb.append("]");
        return sb.toString();
    }

    /**
     *
     * @mbg.generated Wed Jun 27 15:47:09 CST 2018
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
        Sales other = (Sales) that;
        return (this.getProId() == null ? other.getProId() == null : this.getProId().equals(other.getProId()))
            && (this.getProDate() == null ? other.getProDate() == null : this.getProDate().equals(other.getProDate()))
            && (this.getPromotion() == null ? other.getPromotion() == null : this.getPromotion().equals(other.getPromotion()))
            && (this.getSaleDate() == null ? other.getSaleDate() == null : this.getSaleDate().equals(other.getSaleDate()));
    }

    /**
     *
     * @mbg.generated Wed Jun 27 15:47:09 CST 2018
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getProId() == null) ? 0 : getProId().hashCode());
        result = prime * result + ((getProDate() == null) ? 0 : getProDate().hashCode());
        result = prime * result + ((getPromotion() == null) ? 0 : getPromotion().hashCode());
        result = prime * result + ((getSaleDate() == null) ? 0 : getSaleDate().hashCode());
        return result;
    }
}