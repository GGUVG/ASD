package com.demo.asd.service.services.client;

import com.demo.asd.base.hierarchies.BaseService;
import com.demo.asd.base.hierarchies.CrudDao;
import com.demo.asd.beanUtils.BeanUtils;
import com.demo.asd.dao.client.ClientWantBuyDao;
import com.demo.asd.model.client.wantBuy.ClientWantBuyExRequest;
import com.demo.asd.pagination.Pagination;
import com.demo.asd.support.model.po.client.wantBuy.ClientWantBuyExBean;
import com.demo.asd.support.model.po.client.wantBuy.ClientWantBuyExCriteria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientWantBuyService extends BaseService<Long, ClientWantBuyExBean, ClientWantBuyExCriteria>
{
    @Autowired
    public ClientWantBuyDao clientWantBuyDao;

    public List<ClientWantBuyExBean> findClientWantBuyByPage(ClientWantBuyExCriteria criteria,Pagination pagination)
    {
        return clientWantBuyDao.findClientWantBuyByPage(criteria, pagination);
    }

    public Long countFindClientWantBuyByPage( ClientWantBuyExCriteria criteria)
    {
        return clientWantBuyDao.countFindClientWantBuyByPage(criteria);
    }

    public List<ClientWantBuyExBean> findClientWantBuy(ClientWantBuyExCriteria criteria)
    {
        return clientWantBuyDao.findClientWantBuy(criteria);
    }

    public List<ClientWantBuyExBean> findClientWantBuy(ClientWantBuyExRequest request)
    {
        ClientWantBuyExCriteria criteria= BeanUtils.copy(request, ClientWantBuyExCriteria.class);
        return clientWantBuyDao.findClientWantBuy(criteria);
    }

    @Override
    protected CrudDao<Long, ClientWantBuyExBean, ClientWantBuyExCriteria> getCrudDao()
    {
        return clientWantBuyDao;
    }
}
