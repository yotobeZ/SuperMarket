package com.supermarket.service;

import com.supermarket.pojo.Userlog;
import com.supermarket.pojo.UserlogExample;

import java.util.List;

public interface LoginMapperService {
    List<Userlog> selectByExample(UserlogExample example);
}
