package com.demo.asd.api.controller.sys;

import com.demo.asd.dataResult.DataResult;
import com.demo.asd.dataResult.DataResults;
import com.demo.asd.service.bizs.sys.SiteBiz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Validated
@RestController
@RequestMapping(value="/v1/sys/Site")
public class SiteController {
    @Autowired
    public SiteBiz siteBiz;

    @PostMapping("/findProvinceList")
    public DataResult<List<String>> findProvinceList()
    {
        return DataResults.ok(siteBiz.findProvince());
    }

    @PostMapping("/findCityList")
    public DataResult<List<String>> findCityList(@RequestBody String province)
    {
        return DataResults.ok(siteBiz.findCity(province));
    }

    @PostMapping("/findDistrictList")
    public DataResult<List<String>> findDistrictList(@RequestBody String city)
    {
        return DataResults.ok(siteBiz.findDistrict(city));
    }

    @PostMapping("/findStreetList")
    public DataResult<List<String>> findStreetList(@RequestBody String district)
    {
        return DataResults.ok(siteBiz.findStreet(district));
    }
}
