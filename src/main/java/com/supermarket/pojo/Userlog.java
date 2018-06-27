package com.supermarket.pojo;

import java.io.Serializable;

/**
 * Created By MBG-GUI-EXTENSION https://github.com/spawpaw/mybatis-generator-gui-extension
 * Description:
 * 
 *
 * @author 
 */
public class Userlog implements Serializable {
    /**
     *
     *
     * @mbg.generated Wed Jun 27 15:16:34 CST 2018
     */
    private Integer logId;

    /**
     *
     *
     * @mbg.generated Wed Jun 27 15:16:34 CST 2018
     */
    private String logName;

    /**
     *
     *
     * @mbg.generated Wed Jun 27 15:16:34 CST 2018
     */
    private String logPassword;

    /**
     *
     *
     * @mbg.generated Wed Jun 27 15:16:34 CST 2018
     */
    private Integer logLimit;

    /**
     *
     * @mbg.generated Wed Jun 27 15:16:34 CST 2018
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method returns the value of the database column userlog.LogId
     *
     * @return the value of userlog.LogId
     *
     * @mbg.generated Wed Jun 27 15:16:34 CST 2018
     */
    public Integer getLogId() {
        return logId;
    }

    /**
     *
     * @mbg.generated Wed Jun 27 15:16:34 CST 2018
     */
    public Userlog withLogId(Integer logId) {
        this.setLogId(logId);
        return this;
    }

    /**
     * This method sets the value of the database column userlog.LogId
     *
     * @param logId the value for userlog.LogId
     *
     * @mbg.generated Wed Jun 27 15:16:34 CST 2018
     */
    public void setLogId(Integer logId) {
        this.logId = logId;
    }

    /**
     * This method returns the value of the database column userlog.LogName
     *
     * @return the value of userlog.LogName
     *
     * @mbg.generated Wed Jun 27 15:16:34 CST 2018
     */
    public String getLogName() {
        return logName;
    }

    /**
     *
     * @mbg.generated Wed Jun 27 15:16:34 CST 2018
     */
    public Userlog withLogName(String logName) {
        this.setLogName(logName);
        return this;
    }

    /**
     * This method sets the value of the database column userlog.LogName
     *
     * @param logName the value for userlog.LogName
     *
     * @mbg.generated Wed Jun 27 15:16:34 CST 2018
     */
    public void setLogName(String logName) {
        this.logName = logName;
    }

    /**
     * This method returns the value of the database column userlog.LogPassword
     *
     * @return the value of userlog.LogPassword
     *
     * @mbg.generated Wed Jun 27 15:16:34 CST 2018
     */
    public String getLogPassword() {
        return logPassword;
    }

    /**
     *
     * @mbg.generated Wed Jun 27 15:16:34 CST 2018
     */
    public Userlog withLogPassword(String logPassword) {
        this.setLogPassword(logPassword);
        return this;
    }

    /**
     * This method sets the value of the database column userlog.LogPassword
     *
     * @param logPassword the value for userlog.LogPassword
     *
     * @mbg.generated Wed Jun 27 15:16:34 CST 2018
     */
    public void setLogPassword(String logPassword) {
        this.logPassword = logPassword;
    }

    /**
     * This method returns the value of the database column userlog.LogLimit
     *
     * @return the value of userlog.LogLimit
     *
     * @mbg.generated Wed Jun 27 15:16:34 CST 2018
     */
    public Integer getLogLimit() {
        return logLimit;
    }

    /**
     *
     * @mbg.generated Wed Jun 27 15:16:34 CST 2018
     */
    public Userlog withLogLimit(Integer logLimit) {
        this.setLogLimit(logLimit);
        return this;
    }

    /**
     * This method sets the value of the database column userlog.LogLimit
     *
     * @param logLimit the value for userlog.LogLimit
     *
     * @mbg.generated Wed Jun 27 15:16:34 CST 2018
     */
    public void setLogLimit(Integer logLimit) {
        this.logLimit = logLimit;
    }

    /**
     *
     * @mbg.generated Wed Jun 27 15:16:34 CST 2018
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", logId=").append(logId);
        sb.append(", logName=").append(logName);
        sb.append(", logPassword=").append(logPassword);
        sb.append(", logLimit=").append(logLimit);
        sb.append("]");
        return sb.toString();
    }

    /**
     *
     * @mbg.generated Wed Jun 27 15:16:34 CST 2018
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
        Userlog other = (Userlog) that;
        return (this.getLogId() == null ? other.getLogId() == null : this.getLogId().equals(other.getLogId()))
            && (this.getLogName() == null ? other.getLogName() == null : this.getLogName().equals(other.getLogName()))
            && (this.getLogPassword() == null ? other.getLogPassword() == null : this.getLogPassword().equals(other.getLogPassword()))
            && (this.getLogLimit() == null ? other.getLogLimit() == null : this.getLogLimit().equals(other.getLogLimit()));
    }

    /**
     *
     * @mbg.generated Wed Jun 27 15:16:34 CST 2018
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getLogId() == null) ? 0 : getLogId().hashCode());
        result = prime * result + ((getLogName() == null) ? 0 : getLogName().hashCode());
        result = prime * result + ((getLogPassword() == null) ? 0 : getLogPassword().hashCode());
        result = prime * result + ((getLogLimit() == null) ? 0 : getLogLimit().hashCode());
        return result;
    }
}