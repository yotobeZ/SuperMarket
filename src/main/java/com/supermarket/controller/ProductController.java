package com.supermarket.controller;


import com.supermarket.pojo.Product;
import com.supermarket.pojo.ProductExample;
import com.supermarket.service.ProductMapperService;
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
@Log
@Controller
public class ProductController {

    @Autowired
    ProductMapperService productMapperService;
    @Autowired
    SalerecordMapperService salerecordMapperService;
    @RequestMapping(value = "/Sell",method = RequestMethod.GET)
    public String presell(Model model, HttpSession httpSession){
        model.addAttribute("prolist",showall());
        log.info(showall().toString());
        return "list/cashier";
    }
    @RequestMapping(value = "/proselect",method = RequestMethod.POST)
    @ResponseBody
    public Object ajaxSelect(@Param("proName")String proName){
        return productMapperService.selectByName(proName);
    }

    @RequestMapping(value = "/Sell",method = RequestMethod.POST)
    public String sell(Model model,@Param("payway")int payway, @Param("proId")int[] proId, @Param("proNum")int[] proNum, @Param("proName")String[] proName){
        int i =proId.length;
        log.info(""+i);
        int j =salerecordMapperService.insertByIdNumDatePayway(proId,proNum,proName,payway);
        log.info("i:"+i+","+"j:"+j);
        String url="";
        if (i!=j){
            model.addAttribute("info","结算失败请查看日志");
            log.info("失败j:"+j);
        }else {
            model.addAttribute("info","成功生成"+i+"条销售记录");
            log.info("成功");
            return"redirect:/Sell";
        }
        return url;
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

/*   @Autowired
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
    }*/


    //商品信息增删改查
    //查询所有商品
    @RequestMapping("/Testjum")
    public String selectAll(Model model) {
        List<Product> productlist = productMapperService.selectAll();
        log.info(productlist.toString());
        model.addAttribute("productlist", productlist );
        return "/list/Test";
    }
    //添加商品信息
    @RequestMapping("/insertPro")
    public String insert(Product record,Model model) {
        productMapperService.insert(record);
        return "redirect:/Testjum";
    }
    //删除商品
    @RequestMapping("/deletePro")
    public String deleteByPrimaryKey(Integer proId) {
        productMapperService.deleteByPrimaryKey(proId);
        return "redirect:/Testjum";
    }
    //更新商品信息
    @RequestMapping("toUpdateProduct")
    public String toUpdateProduct(Model model, Integer proId) {
        Product product = productMapperService.selectByPrimaryKey(proId);
        log.info(product.toString());
        model.addAttribute("product", product);
        return "/list/updatePro";
    }
    @RequestMapping("/updateProduct")
    public String updateProduct(Model model, Product product) {
        productMapperService.updateByPrimaryKey(product);
        model.addAttribute("product", product);
        return "redirect:/Testjum";
    }




}
