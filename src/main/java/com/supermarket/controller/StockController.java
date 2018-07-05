package com.supermarket.controller;


import com.supermarket.pojo.Page;
import com.supermarket.pojo.Stock;
import com.supermarket.service.StockMapperService;
import lombok.extern.java.Log;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
@Log
@Controller
public class StockController {
    @Autowired
    StockMapperService stockMapperService;
    @RequestMapping(value = "/showStock",method = RequestMethod.GET)

    public ModelAndView listStock(Page page){

        ModelAndView mav = new ModelAndView();
        List<Stock> stocksList= stockMapperService.list(page);
        int total = stockMapperService.total();

        page.caculateLast(total);

        // 放入转发参数
        mav.addObject("stocksList", stocksList);
        // 放入jsp路径
        mav.setViewName("list/stockinfo");
        return mav;
    }

}



