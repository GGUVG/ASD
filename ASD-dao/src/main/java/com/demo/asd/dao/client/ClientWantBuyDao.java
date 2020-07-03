package com.demo.asd.dao.client;

import com.demo.asd.base.hierarchies.CrudDao;
import com.demo.asd.pagination.Pagination;
import com.demo.asd.support.model.po.client.wantBuy.ClientWantBuyBean;
import com.demo.asd.support.model.po.client.wantBuy.ClientWantBuyCriteria;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper
public interface ClientWantBuyDao extends CrudDao<Long, ClientWantBuyBean, ClientWantBuyCriteria>
{
    public List<ClientWantBuyBean> findClientWantBuy(@Param("criteria") ClientWantBuyCriteria criteria, @Param("pagination") Pagination pagination);

    public Long countFindClientWantBuy(@Param("criteria") ClientWantBuyCriteria criteria);
}
