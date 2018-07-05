package com.supermarket.dao;

import com.supermarket.pojo.Page;
import com.supermarket.pojo.Stock;
import com.supermarket.pojo.StockExample;
import com.supermarket.pojo.StockKey;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface StockMapper {
    /**
     *
     * @mbg.generated Wed Jun 27 15:47:12 CST 2018
     */
    long countByExample(StockExample example);

    /**
     *
     * @mbg.generated Wed Jun 27 15:47:12 CST 2018
     */
    int deleteByExample(StockExample example);

    /**
     *
     * @mbg.generated Wed Jun 27 15:47:12 CST 2018
     */
    int deleteByPrimaryKey(StockKey key);

    /**
     *
     * @mbg.generated Wed Jun 27 15:47:12 CST 2018
     */
    int insert(Stock record);

    /**
     *
     * @mbg.generated Wed Jun 27 15:47:12 CST 2018
     */
    int insertSelective(Stock record);

    /**
     *
     * @mbg.generated Wed Jun 27 15:47:12 CST 2018
     */
    List<Stock> selectByExample(StockExample example);
    List<Stock> selectInfo();
    List<Stock> selectInfo(Page page);

    /**
     *
     * @mbg.generated Wed Jun 27 15:47:12 CST 2018
     */
    Stock selectByPrimaryKey(StockKey key);

    /**
     *
     * @mbg.generated Wed Jun 27 15:47:12 CST 2018
     */
    int updateByExampleSelective(@Param("record") Stock record, @Param("example") StockExample example);

    /**
     *
     * @mbg.generated Wed Jun 27 15:47:12 CST 2018
     */
    int updateByExample(@Param("record") Stock record, @Param("example") StockExample example);

    /**
     *
     * @mbg.generated Wed Jun 27 15:47:12 CST 2018
     */
    int updateByPrimaryKeySelective(Stock record);

    /**
     *
     * @mbg.generated Wed Jun 27 15:47:12 CST 2018
     */
    int updateByPrimaryKey(Stock record);

<<<<<<< HEAD
   List <Stock> findpromCata(String proCatagory);
=======
    int total();
>>>>>>> origin/develop
}