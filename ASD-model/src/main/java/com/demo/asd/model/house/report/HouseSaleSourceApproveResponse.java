package com.demo.asd.model.house.report;

import com.demo.asd.base.entity.BaseResponse;
import java.time.LocalDateTime;
/**
 * 报备新房源
 * create by chenCy at 2020/06/22
 */
public class HouseSaleSourceApproveResponse extends BaseResponse
{
    public Long Id;
    public Long staffId;
    public Integer houseType;
    public String hangTypeTxt;
    public Long estateId;
    public String houseName;
    public String houseLocationProvince;
    public String houseLocationCity;
    public String houseLocationDistrict;
    public String houseLocationStreet;
    public Integer housePrice;
    public Integer houseSquare;
    public String completeTime;
    public Long houseClientId;
    public String mandate;
    public LocalDateTime permitTime;
    public Integer permitState;

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
