package com.demo.asd.dao.client;

import com.demo.asd.base.hierarchies.CrudDao;
import com.demo.asd.pagination.Pagination;
import com.demo.asd.support.model.po.client.forRent.ClientRentBean;
import com.demo.asd.support.model.po.client.forRent.ClientRentCriteria;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
@Mapper
public interface ClientForRentDao extends CrudDao<Long, ClientRentBean, ClientRentCriteria>
{
    public List<ClientRentBean> findClientRent(@Param("criteria") ClientRentCriteria criteria, @Param("pagination") Pagination pagination);

    public Long countFindClientRent(@Param("criteria") ClientRentCriteria criteria);
}
