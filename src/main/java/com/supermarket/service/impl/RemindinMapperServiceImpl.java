package com.supermarket.service.impl;

import com.supermarket.dao.RemindinMapper;
import com.supermarket.pojo.Remindin;
import com.supermarket.service.RemindinMapperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RemindinMapperServiceImpl implements RemindinMapperService {
    @Autowired
    RemindinMapper remindinMapper;

    @Override
    public List<Remindin> selectInfo() {
        return remindinMapper.selectInfo();
    }
}
