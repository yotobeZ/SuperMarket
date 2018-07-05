package com.supermarket.pojo;

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

    public String getProName() {
        return proName;
    }

    public void setProName(String proName) {
        this.proName = proName;
    }

    /**

     *
     * @mbg.generated Wed Jun 27 15:47:12 CST 2018
     */
    private static final long serialVersionUID = 1L;

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
        sb.append(", storeNum=").append(storeNum);
        sb.append("]");
        return sb.toString();
    }

    /**
     *
     * @mbg.generated Wed Jun 27 15:47:12 CST 2018
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
        Stock other = (Stock) that;
        return (this.getProId() == null ? other.getProId() == null : this.getProId().equals(other.getProId()))
            && (this.getProDate() == null ? other.getProDate() == null : this.getProDate().equals(other.getProDate()))
            && (this.getStoreNum() == null ? other.getStoreNum() == null : this.getStoreNum().equals(other.getStoreNum()));
    }

    /**
     *
     * @mbg.generated Wed Jun 27 15:47:12 CST 2018
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getProId() == null) ? 0 : getProId().hashCode());
        result = prime * result + ((getProDate() == null) ? 0 : getProDate().hashCode());
        result = prime * result + ((getStoreNum() == null) ? 0 : getStoreNum().hashCode());
        return result;
    }
}