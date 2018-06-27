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
public class Employee implements Serializable {
    /**
     *
     *
     * @mbg.generated Wed Jun 27 15:09:37 CST 2018
     */
    private Integer emId;

    /**
     *
     *
     * @mbg.generated Wed Jun 27 15:09:37 CST 2018
     */
    private String emName;

    /**
     *
     *
     * @mbg.generated Wed Jun 27 15:09:37 CST 2018
     */
    private String sex;

    /**
     *
     *
     * @mbg.generated Wed Jun 27 15:09:37 CST 2018
     */
    private Integer age;

    /**
     *
     *
     * @mbg.generated Wed Jun 27 15:09:37 CST 2018
     */
    private Integer idCard;

    /**
     *
     *
     * @mbg.generated Wed Jun 27 15:09:37 CST 2018
     */
    private Integer phone;

    /**
     *
     *
     * @mbg.generated Wed Jun 27 15:09:37 CST 2018
     */
    private Date hireDate;

    /**
     *
     *
     * @mbg.generated Wed Jun 27 15:09:37 CST 2018
     */
    private String post;

    /**
     *
     * @mbg.generated Wed Jun 27 15:09:37 CST 2018
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method returns the value of the database column employee.EmId
     *
     * @return the value of employee.EmId
     *
     * @mbg.generated Wed Jun 27 15:09:37 CST 2018
     */
    public Integer getEmId() {
        return emId;
    }

    /**
     *
     * @mbg.generated Wed Jun 27 15:09:37 CST 2018
     */
    public Employee withEmId(Integer emId) {
        this.setEmId(emId);
        return this;
    }

    /**
     * This method sets the value of the database column employee.EmId
     *
     * @param emId the value for employee.EmId
     *
     * @mbg.generated Wed Jun 27 15:09:37 CST 2018
     */
    public void setEmId(Integer emId) {
        this.emId = emId;
    }

    /**
     * This method returns the value of the database column employee.EmName
     *
     * @return the value of employee.EmName
     *
     * @mbg.generated Wed Jun 27 15:09:37 CST 2018
     */
    public String getEmName() {
        return emName;
    }

    /**
     *
     * @mbg.generated Wed Jun 27 15:09:37 CST 2018
     */
    public Employee withEmName(String emName) {
        this.setEmName(emName);
        return this;
    }

    /**
     * This method sets the value of the database column employee.EmName
     *
     * @param emName the value for employee.EmName
     *
     * @mbg.generated Wed Jun 27 15:09:37 CST 2018
     */
    public void setEmName(String emName) {
        this.emName = emName;
    }

    /**
     * This method returns the value of the database column employee.Sex
     *
     * @return the value of employee.Sex
     *
     * @mbg.generated Wed Jun 27 15:09:37 CST 2018
     */
    public String getSex() {
        return sex;
    }

    /**
     *
     * @mbg.generated Wed Jun 27 15:09:37 CST 2018
     */
    public Employee withSex(String sex) {
        this.setSex(sex);
        return this;
    }

    /**
     * This method sets the value of the database column employee.Sex
     *
     * @param sex the value for employee.Sex
     *
     * @mbg.generated Wed Jun 27 15:09:37 CST 2018
     */
    public void setSex(String sex) {
        this.sex = sex;
    }

    /**
     * This method returns the value of the database column employee.Age
     *
     * @return the value of employee.Age
     *
     * @mbg.generated Wed Jun 27 15:09:37 CST 2018
     */
    public Integer getAge() {
        return age;
    }

    /**
     *
     * @mbg.generated Wed Jun 27 15:09:37 CST 2018
     */
    public Employee withAge(Integer age) {
        this.setAge(age);
        return this;
    }

    /**
     * This method sets the value of the database column employee.Age
     *
     * @param age the value for employee.Age
     *
     * @mbg.generated Wed Jun 27 15:09:37 CST 2018
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * This method returns the value of the database column employee.IdCard
     *
     * @return the value of employee.IdCard
     *
     * @mbg.generated Wed Jun 27 15:09:37 CST 2018
     */
    public Integer getIdCard() {
        return idCard;
    }

    /**
     *
     * @mbg.generated Wed Jun 27 15:09:37 CST 2018
     */
    public Employee withIdCard(Integer idCard) {
        this.setIdCard(idCard);
        return this;
    }

