package com.supermarket.pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;

/**
 * Created By MBG-GUI-EXTENSION https://github.com/spawpaw/mybatis-generator-gui-extension
 * Description:
 * 
 *
 * @author 
 */
public class Product implements Serializable {
    /**
     *
     *
     * @mbg.generated Wed Jun 27 15:10:53 CST 2018
     */
    /**mapper返回**/

    public Integer proId;
    /**
     *
     *
     * @mbg.generated Wed Jun 27 15:10:53 CST 2018
     */
    public String proName;

    /**
     *
     *
     * @mbg.generated Wed Jun 27 15:10:53 CST 2018
     */
    private String proShelf;

    /**
     *
     *
     * @mbg.generated Wed Jun 27 15:10:53 CST 2018
     */
    private BigDecimal proPrice;

    /**
     *
     *
     * @mbg.generated Wed Jun 27 15:10:53 CST 2018
     */
    private String proSize;

    /**
     *
     *
     * @mbg.generated Wed Jun 27 15:10:53 CST 2018
     */
    private String proCatagory;

    /**
     *
     *
     * @mbg.generated Wed Jun 27 15:10:53 CST 2018
     */
    public Integer salesDay;

    /**
     *
     *
     * @mbg.generated Wed Jun 27 15:10:53 CST 2018
     */
    private Integer provideId;

    /**
     *
     *
     * @mbg.generated Wed Jun 27 15:10:53 CST 2018
     */
    private Integer safeStock;

    public Date getProDate() {
        return proDate;
    }

    public void setProDate(Date proDate) {
        this.proDate = proDate;
    }

    private Date proDate;

    /**
     *
     * @mbg.generated Wed Jun 27 15:10:53 CST 2018
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method returns the value of the database column product.ProId
     *
     * @return the value of product.ProId
     *
     * @mbg.generated Wed Jun 27 15:10:53 CST 2018
     */
    public Integer getProId() {
        return proId;
    }

    /**
     *
     * @mbg.generated Wed Jun 27 15:10:53 CST 2018
     */
    public Product withProId(Integer proId) {
        this.setProId(proId);
        return this;
    }

    /**
     * This method sets the value of the database column product.ProId
     *
     * @param proId the value for product.ProId
     *
     * @mbg.generated Wed Jun 27 15:10:53 CST 2018
     */
    public void setProId(Integer proId) {
        this.proId = proId;
    }

    /**
     * This method returns the value of the database column product.ProName
     *
     * @return the value of product.ProName
     *
     * @mbg.generated Wed Jun 27 15:10:53 CST 2018
     */
    public String getProName() {
        return proName;
    }

    /**
     *
     * @mbg.generated Wed Jun 27 15:10:53 CST 2018
     */
    public Product withProName(String proName) {
        this.setProName(proName);
        return this;
    }

    /**
     * This method sets the value of the database column product.ProName
     *
     * @param proName the value for product.ProName
     *
     * @mbg.generated Wed Jun 27 15:10:53 CST 2018
     */
    public void setProName(String proName) {
        this.proName = proName;
    }

    /**
     * This method returns the value of the database column product.ProShelf
     *
     * @return the value of product.ProShelf
     *
     * @mbg.generated Wed Jun 27 15:10:53 CST 2018
     */
    public String getProShelf() {
        return proShelf;
    }

    /**
     *
     * @mbg.generated Wed Jun 27 15:10:53 CST 2018
     */
    public Product withProShelf(String proShelf) {
        this.setProShelf(proShelf);
        return this;
    }

    /**
     * This method sets the value of the database column product.ProShelf
     *
     * @param proShelf the value for product.ProShelf
     *
     * @mbg.generated Wed Jun 27 15:10:53 CST 2018
     */
    public void setProShelf(String proShelf) {
        this.proShelf = proShelf;
    }

    /**
     * This method returns the value of the database column product.ProPrice
     *
     * @return the value of product.ProPrice
     *
     * @mbg.generated Wed Jun 27 15:10:53 CST 2018
     */
    public BigDecimal getProPrice() {
        return proPrice;
    }

    /**
     *
     * @mbg.generated Wed Jun 27 15:10:53 CST 2018
     */
    public Product withProPrice(BigDecimal proPrice) {
        this.setProPrice(proPrice);
        return this;
    }

    /**
     * This method sets the value of the database column product.ProPrice
     *
     * @param proPrice the value for product.ProPrice
     *
     * @mbg.generated Wed Jun 27 15:10:53 CST 2018
     */
    public void setProPrice(BigDecimal proPrice) {
        this.proPrice = proPrice;
    }

    /**
     * This method returns the value of the database column product.ProSize
     *
     * @return the value of product.ProSize
     *
     * @mbg.generated Wed Jun 27 15:10:53 CST 2018
     */
    public String getProSize() {
        return proSize;
    }

    /**
     *
     * @mbg.generated Wed Jun 27 15:10:53 CST 2018
     */
    public Product withProSize(String proSize) {
        this.setProSize(proSize);
        return this;
    }

    /**
     * This method sets the value of the database column product.ProSize
     *
     * @param proSize the value for product.ProSize
     *
     * @mbg.generated Wed Jun 27 15:10:53 CST 2018
     */
    public void setProSize(String proSize) {
        this.proSize = proSize;
    }

    /**
     * This method returns the value of the database column product.ProCatagory
     *
     * @return the value of product.ProCatagory
     *
     * @mbg.generated Wed Jun 27 15:10:53 CST 2018
     */
    public String getProCatagory() {
        return proCatagory;
    }

