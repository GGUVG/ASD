package com.demo.asd.model.house.report;

import com.demo.asd.base.entity.BaseResponse;
import java.time.LocalDateTime;
/**
 * 报备新房源
 * create by chenCy at 2020/06/22
 */
public class HouseSourceApproveResponse extends BaseResponse
{
    public Long Id;
    public Long staffId;
    public Integer houseType;
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
    public String mandateImg1;
    public String mandateImg2;
    public String mandateImg3;
    public String mandateImg4;
    public String mandateImg5;
    public LocalDateTime permitTime;
    public Integer permitState;

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

    public String getMandateImg1() {
        return mandateImg1;
    }

    public void setMandateImg1(String mandateImg1) {
        this.mandateImg1 = mandateImg1;
    }

    public String getMandateImg2() {
        return mandateImg2;
    }

    public void setMandateImg2(String mandateImg2) {
        this.mandateImg2 = mandateImg2;
    }

    public String getMandateImg3() {
        return mandateImg3;
    }

    public void setMandateImg3(String mandateImg3) {
        this.mandateImg3 = mandateImg3;
    }

    public String getMandateImg4() {
        return mandateImg4;
    }

    public void setMandateImg4(String mandateImg4) {
        this.mandateImg4 = mandateImg4;
    }

    public String getMandateImg5() {
        return mandateImg5;
    }

    public void setMandateImg5(String mandateImg5) {
        this.mandateImg5 = mandateImg5;
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
