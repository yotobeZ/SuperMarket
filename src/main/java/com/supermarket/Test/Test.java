package com.supermarket.Test;

import com.supermarket.pojo.Userlog;
import com.supermarket.service.UserlogMapperService;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

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

    @org.junit.Test
    public void TestLogin(){
        Userlog userlog=new Userlog();
        userlog.setLogName("sy");
        userlog.setLogPassword("000");
        List<Userlog> userlogList =userlogMapperService.selectByExample(userlog);
        userlog=userlogList.get(0);
        System.out.println(userlog.toString());
        for (Userlog test:userlogList
             ) {
            System.out.println(1);
            System.out.println(test.toString());
        }


    }
}
