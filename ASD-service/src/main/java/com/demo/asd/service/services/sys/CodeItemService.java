package com.demo.asd.service.services.sys;

import com.demo.asd.base.hierarchies.BaseService;
import com.demo.asd.base.hierarchies.CrudDao;
import com.demo.asd.dao.sys.CodeItemDao;
import com.demo.asd.support.model.po.sys.CodeItemBean;
import com.demo.asd.support.model.po.sys.CodeItemCriteria;
import com.demo.asd.support.model.po.sys.CodeItemPkBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CodeItemService extends BaseService<CodeItemPkBean, CodeItemBean, CodeItemCriteria>
{
    @Autowired
    public CodeItemDao codeItemDao;

    public List<CodeItemBean> getCodeItemList(CodeItemCriteria criteria)
    {
        return codeItemDao.getCodeItemList(criteria);
    }

    @Override
    protected CrudDao<CodeItemPkBean, CodeItemBean, CodeItemCriteria> getCrudDao() {
        return codeItemDao;
    }
}
