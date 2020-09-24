package com.demo.asd.model.welfare;

import com.demo.asd.base.entity.BaseRequest;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * 出版商/代表 信息
 * Created by chency on 2020-09-24.
 */
@Getter
@Setter
public class PublishRequest extends BaseRequest
{
    @ApiModelProperty("WELFARE_PUBLISH")
    public String strPublish;

    @ApiModelProperty("编号")
    public Integer publishCode;

    @ApiModelProperty("文本描述")
    public String publishName;
}
