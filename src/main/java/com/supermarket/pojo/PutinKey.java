package com.supermarket.pojo;

import java.io.Serializable;

/**
 * Created By MBG-GUI-EXTENSION https://github.com/spawpaw/mybatis-generator-gui-extension
 * Description:
 * 
 *
 * @author 
 */
public class PutinKey implements Serializable {
    /**
     *
     *
     * @mbg.generated Wed Jun 27 15:13:46 CST 2018
     */
    private Integer proId;

    /**
     *
     *
     * @mbg.generated Wed Jun 27 15:13:46 CST 2018
     */
    private Integer impBill;

    /**
     *
     * @mbg.generated Wed Jun 27 15:13:46 CST 2018
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method returns the value of the database column putin.ProId
     *
     * @return the value of putin.ProId
     *
     * @mbg.generated Wed Jun 27 15:13:46 CST 2018
     */
    public Integer getProId() {
        return proId;
    }

    /**
     *
     * @mbg.generated Wed Jun 27 15:13:46 CST 2018
     */
    public PutinKey withProId(Integer proId) {
        this.setProId(proId);
        return this;
    }

    /**
     * This method sets the value of the database column putin.ProId
     *
     * @param proId the value for putin.ProId
     *
     * @mbg.generated Wed Jun 27 15:13:46 CST 2018
     */
    public void setProId(Integer proId) {
        this.proId = proId;
    }

    /**
     * This method returns the value of the database column putin.ImpBill
     *
     * @return the value of putin.ImpBill
     *
     * @mbg.generated Wed Jun 27 15:13:46 CST 2018
     */
    public Integer getImpBill() {
        return impBill;
    }

    /**
     *
     * @mbg.generated Wed Jun 27 15:13:46 CST 2018
     */
    public PutinKey withImpBill(Integer impBill) {
        this.setImpBill(impBill);
        return this;
    }

    /**
     * This method sets the value of the database column putin.ImpBill
     *
     * @param impBill the value for putin.ImpBill
     *
     * @mbg.generated Wed Jun 27 15:13:46 CST 2018
     */
    public void setImpBill(Integer impBill) {
        this.impBill = impBill;
    }

    /**
     *
     * @mbg.generated Wed Jun 27 15:13:46 CST 2018
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", proId=").append(proId);
        sb.append(", impBill=").append(impBill);
        sb.append("]");
        return sb.toString();
    }

    /**
     *
     * @mbg.generated Wed Jun 27 15:13:46 CST 2018
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
        PutinKey other = (PutinKey) that;
        return (this.getProId() == null ? other.getProId() == null : this.getProId().equals(other.getProId()))
            && (this.getImpBill() == null ? other.getImpBill() == null : this.getImpBill().equals(other.getImpBill()));
    }

    /**
     *
     * @mbg.generated Wed Jun 27 15:13:46 CST 2018
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getProId() == null) ? 0 : getProId().hashCode());
        result = prime * result + ((getImpBill() == null) ? 0 : getImpBill().hashCode());
        return result;
    }
}