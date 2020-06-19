package com.demo.asd.api.controller.house.forRent;

import com.demo.asd.dataResult.DataResult;
import com.demo.asd.dataResult.DataResults;
import com.demo.asd.model.house.forRent.HouseRentExRequest;
import com.demo.asd.model.house.forRent.HouseRentExResponse;
import com.demo.asd.pagination.PagingRequest;
import com.demo.asd.pagination.PagingResponse;
import com.demo.asd.service.bizs.house.forRent.HouseRentBiz;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;

/**

**/
@Validated
@RestController
@RequestMapping(value="/v1/house/forRent")
public class HouseRentController {
    @Autowired
    public HouseRentBiz houseRentBiz;

    @ApiOperation(tags = "HouseRentExResponse", value = "findPageHouseForRent", httpMethod = "POST",
            notes = "分页查询租赁房源信息")
    @PostMapping("/findPageHouseForRent")
    public DataResult<PagingResponse<HouseRentExResponse>> findPageHouseForSale(
            @RequestBody PagingRequest<HouseRentExRequest> req, HttpServletRequest hReq) throws IllegalAccessException, InstantiationException, UnsupportedEncodingException {
        return DataResults.ok(houseRentBiz.findPageHouseForRent(req,hReq));
    }

    /**
     * 买卖房源信息导出excel
     */
    @ApiOperation(tags = "HouseRentExResponse", value = "exportFindHouseForRent", httpMethod = "POST",
            notes = "租赁房源信息导出excel")
    @PostMapping("/exportFindHouseForRent")
    public void exportFindHouseForSale(HttpServletResponse hRep, HttpServletRequest hReq,@RequestBody HouseRentExRequest condition) throws IllegalAccessException, InstantiationException, UnsupportedEncodingException
    {
        houseRentBiz.exportFindHouseForRent(hRep,hReq,condition);
    }


}
