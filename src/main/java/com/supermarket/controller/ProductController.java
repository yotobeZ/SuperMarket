package com.supermarket.controller;


import com.supermarket.pojo.Product;
import com.supermarket.pojo.ProductExample;
import com.supermarket.service.ProductMapperService;
import com.supermarket.service.SalerecordMapperService;
import lombok.extern.java.Log;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.sql.Date;
import java.util.List;
@Log
@Controller
public class ProductController {
    @Autowired
    ProductMapperService productMapperService;
    @Autowired
    SalerecordMapperService salerecordMapperService;
    @RequestMapping(value = "/Sell",method = RequestMethod.GET)
    public String presell(Model model, HttpSession httpSession){
        model.addAttribute("prolist",showall());
        return "list/cashier";
    }
    @RequestMapping(value = "/proselect",method = RequestMethod.POST)
    @ResponseBody
    public Object ajaxSelect(@Param("proName")String proName){
        return productMapperService.selectByName(proName);
    }



    @RequestMapping(value = "/Sell",method = RequestMethod.POST)
    public String sell(Model model,@Param("payway")int payway, @Param("proId")int[] proId, @Param("proNum")int[] proNum, @Param("proName")String[] proName){
        int i =proId.length;
        log.info(""+i);
        int j =salerecordMapperService.insertByIdNumDatePayway(proId,proNum,proName,payway);
        log.info("i:"+i+","+"j:"+j);
        String url="";
        if (i!=j){
            model.addAttribute("info","结算失败请查看日志");
            log.info("失败j:"+j);
        }else {
            model.addAttribute("info","成功生成"+i+"条销售记录");
            log.info("成功");
            return"redirect:/Sell";
        }
        return url;
    }
    @RequestMapping("/Test")
    @ResponseBody
    public Object showall(){
        ProductExample productExample=new ProductExample();
        return productMapperService.selectByExample(productExample);
    }

    @RequestMapping("/Testjump")
    public String Testjump(){
        return "list/in";
    }


}
