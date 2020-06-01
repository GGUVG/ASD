package com.demo.asd.model.house.forSale;

import java.sql.Timestamp;

public class HouseSaleWithOwnerClientResponse extends HouseSaleResponse{
    public Long clientStaffId;//员工ID-客户表
    public Integer startHousePrice;//用于检索housePrice区间起始
    public Integer endHousePrice;//用于检索housePrice区间结束
    public Integer startHouseSquare;//用于检索houseSquare区间起始
    public Integer endHouseSquare;//用于检索houseSquare区间结束
    public String clientName;//客户名-客户表
    public String clientSex;//客户性别-客户表
    public String clientAddress;//客户地址-客户表
    public String clientPhone;//客户电话-客户表
    public Timestamp startDealTime;//用于检索dealTime区间起始
    public Timestamp endDealTime;//用于检索dealTime区间起始

    public Long getClientStaffId() {
        return clientStaffId;
    }

    public void setClientStaffId(Long clientidStaffId) {
        this.clientStaffId = clientidStaffId;
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

    public String getClientAddress() {
        return clientAddress;
    }

    public void setClientAddress(String clientAddress) {
        this.clientAddress = clientAddress;
    }

    public String getClientPhone() {
        return clientPhone;
    }

    public void setClientPhone(String clientPhone) {
        this.clientPhone = clientPhone;
    }

    public Timestamp getStartDealTime() {
        return startDealTime;
    }

    public void setStartDealTime(Timestamp startDealTime) {
        this.startDealTime = startDealTime;
    }

    public Timestamp getEndDealTime() {
        return endDealTime;
    }

    public void setEndDealTime(Timestamp endDealTime) {
        this.endDealTime = endDealTime;
    }

    @Override
    public String toString() {
        return "HouseSaleWithOwnerClientCriteria{" +
                "clientStaffId=" + clientStaffId +
                ", startHousePrice=" + startHousePrice +
                ", endHousePrice=" + endHousePrice +
                ", startHouseSquare=" + startHouseSquare +
                ", endHouseSquare=" + endHouseSquare +
                ", clientName='" + clientName + '\'' +
                ", clientSex='" + clientSex + '\'' +
                ", clientAddress='" + clientAddress + '\'' +
                ", clientPhone='" + clientPhone + '\'' +
                ", houseId=" + houseId +
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
