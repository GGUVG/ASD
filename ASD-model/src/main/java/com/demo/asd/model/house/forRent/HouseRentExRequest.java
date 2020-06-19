package com.demo.asd.model.house.forRent;

import java.time.LocalDateTime;

/**
 * 租赁房源表
 * create by chenCy at 2020/06/18
 */
public class HouseRentExRequest extends HouseRentRequest
{
    public Long clientStaffId;//员工ID-客户表

    public String clientName;//房东名

    public String clientSex;//房东性别

    public String clientPhone;//房东电话

    public String wClientName;//租客名

    public String wClientSex;//租客性别

    public String wClientPhone;//租客电话

    public String estateName;//小区名

    public String houseTypeTxt;//房屋类型名

    public Integer startHousePrice;//价格区间起始

    public Integer endHousePrice;//价格区间结束

    public Integer startHouseSquare;//面积区间起始

    public Integer endHouseSquare;//面积区间结束

    public LocalDateTime startLastDeal;//最近交易时间区间起始

    public LocalDateTime endLastDeal;//最近交易时间区间结束

    public LocalDateTime startLastEnd;//最近租期到期时间区间起始

    public LocalDateTime endLastEnd;//最近租期到期时间区间结束

    public String typeCode;//码表里房屋的编码为'HOUSE_TYPE'

    public Long getClientStaffId() {
        return clientStaffId;
    }

    public void setClientStaffId(Long clientStaffId) {
        this.clientStaffId = clientStaffId;
    }

    public String getTypeCode() {
        return typeCode;
    }

    public void setTypeCode(String typeCode) {
        this.typeCode = typeCode;
    }

    public LocalDateTime getStartLastDeal() {
        return startLastDeal;
    }

    public void setStartLastDeal(LocalDateTime startLastDeal) {
        this.startLastDeal = startLastDeal;
    }

    public LocalDateTime getEndLastDeal() {
        return endLastDeal;
    }

    public void setEndLastDeal(LocalDateTime endLastDeal) {
        this.endLastDeal = endLastDeal;
    }

    public LocalDateTime getStartLastEnd() {
        return startLastEnd;
    }

    public void setStartLastEnd(LocalDateTime startLastEnd) {
        this.startLastEnd = startLastEnd;
    }

    public LocalDateTime getEndLastEnd() {
        return endLastEnd;
    }

    public void setEndLastEnd(LocalDateTime endLastEnd) {
        this.endLastEnd = endLastEnd;
    }

    public Integer getStartHousePrice() {
        return startHousePrice;
    }

    public void setStartHousePrice(Integer startHousePrice) {
        this.startHousePrice = startHousePrice;
    }

    public Integer getEndHousePrice() {
        return endHousePrice;
    }

    public void setEndHousePrice(Integer endHousePrice) {
        this.endHousePrice = endHousePrice;
    }

    public Integer getStartHouseSquare() {
        return startHouseSquare;
    }

    public void setStartHouseSquare(Integer startHouseSquare) {
        this.startHouseSquare = startHouseSquare;
    }

    public Integer getEndHouseSquare() {
        return endHouseSquare;
    }

    public void setEndHouseSquare(Integer endHouseSquare) {
        this.endHouseSquare = endHouseSquare;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getClientSex() {
        return clientSex;
    }

    public void setClientSex(String clientSex) {
        this.clientSex = clientSex;
    }

    public String getClientPhone() {
        return clientPhone;
    }

    public void setClientPhone(String clientPhone) {
        this.clientPhone = clientPhone;
    }

    public String getwClientName() {
        return wClientName;
    }

    public void setwClientName(String wClientName) {
        this.wClientName = wClientName;
    }

    public String getwClientSex() {
        return wClientSex;
    }

    public void setwClientSex(String wClientSex) {
        this.wClientSex = wClientSex;
    }

    public String getwClientPhone() {
        return wClientPhone;
    }

    public void setwClientPhone(String wClientPhone) {
        this.wClientPhone = wClientPhone;
    }

    public String getEstateName() {
        return estateName;
    }

    public void setEstateName(String estateName) {
        this.estateName = estateName;
    }

    public String getHouseTypeTxt() {
        return houseTypeTxt;
    }

    public void setHouseTypeTxt(String houseTypeTxt) {
        this.houseTypeTxt = houseTypeTxt;
    }

    @Override
    public String toString() {
        return "HouseRentExBean{" +
                "clientName='" + clientName + '\'' +
                ", clientSex='" + clientSex + '\'' +
                ", clientPhone='" + clientPhone + '\'' +
                ", wClientName='" + wClientName + '\'' +
                ", wClientSex='" + wClientSex + '\'' +
                ", wClientPhone='" + wClientPhone + '\'' +
                ", estateName='" + estateName + '\'' +
                ", houseTypeTxt='" + houseTypeTxt + '\'' +
                ", houseId=" + houseId +
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
                ", lastDealTime=" + lastDealTime +
                ", lastPurchaserId=" + lastPurchaserId +
                ", lastEnd=" + lastEnd +
                ", status=" + status +
                '}';
    }

}
