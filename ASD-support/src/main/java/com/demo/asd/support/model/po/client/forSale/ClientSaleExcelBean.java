package com.demo.asd.support.model.po.client.forSale;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.metadata.BaseRowModel;

public class ClientSaleExcelBean extends BaseRowModel {

    @ExcelProperty(value = "客户ID", index = 0)
    public Long clientId;

    @ExcelProperty(value = "客户名", index = 1)
    public String clientName;

    @ExcelProperty(value = "客户性别", index = 2)
    public String clientSex;

    @ExcelProperty(value = "客户省地址", index = 3)
    public String clientAddressProvince;

    @ExcelProperty(value = "客户市地址", index = 4)
    public String clientAddressCity;

    @ExcelProperty(value = "客户区地址", index = 5)
    public String clientAddressDistrict;

    @ExcelProperty(value = "客户街地址", index = 6)
    public String clientAddressStreet;

    @ExcelProperty(value = "客户电话", index = 7)
    public String clientPhone;

    @ExcelProperty(value = "客户备注", index = 8)
    public String clientRemark;

    @ExcelProperty(value="客户所属员工ID",index = 9)
    public Long clientStaffId;

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
}
