package com.demo.asd.dao.client;

import com.demo.asd.base.hierarchies.CrudDao;
import com.demo.asd.pagination.Pagination;
import com.demo.asd.support.model.po.client.wantBuy.ClientWantBuyExBean;
import com.demo.asd.support.model.po.client.wantBuy.ClientWantBuyExCriteria;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper
public interface ClientWantBuyDao extends CrudDao<Long, ClientWantBuyExBean, ClientWantBuyExCriteria>
{
    public List<ClientWantBuyExBean> findClientWantBuyByPage(@Param("criteria") ClientWantBuyExCriteria criteria, @Param("pagination") Pagination pagination);

    public Long countFindClientWantBuyByPage(@Param("criteria") ClientWantBuyExCriteria criteria);

    public List<ClientWantBuyExBean> findClientWantBuy(@Param("criteria") ClientWantBuyExCriteria criteria);
}
