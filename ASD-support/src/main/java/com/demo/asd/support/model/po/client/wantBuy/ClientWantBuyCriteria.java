package com.demo.asd.support.model.po.client.wantBuy;

import com.demo.asd.base.entity.BaseCriteria;

public class ClientWantBuyCriteria extends BaseCriteria {
    public Long clientId;//客户ID
    public String clientName;//客户名
    public String clientSex;//客户性别
    public String clientAddressProvince;//客户位置省
    public String clientAddressCity;//客户位置市
    public String clientAddressDistrict;//客户位置区
    public String clientAddressStreet;//客户位置街
    public String clientPhone;//客户电话
    public String clientExpectPlaceProvince;//客户期待位置省
    public String clientExpectPlaceCity;//客户期待位置市
    public String clientExpectPlaceDistrict;//客户期待位置区
    public String clientExpectPlaceStreet;//客户期待位置街
    public Integer clientExpectPrice;//客户期待价格
    public Integer clientExpectSquare;//客户期待面积
    public String clientRemark;//客户备注信息
    public Long clientStaffId;//客源所属员工ID
    public Integer status;//状态0停用1启用

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
