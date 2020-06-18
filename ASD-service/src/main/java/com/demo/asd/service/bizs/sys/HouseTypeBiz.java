package com.demo.asd.service.bizs.sys;

import com.demo.asd.service.services.sys.HouseTypeService;
import com.demo.asd.support.model.po.sys.HouseType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 通过码表查询房屋类型列表
 * create by chenCy at 2020/06/17
 */
@Component
public class HouseTypeBiz {
    @Autowired
    public HouseTypeService houseTypeService;

    public List<HouseType> findHouseType()
    {
        String typeCode="HOUSE_TYPE";
        return houseTypeService.findHouseType(typeCode);
    }
}
