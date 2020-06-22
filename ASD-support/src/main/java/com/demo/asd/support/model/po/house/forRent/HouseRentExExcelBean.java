package com.demo.asd.support.model.po.house.forRent;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.metadata.BaseRowModel;

import java.time.LocalDateTime;

public class HouseRentExExcelBean extends BaseRowModel {

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

    @ExcelProperty(value="房屋类型",index = 9)
    public String houseTypeTxt;

    @ExcelProperty(value = "状态", index = 10)
    public Integer houseState;

    @ExcelProperty(value = "建成时间", index = 11)
    public String completeTime;

    @ExcelProperty(value = "最近交易时间", index = 12)
    public String lastDealTime;

    @ExcelProperty(value = "最近租期到期时间", index = 13)
    public String lastEnd;

    @ExcelProperty(value = "客户所属员工ID", index = 14)
    public Long clientStaffId;

    @ExcelProperty(value = "客户ID", index = 15)
    public Long houseClientId;

    @ExcelProperty(value = "客户名", index = 16)
    public String clientName;

    @ExcelProperty(value = "客户性别", index = 17)
    public String clientSex;

    @ExcelProperty(value = "客户电话", index = 18)
    public String clientPhone;

    @ExcelProperty(value = "买方客户ID", index = 19)
    public Long lastPurchaserId;

    @ExcelProperty(value = "客户名", index = 20)
    public String wClientName;

    @ExcelProperty(value = "客户性别", index = 21)
    public String wClientSex;

    @ExcelProperty(value = "客户电话", index = 22)
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

    public String getHouseTypeTxt() {
        return houseTypeTxt;
    }

    public void setHouseTypeTxt(String houseTypeTxt) {
        this.houseTypeTxt = houseTypeTxt;
    }

    public Integer getHouseState() {
        return houseState;
    }

    public void setHouseState(Integer houseState) {
        this.houseState = houseState;
    }

    public String getCompleteTime() {
        return completeTime;
    }

    public void setCompleteTime(String completeTime) {
        this.completeTime = completeTime;
    }

    public String getLastDealTime() {
        return lastDealTime;
    }

    public void setLastDealTime(String lastDealTime) {
        this.lastDealTime = lastDealTime;
    }

    public String getLastEnd() {
        return lastEnd;
    }

    public void setLastEnd(String lastEnd) {
        this.lastEnd = lastEnd;
    }

    public Long getClientStaffId() {
        return clientStaffId;
    }

    public void setClientStaffId(Long clientStaffId) {
        this.clientStaffId = clientStaffId;
    }

    public Long getHouseClientId() {
        return houseClientId;
    }

    public void setHouseClientId(Long houseClientId) {
        this.houseClientId = houseClientId;
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

    public Long getLastPurchaserId() {
        return lastPurchaserId;
    }

    public void setLastPurchaserId(Long lastPurchaserId) {
        this.lastPurchaserId = lastPurchaserId;
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
        return "HouseRentExReportBean{" +
                "houseId=" + houseId +
                ", houseName='" + houseName + '\'' +
                ", estateName='" + estateName + '\'' +
                ", houseLocationProvince='" + houseLocationProvince + '\'' +
                ", houseLocationCity='" + houseLocationCity + '\'' +
                ", houseLocationDistrict='" + houseLocationDistrict + '\'' +
                ", houseLocationStreet='" + houseLocationStreet + '\'' +
                ", housePrice=" + housePrice +
                ", houseSquare=" + houseSquare +
                ", houseTypeTxt='" + houseTypeTxt + '\'' +
                ", houseState=" + houseState +
                ", completeTime='" + completeTime + '\'' +
                ", lastDealTime='" + lastDealTime + '\'' +
                ", lastEnd='" + lastEnd + '\'' +
                ", clientStaffId=" + clientStaffId +
                ", houseClientId=" + houseClientId +
                ", clientName='" + clientName + '\'' +
                ", clientSex='" + clientSex + '\'' +
                ", clientPhone='" + clientPhone + '\'' +
                ", lastPurchaserId=" + lastPurchaserId +
                ", wClientName='" + wClientName + '\'' +
                ", wClientSex='" + wClientSex + '\'' +
                ", wClientPhone='" + wClientPhone + '\'' +
                '}';
    }
}
