package com.demo.asd.dao.client;

import com.demo.asd.base.hierarchies.CrudDao;
import com.demo.asd.pagination.Pagination;
import com.demo.asd.support.model.po.client.forSale.ClientSaleBean;
import com.demo.asd.support.model.po.client.forSale.ClientSaleCriteria;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
@Mapper
public interface ClientForSaleDao extends CrudDao<Long, ClientSaleBean, ClientSaleCriteria>
{
    public List<ClientSaleBean> findClientSale(@Param("criteria")ClientSaleCriteria criteria, @Param("pagination")Pagination pagination);

    public Long countFindClientSale(@Param("criteria")ClientSaleCriteria criteria);
}
