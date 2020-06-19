package com.demo.asd.model.house.forRent;

import com.demo.asd.base.entity.BaseRequest;

import java.time.LocalDateTime;

public class HouseRentRequest extends BaseRequest
{
    public Long houseId;//房源ID

    public String houseName;//房源门牌号

    public String houseEstateId;//小区ID

    public String houseLocationProvince;//省位置

    public String houseLocationCity;//市位置

    public String houseLocationDistrict;//区位置

    public String houseLocationStreet;//街道位置

    public Integer housePrice;//价格/月

    public Integer houseSquare;//面积/月

    public Integer houseState;//租赁状态0待租1已租-1异常

    public Long houseClientId;//房东ID

    public String completeTime;//建成时间

    public LocalDateTime lastDealTime;//最近交易时间

    public Long lastPurchaserId;//最近租客ID

    public LocalDateTime lastEnd;//最近租期到期时间

    public Integer houseType;//房屋类型

    public Integer status;//0停用,1启用

    public Integer getHouseType() {
        return houseType;
    }

    public void setHouseType(Integer houseType) {
        this.houseType = houseType;
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

    public String getHouseEstateId() {
        return houseEstateId;
    }

    public void setHouseEstateId(String houseEstateId) {
        this.houseEstateId = houseEstateId;
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

    public LocalDateTime getLastDealTime() {
        return lastDealTime;
    }

    public void setLastDealTime(LocalDateTime lastDealTime) {
        this.lastDealTime = lastDealTime;
    }

    public Long getLastPurchaserId() {
        return lastPurchaserId;
    }

    public void setLastPurchaserId(Long lastPurchaserId) {
        this.lastPurchaserId = lastPurchaserId;
    }

    public LocalDateTime getLastEnd() {
        return lastEnd;
    }

    public void setLastEnd(LocalDateTime lastEnd) {
        this.lastEnd = lastEnd;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

}
