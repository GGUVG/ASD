package com.demo.asd.service.services.sys.codeTranslate;

import com.demo.asd.support.model.po.common.CodeItemKeys;
import org.springframework.stereotype.Service;
/**
 * 根据码表code获取code描述
 * 福利图类
 * Create By chenCy 2020/9/11
 */
@Service
public class WelfarePhotoCodeTranslateService
{
    //根据图片出版商/代言,转译文本描述
    public String getDescribeByWelfareImgPublish(Integer welfareImg)
    {
        if(welfareImg== CodeItemKeys.WELFARE_IMG_TUIGIRL)
        {
            return "TuiGirl推女郎";
        }else if(welfareImg==CodeItemKeys.WELFARE_IMG_XIUREN)
        {
            return "[XiuRen]秀人网";
        }else if(welfareImg==CodeItemKeys.WELFARE_IMG_FEILIN)
        {
            return "FeiLin嗲囡囡";
        }else if(welfareImg==CodeItemKeys.WELFARE_IMG_LEGBABY)
        {
            return "[LegBaby]美腿宝贝";
        }else if(welfareImg==CodeItemKeys.WELFARE_IMG_MIITAO)
        {
            return "[MiiTao]蜜桃社";
        }else if(welfareImg==CodeItemKeys.WELFARE_IMG_MISTAR)
        {
            return "[MiStar]魅妍社";
        }else if(welfareImg==CodeItemKeys.WELFARE_IMG_PARTYCAT)
        {
            return "[PARTYCAT]轰趴猫";
        }else if(welfareImg==CodeItemKeys.WELFARE_IMG_AISS)
        {
            return "[爱丝AISS]";
        }else if(welfareImg==CodeItemKeys.WELFARE_IMG_GANGBEN)
        {
            return "[冈本映画]";
        }else if(welfareImg==CodeItemKeys.WELFARE_IMG_LPVISION)
        {
            return "L.P.VISION";
        }else if(welfareImg==CodeItemKeys.WELFARE_IMG_ASIAN)
        {
            return "[亚站撸图]";
        }else if(welfareImg==CodeItemKeys.WELFARE_IMG_CELEBRITY) {
            return "网络红人";
        }else {
            return CodeItemKeys.WELFARE_IMG_UNDEFINED;
        }
    }

    //根据图片一级分类,转译一级分类描述
    public String getDescribeByWelfareImgPrimary(Integer primaryCategory)
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

    //根据图片后缀类型Code获取图片后缀字符串
    public String getPhotoSuffixType(Integer photoType)
    {
        if(photoType==CodeItemKeys.IMG_TYPE_JPG)
        {
            return ".jpg";
        }else if(photoType==CodeItemKeys.IMG_TYPE_PNG)
        {
            return ".png";
        }else if (photoType==CodeItemKeys.IMG_TYPE_GIF)
        {
            return ".gif";
        }else {
            return "";
        }
    }
}
