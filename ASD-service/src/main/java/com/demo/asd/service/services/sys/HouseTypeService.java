package com.demo.asd.service.services.sys;

import com.demo.asd.dao.sys.HouseTypeDao;
import com.demo.asd.support.model.po.sys.HouseType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HouseTypeService {
    @Autowired
    public HouseTypeDao houseTypeDao;

    public List<HouseType> findHouseType(String typeCode)
    {
        return houseTypeDao.findHouseType(typeCode);
    }
}
