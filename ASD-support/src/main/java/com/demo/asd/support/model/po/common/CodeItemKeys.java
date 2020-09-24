package com.demo.asd.support.model.po.common;

/**
 * 码表常量
 * Created by chency on 2020/09/11
 */
public interface CodeItemKeys {

    /**
     * 状态
     */
    Integer STATUS_Enable=1;//启用
    Integer STATUS_DISABLE=0;//停用

    /**
     * 反馈
     */
    Integer SUCCESS=1;
    Integer FAILURE=0;

    /**
     * 修改反馈信息
     */
    String MODIFY_SUCCESS="修改成功";
    String MODIFY_FAILURE="修改失败";

    /**
     * 福利文章一级类目
     * 10国内,20亚裔,30欧美,40非裔,50动漫2D,60动漫3D
     */
    String ARTICLE_PRIMARY_CATEGORY_UNDEFINED = "未定义文章一级目录";
    Integer ARTICLE_PRIMARY_CATEGORY_DOMESTIC=10;
    Integer ARTICLE_PRIMARY_CATEGORY_ASIAN=20;
    Integer ARTICLE_PRIMARY_CATEGORY_WESTERN=30;
    Integer ARTICLE_PRIMARY_CATEGORY_AFRICAN=40;
    Integer ARTICLE_PRIMARY_CATEGORY_ANIMATION2D=50;
    Integer ARTICLE_PRIMARY_CATEGORY_ANIMATION3D=60;

    /**
     * 福利Img各出版方/代表作者
     */
    String WELFARE_IMG_UNDEFINED = "未定义";

    Integer WELFARE_IMG_TUIGIRL=10;//TuiGirl推女郎
    Integer WELFARE_IMG_XIUREN=11;//[XiuRen]秀人网
    Integer WELFARE_IMG_FEILIN=12;//FeiLin嗲囡囡
    Integer WELFARE_IMG_LEGBABY=13;//[LegBaby]美腿宝贝
    Integer WELFARE_IMG_MIITAO=14;//[MiiTao]蜜桃社
    Integer WELFARE_IMG_MISTAR=15;//[MiStar]魅妍社
    Integer WELFARE_IMG_PARTYCAT=16;//[PARTYCAT]轰趴猫
    Integer WELFARE_IMG_AISS=17;//[爱丝AISS]
    Integer WELFARE_IMG_GANGBEN=18;//[冈本映画]
    Integer WELFARE_IMG_LPVISION=19;//L.P.VISION
    Integer WELFARE_IMG_ASIAN=20;//[亚站撸图]
    Integer WELFARE_IMG_CELEBRITY=21;//网络红人

    /**
     * 图片类型
     */
    Integer IMG_TYPE_JPG=0;//.jpg
    Integer IMG_TYPE_PNG=1;//.png
    Integer IMG_TYPE_GIF=2;//.gif
}
