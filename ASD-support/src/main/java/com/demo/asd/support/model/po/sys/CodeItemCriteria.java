package com.demo.asd.support.model.po.sys;

import com.demo.asd.base.entity.BaseCriteria;

import java.time.LocalDateTime;

public class CodeItemCriteria extends BaseCriteria
{
    public String typeCode;//子表所属码表编码
    public Integer itemCode;//子表编码
    public String itemName;//子表名
    public String parent;//父级菜单
    public String attr1;//属性1
    public String attr2;//属性2
    public String attr3;//属性3
    public String idx;//索引
    public LocalDateTime createAt;//创建时间
    public Long createBy;//创建者ID
    public String createByTxt;//创建者名
    public LocalDateTime lastModified;//最近修改时间
    public Long lastModifiedBy;//最近修改者ID
    public String lastModifiedByTxt;//最近修改着名

    public String getTypeCode() {
        return typeCode;
    }

    public void setTypeCode(String typeCode) {
        this.typeCode = typeCode;
    }

    public Integer getItemCode() {
        return itemCode;
    }

    public void setItemCode(Integer itemCode) {
        this.itemCode = itemCode;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getParent() {
        return parent;
    }

    public void setParent(String parent) {
        this.parent = parent;
    }

    public String getAttr1() {
        return attr1;
    }

    public void setAttr1(String attr1) {
        this.attr1 = attr1;
    }

    public String getAttr2() {
        return attr2;
    }

    public void setAttr2(String attr2) {
        this.attr2 = attr2;
    }

    public String getAttr3() {
        return attr3;
    }

    public void setAttr3(String attr3) {
        this.attr3 = attr3;
    }

    public String getIdx() {
        return idx;
    }

    public void setIdx(String idx) {
        this.idx = idx;
    }

    public LocalDateTime getCreateAt() {
        return createAt;
    }

    public void setCreateAt(LocalDateTime createAt) {
        this.createAt = createAt;
    }

    public Long getCreateBy() {
        return createBy;
    }

    public void setCreateBy(Long createBy) {
        this.createBy = createBy;
    }

    public String getCreateByTxt() {
        return createByTxt;
    }

    public void setCreateByTxt(String createByTxt) {
        this.createByTxt = createByTxt;
    }

    public LocalDateTime getLastModified() {
        return lastModified;
    }

    public void setLastModified(LocalDateTime lastModified) {
        this.lastModified = lastModified;
    }

    public Long getLastModifiedBy() {
        return lastModifiedBy;
    }

    public void setLastModifiedBy(Long lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    public String getLastModifiedByTxt() {
        return lastModifiedByTxt;
    }

    public void setLastModifiedByTxt(String lastModifiedByTxt) {
        this.lastModifiedByTxt = lastModifiedByTxt;
    }

    @Override
    public String toString() {
        return "CodeItemBean{" +
                "typeCode='" + typeCode + '\'' +
                ", itemCode=" + itemCode +
                ", itemName='" + itemName + '\'' +
                ", parent='" + parent + '\'' +
                ", attr1='" + attr1 + '\'' +
                ", attr2='" + attr2 + '\'' +
                ", attr3='" + attr3 + '\'' +
                ", idx='" + idx + '\'' +
                ", createAt=" + createAt +
                ", createBy=" + createBy +
                ", createByTxt='" + createByTxt + '\'' +
                ", lastModified=" + lastModified +
                ", lastModifiedBy=" + lastModifiedBy +
                ", lastModifiedByTxt='" + lastModifiedByTxt + '\'' +
                '}';
    }
}
