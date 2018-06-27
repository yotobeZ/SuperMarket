package com.supermarket.service;

import com.supermarket.pojo.Product;
import com.supermarket.pojo.ProductExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;


/**
 * @ClassName com.supermarket.service
 * @Description
 * @Author Liuying[albertliuy@foxmail.com]
 * @Date 2018/3/7 21:15
 */

public interface ProductMapperService {
    List<Product> selectByExample(ProductExample example);
}
