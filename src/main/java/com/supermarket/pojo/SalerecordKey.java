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
public class SalerecordKey implements Serializable {
    /**
     *
     *
     * @mbg.generated Wed Jun 27 15:45:53 CST 2018
     */
    private Integer proId;

    /**
     *
     *
     * @mbg.generated Wed Jun 27 15:45:53 CST 2018
     */
    private Integer saleNo;

    /**
     *
     *
     * @mbg.generated Wed Jun 27 15:45:53 CST 2018
     */
    private Date proDate;

    /**
     *
     * @mbg.generated Wed Jun 27 15:45:53 CST 2018
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method returns the value of the database column salerecord.ProId
     *
     * @return the value of salerecord.ProId
     *
     * @mbg.generated Wed Jun 27 15:45:53 CST 2018
     */
    public Integer getProId() {
        return proId;
    }

    /**
     *
     * @mbg.generated Wed Jun 27 15:45:53 CST 2018
     */
    public SalerecordKey withProId(Integer proId) {
        this.setProId(proId);
        return this;
    }

    /**
     * This method sets the value of the database column salerecord.ProId
     *
     * @param proId the value for salerecord.ProId
     *
     * @mbg.generated Wed Jun 27 15:45:53 CST 2018
     */
    public void setProId(Integer proId) {
        this.proId = proId;
    }

    /**
     * This method returns the value of the database column salerecord.SaleNo
     *
     * @return the value of salerecord.SaleNo
     *
     * @mbg.generated Wed Jun 27 15:45:53 CST 2018
     */
    public Integer getSaleNo() {
        return saleNo;
    }

    /**
     *
     * @mbg.generated Wed Jun 27 15:45:53 CST 2018
     */
    public SalerecordKey withSaleNo(Integer saleNo) {
        this.setSaleNo(saleNo);
        return this;
    }

    /**
     * This method sets the value of the database column salerecord.SaleNo
     *
     * @param saleNo the value for salerecord.SaleNo
     *
     * @mbg.generated Wed Jun 27 15:45:53 CST 2018
     */
    public void setSaleNo(Integer saleNo) {
        this.saleNo = saleNo;
    }

    /**
     * This method returns the value of the database column salerecord.ProDate
     *
     * @return the value of salerecord.ProDate
     *
     * @mbg.generated Wed Jun 27 15:45:53 CST 2018
     */
    public Date getProDate() {
        return proDate;
    }

    /**
     *
     * @mbg.generated Wed Jun 27 15:45:53 CST 2018
     */
    public SalerecordKey withProDate(Date proDate) {
        this.setProDate(proDate);
        return this;
    }

    /**
     * This method sets the value of the database column salerecord.ProDate
     *
     * @param proDate the value for salerecord.ProDate
     *
     * @mbg.generated Wed Jun 27 15:45:53 CST 2018
     */
    public void setProDate(Date proDate) {
        this.proDate = proDate;
    }

    /**
     *
     * @mbg.generated Wed Jun 27 15:45:53 CST 2018
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", proId=").append(proId);
        sb.append(", saleNo=").append(saleNo);
        sb.append(", proDate=").append(proDate);
        sb.append("]");
        return sb.toString();
    }

    /**
     *
     * @mbg.generated Wed Jun 27 15:45:53 CST 2018
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
        SalerecordKey other = (SalerecordKey) that;
        return (this.getProId() == null ? other.getProId() == null : this.getProId().equals(other.getProId()))
            && (this.getSaleNo() == null ? other.getSaleNo() == null : this.getSaleNo().equals(other.getSaleNo()))
            && (this.getProDate() == null ? other.getProDate() == null : this.getProDate().equals(other.getProDate()));
    }

    /**
     *
     * @mbg.generated Wed Jun 27 15:45:53 CST 2018
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getProId() == null) ? 0 : getProId().hashCode());
        result = prime * result + ((getSaleNo() == null) ? 0 : getSaleNo().hashCode());
        result = prime * result + ((getProDate() == null) ? 0 : getProDate().hashCode());
        return result;
    }
}