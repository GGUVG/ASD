package com.demo.asd.service.services.client;

import com.demo.asd.base.hierarchies.BaseService;
import com.demo.asd.base.hierarchies.CrudDao;
import com.demo.asd.beanUtils.BeanUtils;
import com.demo.asd.dao.client.ClientForRentDao;
import com.demo.asd.model.client.forRent.ClientRentRequest;
import com.demo.asd.pagination.Pagination;
import com.demo.asd.support.model.po.client.forRent.ClientRentBean;
import com.demo.asd.support.model.po.client.forRent.ClientRentCriteria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientForRentService extends BaseService<Long, ClientRentBean, ClientRentCriteria>
{
    @Autowired
    public ClientForRentDao clientForRentDao;

    public List<ClientRentBean> findClientRentByPage(ClientRentCriteria criteria, Pagination pagination)
    {
        return clientForRentDao.findClientRentByPage(criteria, pagination);
    }

    public Long countFindClientRent(ClientRentCriteria criteria)
    {
        return clientForRentDao.countFindClientRent(criteria);
    }

    public List<ClientRentBean> findClientRent(ClientRentCriteria criteria)
    {
        return clientForRentDao.findClientRent(criteria);
    }

    public List<ClientRentBean> findClientRentForRequest(ClientRentRequest request)
    {
        ClientRentCriteria criteria= BeanUtils.copy(request, ClientRentCriteria.class);
        return clientForRentDao.findClientRent(criteria);
    }

    @Override
    protected CrudDao<Long, ClientRentBean, ClientRentCriteria> getCrudDao()
    {
        return clientForRentDao;
    }
}
