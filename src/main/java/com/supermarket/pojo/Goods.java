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
public class Goods implements Serializable {
    /**
     *
     *
     * @mbg.generated Wed Jun 27 15:10:19 CST 2018
     */
    private Integer id;

    /**
     *
     *
     * @mbg.generated Wed Jun 27 15:10:19 CST 2018
     */
    private String goodsName;

    /**
     *
     *
     * @mbg.generated Wed Jun 27 15:10:19 CST 2018
     */
    private Integer billStatus;

    /**
     *
     *
     * @mbg.generated Wed Jun 27 15:10:19 CST 2018
     */
    private Integer goodsDistrict;

    /**
     *
     *
     * @mbg.generated Wed Jun 27 15:10:19 CST 2018
     */
    private Integer goodsPrice;

    /**
     *
     *
     * @mbg.generated Wed Jun 27 15:10:19 CST 2018
     */
    private Integer goodsCount;

    /**
     *
     *
     * @mbg.generated Wed Jun 27 15:10:19 CST 2018
     */
    private Date creationTime;

    /**
     *
     * @mbg.generated Wed Jun 27 15:10:19 CST 2018
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method returns the value of the database column goods.id
     *
     * @return the value of goods.id
     *
     * @mbg.generated Wed Jun 27 15:10:19 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     *
     * @mbg.generated Wed Jun 27 15:10:19 CST 2018
     */
    public Goods withId(Integer id) {
        this.setId(id);
        return this;
    }

    /**
     * This method sets the value of the database column goods.id
     *
     * @param id the value for goods.id
     *
     * @mbg.generated Wed Jun 27 15:10:19 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method returns the value of the database column goods.goodsName
     *
     * @return the value of goods.goodsName
     *
     * @mbg.generated Wed Jun 27 15:10:19 CST 2018
     */
    public String getGoodsName() {
        return goodsName;
    }

    /**
     *
     * @mbg.generated Wed Jun 27 15:10:19 CST 2018
     */
    public Goods withGoodsName(String goodsName) {
        this.setGoodsName(goodsName);
        return this;
    }

    /**
     * This method sets the value of the database column goods.goodsName
     *
     * @param goodsName the value for goods.goodsName
     *
     * @mbg.generated Wed Jun 27 15:10:19 CST 2018
     */
    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    /**
     * This method returns the value of the database column goods.billStatus
     *
     * @return the value of goods.billStatus
     *
     * @mbg.generated Wed Jun 27 15:10:19 CST 2018
     */
    public Integer getBillStatus() {
        return billStatus;
    }

    /**
     *
     * @mbg.generated Wed Jun 27 15:10:19 CST 2018
     */
    public Goods withBillStatus(Integer billStatus) {
        this.setBillStatus(billStatus);
        return this;
    }

    /**
     * This method sets the value of the database column goods.billStatus
     *
     * @param billStatus the value for goods.billStatus
     *
     * @mbg.generated Wed Jun 27 15:10:19 CST 2018
     */
    public void setBillStatus(Integer billStatus) {
        this.billStatus = billStatus;
    }

    /**
     * This method returns the value of the database column goods.goodsDistrict
     *
     * @return the value of goods.goodsDistrict
     *
     * @mbg.generated Wed Jun 27 15:10:19 CST 2018
     */
    public Integer getGoodsDistrict() {
        return goodsDistrict;
    }

    /**
     *
     * @mbg.generated Wed Jun 27 15:10:19 CST 2018
     */
    public Goods withGoodsDistrict(Integer goodsDistrict) {
        this.setGoodsDistrict(goodsDistrict);
        return this;
    }

    /**
     * This method sets the value of the database column goods.goodsDistrict
     *
     * @param goodsDistrict the value for goods.goodsDistrict
     *
     * @mbg.generated Wed Jun 27 15:10:19 CST 2018
     */
    public void setGoodsDistrict(Integer goodsDistrict) {
        this.goodsDistrict = goodsDistrict;
    }

    /**
     * This method returns the value of the database column goods.goodsPrice
     *
     * @return the value of goods.goodsPrice
     *
     * @mbg.generated Wed Jun 27 15:10:19 CST 2018
     */
    public Integer getGoodsPrice() {
        return goodsPrice;
    }

