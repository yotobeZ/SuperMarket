package com.supermarket.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @Author: lly
 * @Date: 2018/7/4 19:59
 */
public class hash {
    public static List<String> DateSale(String str, String spl) {
        String[] strs = null;
        List<String> strList = null;
        if (str != null) {
            strs = str.split(spl);
            if (strs != null) {
                strList = new ArrayList<String>();
                for (String st : strs) {
                    strList.add(st != null ? st.trim() : "");
                }
            }
        }
        return strList;
    }
    public static List<HashMap<String, Object>> getDateSale() {
        List<HashMap<String, Object>> list = new ArrayList<HashMap<String, Object>>();
        List<String> names = DateSale("周日, 周一, 周二, 周三, 周四, 周五, 周六", ",");
        for (String nam : names) {
            HashMap<String, Object> vals = new HashMap<String, Object>();
            vals.put("name", nam);
            vals.put("value", Math.round(Math.random() * 100));
            list.add(vals);
        }
        return list;
    }

}
