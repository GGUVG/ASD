package com.demo.asd.model.welfare;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

/**
 * 文章类拓展
 * Create By chenCy 2020/09/15
 */
@Getter
@Setter
public class WelfareArticleExRequest extends WelfareArticleRequest
{
    @ApiModelProperty("发布时间起始区间")
    public LocalDateTime startPublishTime;

    @ApiModelProperty("发布时间结束区间")
    public LocalDateTime endPublishTime;
}