    /**
     *
     * @mbg.generated Wed Jun 27 15:10:19 CST 2018
     */
    public Goods withGoodsPrice(Integer goodsPrice) {
        this.setGoodsPrice(goodsPrice);
        return this;
    }

    /**
     * This method sets the value of the database column goods.goodsPrice
     *
     * @param goodsPrice the value for goods.goodsPrice
     *
     * @mbg.generated Wed Jun 27 15:10:19 CST 2018
     */
    public void setGoodsPrice(Integer goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    /**
     * This method returns the value of the database column goods.goodsCount
     *
     * @return the value of goods.goodsCount
     *
     * @mbg.generated Wed Jun 27 15:10:19 CST 2018
     */
    public Integer getGoodsCount() {
        return goodsCount;
    }

    /**
     *
     * @mbg.generated Wed Jun 27 15:10:19 CST 2018
     */
    public Goods withGoodsCount(Integer goodsCount) {
        this.setGoodsCount(goodsCount);
        return this;
    }

    /**
     * This method sets the value of the database column goods.goodsCount
     *
     * @param goodsCount the value for goods.goodsCount
     *
     * @mbg.generated Wed Jun 27 15:10:19 CST 2018
     */
    public void setGoodsCount(Integer goodsCount) {
        this.goodsCount = goodsCount;
    }

    /**
     * This method returns the value of the database column goods.creationTime
     *
     * @return the value of goods.creationTime
     *
     * @mbg.generated Wed Jun 27 15:10:19 CST 2018
     */
    public Date getCreationTime() {
        return creationTime;
    }

    /**
     *
     * @mbg.generated Wed Jun 27 15:10:19 CST 2018
     */
    public Goods withCreationTime(Date creationTime) {
        this.setCreationTime(creationTime);
        return this;
    }

    /**
     * This method sets the value of the database column goods.creationTime
     *
     * @param creationTime the value for goods.creationTime
     *
     * @mbg.generated Wed Jun 27 15:10:19 CST 2018
     */
    public void setCreationTime(Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     *
     * @mbg.generated Wed Jun 27 15:10:19 CST 2018
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", goodsName=").append(goodsName);
        sb.append(", billStatus=").append(billStatus);
        sb.append(", goodsDistrict=").append(goodsDistrict);
        sb.append(", goodsPrice=").append(goodsPrice);
        sb.append(", goodsCount=").append(goodsCount);
        sb.append(", creationTime=").append(creationTime);
        sb.append("]");
        return sb.toString();
    }

    /**
     *
     * @mbg.generated Wed Jun 27 15:10:19 CST 2018
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
        Goods other = (Goods) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getGoodsName() == null ? other.getGoodsName() == null : this.getGoodsName().equals(other.getGoodsName()))
            && (this.getBillStatus() == null ? other.getBillStatus() == null : this.getBillStatus().equals(other.getBillStatus()))
            && (this.getGoodsDistrict() == null ? other.getGoodsDistrict() == null : this.getGoodsDistrict().equals(other.getGoodsDistrict()))
            && (this.getGoodsPrice() == null ? other.getGoodsPrice() == null : this.getGoodsPrice().equals(other.getGoodsPrice()))
            && (this.getGoodsCount() == null ? other.getGoodsCount() == null : this.getGoodsCount().equals(other.getGoodsCount()))
            && (this.getCreationTime() == null ? other.getCreationTime() == null : this.getCreationTime().equals(other.getCreationTime()));
    }

    /**
     *
     * @mbg.generated Wed Jun 27 15:10:19 CST 2018
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getGoodsName() == null) ? 0 : getGoodsName().hashCode());
        result = prime * result + ((getBillStatus() == null) ? 0 : getBillStatus().hashCode());
        result = prime * result + ((getGoodsDistrict() == null) ? 0 : getGoodsDistrict().hashCode());
        result = prime * result + ((getGoodsPrice() == null) ? 0 : getGoodsPrice().hashCode());
        result = prime * result + ((getGoodsCount() == null) ? 0 : getGoodsCount().hashCode());
        result = prime * result + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        return result;
    }
}