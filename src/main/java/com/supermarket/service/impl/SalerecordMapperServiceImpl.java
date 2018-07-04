package com.supermarket.service.impl;

import com.supermarket.dao.SalerecordMapper;
import com.supermarket.pojo.Salerecord;
import com.supermarket.pojo.SalerecordExample;
import com.supermarket.service.SalerecordMapperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
@Service
public class SalerecordMapperServiceImpl implements SalerecordMapperService {
    @Autowired
    SalerecordMapper salerecordMapper;

    @Override
    public List<Salerecord> selectByExample(SalerecordExample example) {
        return salerecordMapper.selectByExample( example);
    }

    @Override
    public List<Salerecord> selectBySaleDate(Date saleDate) {
        return salerecordMapper.selectBySaleDate(saleDate);
    }
}
