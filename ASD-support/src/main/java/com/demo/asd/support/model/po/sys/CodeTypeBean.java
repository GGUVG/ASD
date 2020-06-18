package com.demo.asd.support.model.po.sys;

import java.time.LocalDateTime;

public class CodeTypeBean {
    public String typeCode;
    public String typeName;
    public String maintainType;
    public LocalDateTime createAt;
    public Long createBy;
    public String createByTxt;
    public LocalDateTime lastModified;
    public Long lastModifiedBy;
    public String lastModifiedByTxt;
    public String isSynchronize;

    public String getTypeCode() {
        return typeCode;
    }

    public void setTypeCode(String typeCode) {
        this.typeCode = typeCode;
    }

    @Override
    public String toString() {
        return "CodeTypeBean{" +
                "typeCode='" + typeCode + '\'' +
                ", typeName='" + typeName + '\'' +
                ", maintainType='" + maintainType + '\'' +
                ", createAt=" + createAt +
                ", createBy=" + createBy +
                ", createByTxt='" + createByTxt + '\'' +
                ", lastModified=" + lastModified +
                ", lastModifiedBy=" + lastModifiedBy +
                ", lastModifiedByTxt='" + lastModifiedByTxt + '\'' +
                ", isSynchronize='" + isSynchronize + '\'' +
                '}';
    }
}
