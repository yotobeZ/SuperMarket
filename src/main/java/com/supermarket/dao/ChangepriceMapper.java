package com.supermarket.dao;

import com.supermarket.pojo.Changeprice;
import com.supermarket.pojo.ChangepriceExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ChangepriceMapper {
    /**
     *
     * @mbg.generated Wed Jun 27 15:10:05 CST 2018
     */
    long countByExample(ChangepriceExample example);

    /**
     *
     * @mbg.generated Wed Jun 27 15:10:05 CST 2018
     */
    int deleteByExample(ChangepriceExample example);

    /**
     *
     * @mbg.generated Wed Jun 27 15:10:05 CST 2018
     */
    int deleteByPrimaryKey(Integer proId);

    /**
     *
     * @mbg.generated Wed Jun 27 15:10:05 CST 2018
     */
    int insert(Changeprice record);

    /**
     *
     * @mbg.generated Wed Jun 27 15:10:05 CST 2018
     */
    int insertSelective(Changeprice record);

    /**
     *
     * @mbg.generated Wed Jun 27 15:10:05 CST 2018
     */
    List<Changeprice> selectByExample(ChangepriceExample example);

    /**
     *
     * @mbg.generated Wed Jun 27 15:10:05 CST 2018
     */
    Changeprice selectByPrimaryKey(Integer proId);

    /**
     *
     * @mbg.generated Wed Jun 27 15:10:05 CST 2018
     */
    int updateByExampleSelective(@Param("record") Changeprice record, @Param("example") ChangepriceExample example);

    /**
     *
     * @mbg.generated Wed Jun 27 15:10:05 CST 2018
     */
    int updateByExample(@Param("record") Changeprice record, @Param("example") ChangepriceExample example);

    /**
     *
     * @mbg.generated Wed Jun 27 15:10:05 CST 2018
     */
    int updateByPrimaryKeySelective(Changeprice record);

    /**
     *
     * @mbg.generated Wed Jun 27 15:10:05 CST 2018
     */
    int updateByPrimaryKey(Changeprice record);
}