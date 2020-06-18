package com.demo.asd.dao.sys;

import com.demo.asd.support.model.po.sys.HouseType;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper
public interface HouseTypeDao {
    public List<HouseType> findHouseType(@Param("typeCode")String typeCode);
}
