package com.demo.asd.api.controller.house.forRent;

import com.demo.asd.dataResult.DataResult;
import com.demo.asd.dataResult.DataResults;
import com.demo.asd.model.house.forRent.HouseRentExRequest;
import com.demo.asd.model.house.forRent.HouseRentExResponse;
import com.demo.asd.model.house.report.HouseRentSourceApproveRequest;
import com.demo.asd.pagination.PagingRequest;
import com.demo.asd.pagination.PagingResponse;
import com.demo.asd.service.bizs.house.forRent.HouseRentBiz;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
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

    @ApiOperation(tags = "HouseRentSourceApproveBean", value = "reportNewSource", httpMethod = "POST",
            notes = "报备新租赁房源信息")
    @PostMapping("/reportNewSource")
    public DataResult<Integer> reportNewSource(
            @RequestBody HouseRentSourceApproveRequest request, HttpServletRequest hReq) throws IOException
    {
        return DataResults.ok(houseRentBiz.reportNewSource(request,hReq));
    }

    @ApiOperation(tags = "HouseRentSourceApproveBean", value = "reportNewSource", httpMethod = "POST",
            notes = "上传新租赁房源文件")
    @PostMapping("/uploadHouseRentFile")
    public String uploadHouseRentFile(
            @RequestParam("newFile1") MultipartFile newFile,
            @RequestParam("houseEstateId")Long houseEstateId,
            @RequestParam("houseName")String houseName,
            @RequestParam("materialTypeTxt")String materialTypeTxt,
            @RequestParam("houseLocationProvince")String houseLocationProvince,
            @RequestParam("houseLocationCity")String houseLocationCity,
            @RequestParam("houseLocationDistrict")String houseLocationDistrict,
            @RequestParam("houseLocationStreet")String houseLocationStreet,
            @RequestParam("staffId")Long staffId,
            @RequestParam("staffUserName")String staffUserName) throws IOException
    {
        return houseRentBiz.uploadHouseRentFile(newFile,houseEstateId,houseName,materialTypeTxt,houseLocationProvince,houseLocationCity,houseLocationDistrict,houseLocationStreet,staffId,staffUserName);
    }
}
