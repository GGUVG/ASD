package com.demo.asd.model.estate;

import com.demo.asd.base.entity.BaseRequest;

import java.math.BigDecimal;

public class EstateRequest extends BaseRequest
{
    public Long estateId;//小区ID
    public String estateName;//小区名
    public String estateProvince;//位置省
    public String estateCity;//位置市
    public String estateDistrict;//位置区
    public String estateStreet;//位置街
    public String estateImgThumbnail;//缩略图
    public String estateImgMain;//主图
    public String estateImgOriginal;//原图
    public BigDecimal estateCommissionSale;//买卖佣金点
    public BigDecimal estateCommissionRent;//租赁佣金点
    public Integer estateType;//小区类型-参考码表
    public Integer status;//状态0停用1启用

    public Long getEstateId() {
        return estateId;
    }

    public void setEstateId(Long estateId) {
        this.estateId = estateId;
    }

    public String getEstateName() {
        return estateName;
    }

    public void setEstateName(String estateName) {
        this.estateName = estateName;
    }

    public String getEstateProvince() {
        return estateProvince;
    }

    public void setEstateProvince(String estateProvince) {
        this.estateProvince = estateProvince;
    }

    public String getEstateCity() {
        return estateCity;
    }

    public void setEstateCity(String estateCity) {
        this.estateCity = estateCity;
    }

    public String getEstateDistrict() {
        return estateDistrict;
    }

    public void setEstateDistrict(String estateDistrict) {
        this.estateDistrict = estateDistrict;
    }

    public String getEstateStreet() {
        return estateStreet;
    }

    public void setEstateStreet(String estateStreet) {
        this.estateStreet = estateStreet;
    }

    public String getEstateImgThumbnail() {
        return estateImgThumbnail;
    }

    public void setEstateImgThumbnail(String estateImgThumbnail) {
        this.estateImgThumbnail = estateImgThumbnail;
    }

    public String getEstateImgMain() {
        return estateImgMain;
    }

    public void setEstateImgMain(String estateImgMain) {
        this.estateImgMain = estateImgMain;
    }

    public String getEstateImgOriginal() {
        return estateImgOriginal;
    }

    public void setEstateImgOriginal(String estateImgOriginal) {
        this.estateImgOriginal = estateImgOriginal;
    }

    public BigDecimal getEstateCommissionSale() {
        return estateCommissionSale;
    }

    public void setEstateCommissionSale(BigDecimal estateCommissionSale) {
        this.estateCommissionSale = estateCommissionSale;
    }

    public BigDecimal getEstateCommissionRent() {
        return estateCommissionRent;
    }

    public void setEstateCommissionRent(BigDecimal estateCommissionRent) {
        this.estateCommissionRent = estateCommissionRent;
    }

    public Integer getEstateType() {
        return estateType;
    }

    public void setEstateType(Integer estateType) {
        this.estateType = estateType;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
