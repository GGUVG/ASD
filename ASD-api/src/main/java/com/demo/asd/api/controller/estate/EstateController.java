package com.demo.asd.api.controller.estate;

import com.demo.asd.dataResult.DataResult;
import com.demo.asd.dataResult.DataResults;
import com.demo.asd.model.estate.EstateRequest;
import com.demo.asd.model.estate.EstateResponse;
import com.demo.asd.service.bizs.estae.EstateBiz;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Validated
@RestController
@RequestMapping(value="/v1/estate")
public class EstateController {

    @Autowired
    public EstateBiz estateBiz;

    /**
     * 获取小区列表
     */
    @ApiOperation(tags = "Estate", value = "findEstateList", httpMethod = "POST",
            notes = "获取小区列表")
    @PostMapping("/findEstateList")
    public DataResult<List<EstateResponse>> findEstateList(@RequestBody EstateRequest request)
    {
        return DataResults.ok(estateBiz.findEstateList(request));
    }

}
