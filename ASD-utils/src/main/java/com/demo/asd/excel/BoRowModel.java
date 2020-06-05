package com.demo.asd.excel;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.metadata.BaseRowModel;

public class BoRowModel extends BaseRowModel {
    /**
     * 行数
     */
    @ExcelProperty(value = "行数", index =0)
    private Integer rowNum;

    public Integer getRowNum() {
        return rowNum;
    }

    public void setRowNum(Integer rowNum) {
        this.rowNum = rowNum;
    }
}
