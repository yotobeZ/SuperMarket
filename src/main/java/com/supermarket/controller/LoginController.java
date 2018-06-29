package com.supermarket.controller;

import com.supermarket.pojo.ProductExample;
import com.supermarket.pojo.Userlog;
import com.supermarket.pojo.UserlogExample;
import com.supermarket.service.LoginMapperService;
import com.supermarket.service.ProductMapperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

public class LoginController {
    @Autowired
    LoginMapperService loginMapperService;
    @RequestMapping(value="/login")
    @ResponseBody
    public void login(String username,String password){
        UserlogExample userlogExample=new UserlogExample();
        Userlog userlog = new Userlog();
        userlog.withLogName(username);
        userlog.withLogPassword(password);

        System.out.println(loginMapperService.selectByExample(userlogExample).toString());
        return loginMapperService.selectByExample(userlogExample).toString();

    }
}


