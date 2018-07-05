package com.supermarket.pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Created By MBG-GUI-EXTENSION https://github.com/spawpaw/mybatis-generator-gui-extension
 * Description:
 * 
 *
 * @author 
 */
public class Putin extends PutinKey implements Serializable {
    /**
     *
     *
     * @mbg.generated Wed Jun 27 15:13:46 CST 2018
     */
    private Integer provideId;

    /**
     *
     *
     * @mbg.generated Wed Jun 27 15:13:46 CST 2018
     */
    private Date proDate;

    /**
     *
     *
     * @mbg.generated Wed Jun 27 15:13:46 CST 2018
     */
    private Integer num;

    /**
     *
     *
     * @mbg.generated Wed Jun 27 15:13:46 CST 2018
     */
    private BigDecimal impPrice;

    /**
     *
     *
     * @mbg.generated Wed Jun 27 15:13:46 CST 2018
     */
    private Date impDate;

    /**
     *
     *
     * @mbg.generated Wed Jun 27 15:13:46 CST 2018
     */
    private Date expDate;

    /**
     *
     *
     * @mbg.generated Wed Jun 27 15:13:46 CST 2018
     */
    private String operator;

    /**
     *
     * @mbg.generated Wed Jun 27 15:13:46 CST 2018
     */
    private static final long serialVersionUID = 1L;
    private  Product product;

    public Product getProduct() {
        return product;
    }
    public void setProduct(Product product) {
        this.product = product;
    }
    /**
     * This method returns the value of the database column putin.ProvideId
     *
     * @return the value of putin.ProvideId
     *
     * @mbg.generated Wed Jun 27 15:13:46 CST 2018
     */
    public Integer getProvideId() {
        return provideId;
    }

    /**
     *
     * @mbg.generated Wed Jun 27 15:13:46 CST 2018
     */
    public Putin withProvideId(Integer provideId) {
        this.setProvideId(provideId);
        return this;
    }

    /**
     * This method sets the value of the database column putin.ProvideId
     *
     * @param provideId the value for putin.ProvideId
     *
     * @mbg.generated Wed Jun 27 15:13:46 CST 2018
     */
    public void setProvideId(Integer provideId) {
        this.provideId = provideId;
    }

    /**
     * This method returns the value of the database column putin.ProDate
     *
     * @return the value of putin.ProDate
     *
     * @mbg.generated Wed Jun 27 15:13:46 CST 2018
     */
    public Date getProDate() {
        return proDate;
    }

    /**
     *
     * @mbg.generated Wed Jun 27 15:13:46 CST 2018
     */
    public Putin withProDate(Date proDate) {
        this.setProDate(proDate);
        return this;
    }

    /**
     * This method sets the value of the database column putin.ProDate
     *
     * @param proDate the value for putin.ProDate
     *
     * @mbg.generated Wed Jun 27 15:13:46 CST 2018
     */
    public void setProDate(Date proDate) {
        this.proDate = proDate;
    }

    /**
     * This method returns the value of the database column putin.Num
     *
     * @return the value of putin.Num
     *
     * @mbg.generated Wed Jun 27 15:13:46 CST 2018
     */
    public Integer getNum() {
        return num;
    }

    /**
     *
     * @mbg.generated Wed Jun 27 15:13:46 CST 2018
     */
    public Putin withNum(Integer num) {
        this.setNum(num);
        return this;
    }

    /**
     * This method sets the value of the database column putin.Num
     *
     * @param num the value for putin.Num
     *
     * @mbg.generated Wed Jun 27 15:13:46 CST 2018
     */
    public void setNum(Integer num) {
        this.num = num;
    }

    /**
     * This method returns the value of the database column putin.ImpPrice
     *
     * @return the value of putin.ImpPrice
     *
     * @mbg.generated Wed Jun 27 15:13:46 CST 2018
     */
    public BigDecimal getImpPrice() {
        return impPrice;
    }

    /**
     *
     * @mbg.generated Wed Jun 27 15:13:46 CST 2018
     */
    public Putin withImpPrice(BigDecimal impPrice) {
        this.setImpPrice(impPrice);
        return this;
    }

    /**
     * This method sets the value of the database column putin.ImpPrice
     *
     * @param impPrice the value for putin.ImpPrice
     *
     * @mbg.generated Wed Jun 27 15:13:46 CST 2018
     */
    public void setImpPrice(BigDecimal impPrice) {
        this.impPrice = impPrice;
    }

