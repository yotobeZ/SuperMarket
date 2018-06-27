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
public class ReturnproKey implements Serializable {
    /**
     *
     *
     * @mbg.generated Wed Jun 27 15:45:21 CST 2018
     */
    private Integer returnId;

    /**
     *
     *
     * @mbg.generated Wed Jun 27 15:45:21 CST 2018
     */
    private Integer saleId;

    /**
     *
     *
     * @mbg.generated Wed Jun 27 15:45:21 CST 2018
     */
    private Date proId;

    /**
     *
     *
     * @mbg.generated Wed Jun 27 15:45:21 CST 2018
     */
    private Date proDate;

    /**
     *
     * @mbg.generated Wed Jun 27 15:45:21 CST 2018
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method returns the value of the database column returnpro.ReturnId
     *
     * @return the value of returnpro.ReturnId
     *
     * @mbg.generated Wed Jun 27 15:45:21 CST 2018
     */
    public Integer getReturnId() {
        return returnId;
    }

    /**
     *
     * @mbg.generated Wed Jun 27 15:45:21 CST 2018
     */
    public ReturnproKey withReturnId(Integer returnId) {
        this.setReturnId(returnId);
        return this;
    }

    /**
     * This method sets the value of the database column returnpro.ReturnId
     *
     * @param returnId the value for returnpro.ReturnId
     *
     * @mbg.generated Wed Jun 27 15:45:21 CST 2018
     */
    public void setReturnId(Integer returnId) {
        this.returnId = returnId;
    }

    /**
     * This method returns the value of the database column returnpro.SaleId
     *
     * @return the value of returnpro.SaleId
     *
     * @mbg.generated Wed Jun 27 15:45:21 CST 2018
     */
    public Integer getSaleId() {
        return saleId;
    }

    /**
     *
     * @mbg.generated Wed Jun 27 15:45:21 CST 2018
     */
    public ReturnproKey withSaleId(Integer saleId) {
        this.setSaleId(saleId);
        return this;
    }

    /**
     * This method sets the value of the database column returnpro.SaleId
     *
     * @param saleId the value for returnpro.SaleId
     *
     * @mbg.generated Wed Jun 27 15:45:21 CST 2018
     */
    public void setSaleId(Integer saleId) {
        this.saleId = saleId;
    }

    /**
     * This method returns the value of the database column returnpro.ProId
     *
     * @return the value of returnpro.ProId
     *
     * @mbg.generated Wed Jun 27 15:45:21 CST 2018
     */
    public Date getProId() {
        return proId;
    }

    /**
     *
     * @mbg.generated Wed Jun 27 15:45:21 CST 2018
     */
    public ReturnproKey withProId(Date proId) {
        this.setProId(proId);
        return this;
    }

    /**
     * This method sets the value of the database column returnpro.ProId
     *
     * @param proId the value for returnpro.ProId
     *
     * @mbg.generated Wed Jun 27 15:45:21 CST 2018
     */
    public void setProId(Date proId) {
        this.proId = proId;
    }

    /**
     * This method returns the value of the database column returnpro.ProDate
     *
     * @return the value of returnpro.ProDate
     *
     * @mbg.generated Wed Jun 27 15:45:21 CST 2018
     */
    public Date getProDate() {
        return proDate;
    }

    /**
     *
     * @mbg.generated Wed Jun 27 15:45:21 CST 2018
     */
    public ReturnproKey withProDate(Date proDate) {
        this.setProDate(proDate);
        return this;
    }

    /**
     * This method sets the value of the database column returnpro.ProDate
     *
     * @param proDate the value for returnpro.ProDate
     *
     * @mbg.generated Wed Jun 27 15:45:21 CST 2018
     */
    public void setProDate(Date proDate) {
        this.proDate = proDate;
    }

    /**
     *
     * @mbg.generated Wed Jun 27 15:45:21 CST 2018
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", returnId=").append(returnId);
        sb.append(", saleId=").append(saleId);
        sb.append(", proId=").append(proId);
        sb.append(", proDate=").append(proDate);
        sb.append("]");
        return sb.toString();
    }

    /**
     *
     * @mbg.generated Wed Jun 27 15:45:21 CST 2018
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
        ReturnproKey other = (ReturnproKey) that;
        return (this.getReturnId() == null ? other.getReturnId() == null : this.getReturnId().equals(other.getReturnId()))
            && (this.getSaleId() == null ? other.getSaleId() == null : this.getSaleId().equals(other.getSaleId()))
            && (this.getProId() == null ? other.getProId() == null : this.getProId().equals(other.getProId()))
            && (this.getProDate() == null ? other.getProDate() == null : this.getProDate().equals(other.getProDate()));
    }

    /**
     *
     * @mbg.generated Wed Jun 27 15:45:21 CST 2018
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getReturnId() == null) ? 0 : getReturnId().hashCode());
        result = prime * result + ((getSaleId() == null) ? 0 : getSaleId().hashCode());
        result = prime * result + ((getProId() == null) ? 0 : getProId().hashCode());
        result = prime * result + ((getProDate() == null) ? 0 : getProDate().hashCode());
        return result;
    }
}