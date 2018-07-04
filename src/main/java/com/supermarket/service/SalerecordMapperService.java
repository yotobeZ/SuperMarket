package com.supermarket.service;

import com.supermarket.pojo.Salerecord;
import com.supermarket.pojo.SalerecordExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;
public interface SalerecordMapperService {
    Object selectByDate(String saleDate);
}
