package com.supermarket.dao;

import com.supermarket.pojo.Product;
import com.supermarket.pojo.ProductExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ProductMapper {
    /**
     *
     * @mbg.generated Wed Jun 27 15:10:53 CST 2018
     */
    long countByExample(ProductExample example);

    /**
     *
     * @mbg.generated Wed Jun 27 15:10:53 CST 2018
     */
    int deleteByExample(ProductExample example);

    /**
     *
     * @mbg.generated Wed Jun 27 15:10:53 CST 2018
     */
    int deleteByPrimaryKey(Integer proId);

    /**
     *
     * @mbg.generated Wed Jun 27 15:10:53 CST 2018
     */
    int insert(Product record);

    /**
     *
     * @mbg.generated Wed Jun 27 15:10:53 CST 2018
     */
    int insertSelective(Product record);

    /**
     *
     * @mbg.generated Wed Jun 27 15:10:53 CST 2018
     */
    List<Product> selectByExample(ProductExample example);

    /**
     *
     * @mbg.generated Wed Jun 27 15:10:53 CST 2018
     */
    Product selectByPrimaryKey(Integer proId);

    /**
     *
     * @mbg.generated Wed Jun 27 15:10:53 CST 2018
     */
    int updateByExampleSelective(@Param("record") Product record, @Param("example") ProductExample example);

    /**
     *
     * @mbg.generated Wed Jun 27 15:10:53 CST 2018
     */
    int updateByExample(@Param("record") Product record, @Param("example") ProductExample example);

    /**
     *
     * @mbg.generated Wed Jun 27 15:10:53 CST 2018
     */
    int updateByPrimaryKeySelective(Product record);

    /**
     *
     * @mbg.generated Wed Jun 27 15:10:53 CST 2018
     */
    int updateByPrimaryKey(Product record);
}