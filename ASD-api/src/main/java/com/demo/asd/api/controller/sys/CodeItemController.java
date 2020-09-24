package com.demo.asd.api.controller.sys;

import com.demo.asd.dataResult.DataResult;
import com.demo.asd.dataResult.DataResults;
import com.demo.asd.model.sys.CodeItemRequest;
import com.demo.asd.service.bizs.sys.CodeItemBiz;
import com.demo.asd.support.model.po.sys.CodeItemBean;
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
@RequestMapping(value="/v1/sys/CodeItem")
public class CodeItemController
{
    @Autowired
    public CodeItemBiz codeItemBiz;

    /**
     * 根据typeCode,itemCode,itemName模糊查询码表list
     */
    @ApiOperation(tags = "CodeItem", value = "getCodeItemList", httpMethod = "POST",
            notes = "根据typeCode,itemCode,itemName模糊查询码表")
    @PostMapping("/getCodeItemList")
    public DataResult<List<CodeItemBean>> getCodeItemList(@RequestBody CodeItemRequest request)
    {
        return DataResults.ok(codeItemBiz.getCodeItemList(request));
    }
}
