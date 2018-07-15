package com.supermarket.service;

import com.supermarket.pojo.Sales;
import com.supermarket.pojo.SalesExample;

import java.util.List;

public interface SalesMapperService {
    List <Sales> selectByExample(SalesExample sa);
     int insert(Sales record);
}
