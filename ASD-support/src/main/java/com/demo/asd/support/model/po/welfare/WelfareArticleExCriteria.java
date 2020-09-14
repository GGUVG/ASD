package com.demo.asd.support.model.po.welfare;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
/**
 * 文章追加字段
 * Created by chency on 2020/09/14.
 */
@Getter
@Setter
public class WelfareArticleExCriteria extends WelfareArticleCriteria
{
    public LocalDateTime startPublishTime;//发布时间起始区间

    public LocalDateTime endPublishTime;//发布时间结束区间
}