    /**
     *
     * @mbg.generated Wed Jun 27 15:10:53 CST 2018
     */
    public Product withProCatagory(String proCatagory) {
        this.setProCatagory(proCatagory);
        return this;
    }

    /**
     * This method sets the value of the database column product.ProCatagory
     *
     * @param proCatagory the value for product.ProCatagory
     *
     * @mbg.generated Wed Jun 27 15:10:53 CST 2018
     */
    public void setProCatagory(String proCatagory) {
        this.proCatagory = proCatagory;
    }

    /**
     * This method returns the value of the database column product.SalesDay
     *
     * @return the value of product.SalesDay
     *
     * @mbg.generated Wed Jun 27 15:10:53 CST 2018
     */
    public Integer getSalesDay() {
        return salesDay;
    }

    /**
     *
     * @mbg.generated Wed Jun 27 15:10:53 CST 2018
     */
    public Product withSalesDay(Integer salesDay) {
        this.setSalesDay(salesDay);
        return this;
    }

    /**
     * This method sets the value of the database column product.SalesDay
     *
     * @param salesDay the value for product.SalesDay
     *
     * @mbg.generated Wed Jun 27 15:10:53 CST 2018
     */
    public void setSalesDay(Integer salesDay) {
        this.salesDay = salesDay;
    }

    /**
     * This method returns the value of the database column product.ProvideId
     *
     * @return the value of product.ProvideId
     *
     * @mbg.generated Wed Jun 27 15:10:53 CST 2018
     */
    public Integer getProvideId() {
        return provideId;
    }

    /**
     *
     * @mbg.generated Wed Jun 27 15:10:53 CST 2018
     */
    public Product withProvideId(Integer provideId) {
        this.setProvideId(provideId);
        return this;
    }

    /**
     * This method sets the value of the database column product.ProvideId
     *
     * @param provideId the value for product.ProvideId
     *
     * @mbg.generated Wed Jun 27 15:10:53 CST 2018
     */
    public void setProvideId(Integer provideId) {
        this.provideId = provideId;
    }

    /**
     * This method returns the value of the database column product.SafeStock
     *
     * @return the value of product.SafeStock
     *
     * @mbg.generated Wed Jun 27 15:10:53 CST 2018
     */
    public Integer getSafeStock() {
        return safeStock;
    }

    /**
     *
     * @mbg.generated Wed Jun 27 15:10:53 CST 2018
     */
    public Product withSafeStock(Integer safeStock) {
        this.setSafeStock(safeStock);
        return this;
    }

    /**
     * This method sets the value of the database column product.SafeStock
     *
     * @param safeStock the value for product.SafeStock
     *
     * @mbg.generated Wed Jun 27 15:10:53 CST 2018
     */
    public void setSafeStock(Integer safeStock) {
        this.safeStock = safeStock;
    }

    /**
     *
     * @mbg.generated Wed Jun 27 15:10:53 CST 2018
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", proId=").append(proId);
        sb.append(", proName=").append(proName);
        sb.append(", proShelf=").append(proShelf);
        sb.append(", proPrice=").append(proPrice);
        sb.append(", proSize=").append(proSize);
        sb.append(", proCatagory=").append(proCatagory);
        sb.append(", salesDay=").append(salesDay);
        sb.append(", provideId=").append(provideId);
        sb.append(", safeStock=").append(safeStock);
        sb.append("]");
        return sb.toString();
    }

    /**
     *
     * @mbg.generated Wed Jun 27 15:10:53 CST 2018
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
        Product other = (Product) that;
        return (this.getProId() == null ? other.getProId() == null : this.getProId().equals(other.getProId()))
            && (this.getProName() == null ? other.getProName() == null : this.getProName().equals(other.getProName()))
            && (this.getProShelf() == null ? other.getProShelf() == null : this.getProShelf().equals(other.getProShelf()))
            && (this.getProPrice() == null ? other.getProPrice() == null : this.getProPrice().equals(other.getProPrice()))
            && (this.getProSize() == null ? other.getProSize() == null : this.getProSize().equals(other.getProSize()))
            && (this.getProCatagory() == null ? other.getProCatagory() == null : this.getProCatagory().equals(other.getProCatagory()))
            && (this.getSalesDay() == null ? other.getSalesDay() == null : this.getSalesDay().equals(other.getSalesDay()))
            && (this.getProvideId() == null ? other.getProvideId() == null : this.getProvideId().equals(other.getProvideId()))
            && (this.getSafeStock() == null ? other.getSafeStock() == null : this.getSafeStock().equals(other.getSafeStock()));
    }

    /**
     *
     * @mbg.generated Wed Jun 27 15:10:53 CST 2018
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getProId() == null) ? 0 : getProId().hashCode());
        result = prime * result + ((getProName() == null) ? 0 : getProName().hashCode());
        result = prime * result + ((getProShelf() == null) ? 0 : getProShelf().hashCode());
        result = prime * result + ((getProPrice() == null) ? 0 : getProPrice().hashCode());
        result = prime * result + ((getProSize() == null) ? 0 : getProSize().hashCode());
        result = prime * result + ((getProCatagory() == null) ? 0 : getProCatagory().hashCode());
        result = prime * result + ((getSalesDay() == null) ? 0 : getSalesDay().hashCode());
        result = prime * result + ((getProvideId() == null) ? 0 : getProvideId().hashCode());
        result = prime * result + ((getSafeStock() == null) ? 0 : getSafeStock().hashCode());
        return result;
    }

}