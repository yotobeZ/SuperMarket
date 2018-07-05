package com.supermarket.pojo;

/**
 * @ClassName com.supermarket.pojo
 * @Description
 * @Author Liuying[albertliuy@foxmail.com]
 * @Date 2018/7/5 22:57
 */

public class Page {
    int start=0;
    int count = 3;
    int last = 0;
    public int getStart() {
        if(start <= 0){
            return 0;
        }else {
            return start;
        }

    }
    public void setStart(int start) {
        this.start = start;
    }
    public int getCount() {
        return count;
    }
    public void setCount(int count) {
        this.count = count;
    }
    public int getLast() {
        return last;
    }
    public void setLast(int last) {
        this.last = last;
    }

    public void caculateLast(int total) {

        if (0 == total % count){
            last = total - count;}

        else{
            last = total - total % count;}
    }
}
