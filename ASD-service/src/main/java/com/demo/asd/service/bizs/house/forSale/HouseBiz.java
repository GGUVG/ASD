package com.demo.asd.service.bizs.house.forSale;

import com.demo.asd.base.hierarchies.BaseBiz;
import com.demo.asd.base.hierarchies.BaseService;
import com.demo.asd.beanUtils.BeanUtils;
import com.demo.asd.model.house.forSale.HouseSaleWithOwnerClientRequest;
import com.demo.asd.model.house.forSale.HouseSaleWithOwnerClientResponse;
import com.demo.asd.pagination.*;
import com.demo.asd.service.services.house.HouseSaleService;
import com.demo.asd.support.model.po.house.forSale.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 调用asd-service模块/houseSaleService
 * 有关售房业务逻辑处理
 * Created by chency on 2020-05-14.
 */
@Component
public class HouseBiz extends BaseBiz<Long, HouseSaleWithOwnerClientBean, HouseSaleWithOwnerClientCriteria, HouseSaleWithOwnerClientRequest, HouseSaleWithOwnerClientResponse> {
    @Autowired
    public HouseSaleService houseSaleService;

    public PagingResponse<HouseSaleWithOwnerClientResponse> findPageHouseForSale(PagingRequest<HouseSaleWithOwnerClientRequest> pag) throws InstantiationException, IllegalAccessException
    {
        HouseSaleWithOwnerClientCriteria criteria=BeanUtils.copy(pag.getCriteria(), this.criteriaClass);
        Pagination pagination =BeanUtils.copy(pag.getPagination(), Pagination.class);
        List<HouseSaleWithOwnerClientBean> beans=houseSaleService.findPageHouseForSale(criteria,pagination);
        long count=houseSaleService.CountfindPageHouseForSale(criteria);
        PagingResponse<HouseSaleWithOwnerClientResponse> response = PageConverter.convert(pagination, HouseSaleWithOwnerClientResponse.class, count, beans);
        return response;
    }

    @Override
    public BaseService<Long, HouseSaleWithOwnerClientBean, HouseSaleWithOwnerClientCriteria> getService() {
        return houseSaleService;
    }
}
