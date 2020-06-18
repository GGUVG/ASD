package com.demo.asd.support.model.po.sys;

public class HouseType {
    public Integer houseType;

    public String houseTypeTxt;

    public Integer getHouseType() {
        return houseType;
    }

    public void setHouseType(Integer houseType) {
        this.houseType = houseType;
    }

    public String getHouseTypeTxt() {
        return houseTypeTxt;
    }

    public void setHouseTypeTxt(String houseTypeTxt) {
        this.houseTypeTxt = houseTypeTxt;
    }

    @Override
    public String toString() {
        return "HouseType{" +
                "houseType=" + houseType +
                ", houseTypeTxt='" + houseTypeTxt + '\'' +
                '}';
    }
}
