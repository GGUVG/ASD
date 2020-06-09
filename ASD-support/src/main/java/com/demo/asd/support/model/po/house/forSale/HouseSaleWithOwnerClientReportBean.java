package com.demo.asd.support.model.po.house.forSale;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.metadata.BaseRowModel;

public class HouseSaleWithOwnerClientReportBean extends BaseRowModel {

    @ExcelProperty(value = "房源ID", index = 0)
    public Long houseId;

    @ExcelProperty(value = "房源门牌号", index = 1)
    public String houseName;

    @ExcelProperty(value = "房源小区名", index = 2)
    public String estateName;

    @ExcelProperty(value = "省", index = 3)
    public String houseLocationProvince;

    @ExcelProperty(value = "市", index = 4)
    public String houseLocationCity;

    @ExcelProperty(value = "区", index = 5)
    public String houseLocationDistrict;

    @ExcelProperty(value = "街", index = 6)
    public String houseLocationStreet;

    @ExcelProperty(value = "价格/平", index = 7)
    public Integer housePrice;

    @ExcelProperty(value = "面积/平", index = 8)
    public Integer houseSquare;

    @ExcelProperty(value = "状态", index = 9)
    public Integer houseState;

    @ExcelProperty(value = "建成时间", index = 10)
    public String completeTime;

    @ExcelProperty(value = "交易时间", index = 11)
    public String dealTime;

    @ExcelProperty(value = "客户所属员工ID", index = 12)
    public Long clientStaffId;

    @ExcelProperty(value = "客户ID", index = 13)
    public Long houseClientId;

    @ExcelProperty(value = "客户名", index = 14)
    public String clientName;

    @ExcelProperty(value = "客户性别", index = 15)
    public String clientSex;

    @ExcelProperty(value = "客户电话", index = 16)
    public String clientPhone;

    @ExcelProperty(value = "买方客户ID", index = 17)
    public Long housePurachaserId;

    @ExcelProperty(value = "客户名", index = 18)
    public String wClientName;

    @ExcelProperty(value = "客户性别", index = 19)
    public String wClientSex;

    @ExcelProperty(value = "客户电话", index = 20)
    public String wClientPhone;

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

    public String getEstateName() {
        return estateName;
    }

    public void setEstateName(String estateName) {
        this.estateName = estateName;
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

    public String getDealTime() {
        return dealTime;
    }

    public void setDealTime(String dealTime) {
        this.dealTime = dealTime;
    }

    public Long getClientStaffId() {
        return clientStaffId;
    }

    public void setClientStaffId(Long clientStaffId) {
        this.clientStaffId = clientStaffId;
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

    public Long getHousePurachaserId() {
        return housePurachaserId;
    }

    public void setHousePurachaserId(Long housePurachaserId) {
        this.housePurachaserId = housePurachaserId;
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
        return "HouseSaleWithOwnerClientReportBean{" +
                "houseId=" + houseId +
                ", houseName='" + houseName + '\'' +
                ", estateName='" + estateName + '\'' +
                ", houseLocationProvince='" + houseLocationProvince + '\'' +
                ", houseLocationCity='" + houseLocationCity + '\'' +
                ", houseLocationDistrict='" + houseLocationDistrict + '\'' +
                ", houseLocationStreet='" + houseLocationStreet + '\'' +
                ", housePrice=" + housePrice +
                ", houseSquare=" + houseSquare +
                ", houseState=" + houseState +
                ", houseClientId=" + houseClientId +
                ", completeTime='" + completeTime + '\'' +
                ", dealTime='" + dealTime + '\'' +
                ", clientStaffId=" + clientStaffId +
                ", clientName='" + clientName + '\'' +
                ", clientSex='" + clientSex + '\'' +
                ", clientPhone='" + clientPhone + '\'' +
                ", housePurachaserId=" + housePurachaserId +
                ", wClientName='" + wClientName + '\'' +
                ", wClientSex='" + wClientSex + '\'' +
                ", wClientPhone='" + wClientPhone + '\'' +
                '}';
    }
}
