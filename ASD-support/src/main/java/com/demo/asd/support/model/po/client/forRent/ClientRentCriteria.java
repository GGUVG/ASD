package com.demo.asd.support.model.po.client.forRent;

import com.demo.asd.base.entity.BaseCriteria;

public class ClientRentCriteria extends BaseCriteria
{
    public Long clientId;//客户ID

    public String clientName;//客户名

    public String clientSex;//客户性别

    public String clientAddressProvince;//省地址

    public String clientAddressCity;//市地址

    public String clientAddressDistrict;//区地址

    public String clientAddressStreet;//街地址

    public String clientPhone;//客户电话

    public String clientRemark;//客户备注

    public Long clientStaffId;//客户所属员工ID

    public Integer status;//0停用1启用

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

    @Override
    public String toString() {
        return "ClientRentCriteria{" +
                "clientId=" + clientId +
                ", clientName='" + clientName + '\'' +
                ", clientSex='" + clientSex + '\'' +
                ", clientAddressProvince='" + clientAddressProvince + '\'' +
                ", clientAddressCity='" + clientAddressCity + '\'' +
                ", clientAddressDistrict='" + clientAddressDistrict + '\'' +
                ", clientAddressStreet='" + clientAddressStreet + '\'' +
                ", clientPhone='" + clientPhone + '\'' +
                ", clientRemark='" + clientRemark + '\'' +
                ", clientStaffId=" + clientStaffId +
                ", status=" + status +
                '}';
    }
}
