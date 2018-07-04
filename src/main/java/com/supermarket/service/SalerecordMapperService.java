package com.supermarket.service;



import java.util.List;
public interface SalerecordMapperService {
    List<Salerecord> selectByExample(SalerecordExample example);
    Salerecord selectBySaleDate(String saleDate);
}
