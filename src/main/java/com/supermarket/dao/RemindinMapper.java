package com.supermarket.dao;

import com.supermarket.pojo.Remindin;
import com.supermarket.pojo.RemindinExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface RemindinMapper {
    /**
     *
     * @mbg.generated Thu Jul 05 10:06:15 CST 2018
     */
    long countByExample(RemindinExample example);

    /**
     *
     * @mbg.generated Thu Jul 05 10:06:15 CST 2018
     */
    int deleteByExample(RemindinExample example);

    /**
     *
     * @mbg.generated Thu Jul 05 10:06:15 CST 2018
     */
    int deleteByPrimaryKey(Integer proId);

    /**
     *
     * @mbg.generated Thu Jul 05 10:06:15 CST 2018
     */
    int insert(Remindin record);

    /**
     *
     * @mbg.generated Thu Jul 05 10:06:15 CST 2018
     */
    int insertSelective(Remindin record);

    /**
     *
     * @mbg.generated Thu Jul 05 10:06:15 CST 2018
     */
    List<Remindin> selectByExample(RemindinExample example);

    /**
     *
     * @mbg.generated Thu Jul 05 10:06:15 CST 2018
     */
    Remindin selectByPrimaryKey(Integer proId);

    /**
     *
     * @mbg.generated Thu Jul 05 10:06:15 CST 2018
     */
    int updateByExampleSelective(@Param("record") Remindin record, @Param("example") RemindinExample example);

    /**
     *
     * @mbg.generated Thu Jul 05 10:06:15 CST 2018
     */
    int updateByExample(@Param("record") Remindin record, @Param("example") RemindinExample example);

    /**
     *
     * @mbg.generated Thu Jul 05 10:06:15 CST 2018
     */
    int updateByPrimaryKeySelective(Remindin record);

    /**
     *
     * @mbg.generated Thu Jul 05 10:06:15 CST 2018
     */
    int updateByPrimaryKey(Remindin record);
}