package com.demo.asd.service.services.house.forSale;

import com.demo.asd.base.hierarchies.BaseService;
import com.demo.asd.base.hierarchies.CrudDao;
import com.demo.asd.beanUtils.BeanUtils;
import com.demo.asd.dao.house.forSale.HouseSaleDao;
import com.demo.asd.model.house.forSale.HouseSaleWithOwnerClientRequest;
import com.demo.asd.pagination.Pagination;
import com.demo.asd.support.model.po.house.forSale.*;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by chency on 2020-05-19.
 */
@Service
public class HouseSaleService extends BaseService<Long, HouseSaleWithOwnerClientBean, HouseSaleWithOwnerClientCriteria> {
    @Autowired
    public HouseSaleDao houseSaleDao;

    public List<HouseSaleWithOwnerClientBean> findPageHouseForSale(HouseSaleWithOwnerClientCriteria criteria, Pagination pagination)
    {
        return houseSaleDao.findPageHouseForSale(criteria, pagination);
    }

    public long CountfindPageHouseForSale(@Param("criteria") HouseSaleWithOwnerClientCriteria criteria)
    {
        return houseSaleDao.CountfindPageHouseForSale(criteria);
    }

    public List<HouseSaleWithOwnerClientBean> findHouseForSale(HouseSaleWithOwnerClientRequest request)
    {
        HouseSaleWithOwnerClientCriteria criteria =  BeanUtils.copy(request, HouseSaleWithOwnerClientCriteria.class);
        return houseSaleDao.findHouseForSale(criteria);
    }

    @Override
    protected CrudDao<Long, HouseSaleWithOwnerClientBean, HouseSaleWithOwnerClientCriteria> getCrudDao() {
        return houseSaleDao;
    }
}