    /**
     * This method sets the value of the database column employee.IdCard
     *
     * @param idCard the value for employee.IdCard
     *
     * @mbg.generated Wed Jun 27 15:09:37 CST 2018
     */
    public void setIdCard(Integer idCard) {
        this.idCard = idCard;
    }

    /**
     * This method returns the value of the database column employee.Phone
     *
     * @return the value of employee.Phone
     *
     * @mbg.generated Wed Jun 27 15:09:37 CST 2018
     */
    public Integer getPhone() {
        return phone;
    }

    /**
     *
     * @mbg.generated Wed Jun 27 15:09:37 CST 2018
     */
    public Employee withPhone(Integer phone) {
        this.setPhone(phone);
        return this;
    }

    /**
     * This method sets the value of the database column employee.Phone
     *
     * @param phone the value for employee.Phone
     *
     * @mbg.generated Wed Jun 27 15:09:37 CST 2018
     */
    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    /**
     * This method returns the value of the database column employee.HireDate
     *
     * @return the value of employee.HireDate
     *
     * @mbg.generated Wed Jun 27 15:09:37 CST 2018
     */
    public Date getHireDate() {
        return hireDate;
    }

    /**
     *
     * @mbg.generated Wed Jun 27 15:09:37 CST 2018
     */
    public Employee withHireDate(Date hireDate) {
        this.setHireDate(hireDate);
        return this;
    }

    /**
     * This method sets the value of the database column employee.HireDate
     *
     * @param hireDate the value for employee.HireDate
     *
     * @mbg.generated Wed Jun 27 15:09:37 CST 2018
     */
    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    /**
     * This method returns the value of the database column employee.Post
     *
     * @return the value of employee.Post
     *
     * @mbg.generated Wed Jun 27 15:09:37 CST 2018
     */
    public String getPost() {
        return post;
    }

    /**
     *
     * @mbg.generated Wed Jun 27 15:09:37 CST 2018
     */
    public Employee withPost(String post) {
        this.setPost(post);
        return this;
    }

    /**
     * This method sets the value of the database column employee.Post
     *
     * @param post the value for employee.Post
     *
     * @mbg.generated Wed Jun 27 15:09:37 CST 2018
     */
    public void setPost(String post) {
        this.post = post;
    }

    /**
     *
     * @mbg.generated Wed Jun 27 15:09:37 CST 2018
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", emId=").append(emId);
        sb.append(", emName=").append(emName);
        sb.append(", sex=").append(sex);
        sb.append(", age=").append(age);
        sb.append(", idCard=").append(idCard);
        sb.append(", phone=").append(phone);
        sb.append(", hireDate=").append(hireDate);
        sb.append(", post=").append(post);
        sb.append("]");
        return sb.toString();
    }

    /**
     *
     * @mbg.generated Wed Jun 27 15:09:37 CST 2018
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
        Employee other = (Employee) that;
        return (this.getEmId() == null ? other.getEmId() == null : this.getEmId().equals(other.getEmId()))
            && (this.getEmName() == null ? other.getEmName() == null : this.getEmName().equals(other.getEmName()))
            && (this.getSex() == null ? other.getSex() == null : this.getSex().equals(other.getSex()))
            && (this.getAge() == null ? other.getAge() == null : this.getAge().equals(other.getAge()))
            && (this.getIdCard() == null ? other.getIdCard() == null : this.getIdCard().equals(other.getIdCard()))
            && (this.getPhone() == null ? other.getPhone() == null : this.getPhone().equals(other.getPhone()))
            && (this.getHireDate() == null ? other.getHireDate() == null : this.getHireDate().equals(other.getHireDate()))
            && (this.getPost() == null ? other.getPost() == null : this.getPost().equals(other.getPost()));
    }

    /**
     *
     * @mbg.generated Wed Jun 27 15:09:37 CST 2018
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getEmId() == null) ? 0 : getEmId().hashCode());
        result = prime * result + ((getEmName() == null) ? 0 : getEmName().hashCode());
        result = prime * result + ((getSex() == null) ? 0 : getSex().hashCode());
        result = prime * result + ((getAge() == null) ? 0 : getAge().hashCode());
        result = prime * result + ((getIdCard() == null) ? 0 : getIdCard().hashCode());
        result = prime * result + ((getPhone() == null) ? 0 : getPhone().hashCode());
        result = prime * result + ((getHireDate() == null) ? 0 : getHireDate().hashCode());
        result = prime * result + ((getPost() == null) ? 0 : getPost().hashCode());
        return result;
    }
}