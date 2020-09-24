package com.demo.asd.api.controller.welfare;

import com.demo.asd.dataResult.DataResult;
import com.demo.asd.dataResult.DataResults;
import com.demo.asd.model.ModifyResponse;
import com.demo.asd.model.welfare.*;
import com.demo.asd.pagination.PagingRequest;
import com.demo.asd.pagination.PagingResponse;
import com.demo.asd.service.bizs.welfare.WelfareBiz;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

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
    @ApiOperation(tags = "WelfareImg", value = "findWelfareImgByPage", httpMethod = "POST",
            notes = "在文章里分页显示图片")
    @PostMapping("/findWelfareImgByPage")
    public DataResult<PagingResponse<WelfareImgExResponse>> findWelfareImgByPage(@RequestBody PagingRequest<WelfareImgExRequest> req) throws IllegalAccessException, InstantiationException
    {
        return DataResults.ok(welfareBiz.findImgByPage(req));
    }

    /**
     * 查询文章列表
     */
    @ApiOperation(tags = "WelfareArticle", value = "findArticleByPage", httpMethod = "POST",
            notes = "查询文章列表")
    @PostMapping("/findArticleByPage")
    public DataResult<PagingResponse<WelfareArticleExResponse>> findArticleByPage(@RequestBody PagingRequest<WelfareArticleExRequest> req) throws IllegalAccessException, InstantiationException
    {
        return DataResults.ok(welfareBiz.findArticleByPage(req));
    }

    /**
     * 上传新文章
     */
    @ApiOperation(tags = "WelfareArticle", value = "submitNewArticle", httpMethod = "POST",
            notes = "新增文章")
    @PostMapping("/submitNewArticle")
    public DataResult<ModifyResponse> submitNewArticle(@RequestBody WelfareArticleExRequest request)
    {
        return DataResults.ok(welfareBiz.submitNewArticle(request));
    }

    @ApiOperation(tags = "WelfareImg", value = "uploadNewImg", httpMethod = "POST",
            notes = "新增图片")
    @PostMapping("/submitNewImg")
    public DataResult<ModifyResponse> submitNewImg(@RequestBody WelfareImgExRequest request)
    {
        return DataResults.ok(welfareBiz.submitNewImg(request));
    }

    @ApiOperation(tags = "WelfareImg", value = "uploadNewImg", httpMethod = "POST",
            notes = "上传图片")
    @PostMapping("/uploadNewImg")
    public DataResult<ModifyResponse> uploadNewImg(@RequestParam("newFile1") MultipartFile newFile,
                                      @RequestParam("houseEstateId")Long houseEstateId) throws IOException {
        return DataResults.ok(welfareBiz.uploadNewImg(newFile));
    }

    /**
     * 获取出版商信息
     */
    @ApiOperation(tags = "WelfareArticle", value = "getPublishByCode", httpMethod = "POST",
            notes = "获取出版商信息")
    @PostMapping("/getPublishByCode")
    public DataResult<List<PublishResponse>> getPublishByCode(@RequestBody PublishRequest req)
    {
        return DataResults.ok(welfareBiz.getPublishByCode(req));
    }
}
