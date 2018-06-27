/*
package com.supermarket.controller;

import com.supermarket.dao.GoodsMapper;
import com.supermarket.pojo.Goods;
import com.supermarket.pojo.Product;
import com.supermarket.service.GoodsMapperService;
import com.supermarket.service.ProductMapperService;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.util.List;

*/
/**
 * @ClassName com.supermarket.controller
 * @Description
 * @Author Liuying[albertliuy@foxmail.com]
 * @Date 2018/3/6 15:56
 *//*

@Log
@Controller
public class GoodsController {
    @Autowired
    GoodsMapperService goodsMapperService;
    ProductMapperService productMapperService;
    public GoodsController(){
        System.out.println("初始化Controller");



    }


    @RequestMapping(value = "/GoodsBill",method = RequestMethod.GET)
    */
/**
     * @Title show
     * @Description 显示所选区域的列表
     * @author Liuying[albertliuy@foxmail.com]
     * @date 2018/3/8 21:24
     * @param [goodsDistrict, model]
     * @return java.lang.String
     *//*

    public String show(@RequestParam(value = "goodsDistrict",required = false)Integer goodsDistrict,Model model ){
        log.info("进入显示：地区"+goodsDistrict.toString());
        //List<Goods> goodsList=goodsMapperService.selectByDistrict(goodsDistrict);
        List<Product> productList=productMapperService.selectAll();
        //model.addAttribute("goodsList",goodsList);
        //log.info("显示"+goodsList.toString());
        return "/goodsshow";
    }
    @RequestMapping(value = "/fix/{id}",method = RequestMethod.GET)
    */
/**
     * @Title fix
     * @Description 传值修改
     * @author Liuying[albertliuy@foxmail.com]
     * @date 2018/3/8 21:24
     * @param [id]
     * @return org.springframework.web.servlet.ModelAndView
     *//*

    public ModelAndView fix(@PathVariable Integer id){
        log.info("修改"+id);
        ModelAndView mv=new ModelAndView("/fixgoods");
        mv.addObject("Goods",goodsMapperService.selectById(id));
        return mv;
    }
    @RequestMapping(value = "/dofix",method = RequestMethod.POST)
    */
/**
     * @Title dofix
     * @Description 实际修改
     * @author Liuying[albertliuy@foxmail.com]  
     * @date 2018/3/8 21:24  
     * @param [goods, bindingResult]  
     * @return java.lang.String  
     *//*

    public String dofix(@Valid @ModelAttribute("Goods")Goods goods, BindingResult bindingResult){
        if (bindingResult.hasErrors()){
            log.info("修改失败");
            return "redirect:/fix/"+goods.getId();
        }else {
            goodsMapperService.fixGoodsById(goods);
            log.info("修改成功");
            return "redirect:/GoodsBill?goodsDistrict="+goods.getGoodsDistrict();}
    }
}
*/
