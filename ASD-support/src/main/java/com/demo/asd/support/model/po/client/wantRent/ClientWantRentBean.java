package com.demo.asd.support.model.po.client.wantRent;

import com.demo.asd.base.entity.BaseBean;

public class ClientWantRentBean extends BaseBean {
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


}
