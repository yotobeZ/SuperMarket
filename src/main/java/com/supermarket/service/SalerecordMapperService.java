package com.supermarket.service;



import com.supermarket.pojo.Salerecord;
import com.supermarket.pojo.SalerecordExample;

import java.util.List;
public interface SalerecordMapperService {
    List<Salerecord> selectByExample(SalerecordExample example);
    Salerecord selectBySaleDate(String saleDate);
}
