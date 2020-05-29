package com.demo.asd.model.house.forSale;

import com.demo.asd.base.entity.BaseResponse;

import java.sql.Timestamp;

/**
 * 售卖房源
 * Created by chency on 2020-05-19.
 */
public class HouseSaleResponse extends BaseResponse {

    public Long houseId;//房源ID
    public String houseName;//房源门牌号
    public String houseEstate;//房源小区名
    public String houseLocationProvince;//房源位置省
    public String houseLocationCity;//房源位置市
    public String houseLocationDistrict;//房源位置区
    public String houseLocationStreet;//房源位置街
    public Integer housePrice;//价格/平
    public Integer houseSquare;//面积/平
    public Integer houseState;//状态0待售，1已售，-1异常
    public Long houseClientId;//(原)业主ID
    public String completeTime;//建成时间
    public Timestamp dealTime;//交易时间
    public Long housePurachaserId;//(买方)新业主ID
    public Integer status;//1启用0停用

    public Long getHouseId() {
        return houseId;
    }

    public void setHouseId(Long houseId) {
        this.houseId = houseId;
    }

    public String getHouseName() {
        return houseName;
    }

    public void setHouseName(String houseName) {
        this.houseName = houseName;
    }

    public String getHouseEstate() {
        return houseEstate;
    }

    public void setHouseEstate(String houseEstate) {
        this.houseEstate = houseEstate;
    }

    public String getHouseLocationProvince() {
        return houseLocationProvince;
    }

    public void setHouseLocationProvince(String houseLocationProvince) {
        this.houseLocationProvince = houseLocationProvince;
    }

    public String getHouseLocationCity() {
        return houseLocationCity;
    }

    public void setHouseLocationCity(String houseLocationCity) {
        this.houseLocationCity = houseLocationCity;
    }

    public String getHouseLocationDistrict() {
        return houseLocationDistrict;
    }

    public void setHouseLocationDistrict(String houseLocationDistrict) {
        this.houseLocationDistrict = houseLocationDistrict;
    }

    public String getHouseLocationStreet() {
        return houseLocationStreet;
    }

    public void setHouseLocationStreet(String houseLocationStreet) {
        this.houseLocationStreet = houseLocationStreet;
    }

    public Integer getHousePrice() {
        return housePrice;
    }

    public void setHousePrice(Integer housePrice) {
        this.housePrice = housePrice;
    }

    public Integer getHouseSquare() {
        return houseSquare;
    }

    public void setHouseSquare(Integer houseSquare) {
        this.houseSquare = houseSquare;
    }

    public Integer getHouseState() {
        return houseState;
    }

    public void setHouseState(Integer houseState) {
        this.houseState = houseState;
    }

    public Long getHouseClientId() {
        return houseClientId;
    }

    public void setHouseClientId(Long houseClientId) {
        this.houseClientId = houseClientId;
    }

    public String getCompleteTime() {
        return completeTime;
    }

    public void setCompleteTime(String completeTime) {
        this.completeTime = completeTime;
    }

    public Timestamp getDealTime() {
        return dealTime;
    }

    public void setDealTime(Timestamp dealTime) {
        this.dealTime = dealTime;
    }

    public Long getHousePurachaserId() {
        return housePurachaserId;
    }

    public void setHousePurachaserId(Long housePurachaserId) {
        this.housePurachaserId = housePurachaserId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "HouseSaleRequest{" +
                "houseId=" + houseId +
                ", houseName='" + houseName + '\'' +
                ", houseEstate='" + houseEstate + '\'' +
                ", houseLocationProvince='" + houseLocationProvince + '\'' +
                ", houseLocationCity='" + houseLocationCity + '\'' +
                ", houseLocationDistrict='" + houseLocationDistrict + '\'' +
                ", houseLocationStreet='" + houseLocationStreet + '\'' +
                ", housePrice=" + housePrice +
                ", houseSquare=" + houseSquare +
                ", houseState=" + houseState +
                ", houseClientId=" + houseClientId +
                ", completeTime='" + completeTime + '\'' +
                ", dealTime=" + dealTime +
                ", housePurachaserId=" + housePurachaserId +
                ", status=" + status +
                '}';
    }
}
