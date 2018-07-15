package com.supermarket.service.impl;

import com.supermarket.dao.SalesMapper;
import com.supermarket.pojo.Sales;
import com.supermarket.pojo.SalesExample;
import com.supermarket.service.SalesMapperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(" SalesMapperService")
public class SalesMapperServiceImpl implements SalesMapperService {
    @Autowired
    SalesMapper salesMapper;
    @Override
    public int  insert(Sales record){
     return  salesMapper.insert(record);
    }

    @Override
    public  List <Sales> selectByExample(SalesExample sa){
        return  salesMapper.selectByExample(sa);
    }
}
