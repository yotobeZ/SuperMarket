package com.supermarket.dao;

import com.supermarket.pojo.Goods;
import com.supermarket.pojo.GoodsExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface GoodsMapper {
    /**
     *
     * @mbg.generated Wed Jun 27 15:10:19 CST 2018
     */
    long countByExample(GoodsExample example);

    /**
     *
     * @mbg.generated Wed Jun 27 15:10:19 CST 2018
     */
    int deleteByExample(GoodsExample example);

    /**
     *
     * @mbg.generated Wed Jun 27 15:10:19 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated Wed Jun 27 15:10:19 CST 2018
     */
    int insert(Goods record);

    /**
     *
     * @mbg.generated Wed Jun 27 15:10:19 CST 2018
     */
    int insertSelective(Goods record);

    /**
     *
     * @mbg.generated Wed Jun 27 15:10:19 CST 2018
     */
    List<Goods> selectByExample(GoodsExample example);

    /**
     *
     * @mbg.generated Wed Jun 27 15:10:19 CST 2018
     */
    Goods selectByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated Wed Jun 27 15:10:19 CST 2018
     */
    int updateByExampleSelective(@Param("record") Goods record, @Param("example") GoodsExample example);

    /**
     *
     * @mbg.generated Wed Jun 27 15:10:19 CST 2018
     */
    int updateByExample(@Param("record") Goods record, @Param("example") GoodsExample example);

    /**
     *
     * @mbg.generated Wed Jun 27 15:10:19 CST 2018
     */
    int updateByPrimaryKeySelective(Goods record);

    /**
     *
     * @mbg.generated Wed Jun 27 15:10:19 CST 2018
     */
    int updateByPrimaryKey(Goods record);
}