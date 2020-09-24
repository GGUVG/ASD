package com.demo.asd.service.bizs.welfare;

import com.demo.asd.base.hierarchies.BaseBiz;
import com.demo.asd.base.hierarchies.BaseService;
import com.demo.asd.beanUtils.BeanUtils;
import com.demo.asd.exception.BizAssert;
import com.demo.asd.model.ModifyResponse;
import com.demo.asd.model.welfare.*;
import com.demo.asd.pagination.PageConverter;
import com.demo.asd.pagination.Pagination;
import com.demo.asd.pagination.PagingRequest;
import com.demo.asd.pagination.PagingResponse;
import com.demo.asd.service.services.sys.CodeItemService;
import com.demo.asd.service.services.sys.DataBaseService;
import com.demo.asd.service.services.sys.UserContextService;
import com.demo.asd.service.services.sys.codeTranslate.ArticleCodeTranslateService;
import com.demo.asd.service.services.sys.codeTranslate.WelfarePhotoCodeTranslateService;
import com.demo.asd.service.services.welfare.WelfareService;
import com.demo.asd.support.model.po.common.CodeItemKeys;
import com.demo.asd.support.model.po.sys.CodeItemBean;
import com.demo.asd.support.model.po.sys.CodeItemCriteria;
import com.demo.asd.support.model.po.welfare.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import com.demo.asd.dataUtils.ChineseUtils;
import org.springframework.web.multipart.MultipartFile;

@Component
public class WelfareBiz extends BaseBiz<Long, WelfareImgExBean, WelfareImgExCriteria, WelfareImgExRequest, WelfareImgExResponse>
{
    @Autowired
    public WelfareService welfareService;

    @Autowired
    public UserContextService userContextService;

    @Autowired
    public WelfarePhotoCodeTranslateService getTxtFromImgCode;

    @Autowired
    ArticleCodeTranslateService getTxtFromArticleCode;

    @Autowired
    DataBaseService dataBaseService;

    @Autowired
    public CodeItemService codeItemService;

    /**
     * 点进文章后,显示的图片list,分页
     * @param pag
     * @return
     * @throws IllegalAccessException
     * @throws InstantiationException
     */
    public PagingResponse<WelfareImgExResponse> findImgByPage(PagingRequest<WelfareImgExRequest> pag) throws IllegalAccessException, InstantiationException {
        WelfareImgExCriteria criteria= BeanUtils.copy(pag.getCriteria(), WelfareImgExCriteria.class);
        Pagination pagination =BeanUtils.copy(pag.getPagination(), Pagination.class);
        criteria.setStatus(CodeItemKeys.STATUS_Enable);
        BizAssert.isTrue(criteria.articleId!=null, "无法根据该文章获取详情!");
        List<WelfareImgExBean> beans=welfareService.findImgByPage(criteria,pagination);
        beans.forEach(bean->{
            if(bean.primaryCategory!=null)
            {
                bean.setPrimaryCategoryTxt(getTxtFromImgCode.getDescribeByWelfareImgPrimary(bean.primaryCategory));
            }
            if(bean.secondaryCategory!=null)
            {
                bean.setSecondaryCategoryTxt(getTxtFromImgCode.getDescribeByWelfareImgPublish(bean.secondaryCategory));
            }
            /**
             * 三级分类我还没想好
             */
        });
        long count=welfareService.countFindImgByPage(criteria);
        PagingResponse<WelfareImgExResponse> response = PageConverter.convert(pagination, WelfareImgExResponse.class, count, beans);
        return response;
    }

    /**
     * 根据条件查询出文章列表
     * @return
     */
    public PagingResponse<WelfareArticleExResponse> findArticleByPage(PagingRequest<WelfareArticleExRequest> pag) throws IllegalAccessException, InstantiationException {
        WelfareArticleExCriteria criteria=BeanUtils.copy(pag.getCriteria(), WelfareArticleExCriteria.class);
        Pagination pagination =BeanUtils.copy(pag.getPagination(), Pagination.class);
        criteria.setStatus(CodeItemKeys.STATUS_Enable);
        List<WelfareArticleExBean> beans=welfareService.findArticleByPage(criteria,pagination);
        beans.forEach(bean->{
            if(bean.primaryCategory!=null)
            {
                bean.setPrimaryCategoryTxt(getTxtFromImgCode.getDescribeByWelfareImgPrimary(bean.primaryCategory));
            }
            if(bean.secondaryCategory!=null)
            {
                bean.setSecondaryCategoryTxt(getTxtFromImgCode.getDescribeByWelfareImgPublish(bean.secondaryCategory));
            }
            /**
             * 三级分类我还没想好
             */
        });
        long count=welfareService.countFindArticleByPage(criteria);
        PagingResponse<WelfareArticleExResponse> response = PageConverter.convert(pagination, WelfareArticleExResponse.class, count, beans);
        return response;
    }

    /**
     * 新增文章
     */
    public ModifyResponse submitNewArticle(WelfareArticleExRequest request)
    {
        ModifyResponse response=new ModifyResponse();
        WelfareArticleExBean bean=BeanUtils.copy(request, WelfareArticleExBean.class);
        bean.setPublishTime(dataBaseService.getDbDatetime());
        bean.setStatus(CodeItemKeys.SUCCESS);
        response.setChangeQty(welfareService.submitNewArticle(bean));
        if(response.getChangeQty()>0)
        {
            response.setStatus(CodeItemKeys.SUCCESS);
            response.setMessage(CodeItemKeys.MODIFY_SUCCESS);
            return response;
        }else{
            response.setStatus(CodeItemKeys.FAILURE);
            response.setMessage(CodeItemKeys.MODIFY_FAILURE);
            return response;
        }
    }

    /**
     * 新增图片
     */
    public ModifyResponse submitNewImg(WelfareImgExRequest request)
    {
        ModifyResponse response=new ModifyResponse();
        WelfareImgExBean bean=BeanUtils.copy(request, WelfareImgExBean.class);
        response.setChangeQty(welfareService.submitNewImg(bean));
        if(response.getChangeQty()>0)
        {
            response.setStatus(CodeItemKeys.SUCCESS);
            response.setMessage(CodeItemKeys.MODIFY_SUCCESS);
            return response;
        }else{
            response.setStatus(CodeItemKeys.FAILURE);
            response.setMessage(CodeItemKeys.MODIFY_FAILURE);
            return response;
        }
    }

    /**
     * 上传文件
     * 文件名=model+title+
     * @return
     */
    public ModifyResponse uploadNewImg(MultipartFile multipartFile)
    {
        ModifyResponse response=new ModifyResponse();
        return response;
    }

    /**
     * 获取出版商信息list
     * @return
     */
    public List<PublishResponse> getPublishByCode(PublishRequest request)
    {
        List<PublishResponse> responses=new ArrayList<>();
        PublishCriteria publishCriteria=BeanUtils.copy(request, PublishCriteria.class);
        publishCriteria.setStrPublish("WELFARE_PUBLISH");
        CodeItemCriteria criteria=new CodeItemCriteria();
        criteria.setTypeCode(publishCriteria.getStrPublish());
        criteria.setItemCode(publishCriteria.getPublishCode());
        List<CodeItemBean> beans=codeItemService.getCodeItemList(criteria);
        beans.forEach(bean->{
            PublishResponse response=new PublishResponse();
            response.setPublishCode(bean.itemCode);
            response.setPublishName(bean.itemName);
            responses.add(response);
        });
        return responses;
    }

    @Override
    public BaseService<Long, WelfareImgExBean, WelfareImgExCriteria> getService() {
        return welfareService;
    }
}
