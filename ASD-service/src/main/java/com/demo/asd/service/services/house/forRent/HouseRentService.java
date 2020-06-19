package com.demo.asd.service.services.house.forRent;

import com.demo.asd.base.hierarchies.BaseService;
import com.demo.asd.base.hierarchies.CrudDao;
import com.demo.asd.beanUtils.BeanUtils;
import com.demo.asd.dao.house.forRent.HouseRentDao;
import com.demo.asd.model.house.forRent.HouseRentExRequest;
import com.demo.asd.pagination.Pagination;
import com.demo.asd.support.model.po.house.forRent.HouseRentExBean;
import com.demo.asd.support.model.po.house.forRent.HouseRentExCriteria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HouseRentService extends BaseService<Long, HouseRentExBean, HouseRentExCriteria>
{
    @Autowired
    public HouseRentDao houseRentDao;

    public List<HouseRentExBean> findPageHouseForRent(HouseRentExCriteria criteria, Pagination pagination)
    {
        return houseRentDao.findPageHouseForRent(criteria, pagination);
    }

    public long CountfindPageHouseForRent(HouseRentExCriteria criteria)
    {
        return  houseRentDao.CountfindPageHouseForRent(criteria);
    }

    public List<HouseRentExBean> findHouseForRent(HouseRentExCriteria criteria)
    {
        return houseRentDao.findHouseForRent(criteria);
    }

    public List<HouseRentExBean> findHouseForRentRequest(HouseRentExRequest request)
    {
        HouseRentExCriteria criteria= BeanUtils.copy(request, HouseRentExCriteria.class);
        return houseRentDao.findHouseForRent(criteria);
    }

    @Override
    protected CrudDao<Long, HouseRentExBean, HouseRentExCriteria> getCrudDao() {
        return houseRentDao;
    }
}
