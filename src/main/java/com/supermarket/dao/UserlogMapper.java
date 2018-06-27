package com.supermarket.dao;

import com.supermarket.pojo.Userlog;
import com.supermarket.pojo.UserlogExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserlogMapper {
    /**
     *
     * @mbg.generated Wed Jun 27 15:16:34 CST 2018
     */
    long countByExample(UserlogExample example);

    /**
     *
     * @mbg.generated Wed Jun 27 15:16:34 CST 2018
     */
    int deleteByExample(UserlogExample example);

    /**
     *
     * @mbg.generated Wed Jun 27 15:16:34 CST 2018
     */
    int deleteByPrimaryKey(Integer logId);

    /**
     *
     * @mbg.generated Wed Jun 27 15:16:34 CST 2018
     */
    int insert(Userlog record);

    /**
     *
     * @mbg.generated Wed Jun 27 15:16:34 CST 2018
     */
    int insertSelective(Userlog record);

    /**
     *
     * @mbg.generated Wed Jun 27 15:16:34 CST 2018
     */
    List<Userlog> selectByExample(UserlogExample example);

    /**
     *
     * @mbg.generated Wed Jun 27 15:16:34 CST 2018
     */
    Userlog selectByPrimaryKey(Integer logId);

    /**
     *
     * @mbg.generated Wed Jun 27 15:16:34 CST 2018
     */
    int updateByExampleSelective(@Param("record") Userlog record, @Param("example") UserlogExample example);

    /**
     *
     * @mbg.generated Wed Jun 27 15:16:34 CST 2018
     */
    int updateByExample(@Param("record") Userlog record, @Param("example") UserlogExample example);

    /**
     *
     * @mbg.generated Wed Jun 27 15:16:34 CST 2018
     */
    int updateByPrimaryKeySelective(Userlog record);

    /**
     *
     * @mbg.generated Wed Jun 27 15:16:34 CST 2018
     */
    int updateByPrimaryKey(Userlog record);
}