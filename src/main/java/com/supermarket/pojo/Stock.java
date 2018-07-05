package com.supermarket.pojo;

import  com.supermarket.pojo.Product;

import java.io.Serializable;

/**
 * Created By MBG-GUI-EXTENSION https://github.com/spawpaw/mybatis-generator-gui-extension
 * Description:
 * 
 *
 * @author 
 */
public class Stock extends StockKey implements Serializable {
    /**
     *
     *
     * @mbg.generated Wed Jun 27 15:47:12 CST 2018
     */
    private Integer storeNum;
    private String proName;

    /**
     *
     * @mbg.generated Wed Jun 27 15:47:12 CST 2018
     */
    private static final long serialVersionUID = 1L;

    private  Integer  salesDay;

    public String getProName() {
        return proName;
    }

    public void setProName(String proName) {
        this.proName = proName;
    }
    private Integer restday;
    public void setRestday(Integer restday) {
        this.restday=  restday;
    }

    public Integer getRestday() {
        return  restday;
    }

    public void setSalesDay(Integer salesDay) {
        this.salesDay = salesDay;
    }

    public Integer getSalesDay() {
        return salesDay;
    }
    /**
    /**
     * This method returns the value of the database column stock.StoreNum
     *
     * @return the value of stock.StoreNum
     *
     * @mbg.generated Wed Jun 27 15:47:12 CST 2018
     */
    public Integer getStoreNum() {
        return storeNum;
    }
    /**
     *
     * @mbg.generated Wed Jun 27 15:47:12 CST 2018
     */
    public Stock withStoreNum(Integer storeNum) {
        this.setStoreNum(storeNum);
        return this;
    }
    /**
     * This method sets the value of the database column stock.StoreNum
     *
     * @param storeNum the value for stock.StoreNum
     *
     * @mbg.generated Wed Jun 27 15:47:12 CST 2018
     */
    public void setStoreNum(Integer storeNum) {
        this.storeNum = storeNum;
    }
    /**
     *
     * @mbg.generated Wed Jun 27 15:47:12 CST 2018
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", proId=").append(proId);
        sb.append(", proDate=").append(proDate);
        sb.append(", storeNum=").append(storeNum);
        sb.append(", salesDay=").append( salesDay);
        sb.append(", restday=").append( restday);
        sb.append(", proName=").append( proName);
        sb.append("]");
        return sb.toString();
    }

}