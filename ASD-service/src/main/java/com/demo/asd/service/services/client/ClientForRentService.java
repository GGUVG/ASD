package com.demo.asd.service.services.client;

import com.demo.asd.base.hierarchies.BaseService;
import com.demo.asd.base.hierarchies.CrudDao;
import com.demo.asd.dao.client.ClientForRentDao;
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

    public List<ClientRentBean> findClientRent(ClientRentCriteria criteria, Pagination pagination)
    {
        return clientForRentDao.findClientRent(criteria, pagination);
    }

    public Long countFindClientRent(ClientRentCriteria criteria)
    {
        return clientForRentDao.countFindClientRent(criteria);
    }

    @Override
    protected CrudDao<Long, ClientRentBean, ClientRentCriteria> getCrudDao()
    {
        return clientForRentDao;
    }
}
