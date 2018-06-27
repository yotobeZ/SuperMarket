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
public class SalesKey implements Serializable {
    /**
     *
     *
     * @mbg.generated Wed Jun 27 15:47:09 CST 2018
     */
    private Integer proId;

    /**
     *
     *
     * @mbg.generated Wed Jun 27 15:47:09 CST 2018
     */
    private Date proDate;

    /**
     *
     * @mbg.generated Wed Jun 27 15:47:09 CST 2018
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method returns the value of the database column sales.ProId
     *
     * @return the value of sales.ProId
     *
     * @mbg.generated Wed Jun 27 15:47:09 CST 2018
     */
    public Integer getProId() {
        return proId;
    }

    /**
     *
     * @mbg.generated Wed Jun 27 15:47:09 CST 2018
     */
    public SalesKey withProId(Integer proId) {
        this.setProId(proId);
        return this;
    }

    /**
     * This method sets the value of the database column sales.ProId
     *
     * @param proId the value for sales.ProId
     *
     * @mbg.generated Wed Jun 27 15:47:09 CST 2018
     */
    public void setProId(Integer proId) {
        this.proId = proId;
    }

    /**
     * This method returns the value of the database column sales.ProDate
     *
     * @return the value of sales.ProDate
     *
     * @mbg.generated Wed Jun 27 15:47:09 CST 2018
     */
    public Date getProDate() {
        return proDate;
    }

    /**
     *
     * @mbg.generated Wed Jun 27 15:47:09 CST 2018
     */
    public SalesKey withProDate(Date proDate) {
        this.setProDate(proDate);
        return this;
    }

    /**
     * This method sets the value of the database column sales.ProDate
     *
     * @param proDate the value for sales.ProDate
     *
     * @mbg.generated Wed Jun 27 15:47:09 CST 2018
     */
    public void setProDate(Date proDate) {
        this.proDate = proDate;
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
        sb.append(", proId=").append(proId);
        sb.append(", proDate=").append(proDate);
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
        SalesKey other = (SalesKey) that;
        return (this.getProId() == null ? other.getProId() == null : this.getProId().equals(other.getProId()))
            && (this.getProDate() == null ? other.getProDate() == null : this.getProDate().equals(other.getProDate()));
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
        return result;
    }
}