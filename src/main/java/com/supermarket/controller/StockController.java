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
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;
@Log
@Controller
public class StockController {
    @Autowired
    StockMapperService stockMapperService;
    @RequestMapping(value = "/showStock",method = RequestMethod.GET)
    public ModelAndView show()throws Exception{
        List<Stock> stocksList=stockMapperService.selectInfo();
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("stocksList",stocksList);
        //model.addAttribute("stocksList",stocksList);
        log.info("显示"+stocksList.toString());
        //return "list/stockinfo";
        modelAndView.setViewName("list/stockinfo");


        return modelAndView;

    }

}



