package com.demo.asd.model.house.report;


import com.demo.asd.base.entity.BaseRequest;

import java.time.LocalDateTime;

/**
 * 报备新租赁源
 * create by chenCy at 2020/07/01
 */
public class HouseRentSourceApproveRequest extends BaseRequest
{
    public Long Id;//审批单号流水
    public Long staffId;//报备者工号ID
    public Integer houseType;//报备房屋类型-住宅/公寓/商铺/写字楼/...——参考码表
    public String hangTypeTxt;//挂出类型,这里默认传'出租',在biz层进行赋值
    public Long estateId;//房源所在小区ID
    public String houseName;//房源门牌号
    public String houseLocationProvince;//位置省
    public String houseLocationCity;//位置市
    public String houseLocationDistrict;//位置区
    public String houseLocationStreet;//位置街道
    public Integer housePrice;//租价
    public Integer houseSquare;//房源面积
    public String completeTime;//房源建成时间
    public Long houseClientId;//房东（客户ID）
    public String mandate;//委托材料,在数据库中存放文件名
    public LocalDateTime permitTime;//审批时间
    public Integer permitState;//审批状态,0待审1过审-1驳回
    public String permitRemark;//审批批注

    public String getPermitRemark() {
        return permitRemark;
    }

    public void setPermitRemark(String permitRemark) {
        this.permitRemark = permitRemark;
    }

    public String getMandate() {
        return mandate;
    }

    public void setMandate(String mandate) {
        this.mandate = mandate;
    }

    public String getHangTypeTxt() {
        return hangTypeTxt;
    }

    public void setHangTypeTxt(String hangTypeTxt) {
        this.hangTypeTxt = hangTypeTxt;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public Long getStaffId() {
        return staffId;
    }

    public void setStaffId(Long staffId) {
        this.staffId = staffId;
    }

    public Integer getHouseType() {
        return houseType;
    }

    public void setHouseType(Integer houseType) {
        this.houseType = houseType;
    }

    public Long getEstateId() {
        return estateId;
    }

    public void setEstateId(Long estateId) {
        this.estateId = estateId;
    }

    public String getHouseName() {
        return houseName;
    }

    public void setHouseName(String houseName) {
        this.houseName = houseName;
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

    public String getCompleteTime() {
        return completeTime;
    }

    public void setCompleteTime(String completeTime) {
        this.completeTime = completeTime;
    }

    public Long getHouseClientId() {
        return houseClientId;
    }

    public void setHouseClientId(Long houseClientId) {
        this.houseClientId = houseClientId;
    }

    public LocalDateTime getPermitTime() {
        return permitTime;
    }

    public void setPermitTime(LocalDateTime permitTime) {
        this.permitTime = permitTime;
    }

    public Integer getPermitState() {
        return permitState;
    }

    public void setPermitState(Integer permitState) {
        this.permitState = permitState;
    }
}
