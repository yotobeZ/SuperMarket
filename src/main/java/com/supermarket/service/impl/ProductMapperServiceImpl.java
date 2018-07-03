package com.supermarket.service.impl;

import com.supermarket.dao.ProductMapper;
import com.supermarket.pojo.Product;
import com.supermarket.pojo.ProductExample;
import com.supermarket.service.ProductMapperService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * @ClassName com.bdqn.service
 * @Description
 * @Author Liuying[albertliuy@foxmail.com]
 * @Date 2018/3/7 21:18
 */
@Service("ProductMapperService")
public class ProductMapperServiceImpl implements ProductMapperService {
    @Autowired
    ProductMapper productMapper;

    @Override
    public List<Product> selectByExample(ProductExample example) {
        return productMapper.selectByExample(example);
    }

    @Override
    public Product selectByName(String proName) {
        return productMapper.selectByName(proName);
    }
}
