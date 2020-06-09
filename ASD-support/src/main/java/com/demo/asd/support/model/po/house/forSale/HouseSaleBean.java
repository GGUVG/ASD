package com.demo.asd.support.model.po.house.forSale;

import com.demo.asd.base.entity.BaseBean;

import java.sql.Timestamp;
import java.time.LocalDateTime;

/**
 * 售卖房源
 * Created by chency on 2020-05-19.
 */
public class HouseSaleBean extends BaseBean {

    public Long houseId;//房源ID
    public String houseName;//房源门牌号
    public Long houseEstateId;//房源小区名
    public String houseLocationProvince;//房源位置省
    public String houseLocationCity;//房源位置市
    public String houseLocationDistrict;//房源位置区
    public String houseLocationStreet;//房源位置街
    public Integer housePrice;//价格/平
    public Integer houseSquare;//面积/平
    public Integer houseState;//状态0待售，1已售，-1异常
    public Long houseClientId;//(原)业主ID
    public String completeTime;//建成时间
    public LocalDateTime dealTime;//交易时间
    public Long housePurachaserId;//(买方)新业主ID
    public Integer status;//1启用0停用
    public Integer houseType;//房屋类型
    public String floorImg;//户型图
    public String innerImgAttr1;//室内图1
    public String innerImgAttr2;//室内图2
    public String innerImgAttr3;//室内图3
    public String innerImgAttr4;//室内图4
    public String innerImgAttr5;//室内图5

    public void setHouseEstateId(Long houseEstateId) {
        this.houseEstateId = houseEstateId;
    }

    public Integer getHouseType() {
        return houseType;
    }

    public void setHouseType(Integer houseType) {
        this.houseType = houseType;
    }

    public String getFloorImg() {
        return floorImg;
    }

    public void setFloorImg(String floorImg) {
        this.floorImg = floorImg;
    }

    public String getInnerImgAttr1() {
        return innerImgAttr1;
    }

    public void setInnerImgAttr1(String innerImgAttr1) {
        this.innerImgAttr1 = innerImgAttr1;
    }

    public String getInnerImgAttr2() {
        return innerImgAttr2;
    }

    public void setInnerImgAttr2(String innerImgAttr2) {
        this.innerImgAttr2 = innerImgAttr2;
    }

    public String getInnerImgAttr3() {
        return innerImgAttr3;
    }

    public void setInnerImgAttr3(String innerImgAttr3) {
        this.innerImgAttr3 = innerImgAttr3;
    }

    public String getInnerImgAttr4() {
        return innerImgAttr4;
    }

    public void setInnerImgAttr4(String innerImgAttr4) {
        this.innerImgAttr4 = innerImgAttr4;
    }

    public String getInnerImgAttr5() {
        return innerImgAttr5;
    }

    public void setInnerImgAttr5(String innerImgAttr5) {
        this.innerImgAttr5 = innerImgAttr5;
    }

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

    public LocalDateTime getDealTime() {
        return dealTime;
    }

    public void setDealTime(LocalDateTime dealTime) {
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
        return "HouseSaleBean{" +
                "houseId=" + houseId +
                ", houseName='" + houseName + '\'' +
                ", houseEstateId='" + houseEstateId + '\'' +
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
