package com.demo.asd.api.controller.welfare;

import com.demo.asd.dataResult.DataResult;
import com.demo.asd.dataResult.DataResults;
import com.demo.asd.model.welfare.WelfareImgExRequest;
import com.demo.asd.model.welfare.WelfareImgExResponse;
import com.demo.asd.pagination.PagingRequest;
import com.demo.asd.pagination.PagingResponse;
import com.demo.asd.service.bizs.welfare.WelfareBiz;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Validated
@RestController
@RequestMapping(value="/v1/welfare")
public class WelfareController
{
    @Autowired
    public WelfareBiz welfareBiz;

    /**
     * 在文章里分页显示图片
     */
    @ApiOperation(tags = "Welfare", value = "findPage", httpMethod = "POST",
            notes = "在文章里分页显示图片")
    @PostMapping("/findWelfareImgByPage")
    public DataResult<PagingResponse<WelfareImgExResponse>> findWelfareImgByPage(@RequestBody PagingRequest<WelfareImgExRequest> req) throws IllegalAccessException, InstantiationException
    {
        return DataResults.ok(welfareBiz.findImgByPage(req));
    }
}
