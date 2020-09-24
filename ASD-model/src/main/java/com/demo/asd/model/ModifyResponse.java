package com.demo.asd.model;

import com.demo.asd.base.entity.BaseResponse;
import io.swagger.annotations.ApiModelProperty;

/**
 * 拿来做反馈
 * Create By chenCy 2020/09/22
 */
public class ModifyResponse extends BaseResponse
{
    @ApiModelProperty("变化数量")
    public Integer changeQty;

    @ApiModelProperty("状态")
    public Integer status;

    @ApiModelProperty("描述")
    public String message;

    public Integer getChangeQty() {
        return changeQty;
    }

    public void setChangeQty(Integer changeQty) {
        this.changeQty = changeQty;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
