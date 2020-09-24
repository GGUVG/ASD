package com.demo.asd.model.sys;

import com.demo.asd.base.entity.BaseRequest;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CodeItemRequest extends BaseRequest
{
    @ApiModelProperty("码表类型")
    public String typeCode;

    @ApiModelProperty("子表类型")
    public String itemCode;

    @ApiModelProperty("子表类型文本描述")
    public String itemName;
}
