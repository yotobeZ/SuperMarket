package com.supermarket.controller;


import com.supermarket.pojo.Stock;
import com.supermarket.service.StockMapperService;
import lombok.extern.java.Log;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;
@Log
@Controller
public class StockController {
    @Autowired
    StockMapperService stockMapperService;
    @RequestMapping(value = "/showStock",method = RequestMethod.GET)

    public String show(Model model ){
        List<Stock> stocksList=stockMapperService.selectInfo();
        model.addAttribute("stocksList",stocksList);
        log.info("显示"+stocksList.toString());
        return "list/stockinfo";

    }

}



