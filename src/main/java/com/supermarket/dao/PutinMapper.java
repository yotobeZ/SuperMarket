package com.supermarket.dao;

import com.supermarket.pojo.Putin;
import com.supermarket.pojo.PutinExample;
import com.supermarket.pojo.PutinKey;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PutinMapper {
    /**
     *
     * @mbg.generated Wed Jun 27 15:13:46 CST 2018
     */
    long countByExample(PutinExample example);

    /**
     *
     * @mbg.generated Wed Jun 27 15:13:46 CST 2018
     */
    int deleteByExample(PutinExample example);

    /**
     *
     * @mbg.generated Wed Jun 27 15:13:46 CST 2018
     */
    int deleteByPrimaryKey(PutinKey key);

    /**
     *
     * @mbg.generated Wed Jun 27 15:13:46 CST 2018
     */
    int insert(Putin record);

    /**
     *
     * @mbg.generated Wed Jun 27 15:13:46 CST 2018
     */
    int insertSelective(Putin record);

    /**
     *
     * @mbg.generated Wed Jun 27 15:13:46 CST 2018
     */
    List<Putin> selectByExample(PutinExample example);

    /**
     *
     * @mbg.generated Wed Jun 27 15:13:46 CST 2018
     */
    Putin selectByPrimaryKey(PutinKey key);

    /**
     *
     * @mbg.generated Wed Jun 27 15:13:46 CST 2018
     */
    int updateByExampleSelective(@Param("record") Putin record, @Param("example") PutinExample example);

    /**
     *
     * @mbg.generated Wed Jun 27 15:13:46 CST 2018
     */
    int updateByExample(@Param("record") Putin record, @Param("example") PutinExample example);

    /**
     *
     * @mbg.generated Wed Jun 27 15:13:46 CST 2018
     */
    int updateByPrimaryKeySelective(Putin record);

    /**
     *
     * @mbg.generated Wed Jun 27 15:13:46 CST 2018
     */
    int updateByPrimaryKey(Putin record);
}