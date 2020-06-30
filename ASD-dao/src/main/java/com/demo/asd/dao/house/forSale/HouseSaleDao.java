package com.demo.asd.dao.house.forSale;

import com.demo.asd.base.hierarchies.CrudDao;
import com.demo.asd.support.model.po.house.forSale.*;
import com.demo.asd.support.model.po.house.report.HouseSaleSourceApproveBean;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import com.demo.asd.pagination.Pagination;
import java.util.List;

@Component
@Mapper
public interface HouseSaleDao extends CrudDao<Long, HouseSaleWithOwnerClientBean, HouseSaleWithOwnerClientCriteria> {
    //查询当前登录员工下所属房源并分页
    public List<HouseSaleWithOwnerClientBean> findPageHouseForSale(@Param("criteria") HouseSaleWithOwnerClientCriteria criteria, @Param("pagination") Pagination pagination);

    //分页计数用
    public long CountfindPageHouseForSale(@Param("criteria") HouseSaleWithOwnerClientCriteria criteria);

    //查询当前登录员工下所属房源不分页
    public List<HouseSaleWithOwnerClientBean> findHouseForSale(@Param("criteria") HouseSaleWithOwnerClientCriteria criteria);

    //报备新房源
    public Integer reportNewSource(@Param("bean") HouseSaleSourceApproveBean bean);
}
