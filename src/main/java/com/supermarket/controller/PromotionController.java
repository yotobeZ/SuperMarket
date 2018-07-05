package com.supermarket.controller;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import lombok.extern.java.Log;
import com.supermarket.pojo.Product;
import com.supermarket.pojo.Stock;
import com.supermarket.pojo.Userlog;
import com.supermarket.service.ProductMapperService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.HttpRequestHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.supermarket.service.StockMapperService ;

import java.util.List;
@Controller
public class PromotionController {
    @Autowired
    StockMapperService stockMapperService;
    @RequestMapping(value="/prom")
    public String prom(){
        return "list/inform";
    }
    @RequestMapping(value="/promm")
public String promm(Model model,HttpServletRequest request, HttpSession httpSession){
        String pc= request.getParameter("proCatagory");

       List<Stock> stlist= stockMapperService.findpromCata(pc);
       System.out.println(stlist.get(0)) ;
       model.addAttribute("prom",stlist);
  //model.addAttribute("st",stlist);
      System.out.println(stlist);
        return "list/informdetail";
    }
}

