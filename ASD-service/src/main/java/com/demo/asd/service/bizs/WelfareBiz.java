package com.demo.asd.service.bizs;

import com.demo.asd.base.hierarchies.BaseBiz;
import com.demo.asd.base.hierarchies.BaseService;
import com.demo.asd.beanUtils.BeanUtils;
import com.demo.asd.exception.BizAssert;
import com.demo.asd.model.welfare.WelfareImgExRequest;
import com.demo.asd.model.welfare.WelfareImgExResponse;
import com.demo.asd.pagination.PageConverter;
import com.demo.asd.pagination.Pagination;
import com.demo.asd.pagination.PagingRequest;
import com.demo.asd.pagination.PagingResponse;
import com.demo.asd.service.services.sys.UserContextService;
import com.demo.asd.service.services.welfare.WelfareService;
import com.demo.asd.support.model.po.common.CodeItemKeys;
import com.demo.asd.support.model.po.welfare.WelfareImgExBean;
import com.demo.asd.support.model.po.welfare.WelfareImgExCriteria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.io.UnsupportedEncodingException;
import java.util.List;

@Component
public class WelfareBiz extends BaseBiz<Long, WelfareImgExBean, WelfareImgExCriteria, WelfareImgExRequest, WelfareImgExResponse>
{
    @Autowired
    public WelfareService welfareService;

    @Autowired
    public UserContextService userContextService;

    public PagingResponse<WelfareImgExResponse> findPage(PagingRequest<WelfareImgExRequest> pag) throws IllegalAccessException, InstantiationException {
        WelfareImgExCriteria criteria= BeanUtils.copy(pag.getCriteria(), WelfareImgExCriteria.class);
        Pagination pagination =BeanUtils.copy(pag.getPagination(), Pagination.class);
        criteria.setStatus(CodeItemKeys.STATUS_Enable);
        List<WelfareImgExBean> beans=welfareService.findByPage(criteria,pagination);
        long count=welfareService.countFindByPage(criteria);
        PagingResponse<WelfareImgExResponse> response = PageConverter.convert(pagination, WelfareImgExResponse.class, count, beans);
        return response;
    }

    @Override
    public BaseService<Long, WelfareImgExBean, WelfareImgExCriteria> getService() {
        return welfareService;
    }
}
