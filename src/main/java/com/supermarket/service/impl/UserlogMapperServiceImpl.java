package com.supermarket.service.impl;

import com.supermarket.dao.UserlogMapper;
import com.supermarket.pojo.Userlog;
import com.supermarket.pojo.UserlogExample;
import com.supermarket.service.UserlogMapperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("UserMapperService")
public class UserlogMapperServiceImpl implements UserlogMapperService {
    @Autowired
    UserlogMapper userlogMapper;


    @Override
    public boolean login(Userlog userlog) {
        UserlogExample userlogExample = new UserlogExample();
        UserlogExample.Criteria criteria = userlogExample.createCriteria();
        criteria.andLogNameEqualTo(userlog.getLogName());
        criteria.andLogPasswordEqualTo(userlog.getLogPassword());
        List<Userlog> userlogList = userlogMapper.selectByExample(userlogExample);
        if (userlogList.size() == 0) {
                return false;
            } else {
                return true;
            }
        }


    @Override
    public List<Userlog> selectByExample(Userlog userlog) {
        UserlogExample userlogExample = new UserlogExample();
        UserlogExample.Criteria criteria = userlogExample.createCriteria();
        criteria.andLogNameEqualTo(userlog.getLogName());
        criteria.andLogPasswordEqualTo(userlog.getLogPassword());
        return userlogMapper.selectByExample(userlogExample);
    }
}


