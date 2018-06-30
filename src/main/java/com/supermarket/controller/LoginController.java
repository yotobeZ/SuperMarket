package com.supermarket.controller;

import com.supermarket.pojo.Userlog;
import com.supermarket.service.UserlogMapperService;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;

@Log
@Controller
public class LoginController {
    @Autowired
    UserlogMapperService userlogMapperService;

    @RequestMapping(value="/prelogin",method = RequestMethod.GET)
    public String prelogin(@ModelAttribute("Userlog")Userlog userlog){
        log.info("进入预登陆");
        return "/login";
    }

    @RequestMapping(value="/login",method = RequestMethod.POST)
    public String login(@ModelAttribute("Userlog")Userlog userlog, Model model, HttpSession session){
        log.info("进入登陆");
        String url="";
        if(!userlogMapperService.login(userlog)){
            model.addAttribute("result","0");//登陆失败
            log.info("登陆失败");
            url="redirect:/index";
        }
        else{
            model.addAttribute("result","2");//登录成功\
            userlog=userlogMapperService.selectByExample(userlog).get(0);
            switch (userlog.getLogLimit()){//判断登陆
                case 0:{
                    url= "list/orderlist";
                    log.info("店长");
                    break;
                }
                case 1:{
                    url= "list/cashier";
                    log.info("收银员");
                    break;
                }
                case 2:{
                    url=  "list/putin";
                    log.info("库管");
                    break;
                }
                case 3:{
                    url=  "list/infolist";
                    log.info("信息员");
                    break;
                }
                default:
                    url="redirect:/index";
                    break;
            }
        }
        return url;
    }
}



