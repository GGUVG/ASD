package com.demo.asd.service.services.welfare;

import com.demo.asd.base.hierarchies.BaseService;
import com.demo.asd.base.hierarchies.CrudDao;
import com.demo.asd.dao.welfare.WelfareDao;
import com.demo.asd.pagination.Pagination;
import com.demo.asd.support.model.po.welfare.WelfareImgExBean;
import com.demo.asd.support.model.po.welfare.WelfareImgExCriteria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WelfareService extends BaseService<Long, WelfareImgExBean, WelfareImgExCriteria>
{
    @Autowired
    public WelfareDao welfareDao;

    public List<WelfareImgExBean> findByPage(WelfareImgExCriteria criteria, Pagination pagination)
    {
        return welfareDao.findByPage(criteria, pagination);
    }

    public Long countFindByPage(WelfareImgExCriteria criteria)
    {
        return welfareDao.countFindByPage(criteria);
    }

    public List<WelfareImgExBean> findNoPage(WelfareImgExCriteria criteria)
    {
        return  welfareDao.findNoPage(criteria);
    }

    @Override
    protected CrudDao<Long, WelfareImgExBean, WelfareImgExCriteria> getCrudDao()
    {
        return welfareDao;
    }
}
