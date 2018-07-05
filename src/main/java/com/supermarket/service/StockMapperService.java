package com.supermarket.service;
import com.supermarket.pojo.Stock;
import com.supermarket.pojo.StockExample;
import java.util.List;
/**
 * @ClassName com.supermarket.service
 * @Description
 * @Author Liuying[albertliuy@foxmail.com]
 * @Date 2018/7/1 22:02
 */

public interface StockMapperService {
    public  List<Stock>   findpromCata(String proCatagory);
}
