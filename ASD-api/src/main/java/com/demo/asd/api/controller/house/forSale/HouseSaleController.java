package com.demo.asd.api.controller.house.forSale;

import com.demo.asd.dataResult.DataResult;
import com.demo.asd.dataResult.DataResults;
import com.demo.asd.model.house.forSale.HouseSaleWithOwnerClientRequest;
import com.demo.asd.model.house.forSale.HouseSaleWithOwnerClientResponse;
import com.demo.asd.pagination.PagingRequest;
import com.demo.asd.pagination.PagingResponse;
import com.demo.asd.service.bizs.house.forSale.HouseBiz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;

@Validated
@RestController
@RequestMapping(value="/v1/house/forSale")
public class HouseSaleController {
    @Autowired
    public HouseBiz houseBiz;

    @PostMapping("/findPageHouseForSale")
    public DataResult<PagingResponse<HouseSaleWithOwnerClientResponse>> findPageHouseForSale(
            @RequestBody PagingRequest<HouseSaleWithOwnerClientRequest> req, HttpServletRequest hReq) throws IllegalAccessException, InstantiationException, UnsupportedEncodingException {
        return DataResults.ok(houseBiz.findPageHouseForSale(req,hReq));
    }
}
