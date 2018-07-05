package com.supermarket.controller;


import com.supermarket.pojo.ProductExample;
import com.supermarket.pojo.Remindin;
import com.supermarket.pojo.Stock;
import com.supermarket.service.StockMapperService;
import lombok.extern.java.Log;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;
@Log
@Controller
public class StockController {
    @Autowired
    StockMapperService stockMapperService;
    @RequestMapping(value = "/showStock",method = RequestMethod.GET)
    public String show(Model model){
        List<Stock> stocksList=stockMapperService.selectAll();
        model.addAttribute("stocksList",stocksList);
        log.info("显示"+stocksList.toString());
        return "list/stockinfo";
    }
    @RequestMapping(value = "/showRemind",method = RequestMethod.POST)
    @ResponseBody
    public String show(Model model ){
        List<Remindin> RemindinsList=stockMapperService.selectAll();
        //List<Product> productList=productMapperService.selectAll();
        model.addAttribute("goodsList",goodsList);
        log.info("显示"+goodsList.toString());
        return "list/stockremind";
    }

    public Object showall(){
        ProductExample productExample=new ProductExample();
        return productMapperService.selectByExample(productExample);
    }

}



