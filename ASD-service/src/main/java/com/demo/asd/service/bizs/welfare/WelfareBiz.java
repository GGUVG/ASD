package com.demo.asd.service.bizs.welfare;

import com.demo.asd.base.hierarchies.BaseBiz;
import com.demo.asd.base.hierarchies.BaseService;
import com.demo.asd.beanUtils.BeanUtils;
import com.demo.asd.exception.BizAssert;
import com.demo.asd.model.welfare.WelfareArticleExRequest;
import com.demo.asd.model.welfare.WelfareArticleExResponse;
import com.demo.asd.model.welfare.WelfareImgExRequest;
import com.demo.asd.model.welfare.WelfareImgExResponse;
import com.demo.asd.pagination.PageConverter;
import com.demo.asd.pagination.Pagination;
import com.demo.asd.pagination.PagingRequest;
import com.demo.asd.pagination.PagingResponse;
import com.demo.asd.service.services.sys.UserContextService;
import com.demo.asd.service.services.sys.codeTranslate.ArticleCodeTranslateService;
import com.demo.asd.service.services.sys.codeTranslate.WelfarePhotoCodeTranslateService;
import com.demo.asd.service.services.welfare.WelfareService;
import com.demo.asd.support.model.po.common.CodeItemKeys;
import com.demo.asd.support.model.po.welfare.WelfareArticleExBean;
import com.demo.asd.support.model.po.welfare.WelfareArticleExCriteria;
import com.demo.asd.support.model.po.welfare.WelfareImgExBean;
import com.demo.asd.support.model.po.welfare.WelfareImgExCriteria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.List;
import com.demo.asd.dataUtils.ChineseUtils;

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

    @Override
    public BaseService<Long, WelfareImgExBean, WelfareImgExCriteria> getService() {
        return welfareService;
    }
}
