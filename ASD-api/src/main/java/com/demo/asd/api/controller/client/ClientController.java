package com.demo.asd.api.controller.client;

import com.demo.asd.dataResult.DataResult;
import com.demo.asd.dataResult.DataResults;
import com.demo.asd.model.client.forRent.ClientRentRequest;
import com.demo.asd.model.client.forRent.ClientRentResponse;
import com.demo.asd.model.client.forSale.ClientSaleRequest;
import com.demo.asd.model.client.forSale.ClientSaleResponse;
import com.demo.asd.pagination.PagingRequest;
import com.demo.asd.pagination.PagingResponse;
import com.demo.asd.service.bizs.client.CLientForRentBiz;
import com.demo.asd.service.bizs.client.CLientForSaleBiz;
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
import java.util.List;

@Validated
@RestController
@RequestMapping(value="/v1/client")
public class ClientController {

    @Autowired
    public CLientForSaleBiz cLientForSaleBiz;

    @Autowired
    public CLientForRentBiz cLientForRentBiz;

    /**
     * 获取出售房源客户列表
     */
    @ApiOperation(tags = "ClientForSale", value = "findPageClientSale", httpMethod = "POST",
            notes = "获取出售房源客户列表")
    @PostMapping("/findPageClientSale")
    public DataResult<PagingResponse<ClientSaleResponse>> findPageClientSale(@RequestBody PagingRequest<ClientSaleRequest> req, HttpServletRequest hReq) throws IllegalAccessException, UnsupportedEncodingException, InstantiationException
    {
        return DataResults.ok(cLientForSaleBiz.findPageClientSale(req,hReq));
    }

    /**
     * 获取出租房源客户列表
     */
    @ApiOperation(tags = "ClientForRent", value = "findPageClientRent", httpMethod = "POST",
            notes = "获取出租房源客户列表")
    @PostMapping("/findPageClientRent")
    public DataResult<PagingResponse<ClientRentResponse>> findPageClientRent(@RequestBody PagingRequest<ClientRentRequest> req, HttpServletRequest hReq) throws IllegalAccessException, UnsupportedEncodingException, InstantiationException
    {
        return DataResults.ok(cLientForRentBiz.findPageClientRent(req,hReq));
    }

    /**
     *出售房源客户列表导出excel
     */
    @ApiOperation(tags = "ClientRentExcelBean", value = "exportFindCLientSale", httpMethod = "POST",
            notes = "出售房源客户列表导出excel")
    @PostMapping("/exportFindCLientSale")
    public void exportFindCLientSale(HttpServletResponse hRep, HttpServletRequest hReq, @RequestBody ClientSaleRequest condition) throws UnsupportedEncodingException
    {
        cLientForSaleBiz.exportFindCLientSale(hRep,hReq,condition);
    }

    /**
     *出租房源客户列表导出excel
     */
    @ApiOperation(tags = "ClientRentExcelBean", value = "exportFindCLientRent", httpMethod = "POST",
            notes = "出租房源客户列表导出excel")
    @PostMapping("/exportFindCLientRent")
    public void exportFindCLientRent(HttpServletResponse hRep, HttpServletRequest hReq, @RequestBody ClientRentRequest condition) throws UnsupportedEncodingException
    {
        cLientForRentBiz.exportFindCLientRent(hRep,hReq,condition);
    }
}
