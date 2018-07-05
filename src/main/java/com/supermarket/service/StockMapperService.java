package com.supermarket.service;
<<<<<<< HEAD
import com.supermarket.pojo.Stock;
import com.supermarket.pojo.StockExample;
import java.util.List;
=======

import com.supermarket.pojo.Page;
import com.supermarket.pojo.Stock;

import java.util.List;

>>>>>>> origin/develop
/**
 * @ClassName com.supermarket.service
 * @Description
 * @Author Liuying[albertliuy@foxmail.com]
 * @Date 2018/7/1 22:02
 */

public interface StockMapperService {
<<<<<<< HEAD
    public  List<Stock>   findpromCata(String proCatagory);
=======
    //List<Stock> selectInfo();
    List<Stock> list();
    int total();
    List<Stock> list(Page page);
>>>>>>> origin/develop
}
