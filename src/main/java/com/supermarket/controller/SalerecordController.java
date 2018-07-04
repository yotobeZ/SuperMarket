package com.supermarket.controller;

import com.supermarket.pojo.Salerecord;
import com.supermarket.pojo.SalerecordExample;
import com.supermarket.service.SalerecordMapperService;
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

public class SalerecordController {
    @Autowired
    SalerecordMapperService salerecordMapperService;
    @RequestMapping(value = "tec")
    public EcDtUtils() {

    }

    @RequestMapping(value = "/datebar",method = RequestMethod.GET)
    public ModelAndView datebar(HttpServletRequest request) {
        return new ModelAndView("list/date");
    }

    @RequestMapping(value = "/barData", method = RequestMethod.GET)
    @ResponseBody
    public Object ajaxSelect(@Param("SaleDate")String SaleDate){
        return salerecordMapperService.selectByDate(SaleDate);
    }
}