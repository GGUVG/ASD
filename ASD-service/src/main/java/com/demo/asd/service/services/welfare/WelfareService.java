package com.demo.asd.service.services.welfare;

import com.demo.asd.base.hierarchies.BaseService;
import com.demo.asd.base.hierarchies.CrudDao;
import com.demo.asd.dao.welfare.WelfareDao;
import com.demo.asd.pagination.Pagination;
import com.demo.asd.support.model.po.welfare.WelfareArticleExBean;
import com.demo.asd.support.model.po.welfare.WelfareArticleExCriteria;
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

    public List<WelfareImgExBean> findImgByPage(WelfareImgExCriteria criteria, Pagination pagination)
    {
        return welfareDao.findImgByPage(criteria, pagination);
    }

    public Long countFindImgByPage(WelfareImgExCriteria criteria)
    {
        return welfareDao.countFindImgByPage(criteria);
    }

    public List<WelfareImgExBean> findImgNoPage(WelfareImgExCriteria criteria)
    {
        return  welfareDao.findImgNoPage(criteria);
    }

    public List<WelfareArticleExBean> findArticleByPage(WelfareArticleExCriteria criteria, Pagination pagination)
    {
        return  welfareDao.findArticleByPage(criteria, pagination);
    }

    public Long countFindArticleByPage(WelfareArticleExCriteria criteria)
    {
        return welfareDao.countFindArticleByPage(criteria);
    }

    public List<WelfareImgExBean> findArticleNoPage(WelfareArticleExCriteria criteria)
    {
        return welfareDao.findArticleNoPage(criteria);
    }

    @Override
    protected CrudDao<Long, WelfareImgExBean, WelfareImgExCriteria> getCrudDao()
    {
        return welfareDao;
    }
}
