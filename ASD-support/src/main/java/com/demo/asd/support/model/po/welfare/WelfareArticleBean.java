package com.demo.asd.support.model.po.welfare;

import com.demo.asd.base.entity.BaseBean;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

/**
 * 文章
 * Created by chency on 2020-09-11.
 */
@Getter
@Setter

public class WelfareArticleBean extends BaseBean
{
    public Long id;//流水号id

    public String title;//标题

    public String secondaryTitle;//二级标题

    public String content;//内容

    public Integer primaryCategory;//一级分类

    public String primaryCategoryTxt;//一级分类描述

    public Integer secondaryCategory;//二级分类

    public String secondaryCategoryTxt;//二级分类描述

    public Integer thirdCategory;//三级分类

    public String thirdCategoryTxt;//三级分类描述

    public LocalDateTime publishTime;//文章发表时间

    public Integer hotValue;//文章人气值

    public String keyWord1;//关键词1

    public String keyWord2;//关键词2

    public String keyWord3;//关键词3

    public String keyWord4;//关键词4

    public Long bgImg;//文章列表时显示的缩略封面图

    public Integer status;//状态
}
