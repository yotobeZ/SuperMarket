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
public class Salerecord extends SalerecordKey implements Serializable {
    /**
     *
     *
     * @mbg.generated Wed Jun 27 15:45:53 CST 2018
     */
    private Date saleDate;

    /**
     *
     *
     * @mbg.generated Wed Jun 27 15:45:53 CST 2018
     */
    private Integer saleNum;

    /**
     *
     *
     * @mbg.generated Wed Jun 27 15:45:53 CST 2018
     */
    private Integer modeOfPay;

    /**
     *
     * @mbg.generated Wed Jun 27 15:45:53 CST 2018
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method returns the value of the database column salerecord.SaleDate
     *
     * @return the value of salerecord.SaleDate
     *
     * @mbg.generated Wed Jun 27 15:45:53 CST 2018
     */
    public Date getSaleDate() {
        return saleDate;
    }

    /**
     *
     * @mbg.generated Wed Jun 27 15:45:53 CST 2018
     */
    public Salerecord withSaleDate(Date saleDate) {
        this.setSaleDate(saleDate);
        return this;
    }

    /**
     * This method sets the value of the database column salerecord.SaleDate
     *
     * @param saleDate the value for salerecord.SaleDate
     *
     * @mbg.generated Wed Jun 27 15:45:53 CST 2018
     */
    public void setSaleDate(Date saleDate) {
        this.saleDate = saleDate;
    }

    /**
     * This method returns the value of the database column salerecord.SaleNum
     *
     * @return the value of salerecord.SaleNum
     *
     * @mbg.generated Wed Jun 27 15:45:53 CST 2018
     */
    public Integer getSaleNum() {
        return saleNum;
    }

    /**
     *
     * @mbg.generated Wed Jun 27 15:45:53 CST 2018
     */
    public Salerecord withSaleNum(Integer saleNum) {
        this.setSaleNum(saleNum);
        return this;
    }

    /**
     * This method sets the value of the database column salerecord.SaleNum
     *
     * @param saleNum the value for salerecord.SaleNum
     *
     * @mbg.generated Wed Jun 27 15:45:53 CST 2018
     */
    public void setSaleNum(Integer saleNum) {
        this.saleNum = saleNum;
    }

    /**
     * This method returns the value of the database column salerecord.ModeOfPay
     *
     * @return the value of salerecord.ModeOfPay
     *
     * @mbg.generated Wed Jun 27 15:45:53 CST 2018
     */
    public Integer getModeOfPay() {
        return modeOfPay;
    }

    /**
     *
     * @mbg.generated Wed Jun 27 15:45:53 CST 2018
     */
    public Salerecord withModeOfPay(Integer modeOfPay) {
        this.setModeOfPay(modeOfPay);
        return this;
    }

    /**
     * This method sets the value of the database column salerecord.ModeOfPay
     *
     * @param modeOfPay the value for salerecord.ModeOfPay
     *
     * @mbg.generated Wed Jun 27 15:45:53 CST 2018
     */
    public void setModeOfPay(Integer modeOfPay) {
        this.modeOfPay = modeOfPay;
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
        sb.append(", saleDate=").append(saleDate);
        sb.append(", saleNum=").append(saleNum);
        sb.append(", modeOfPay=").append(modeOfPay);
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
        Salerecord other = (Salerecord) that;
        return (this.getProId() == null ? other.getProId() == null : this.getProId().equals(other.getProId()))
            && (this.getSaleNo() == null ? other.getSaleNo() == null : this.getSaleNo().equals(other.getSaleNo()))
            && (this.getProDate() == null ? other.getProDate() == null : this.getProDate().equals(other.getProDate()))
            && (this.getSaleDate() == null ? other.getSaleDate() == null : this.getSaleDate().equals(other.getSaleDate()))
            && (this.getSaleNum() == null ? other.getSaleNum() == null : this.getSaleNum().equals(other.getSaleNum()))
            && (this.getModeOfPay() == null ? other.getModeOfPay() == null : this.getModeOfPay().equals(other.getModeOfPay()));
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
        result = prime * result + ((getSaleDate() == null) ? 0 : getSaleDate().hashCode());
        result = prime * result + ((getSaleNum() == null) ? 0 : getSaleNum().hashCode());
        result = prime * result + ((getModeOfPay() == null) ? 0 : getModeOfPay().hashCode());
        return result;
    }
}