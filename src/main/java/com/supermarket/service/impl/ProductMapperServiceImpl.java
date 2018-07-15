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



    //商品信息增删改查
    @Override
    public Product selectByPrimaryKey(Integer proId) {
        return productMapper.selectByPrimaryKey(proId);
    }

    @Override
    public String updateByPrimaryKey(Product record) {
        productMapper.updateByPrimaryKey(record);
        return "";
    }


    @Override
    public String deleteByPrimaryKey(Integer proId) {
        productMapper.deleteByPrimaryKey(proId);
        return "";
    }

    @Override
    public String insert(Product record) {
        productMapper.insert(record);
        return "";
    }


    @Override
    public List<Product> selectAll() {
        return productMapper.selectAll();
    }



}
