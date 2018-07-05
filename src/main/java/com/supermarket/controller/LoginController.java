package com.supermarket.controller;

import com.supermarket.pojo.Userlog;
import com.supermarket.service.UserlogMapperService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.HashMap;

@Controller
public class LoginController {

    private Log log = LogFactory.getLog(this.getClass());

    @Autowired
    UserlogMapperService userlogMapperService;
    @RequestMapping(value="/prelogin",method = RequestMethod.GET)
    public String prelogin(@ModelAttribute("Userlog")Userlog userlog){
        log.info("进入预登陆");
        return "/login";
    }
    @RequestMapping(value="/date",method = RequestMethod.GET)
    public ModelAndView date(){
        log.info("进入date.jsp");
        return new ModelAndView("/list/date");
//        new HashMap<>()
    }


    @RequestMapping(value="/login",method = RequestMethod.POST)
    public String login(@ModelAttribute("Userlog")Userlog userlog, Model model, HttpSession session){
        log.info("进入登陆");
        String url="";
        /**
         * 登陆判断
         */
        if(!userlogMapperService.login(userlog)){
            model.addAttribute("result","0");
            log.info("登陆失败");
            url="redirect:/";
        }
        else{
            userlog=userlogMapperService.selectByExample(userlog).get(0);
            /**
             * 登陆权限判断
             */
            log.info(userlog.getLogLimit().toString());
            switch (userlog.getLogLimit()){
                case 0:{
                    url= "list/orderlist";
                    log.info("店长");
                    break;
                }
                case 1:{
                    url= "redirect:/Sell";
                    log.info("收银员");
                    break;
                }
                case 2:{
                    url=  "list/putin";
                    log.info("库管员");
                    break;
                }
                case 3:{
                    url="redirect:/Testjump";
                    //url=  "list/infolist";
                    log.info("信息员");
                    break;
                }
                case 4:{
                    url="redirect:/prom";
                    //url=  "list/infolist";
                    log.info("理货员");
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



