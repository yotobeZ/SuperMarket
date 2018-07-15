package com.supermarket.controller;

import com.supermarket.pojo.Sales;
import com.supermarket.pojo.SalesExample;
import com.supermarket.pojo.Stock;
import com.supermarket.service.SalesMapperService;
import com.supermarket.service.StockMapperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class PromotionController {
    @Autowired
    StockMapperService stockMapperService;
    @Autowired
    SalesMapperService salesMapperService;
    @RequestMapping(value="/prom")
    public String prom(){
        return "list/promind";
    }
    //根据前台的输入种类搜索出促销商品
    @RequestMapping(value="/promm")
public String promm(Model model,HttpServletRequest request, HttpSession httpSession){
        String pc= request.getParameter("proCatagory");
       List<Stock> stlist= stockMapperService.findpromCata(pc);
    //    System.out.println(stlist.get(0)) ;
       model.addAttribute("prom",stlist);
  //model.addAttribute("st",stlist);
      System.out.println(stlist);
        return "list/prominfordetail";
    }
    //查询所有的促销信息
    @RequestMapping(value="/promsearch")
    public String promsearch( Model model, HttpSession httpSession ){
        SalesExample salesExampl=new SalesExample();
     List<Sales> sa=   salesMapperService.selectByExample(salesExampl);
            model.addAttribute("promli",sa);
            return "list/promlist";
        }

@RequestMapping(value="/addsq")
    public String addsq(@ModelAttribute("sales")Sales sales , Model model){
      salesMapperService.insert(sales);
      return"添加成功";
   }
}


