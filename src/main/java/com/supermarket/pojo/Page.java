package com.supermarket.pojo;

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
