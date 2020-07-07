package com.demo.asd.dao.client;

import com.demo.asd.base.hierarchies.CrudDao;
import com.demo.asd.pagination.Pagination;
import com.demo.asd.support.model.po.client.wantRent.ClientWantRentExBean;
import com.demo.asd.support.model.po.client.wantRent.ClientWantRentExCriteria;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper
public interface ClientWantRentDao extends CrudDao<Long, ClientWantRentExBean, ClientWantRentExCriteria>
{
    public List<ClientWantRentExBean> findClientWantRentByPage(@Param("criteria") ClientWantRentExCriteria criteria, @Param("pagination") Pagination pagination);

    public Long countFindClientWantRentByPage(@Param("criteria") ClientWantRentExCriteria criteria);

    public List<ClientWantRentExBean> findClientWantRent(@Param("criteria") ClientWantRentExCriteria criteria);
}
