package com.demo.asd.model.welfare;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import java.time.LocalDate;

/**
 * 图片类追加字段
 * Created by chency on 2020/09/14.
 */
@Getter
@Setter
public class WelfareImgExRequest extends WelfareImgRequest
{
    @ApiModelProperty("起始图片时间区间")
    public LocalDate startPhotoTime;

    @ApiModelProperty("结束图片时间")
    public LocalDate endPhotoTime;
}
