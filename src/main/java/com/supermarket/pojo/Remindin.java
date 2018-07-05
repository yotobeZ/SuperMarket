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
public class Remindin implements Serializable {
    /**
     *
     *
     * @mbg.generated Thu Jul 05 10:06:15 CST 2018
     */
    private Integer proId;

    /**
     *
     *
     * @mbg.generated Thu Jul 05 10:06:15 CST 2018
     */
    private Integer inNum;

    /**
     *
     *
     * @mbg.generated Thu Jul 05 10:06:15 CST 2018
     */
    private Date remDate;

    /**
     *
     * @mbg.generated Thu Jul 05 10:06:15 CST 2018
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method returns the value of the database column remindin.ProId
     *
     * @return the value of remindin.ProId
     *
     * @mbg.generated Thu Jul 05 10:06:15 CST 2018
     */
    public Integer getProId() {
        return proId;
    }

    /**
     *
     * @mbg.generated Thu Jul 05 10:06:15 CST 2018
     */
    public Remindin withProId(Integer proId) {
        this.setProId(proId);
        return this;
    }

    /**
     * This method sets the value of the database column remindin.ProId
     *
     * @param proId the value for remindin.ProId
     *
     * @mbg.generated Thu Jul 05 10:06:15 CST 2018
     */
    public void setProId(Integer proId) {
        this.proId = proId;
    }

    /**
     * This method returns the value of the database column remindin.InNum
     *
     * @return the value of remindin.InNum
     *
     * @mbg.generated Thu Jul 05 10:06:15 CST 2018
     */
    public Integer getInNum() {
        return inNum;
    }

    /**
     *
     * @mbg.generated Thu Jul 05 10:06:15 CST 2018
     */
    public Remindin withInNum(Integer inNum) {
        this.setInNum(inNum);
        return this;
    }

    /**
     * This method sets the value of the database column remindin.InNum
     *
     * @param inNum the value for remindin.InNum
     *
     * @mbg.generated Thu Jul 05 10:06:15 CST 2018
     */
    public void setInNum(Integer inNum) {
        this.inNum = inNum;
    }

    /**
     * This method returns the value of the database column remindin.RemDate
     *
     * @return the value of remindin.RemDate
     *
     * @mbg.generated Thu Jul 05 10:06:15 CST 2018
     */
    public Date getRemDate() {
        return remDate;
    }

    /**
     *
     * @mbg.generated Thu Jul 05 10:06:15 CST 2018
     */
    public Remindin withRemDate(Date remDate) {
        this.setRemDate(remDate);
        return this;
    }

    /**
     * This method sets the value of the database column remindin.RemDate
     *
     * @param remDate the value for remindin.RemDate
     *
     * @mbg.generated Thu Jul 05 10:06:15 CST 2018
     */
    public void setRemDate(Date remDate) {
        this.remDate = remDate;
    }

    /**
     *
     * @mbg.generated Thu Jul 05 10:06:15 CST 2018
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", proId=").append(proId);
        sb.append(", inNum=").append(inNum);
        sb.append(", remDate=").append(remDate);
        sb.append("]");
        return sb.toString();
    }

    /**
     *
     * @mbg.generated Thu Jul 05 10:06:15 CST 2018
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
        Remindin other = (Remindin) that;
        return (this.getProId() == null ? other.getProId() == null : this.getProId().equals(other.getProId()))
            && (this.getInNum() == null ? other.getInNum() == null : this.getInNum().equals(other.getInNum()))
            && (this.getRemDate() == null ? other.getRemDate() == null : this.getRemDate().equals(other.getRemDate()));
    }

    /**
     *
     * @mbg.generated Thu Jul 05 10:06:15 CST 2018
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getProId() == null) ? 0 : getProId().hashCode());
        result = prime * result + ((getInNum() == null) ? 0 : getInNum().hashCode());
        result = prime * result + ((getRemDate() == null) ? 0 : getRemDate().hashCode());
        return result;
    }
}