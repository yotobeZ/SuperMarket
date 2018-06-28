package com.supermarket.service.impl;

import com.supermarket.dao.UserlogMapper;
import com.supermarket.pojo.Userlog;
import com.supermarket.pojo.UserlogExample;
import com.supermarket.service.LoginMapperService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class LoginMapperServiceImpl implements LoginMapperService {
    @Autowired
    private UserlogMapper userlogMapper;

    @Override
    public List<Userlog> selectByExample(UserlogExample example) {

        return userlogMapper.selectByExample(example);
    }


}
