package com.demo.asd.model.welfare;

import com.demo.asd.base.entity.BaseRequest;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

/**
 * 文章类
 * Create By chenCy 2020/09/15
 */
@Getter
@Setter
public class WelfareArticleRequest extends BaseRequest
{
    @ApiModelProperty("流水号id")
    public Long id;

    @ApiModelProperty("标题")
    public String title;

    @ApiModelProperty("二级标题")
    public String secondaryTitle;

    @ApiModelProperty("内容")
    public String content;

    @ApiModelProperty("一级分类")
    public Integer primaryCategory;

    @ApiModelProperty("一级分类描述")
    public String primaryCategoryTxt;

    @ApiModelProperty("二级分类")
    public Integer secondaryCategory;

    @ApiModelProperty("二级分类描述")
    public String secondaryCategoryTxt;

    @ApiModelProperty("三级分类")
    public Integer thirdCategory;

    @ApiModelProperty("三级分类描述")
    public String thirdCategoryTxt;

    @ApiModelProperty("文章发表时间")
    public LocalDateTime publishTime;

    @ApiModelProperty("文章人气值")
    public Integer hotValue;

    @ApiModelProperty("关键词1")
    public String keyWord1;

    @ApiModelProperty("关键词2")
    public String keyWord2;

    @ApiModelProperty("关键词3")
    public String keyWord3;

    @ApiModelProperty("关键词4")
    public String keyWord4;

    @ApiModelProperty("文章列表时显示的缩略封面图")
    public String bgImg;

    @ApiModelProperty("状态")
    public Integer status;
}
