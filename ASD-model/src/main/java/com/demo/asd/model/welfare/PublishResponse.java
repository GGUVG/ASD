package com.demo.asd.model.welfare;

import com.demo.asd.base.entity.BaseResponse;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * 出版商/代表 信息
 * Created by chency on 2020-09-24.
 */
@Getter
@Setter
public class PublishResponse extends BaseResponse
{
    @ApiModelProperty("编号")
    public Integer publishCode;

    @ApiModelProperty("文本描述")
    public String publishName;
}
