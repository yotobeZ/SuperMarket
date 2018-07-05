package com.supermarket.pojo;
import java.util.Date;
public class Productprom  extends  Product  {
    private  Date proDate;
    private  Integer storeNum;

    public void setProDate(Date proDate) {
        this.proDate = proDate;
    }

    public Date getProDate() {
        return proDate;
    }

    public void setStoreNum(Integer storeNum) {
        this.storeNum = storeNum;
    }

    public Integer getStoreNum() {
        return storeNum;
    }
}
