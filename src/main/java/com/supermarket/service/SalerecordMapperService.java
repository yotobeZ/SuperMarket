package com.supermarket.service;

import com.supermarket.pojo.Salerecord;
import com.supermarket.pojo.SalerecordExample;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;
public interface SalerecordMapperService {
    List<Salerecord> selectByExample(SalerecordExample example);
//    List<Salerecord> selectBySaleDate(java.sql.Date date);
//   int sumByDate(java.sql.Date date1,java.sql.Date date2);
//     int sumByDate(java.sql.Date date);

}
