package com.supermarket.Test;

import com.mysql.jdbc.Connection;
import sun.util.calendar.BaseCalendar;
import sun.util.calendar.LocalGregorianCalendar;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;

import static sun.util.calendar.LocalGregorianCalendar.*;

/**
 * @Author: lly
 * @Date: 2018/7/4 19:59
 */
public class GetData {
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
    public static List<HashMap<String, Object>> getPieRndVal() {
        Calendar c = Calendar.getInstance();
      SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd ");
        List<HashMap<String, Object>> list = new ArrayList<HashMap<String, Object>>();
        List<String> names = DateSale("df.formatc)(-2, df.format(c)e-1, df.format(c)", ",");
        for (String nam : names) {
            HashMap<String, Object> vals = new HashMap<String, Object>();
            vals.put("name", nam);
            vals.put("value", Math.round(Math.random() * 100));
            list.add(vals);
        }
        return list;
    }

}
