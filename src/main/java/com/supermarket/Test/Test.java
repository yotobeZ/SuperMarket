package com.supermarket.Test;

import com.supermarket.dao.ProductMapper;
import com.supermarket.dao.SalerecordMapper;
import com.supermarket.pojo.Product;
import com.supermarket.pojo.Salerecord;
import com.supermarket.pojo.Userlog;
import com.supermarket.service.ProductMapperService;
import com.supermarket.service.SalerecordMapperService;
import com.supermarket.service.UserlogMapperService;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.List;

/**
 * @ClassName com.supermarket.Test
 * @Description
 * @Author Liuying[albertliuy@foxmail.com]
 * @Date 2018/6/30 2:38
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-mybatis.xml")
public class Test {
    @Autowired
    UserlogMapperService userlogMapperService;
    @Autowired
    SalerecordMapperService salerecordMapperService;
    @Autowired
    SalerecordMapper salerecordMapper;
    @Autowired
    ProductMapper productMapper;
    @Autowired
    ProductMapperService productMapperService;
    @org.junit.Test
    public void TestLogin() {
     /*   Userlog userlog=new Userlog();
        userlog.setLogName("sy");
        userlog.setLogPassword("000");
        List<Userlog> userlogList =userlogMapperService.selectByExample(userlog);
        userlog=userlogList.get(0);
        System.out.println(userlog.toString());
        for (Userlog test:userlogList
             ) {
            System.out.println(1);
            System.out.println(test.toString());
        }*/
        SnowflakeIdWorker idWorker = new SnowflakeIdWorker(0, 0);
        int[] id = {3, 5};
        int[] num = {1, 2};
        int payway = 2;
        String[]names={"牛奶","话梅"};
        Date[] pdate = {new Date(2018 - 03 - 02), new Date(2018 - 05 - 11)};
        System.out.println(id.length);
        Salerecord salerecord1 = new Salerecord();

        //System.out.println(product.toString());
        //salerecord1.setProDate(product.getProDate());
        salerecord1.setSaleNum(1);
        salerecord1.setProId(3);
        salerecord1.setModeOfPay(payway);
        salerecord1.setSaleDate(new java.util.Date());
        salerecord1.setSaleNo(idWorker.getId());
        //int j = salerecordMapper.insert(salerecord1);
        int i=salerecordMapperService.insertByIdNumDatePayway(id,num,names,payway);
        System.out.println(i);
        //System.out.println("j:" + j);


    }

    @org.junit.Test
    public void Testdate() {
        SnowflakeIdWorker idWorker = new SnowflakeIdWorker(0, 0);
        System.out.println(idWorker.getId());
    }//1530823274166
    // 2147483647
    // 1530823848
}
