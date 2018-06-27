package com.supermarket.dao;

import com.supermarket.pojo.Returnpro;
import com.supermarket.pojo.ReturnproExample;
import com.supermarket.pojo.ReturnproKey;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ReturnproMapper {
    /**
     *
     * @mbg.generated Wed Jun 27 15:45:21 CST 2018
     */
    long countByExample(ReturnproExample example);

    /**
     *
     * @mbg.generated Wed Jun 27 15:45:21 CST 2018
     */
    int deleteByExample(ReturnproExample example);

    /**
     *
     * @mbg.generated Wed Jun 27 15:45:21 CST 2018
     */
    int deleteByPrimaryKey(ReturnproKey key);

    /**
     *
     * @mbg.generated Wed Jun 27 15:45:21 CST 2018
     */
    int insert(Returnpro record);

    /**
     *
     * @mbg.generated Wed Jun 27 15:45:21 CST 2018
     */
    int insertSelective(Returnpro record);

    /**
     *
     * @mbg.generated Wed Jun 27 15:45:21 CST 2018
     */
    List<Returnpro> selectByExample(ReturnproExample example);

    /**
     *
     * @mbg.generated Wed Jun 27 15:45:21 CST 2018
     */
    Returnpro selectByPrimaryKey(ReturnproKey key);

    /**
     *
     * @mbg.generated Wed Jun 27 15:45:21 CST 2018
     */
    int updateByExampleSelective(@Param("record") Returnpro record, @Param("example") ReturnproExample example);

    /**
     *
     * @mbg.generated Wed Jun 27 15:45:21 CST 2018
     */
    int updateByExample(@Param("record") Returnpro record, @Param("example") ReturnproExample example);

    /**
     *
     * @mbg.generated Wed Jun 27 15:45:21 CST 2018
     */
    int updateByPrimaryKeySelective(Returnpro record);

    /**
     *
     * @mbg.generated Wed Jun 27 15:45:21 CST 2018
     */
    int updateByPrimaryKey(Returnpro record);
}