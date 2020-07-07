package com.demo.asd.support.model.po.client.wantRent;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.metadata.BaseRowModel;

public class ClientWantRentExcelExBean extends BaseRowModel
{
    @ExcelProperty(value = "客户ID", index = 0)
    public Long clientId;

    @ExcelProperty(value = "客户名", index = 1)
    public String clientName;

    @ExcelProperty(value = "客户性别", index = 2)
    public String clientSex;

    @ExcelProperty(value = "客户位置省", index = 3)
    public String clientAddressProvince;

    @ExcelProperty(value = "客户位置市", index = 4)
    public String clientAddressCity;

    @ExcelProperty(value = "客户位置区", index = 5)
    public String clientAddressDistrict;

    @ExcelProperty(value = "客户位置街", index = 6)
    public String clientAddressStreet;

    @ExcelProperty(value = "客户电话", index = 7)
    public String clientPhone;

    @ExcelProperty(value = "客户期待位置省", index = 8)
    public String clientExpectPlaceProvince;

    @ExcelProperty(value = "客户期待位置市", index = 9)
    public String clientExpectPlaceCity;

    @ExcelProperty(value = "客户期待位置区", index = 10)
    public String clientExpectPlaceDistrict;

    @ExcelProperty(value = "客户期待位置街", index = 11)
    public String clientExpectPlaceStreet;

    @ExcelProperty(value = "客户期待租价/月", index = 12)
    public Integer clientExpectPrice;

    @ExcelProperty(value = "客户期待面积/平", index = 13)
    public Integer clientExpectSquare;

    @ExcelProperty(value = "客户备注信息", index = 14)
    public String clientRemark;

    @ExcelProperty(value = "客源所属员工ID", index = 15)
    public Long clientStaffId;

    @ExcelProperty(value = "状态", index = 16)
    public Integer status;

    public Long getClientId() {
        return clientId;
    }

    public void setClientId(Long clientId) {
        this.clientId = clientId;
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

    public String getClientAddressProvince() {
        return clientAddressProvince;
    }

    public void setClientAddressProvince(String clientAddressProvince) {
        this.clientAddressProvince = clientAddressProvince;
    }

    public String getClientAddressCity() {
        return clientAddressCity;
    }

    public void setClientAddressCity(String clientAddressCity) {
        this.clientAddressCity = clientAddressCity;
    }

    public String getClientAddressDistrict() {
        return clientAddressDistrict;
    }

    public void setClientAddressDistrict(String clientAddressDistrict) {
        this.clientAddressDistrict = clientAddressDistrict;
    }

    public String getClientAddressStreet() {
        return clientAddressStreet;
    }

    public void setClientAddressStreet(String clientAddressStreet) {
        this.clientAddressStreet = clientAddressStreet;
    }

    public String getClientPhone() {
        return clientPhone;
    }

    public void setClientPhone(String clientPhone) {
        this.clientPhone = clientPhone;
    }

    public String getClientExpectPlaceProvince() {
        return clientExpectPlaceProvince;
    }

    public void setClientExpectPlaceProvince(String clientExpectPlaceProvince) {
        this.clientExpectPlaceProvince = clientExpectPlaceProvince;
    }

    public String getClientExpectPlaceCity() {
        return clientExpectPlaceCity;
    }

    public void setClientExpectPlaceCity(String clientExpectPlaceCity) {
        this.clientExpectPlaceCity = clientExpectPlaceCity;
    }

    public String getClientExpectPlaceDistrict() {
        return clientExpectPlaceDistrict;
    }

    public void setClientExpectPlaceDistrict(String clientExpectPlaceDistrict) {
        this.clientExpectPlaceDistrict = clientExpectPlaceDistrict;
    }

    public String getClientExpectPlaceStreet() {
        return clientExpectPlaceStreet;
    }

    public void setClientExpectPlaceStreet(String clientExpectPlaceStreet) {
        this.clientExpectPlaceStreet = clientExpectPlaceStreet;
    }

    public Integer getClientExpectPrice() {
        return clientExpectPrice;
    }

    public void setClientExpectPrice(Integer clientExpectPrice) {
        this.clientExpectPrice = clientExpectPrice;
    }

    public Integer getClientExpectSquare() {
        return clientExpectSquare;
    }

    public void setClientExpectSquare(Integer clientExpectSquare) {
        this.clientExpectSquare = clientExpectSquare;
    }

    public String getClientRemark() {
        return clientRemark;
    }

    public void setClientRemark(String clientRemark) {
        this.clientRemark = clientRemark;
    }

    public Long getClientStaffId() {
        return clientStaffId;
    }

    public void setClientStaffId(Long clientStaffId) {
        this.clientStaffId = clientStaffId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
