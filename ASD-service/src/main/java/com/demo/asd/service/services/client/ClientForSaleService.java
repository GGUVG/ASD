package com.demo.asd.service.services.client;

import com.demo.asd.base.hierarchies.BaseService;
import com.demo.asd.base.hierarchies.CrudDao;
import com.demo.asd.dao.client.ClientForSaleDao;
import com.demo.asd.pagination.Pagination;
import com.demo.asd.support.model.po.client.forSale.ClientSaleBean;
import com.demo.asd.support.model.po.client.forSale.ClientSaleCriteria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientForSaleService extends BaseService<Long, ClientSaleBean, ClientSaleCriteria>
{
    @Autowired
    public ClientForSaleDao clientForSaleDao;

    public List<ClientSaleBean> findClientSale(ClientSaleCriteria criteria, Pagination pagination)
    {
        return clientForSaleDao.findClientSale(criteria,pagination);
    }

    public Long countFindClientSale(ClientSaleCriteria criteria)
    {
        return clientForSaleDao.countFindClientSale(criteria);
    }

    @Override
    protected CrudDao<Long, ClientSaleBean, ClientSaleCriteria> getCrudDao()
    {
        return clientForSaleDao;
    }
}
