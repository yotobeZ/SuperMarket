package com.supermarket.service.impl;

import com.supermarket.dao.StockMapper;
<<<<<<< HEAD
import com.supermarket.dao.UserlogMapper;
=======
import com.supermarket.pojo.Page;
>>>>>>> origin/develop
import com.supermarket.pojo.Stock;
import com.supermarket.service.StockMapperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName com.supermarket.service.impl
 * @Description
 * @Author Liuying[albertliuy@foxmail.com]
 * @Date 2018/7/1 22:02
 */
@Service("StockMapperService")
<<<<<<< HEAD
public class StockMapperServiceImpl implements  StockMapperService{
    @Autowired
    StockMapper stockMapper;
    @Override
    public List<Stock> findpromCata(String proCatagory){
        return stockMapper. findpromCata(  proCatagory);
=======
public class StockMapperServiceImpl implements StockMapperService {
    @Autowired
    StockMapper stockMapper;

    /*@Override
    public List<Stock> selectInfo() {
        return stockMapper.selectInfo();
    }*/

    @Override
    public List<Stock> list() {
        return stockMapper.selectInfo();
    }

    @Override
    public int total() {
        return stockMapper.total();
    }

    @Override
    public List<Stock> list(Page page) {
        return stockMapper.selectInfo(page);
>>>>>>> origin/develop
    }
}
