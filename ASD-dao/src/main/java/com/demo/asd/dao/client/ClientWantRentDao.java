package com.demo.asd.dao.client;

import com.demo.asd.base.hierarchies.CrudDao;
import com.demo.asd.pagination.Pagination;
import com.demo.asd.support.model.po.client.wantRent.ClientWantRentBean;
import com.demo.asd.support.model.po.client.wantRent.ClientWantRentCriteria;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper
public interface ClientWantRentDao extends CrudDao<Long, ClientWantRentBean, ClientWantRentCriteria>
{
    public List<ClientWantRentBean> findClientWantRent(@Param("criteria") ClientWantRentCriteria criteria, @Param("pagination") Pagination pagination);

    public Long countFindClientWantRent(@Param("criteria") ClientWantRentCriteria criteria);
}
