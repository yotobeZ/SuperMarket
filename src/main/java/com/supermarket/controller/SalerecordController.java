package com.supermarket.controller;

import com.supermarket.pojo.Salerecord;
import com.supermarket.service.SalerecordMapperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.List;

@Controller
public class SalerecordController {
    @Autowired
    SalerecordMapperService salerecordMapperService;
    @RequestMapping(value = "/record")
    public @ResponseBody  Object getRecord(Date saleDate){
        List<Salerecord> list=salerecordMapperService.selectBySaleDate(saleDate);
        return list;
    }
}