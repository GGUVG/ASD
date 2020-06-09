package com.demo.asd.model.house.forSale;

import java.sql.Timestamp;
import java.time.LocalDateTime;

public class HouseSaleWithOwnerClientRequest extends HouseSaleRequest{
    public Long clientStaffId;//员工ID-客户表
    public Integer startHousePrice;//用于检索housePrice区间起始
    public Integer endHousePrice;//用于检索housePrice区间结束
    public Integer startHouseSquare;//用于检索houseSquare区间起始
    public Integer endHouseSquare;//用于检索houseSquare区间结束
    public String estateName;//小区名-小区表

    public String getEstateName() {
        return estateName;
    }

    public void setEstateName(String estateName) {
        this.estateName = estateName;
    }

    public String clientName;//客户名-客户表
    public String clientSex;//客户性别-客户表
    public String clientPhone;//客户电话-客户表
    public LocalDateTime startDealTime;//用于检索dealTime区间起始
    public LocalDateTime endDealTime;//用于检索dealTime区间起始
    public String wClientName;//买方客户名-客户表
    public String wClientSex;//买方客户性别-客户表
    public String wClientPhone;//买方客户电话-客户表

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


    public String getClientPhone() {
        return clientPhone;
    }

    public void setClientPhone(String clientPhone) {
        this.clientPhone = clientPhone;
    }

    public LocalDateTime getStartDealTime() {
        return startDealTime;
    }

    public void setStartDealTime(LocalDateTime startDealTime) {
        this.startDealTime = startDealTime;
    }

    public LocalDateTime getEndDealTime() {
        return endDealTime;
    }

    public void setEndDealTime(LocalDateTime endDealTime) {
        this.endDealTime = endDealTime;
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

    @Override
    public String toString() {
        return "HouseSaleWithOwnerClientRequest{" +
                "clientStaffId=" + clientStaffId +
                ", startHousePrice=" + startHousePrice +
                ", endHousePrice=" + endHousePrice +
                ", startHouseSquare=" + startHouseSquare +
                ", endHouseSquare=" + endHouseSquare +
                ", estateName='" + estateName + '\'' +
                ", clientName='" + clientName + '\'' +
                ", clientSex='" + clientSex + '\'' +
                ", clientPhone='" + clientPhone + '\'' +
                ", startDealTime=" + startDealTime +
                ", endDealTime=" + endDealTime +
                ", wClientName='" + wClientName + '\'' +
                ", wClientSex='" + wClientSex + '\'' +
                ", wClientPhone='" + wClientPhone + '\'' +
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
                ", dealTime=" + dealTime +
                ", housePurachaserId=" + housePurachaserId +
                '}';
    }
}
