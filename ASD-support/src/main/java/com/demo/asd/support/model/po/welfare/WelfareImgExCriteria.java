package com.demo.asd.support.model.po.welfare;

import lombok.Getter;
import lombok.Setter;
import java.time.LocalDate;

/**
 * 图片类追加字段
 * Created by chency on 2020/09/14.
 */
@Getter
@Setter
public class WelfareImgExCriteria extends WelfareImgCriteria
{
    public LocalDate startPhotoTime;//起始图片时间区间

    public LocalDate endPhotoTime;//结束图片时间
}
