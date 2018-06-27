package com.supermarket.pojo;

import java.io.Serializable;

/**
 * Created By MBG-GUI-EXTENSION https://github.com/spawpaw/mybatis-generator-gui-extension
 * Description:
 * 
 *
 * @author 
 */
public class Returnpro extends ReturnproKey implements Serializable {
    /**
     *
     *
     * @mbg.generated Wed Jun 27 15:45:21 CST 2018
     */
    private Integer returnNum;

    /**
     *
     * @mbg.generated Wed Jun 27 15:45:21 CST 2018
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method returns the value of the database column returnpro.ReturnNum
     *
     * @return the value of returnpro.ReturnNum
     *
     * @mbg.generated Wed Jun 27 15:45:21 CST 2018
     */
    public Integer getReturnNum() {
        return returnNum;
    }

    /**
     *
     * @mbg.generated Wed Jun 27 15:45:21 CST 2018
     */
    public Returnpro withReturnNum(Integer returnNum) {
        this.setReturnNum(returnNum);
        return this;
    }

    /**
     * This method sets the value of the database column returnpro.ReturnNum
     *
     * @param returnNum the value for returnpro.ReturnNum
     *
     * @mbg.generated Wed Jun 27 15:45:21 CST 2018
     */
    public void setReturnNum(Integer returnNum) {
        this.returnNum = returnNum;
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
        sb.append(", returnNum=").append(returnNum);
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
        Returnpro other = (Returnpro) that;
        return (this.getReturnId() == null ? other.getReturnId() == null : this.getReturnId().equals(other.getReturnId()))
            && (this.getSaleId() == null ? other.getSaleId() == null : this.getSaleId().equals(other.getSaleId()))
            && (this.getProId() == null ? other.getProId() == null : this.getProId().equals(other.getProId()))
            && (this.getProDate() == null ? other.getProDate() == null : this.getProDate().equals(other.getProDate()))
            && (this.getReturnNum() == null ? other.getReturnNum() == null : this.getReturnNum().equals(other.getReturnNum()));
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
        result = prime * result + ((getReturnNum() == null) ? 0 : getReturnNum().hashCode());
        return result;
    }
}