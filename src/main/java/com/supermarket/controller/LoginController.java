package com.supermarket.controller;

import com.supermarket.pojo.Userlog;
import com.supermarket.pojo.UserlogExample;
import com.supermarket.service.UserlogMapperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;
@Controller
public class LoginController {
    @Autowired
    UserlogMapperService userlogMapperService;

    @RequestMapping(value="/login")
    public String login(@ModelAttribute("userlog")Userlog userlog, Model model, HttpSession session){
        String url="";
        if(!userlogMapperService.login(userlog)){
            model.addAttribute("result","0");//登陆失败
            url="redirect:/index";
        }
        else{
            model.addAttribute("result","2");//登录成功
            switch (userlog.getLogLimit()){//判断登陆
                case 0:{
                    url= "list/orderlist";
                    break;
                }
                case 1:{
                    url= "list/cashier";
                    break;
                }
                case 2:{
                    url=  "list/putin";
                    break;
                }
                case 3:{
                    url=  "list/infolist";
                    break;
                }
            }
        }
        return url;
    }
}



