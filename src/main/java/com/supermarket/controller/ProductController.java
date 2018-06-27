package com.supermarket.controller;


import com.supermarket.pojo.ProductExample;
import com.supermarket.service.ProductMapperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ProductController {
    @Autowired
    ProductMapperService productMapperService;
    @RequestMapping("/Test")
    @ResponseBody
    public String showall(){
        ProductExample productExample=new ProductExample();
        System.out.println(productMapperService.selectByExample(productExample).toString());
        return productMapperService.selectByExample(productExample).toString();
    }
}
