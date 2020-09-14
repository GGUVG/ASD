package com.demo.asd.service.services.sys.codeTranslate;

import com.demo.asd.support.model.po.common.CodeItemKeys;
import org.springframework.stereotype.Service;

@Service
/**
 * 根据码表code获取code描述
 * 文章类
 * Create By chenCy 2020/9/11
 */
public class ArticleCodeTranslateService
{
    public String getDescribeByArticlePrimary(Integer primaryCategory)
    {
        if(primaryCategory== CodeItemKeys.ARTICLE_PRIMARY_CATEGORY_DOMESTIC)
        {
            return "国内";
        }else if(primaryCategory==CodeItemKeys.ARTICLE_PRIMARY_CATEGORY_ASIAN)
        {
            return "亚裔";
        }else if(primaryCategory==CodeItemKeys.ARTICLE_PRIMARY_CATEGORY_WESTERN)
        {
            return "欧美";
        }else if(primaryCategory==CodeItemKeys.ARTICLE_PRIMARY_CATEGORY_AFRICAN)
        {
            return "非裔";
        }else if(primaryCategory==CodeItemKeys.ARTICLE_PRIMARY_CATEGORY_ANIMATION2D)
        {
            return "动漫2D";
        }else if(primaryCategory==CodeItemKeys.ARTICLE_PRIMARY_CATEGORY_ANIMATION3D)
        {
            return "动漫3D";
        }
        else {
            return CodeItemKeys.ARTICLE_PRIMARY_CATEGORY_UNDEFINED;
        }
    }
}
