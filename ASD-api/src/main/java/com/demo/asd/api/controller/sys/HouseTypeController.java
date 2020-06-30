package com.demo.asd.api.controller.sys;

import com.demo.asd.dataResult.DataResult;
import com.demo.asd.dataResult.DataResults;
import com.demo.asd.service.bizs.sys.HouseTypeBiz;
import com.demo.asd.support.model.po.sys.HouseType;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Validated
@RestController
@RequestMapping(value="/v1/sys/HouseType")
public class HouseTypeController {
    @Autowired
    public HouseTypeBiz houseTypeBiz;

    /**
     * 查询房屋类别列表HouseType
     */
    @ApiOperation(tags = "HouseType", value = "findHouseType", httpMethod = "POST",
            notes = "查询房屋类别列表HouseType")
    @PostMapping("/findHouseType")
    public DataResult<List<HouseType>> findHouseType()
    {
        return DataResults.ok(houseTypeBiz.findHouseType());
    }
}
