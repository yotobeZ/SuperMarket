package com.supermarket.Test;

import com.supermarket.pojo.Userlog;
import com.supermarket.service.UserlogMapperService;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

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
    @org.junit.Test
    public void TestLogin(){
        Userlog userlog=new Userlog();
        userlog.setLogName("店长");
        userlog.setLogPassword("000");
        System.out.println(userlogMapperService.login(userlog));
    }
}
