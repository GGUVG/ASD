package com.demo.asd.model.welfare;

import com.demo.asd.base.entity.BaseCriteria;
import com.demo.asd.base.entity.BaseRequest;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

/**
 * 图片类
 * Created by chency on 2020/09/11.
 */
@Getter
@Setter
public class WelfareImgRequest extends BaseRequest
{
    @ApiModelProperty("图片流水id")
    public Long id;

    @ApiModelProperty("所属文章流水id")
    public Long articleId;

    @ApiModelProperty("图片原名")
    public String originalName;

    @ApiModelProperty("模特名")
    public String modelName;

    @ApiModelProperty("图片名")
    public String photoName;

    @ApiModelProperty("图片描述")
    public String photoDescribe;

    @ApiModelProperty("一级分类")
    public Integer primaryCategory;

    @ApiModelProperty("一级分类文本描述")
    public String primaryCategoryTxt;

    @ApiModelProperty("二级分类")
    public Integer secondaryCategory;

    @ApiModelProperty("二级分类文本描述")
    public String secondaryCategoryTxt;

    @ApiModelProperty("三级分类")
    public Integer thirdCategory;

    @ApiModelProperty("三级分类文本描述")
    public String thirdCategoryTxt;

    @ApiModelProperty("是否存在同名,0不存在1存在")
    public Integer idxStatus;

    @ApiModelProperty("顺序号,默认0")
    public Integer idx;

    @ApiModelProperty("标签1")
    public String tag1;

    @ApiModelProperty("标签2")
    public String tag2;

    @ApiModelProperty("标签3")
    public String tag3;

    @ApiModelProperty("标签4")
    public String tag4;

    @ApiModelProperty("图片时间")
    public LocalDate photoTime;

    @ApiModelProperty("0表.jpg,1表.png,2表.gif")
    public Integer photoType;

    @ApiModelProperty("0停用,1启用")
    public Integer status;
}
