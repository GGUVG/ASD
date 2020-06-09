package com.demo.asd.dao.house.forRent;

import com.demo.asd.base.hierarchies.CrudDao;
import com.demo.asd.pagination.Pagination;
import com.demo.asd.support.model.po.house.forSale.HouseSaleWithOwnerClientBean;
import com.demo.asd.support.model.po.house.forSale.HouseSaleWithOwnerClientCriteria;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper
public interface HouseRentDao //extends CrudDao<Long, HouseRentBoBean, HouseRentBoClientCriteria>
{

}
