package com.supermarket.service.impl;

import com.supermarket.dao.SalerecordMapper;
import com.supermarket.pojo.Salerecord;
import com.supermarket.pojo.SalerecordExample;
import com.supermarket.service.SalerecordMapperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
@Service
public class SalerecordMapperServiceImpl implements SalerecordMapperService {
    @Autowired
    SalerecordMapper salerecordMapper;

    @Override
    public List<Salerecord> selectByExample(SalerecordExample example) {
        return salerecordMapper.selectByExample(example);
    }


//    @Override
//    public List<Salerecord> selectBySaleDate(java.sql.Date date) {
//        return salerecordMapper.selectBySaleDate(date);
//    }

//    @Override
//    public int sumByDate(java.sql.Date date1, java.sql.Date date2){
//        SalerecordExample example=new SalerecordExample();
//        SalerecordExample.Criteria criteria = example.createCriteria();
//        criteria.andSaleDateGreaterThanOrEqualTo(date1);
//        criteria.andSaleDateLessThanOrEqualTo(date2);
//        List<Salerecord> salerecordList = selectByExample(example);
//
//    }
//    public int sumByDate(java.sql.Date date) {
//        List<Salerecord> salerecordList = selectBySaleDate(date);
//        salelist=convertList(salerecordList);
//    }
//    private static List convertList(List<Salerecord> salerecordList) throws SQLException{
//        List salelist = new ArrayList();
//        ResultSetMetaData md = salerecordList.getMetaData();//获取键名
//        int columnCount = md.getColumnCount();//获取行的数量
//        while (salerecordList.next()) {
//            Map rowData = new HashMap();//声明Map
//            for (int i = 1; i <= columnCount; i++) {
//                rowData.put(md.getColumnName(i), salerecordList.getObject(i));//获取键名及值
//            }
//            salelist.add(rowData);
//        }
//        return salelist;
//    }

}
