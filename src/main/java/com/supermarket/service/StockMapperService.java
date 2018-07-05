package com.supermarket.service;

import com.supermarket.pojo.Page;
import com.supermarket.pojo.Stock;

import java.util.List;

/**
 * @ClassName com.supermarket.service
 * @Description
 * @Author Liuying[albertliuy@foxmail.com]
 * @Date 2018/7/1 22:02
 */

public interface StockMapperService {
    //List<Stock> selectInfo();
    List<Stock> list();
    int total();
    List<Stock> list(Page page);
    List<Stock>   findpromCata(String proCatagory);
}
