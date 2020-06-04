package com.demo.asd.service.services.sys;

import com.demo.asd.dao.sys.SiteDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SiteService {
    @Autowired
    public SiteDao siteDao;

    public List<String> findProvince()
    {
        return siteDao.findProvince();
    }

    public List<String> findCity(String province)
    {
        return siteDao.findCity(province);
    }

    public List<String> findDistrict(String city)
    {
        return siteDao.findDistrict(city);
    }

    public List<String> findStreet(String district)
    {
        return siteDao.findStreet(district);
    }
}
