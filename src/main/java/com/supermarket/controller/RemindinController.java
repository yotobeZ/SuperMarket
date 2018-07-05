package com.supermarket.controller;


import com.supermarket.pojo.ProductExample;
import com.supermarket.pojo.Remindin;
import com.supermarket.pojo.Stock;
import com.supermarket.service.RemindinMapperService;
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
public class RemindinController {
    @Autowired
    RemindinMapperService remindinMapperService;
    @RequestMapping(value = "/showRemind",method = RequestMethod.POST)
    @ResponseBody
    public String show(Model model ){
        List<Remindin> remindinsList=remindinMapperService.selectInfo();
        model.addAttribute("remindinsList",remindinsList);
        log.info("显示"+remindinsList.toString());
        return "list/stockremind";
    }

}







