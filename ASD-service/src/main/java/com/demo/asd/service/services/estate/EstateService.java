package com.demo.asd.service.services.estate;

import com.demo.asd.base.hierarchies.BaseService;
import com.demo.asd.base.hierarchies.CrudDao;
import com.demo.asd.dao.estate.EstateDao;
import com.demo.asd.support.model.po.estate.EstateBean;
import com.demo.asd.support.model.po.estate.EstateCriteria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EstateService extends BaseService<Long, EstateBean, EstateCriteria> {

    @Autowired
    public EstateDao estateDao;

    public List<EstateBean> findEstateList(EstateCriteria criteria)
    {
        return estateDao.findEstateList(criteria);
    }

    @Override
    protected CrudDao<Long, EstateBean, EstateCriteria> getCrudDao() {
        return estateDao;
    }
}
