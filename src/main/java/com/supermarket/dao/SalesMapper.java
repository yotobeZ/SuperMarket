package com.supermarket.dao;

import com.supermarket.pojo.Sales;
import com.supermarket.pojo.SalesExample;
import com.supermarket.pojo.SalesKey;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface SalesMapper {
    /**
     *
     * @mbg.generated Wed Jun 27 15:47:09 CST 2018
     */
    long countByExample(SalesExample example);

    /**
     *
     * @mbg.generated Wed Jun 27 15:47:09 CST 2018
     */
    int deleteByExample(SalesExample example);

    /**
     *
     * @mbg.generated Wed Jun 27 15:47:09 CST 2018
     */
    int deleteByPrimaryKey(SalesKey key);

    /**
     *
     * @mbg.generated Wed Jun 27 15:47:09 CST 2018
     */
    int insert(Sales record);

    /**
     *
     * @mbg.generated Wed Jun 27 15:47:09 CST 2018
     */
    int insertSelective(Sales record);

    /**
     *
     * @mbg.generated Wed Jun 27 15:47:09 CST 2018
     */
    List<Sales> selectByExample(SalesExample example);

    /**
     *
     * @mbg.generated Wed Jun 27 15:47:09 CST 2018
     */
    Sales selectByPrimaryKey(SalesKey key);

    /**
     *
     * @mbg.generated Wed Jun 27 15:47:09 CST 2018
     */
    int updateByExampleSelective(@Param("record") Sales record, @Param("example") SalesExample example);

    /**
     *
     * @mbg.generated Wed Jun 27 15:47:09 CST 2018
     */
    int updateByExample(@Param("record") Sales record, @Param("example") SalesExample example);

    /**
     *
     * @mbg.generated Wed Jun 27 15:47:09 CST 2018
     */
    int updateByPrimaryKeySelective(Sales record);

    /**
     *
     * @mbg.generated Wed Jun 27 15:47:09 CST 2018
     */
    int updateByPrimaryKey(Sales record);
}