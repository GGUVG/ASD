package com.demo.asd.service.bizs.estae;

import com.demo.asd.base.hierarchies.BaseBiz;
import com.demo.asd.base.hierarchies.BaseService;
import com.demo.asd.beanUtils.BeanUtils;
import com.demo.asd.model.estate.EstateRequest;
import com.demo.asd.model.estate.EstateResponse;
import com.demo.asd.service.services.estate.EstateService;
import com.demo.asd.support.model.po.estate.EstateBean;
import com.demo.asd.support.model.po.estate.EstateCriteria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class EstateBiz extends BaseBiz<Long, EstateBean, EstateCriteria, EstateRequest, EstateResponse>
{
    @Autowired
    public EstateService estateService;

    public List<EstateResponse> findEstateList(EstateRequest request)
    {
        EstateCriteria criteria= BeanUtils.copy(request, EstateCriteria.class);
        List<EstateBean> beans=estateService.findEstateList(criteria);
        List<EstateResponse> response=BeanUtils.copyList(beans, EstateResponse.class);
        return response;
    }

    @Override
    public BaseService<Long, EstateBean, EstateCriteria> getService()
    {
        return estateService;
    }
}
