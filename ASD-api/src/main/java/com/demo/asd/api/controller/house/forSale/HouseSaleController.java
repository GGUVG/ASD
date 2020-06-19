package com.demo.asd.api.controller.house.forSale;

import com.demo.asd.dataResult.DataResult;
import com.demo.asd.dataResult.DataResults;
import com.demo.asd.model.house.forSale.HouseSaleWithOwnerClientRequest;
import com.demo.asd.model.house.forSale.HouseSaleWithOwnerClientResponse;
import com.demo.asd.pagination.PagingRequest;
import com.demo.asd.pagination.PagingResponse;
import com.demo.asd.service.bizs.house.forSale.HouseSaleBiz;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;
/**
                       .::::.
                     .::::::::.
                   :::::::::::
                 ..:::::::::::'
              '::::::::::::'
                .::::::::::
           '::::::::::::::..
                ..::::::::::::.
              ``::::::::::::::::
               ::::``:::::::::'        .:::.
              ::::'   ':::::'       .::::::::.
            .::::'      ::::     .:::::::'::::.
           .:::'       :::::  .:::::::::' ':::::.
          .::'        :::::.:::::::::'      ':::::.
         .::'         ::::::::::::::'         ``::::.
     ...:::           ::::::::::::'              ``::.
    ```` ':.          ':::::::::'                  ::::..
                       '.:::::'                    ':'````..
**/
@Validated
@RestController
@RequestMapping(value="/v1/house/forSale")
public class HouseSaleController {
    @Autowired
    public HouseSaleBiz houseSaleBiz;

    @ApiOperation(tags = "HouseSaleWithOwnerClient", value = "findPageHouseForSale", httpMethod = "POST",
            notes = "分页查询买卖房源信息")
    @PostMapping("/findPageHouseForSale")
    public DataResult<PagingResponse<HouseSaleWithOwnerClientResponse>> findPageHouseForSale(
            @RequestBody PagingRequest<HouseSaleWithOwnerClientRequest> req, HttpServletRequest hReq) throws IllegalAccessException, InstantiationException, UnsupportedEncodingException {
        return DataResults.ok(houseSaleBiz.findPageHouseForSale(req,hReq));
    }

    /**
     * 买卖房源信息导出excel
     */
    @ApiOperation(tags = "HouseSaleClientResponse", value = "exportFindHouseForSale", httpMethod = "POST",
            notes = "买卖房源信息导出excel")
    @PostMapping("/exportFindHouseForSale")
    public void exportFindHouseForSale(HttpServletResponse hRep, HttpServletRequest hReq,@RequestBody HouseSaleWithOwnerClientRequest condition) throws IllegalAccessException, InstantiationException, UnsupportedEncodingException
    {
        houseSaleBiz.exportFindPageHouseForSale(hRep,hReq,condition);
    }


}
