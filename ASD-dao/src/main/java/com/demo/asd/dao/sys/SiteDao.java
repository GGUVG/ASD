package com.demo.asd.dao.sys;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
@Mapper
public interface SiteDao {
    public List<String> findProvince();

    public List<String> findCity(@Param("province")String province);

    public List<String> findDistrict(@Param("city")String city);

    public List<String> findStreet(@Param("district")String district);
}
