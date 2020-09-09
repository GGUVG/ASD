package com.demo.asd.api.controller.sys;

import com.demo.asd.dataResult.DataResult;
import com.demo.asd.dataResult.DataResults;
import com.demo.asd.model.staff.StaffResponse;
import com.demo.asd.service.bizs.staff.StaffBiz;
import com.demo.asd.service.bizs.sys.UserBiz;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@Validated
@RestController
@RequestMapping(value="/v1/sys/user")
public class UserController
{
    @Autowired
    public StaffBiz staffBiz;

    @Autowired
    public UserBiz userBiz;

    @ApiOperation(tags = "StaffResponse", value = "getCurrentUser", httpMethod = "POST",
            notes = "获取当前登陆者信息")
    @PostMapping("/getCurrentUser")
    public DataResult<StaffResponse> getCurrentUser(HttpServletRequest hReq) throws IOException
    {
        return DataResults.ok(userBiz.getCurrentUser(hReq));
    }
}
