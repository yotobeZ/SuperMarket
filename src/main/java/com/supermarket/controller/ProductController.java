package com.supermarket.controller;


import com.supermarket.pojo.Product;
import com.supermarket.pojo.ProductExample;
import com.supermarket.service.ProductMapperService;
import lombok.extern.java.Log;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;
@Log
@Controller
public class ProductController {
    @Autowired
    ProductMapperService productMapperService;
    @RequestMapping(value = "/Sell",method = RequestMethod.GET)
    public String presell(Model model, HttpSession httpSession){
        model.addAttribute("prolist",showall());
        System.out.println(showall());
        return "list/cashier";
    }
    @RequestMapping(value = "/proselect",method = RequestMethod.POST)
    @ResponseBody
    public Object ajaxSelect(@Param("proName")String proName){
        return productMapperService.selectByName(proName);
    }



    @RequestMapping(value = "/Sell",method = RequestMethod.POST)
    public String sell(){

        return "";
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
