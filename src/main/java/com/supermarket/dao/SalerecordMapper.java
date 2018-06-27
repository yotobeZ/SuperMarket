package com.supermarket.dao;

import com.supermarket.pojo.Salerecord;
import com.supermarket.pojo.SalerecordExample;
import com.supermarket.pojo.SalerecordKey;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface SalerecordMapper {
    /**
     *
     * @mbg.generated Wed Jun 27 15:45:53 CST 2018
     */
    long countByExample(SalerecordExample example);

    /**
     *
     * @mbg.generated Wed Jun 27 15:45:53 CST 2018
     */
    int deleteByExample(SalerecordExample example);

    /**
     *
     * @mbg.generated Wed Jun 27 15:45:53 CST 2018
     */
    int deleteByPrimaryKey(SalerecordKey key);

    /**
     *
     * @mbg.generated Wed Jun 27 15:45:53 CST 2018
     */
    int insert(Salerecord record);

    /**
     *
     * @mbg.generated Wed Jun 27 15:45:53 CST 2018
     */
    int insertSelective(Salerecord record);

    /**
     *
     * @mbg.generated Wed Jun 27 15:45:53 CST 2018
     */
    List<Salerecord> selectByExample(SalerecordExample example);

    /**
     *
     * @mbg.generated Wed Jun 27 15:45:53 CST 2018
     */
    Salerecord selectByPrimaryKey(SalerecordKey key);

    /**
     *
     * @mbg.generated Wed Jun 27 15:45:53 CST 2018
     */
    int updateByExampleSelective(@Param("record") Salerecord record, @Param("example") SalerecordExample example);

    /**
     *
     * @mbg.generated Wed Jun 27 15:45:53 CST 2018
     */
    int updateByExample(@Param("record") Salerecord record, @Param("example") SalerecordExample example);

    /**
     *
     * @mbg.generated Wed Jun 27 15:45:53 CST 2018
     */
    int updateByPrimaryKeySelective(Salerecord record);

    /**
     *
     * @mbg.generated Wed Jun 27 15:45:53 CST 2018
     */
    int updateByPrimaryKey(Salerecord record);
}