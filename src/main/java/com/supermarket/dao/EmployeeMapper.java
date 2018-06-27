package com.supermarket.dao;

import com.supermarket.pojo.Employee;
import com.supermarket.pojo.EmployeeExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface EmployeeMapper {
    /**
     *
     * @mbg.generated Wed Jun 27 15:09:37 CST 2018
     */
    long countByExample(EmployeeExample example);

    /**
     *
     * @mbg.generated Wed Jun 27 15:09:37 CST 2018
     */
    int deleteByExample(EmployeeExample example);

    /**
     *
     * @mbg.generated Wed Jun 27 15:09:37 CST 2018
     */
    int deleteByPrimaryKey(Integer emId);

    /**
     *
     * @mbg.generated Wed Jun 27 15:09:37 CST 2018
     */
    int insert(Employee record);

    /**
     *
     * @mbg.generated Wed Jun 27 15:09:37 CST 2018
     */
    int insertSelective(Employee record);

    /**
     *
     * @mbg.generated Wed Jun 27 15:09:37 CST 2018
     */
    List<Employee> selectByExample(EmployeeExample example);

    /**
     *
     * @mbg.generated Wed Jun 27 15:09:37 CST 2018
     */
    Employee selectByPrimaryKey(Integer emId);

    /**
     *
     * @mbg.generated Wed Jun 27 15:09:37 CST 2018
     */
    int updateByExampleSelective(@Param("record") Employee record, @Param("example") EmployeeExample example);

    /**
     *
     * @mbg.generated Wed Jun 27 15:09:37 CST 2018
     */
    int updateByExample(@Param("record") Employee record, @Param("example") EmployeeExample example);

    /**
     *
     * @mbg.generated Wed Jun 27 15:09:37 CST 2018
     */
    int updateByPrimaryKeySelective(Employee record);

    /**
     *
     * @mbg.generated Wed Jun 27 15:09:37 CST 2018
     */
    int updateByPrimaryKey(Employee record);
}