    /**
     * This method returns the value of the database column putin.ImpDate
     *
     * @return the value of putin.ImpDate
     *
     * @mbg.generated Wed Jun 27 15:13:46 CST 2018
     */
    public Date getImpDate() {
        return impDate;
    }

    /**
     *
     * @mbg.generated Wed Jun 27 15:13:46 CST 2018
     */
    public Putin withImpDate(Date impDate) {
        this.setImpDate(impDate);
        return this;
    }

    /**
     * This method sets the value of the database column putin.ImpDate
     *
     * @param impDate the value for putin.ImpDate
     *
     * @mbg.generated Wed Jun 27 15:13:46 CST 2018
     */
    public void setImpDate(Date impDate) {
        this.impDate = impDate;
    }

    /**
     * This method returns the value of the database column putin.ExpDate
     *
     * @return the value of putin.ExpDate
     *
     * @mbg.generated Wed Jun 27 15:13:46 CST 2018
     */
    public Date getExpDate() {
        return expDate;
    }

    /**
     *
     * @mbg.generated Wed Jun 27 15:13:46 CST 2018
     */
    public Putin withExpDate(Date expDate) {
        this.setExpDate(expDate);
        return this;
    }

    /**
     * This method sets the value of the database column putin.ExpDate
     *
     * @param expDate the value for putin.ExpDate
     *
     * @mbg.generated Wed Jun 27 15:13:46 CST 2018
     */
    public void setExpDate(Date expDate) {
        this.expDate = expDate;
    }

    /**
     * This method returns the value of the database column putin.Operator
     *
     * @return the value of putin.Operator
     *
     * @mbg.generated Wed Jun 27 15:13:46 CST 2018
     */
    public String getOperator() {
        return operator;
    }

    /**
     *
     * @mbg.generated Wed Jun 27 15:13:46 CST 2018
     */
    public Putin withOperator(String operator) {
        this.setOperator(operator);
        return this;
    }

    /**
     * This method sets the value of the database column putin.Operator
     *
     * @param operator the value for putin.Operator
     *
     * @mbg.generated Wed Jun 27 15:13:46 CST 2018
     */
    public void setOperator(String operator) {
        this.operator = operator;
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
        sb.append(", provideId=").append(provideId);
        sb.append(", proDate=").append(proDate);
        sb.append(", num=").append(num);
        sb.append(", impPrice=").append(impPrice);
        sb.append(", impDate=").append(impDate);
        sb.append(", expDate=").append(expDate);
        sb.append(", operator=").append(operator);
        sb.append(", product=").append(product);
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
        Putin other = (Putin) that;
        return (this.getProId() == null ? other.getProId() == null : this.getProId().equals(other.getProId()))
            && (this.getImpBill() == null ? other.getImpBill() == null : this.getImpBill().equals(other.getImpBill()))
            && (this.getProvideId() == null ? other.getProvideId() == null : this.getProvideId().equals(other.getProvideId()))
            && (this.getProDate() == null ? other.getProDate() == null : this.getProDate().equals(other.getProDate()))
            && (this.getNum() == null ? other.getNum() == null : this.getNum().equals(other.getNum()))
            && (this.getImpPrice() == null ? other.getImpPrice() == null : this.getImpPrice().equals(other.getImpPrice()))
            && (this.getImpDate() == null ? other.getImpDate() == null : this.getImpDate().equals(other.getImpDate()))
            && (this.getExpDate() == null ? other.getExpDate() == null : this.getExpDate().equals(other.getExpDate()))
            && (this.getOperator() == null ? other.getOperator() == null : this.getOperator().equals(other.getOperator()));
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
        result = prime * result + ((getProvideId() == null) ? 0 : getProvideId().hashCode());
        result = prime * result + ((getProDate() == null) ? 0 : getProDate().hashCode());
        result = prime * result + ((getNum() == null) ? 0 : getNum().hashCode());
        result = prime * result + ((getImpPrice() == null) ? 0 : getImpPrice().hashCode());
        result = prime * result + ((getImpDate() == null) ? 0 : getImpDate().hashCode());
        result = prime * result + ((getExpDate() == null) ? 0 : getExpDate().hashCode());
        result = prime * result + ((getOperator() == null) ? 0 : getOperator().hashCode());
        return result;
    }
}