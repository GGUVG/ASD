package com.demo.asd.support.model.po.welfare;

import com.demo.asd.base.entity.BaseCriteria;
import lombok.Getter;
import lombok.Setter;
import java.time.LocalDate;
/**
 * 图片类
 * Created by chency on 2020/09/11.
 */
@Getter
@Setter
public class WelfareImgCriteria extends BaseCriteria
{
    public Long id;//图片流水id

    public Long articleId;//所属文章id

    public String originalName;//图片原名

    public String modelName;//模特名

    public String photoName;//图片名

    public String subPhotoName;//图片副名

    public String photoDescribe;//图片描述

    public Integer primaryCategory;//一级分类

    public String primaryCategoryTxt;//一级分类文本描述

    public Integer secondaryCategory;//二级分类

    public String secondaryCategoryTxt;//二级分类文本描述

    public Integer thirdCategory;//三级分类

    public String thirdCategoryTxt;//三级分类文本描述

    public Integer idxStatus;//是否存在同名,0不存在1存在

    public Integer idx;//顺序号,默认0

    public String tag1;//标签1

    public String tag2;//标签2

    public String tag3;//标签3

    public String tag4;//标签4

    public LocalDate photoTime;//图片时间

    public Integer photoType;//0表.jpg,1表.png,2表.gif

    public Integer status;//0停用,1启用
}
