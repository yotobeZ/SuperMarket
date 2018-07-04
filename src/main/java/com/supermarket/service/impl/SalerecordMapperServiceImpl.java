package com.supermarket.service.impl;

import com.supermarket.dao.SalerecordMapper;
import com.supermarket.pojo.Salerecord;
import com.supermarket.pojo.SalerecordExample;
import com.supermarket.service.SalerecordMapperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("SalerecordMapperService")
public abstract class SalerecordMapperServiceImpl implements SalerecordMapperService {
    @Autowired
    SalerecordMapper salerecordMapper;

    @Override
    public List<Salerecord> selectByExample(SalerecordExample example) {
        return salerecordMapper.selectByExample( example);
    }

    @Override
    public Salerecord selectBySaleDate(String saleDate) {
        return salerecordMapper.selectBySaleDate(saleDate);
    }
}
