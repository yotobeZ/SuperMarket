package com.supermarket.service;

import com.supermarket.pojo.Userlog;
import com.supermarket.pojo.UserlogExample;

import java.util.List;

public interface UserlogMapperService {
    boolean login(Userlog userlog);
    List<Userlog> selectByExample(Userlog userlog);

}
