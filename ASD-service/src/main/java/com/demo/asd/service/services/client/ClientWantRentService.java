package com.demo.asd.service.services.client;


import com.demo.asd.base.hierarchies.BaseService;
import com.demo.asd.base.hierarchies.CrudDao;
import com.demo.asd.beanUtils.BeanUtils;
import com.demo.asd.dao.client.ClientWantRentDao;
import com.demo.asd.model.client.wantRent.ClientWantRentExRequest;
import com.demo.asd.pagination.Pagination;
import com.demo.asd.support.model.po.client.wantRent.ClientWantRentExBean;
import com.demo.asd.support.model.po.client.wantRent.ClientWantRentExCriteria;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientWantRentService extends BaseService<Long, ClientWantRentExBean, ClientWantRentExCriteria>
{
    @Autowired
    public ClientWantRentDao clientWantRentDao;

    public List<ClientWantRentExBean> findClientWantRentByPage(ClientWantRentExCriteria criteria,Pagination pagination)
    {
        return clientWantRentDao.findClientWantRentByPage(criteria, pagination);
    }

    public Long countFindClientWantRentByPage(ClientWantRentExCriteria criteria)
    {
        return clientWantRentDao.countFindClientWantRentByPage(criteria);
    }

    public List<ClientWantRentExBean> findClientWantRent(ClientWantRentExCriteria criteria)
    {
        return clientWantRentDao.findClientWantRent(criteria);
    }

    public List<ClientWantRentExBean> findClientWantRentRequest(ClientWantRentExRequest request)
    {
        ClientWantRentExCriteria criteria= BeanUtils.copy(request, ClientWantRentExCriteria.class);
        return clientWantRentDao.findClientWantRent(criteria);
    }

    @Override
    protected CrudDao<Long, ClientWantRentExBean, ClientWantRentExCriteria> getCrudDao()
    {
        return clientWantRentDao;
    }
}
