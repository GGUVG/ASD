package com.demo.asd.service.bizs.sys;

import com.demo.asd.service.services.sys.SiteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.io.Serializable;
import java.util.List;

/**
 * 省市级
 * Created by chency on 2020-06-02.
 */
@Component
public class SiteBiz implements Serializable {
    @Autowired
    public SiteService siteService;

    public List<String> findProvince()
    {
        return siteService.findProvince();
    }

    public List<String> findCity(String province)
    {
        return siteService.findCity(province);
    }

    public List<String> findDistrict(String city)
    {
        return siteService.findDistrict(city);
    }

    public List<String> findStreet(String district)
    {
        return siteService.findStreet(district);
    }
}
