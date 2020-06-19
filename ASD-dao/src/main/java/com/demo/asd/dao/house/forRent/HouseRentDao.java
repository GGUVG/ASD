package com.demo.asd.dao.house.forRent;

import com.demo.asd.base.hierarchies.CrudDao;
import com.demo.asd.pagination.Pagination;
import com.demo.asd.support.model.po.house.forRent.HouseRentExBean;
import com.demo.asd.support.model.po.house.forRent.HouseRentExCriteria;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper
public interface HouseRentDao extends CrudDao<Long, HouseRentExBean, HouseRentExCriteria>
{
    //查询当前登录员工下所属租赁房源并分页
    public List<HouseRentExBean> findPageHouseForRent(@Param("criteria") HouseRentExCriteria criteria, @Param("pagination") Pagination pagination);

    //分页计数用
    public long CountfindPageHouseForRent(@Param("criteria") HouseRentExCriteria criteria);

    //查询当前登录员工下所属租赁房源不分页
    public List<HouseRentExBean> findHouseForRent(@Param("criteria") HouseRentExCriteria criteria);
}
