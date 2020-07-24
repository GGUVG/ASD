package com.demo.asd.service.services.client;

import com.demo.asd.base.hierarchies.BaseService;
import com.demo.asd.base.hierarchies.CrudDao;
import com.demo.asd.beanUtils.BeanUtils;
import com.demo.asd.dao.client.ClientForSaleDao;
import com.demo.asd.model.client.forSale.ClientSaleRequest;
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

    public List<ClientSaleBean> findClientSaleByPage(ClientSaleCriteria criteria, Pagination pagination)
    {
        return clientForSaleDao.findClientSaleByPage(criteria,pagination);
    }

    public Long countFindClientSale(ClientSaleCriteria criteria)
    {
        return clientForSaleDao.countFindClientSale(criteria);
    }

    public List<ClientSaleBean> findClientSale(ClientSaleCriteria criteria)
    {
        return clientForSaleDao.findClientSale(criteria);
    }

    public List<ClientSaleBean> findClientSaleRequest(ClientSaleRequest request)
    {
        ClientSaleCriteria criteria= BeanUtils.copy(request, ClientSaleCriteria.class);
        return clientForSaleDao.findClientSale(criteria);
    }

    public Integer editClientForSale(ClientSaleBean bean)
    {
        return clientForSaleDao.editClientForSale(bean);
    }

    @Override
    protected CrudDao<Long, ClientSaleBean, ClientSaleCriteria> getCrudDao()
    {
        return clientForSaleDao;
    }
}
