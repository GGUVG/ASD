package com.demo.asd.api.controller.forTest;

import com.demo.asd.dataResult.DataResult;
import com.demo.asd.dataResult.DataResults;
import com.demo.asd.service.bizs.staff.StaffBiz;
import com.demo.asd.service.bizs.test.TestBiz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@Validated
@RestController
@RequestMapping(value="/v1/testApi")
public class DevelopmentTestController {
    @Autowired
    public TestBiz testBiz;

    @Autowired
    public StaffBiz staffBiz;
    @PostMapping("/test1")
    public DataResult<String> msgSendForTest()
    {
        String s1="helloWorld";
        return DataResults.ok(s1);
    }

    @PostMapping("/testConnectMysql")
    public DataResult<String> testConnectMysql()
    {
        String s1=testBiz.testConnectSQL();
        return DataResults.ok(s1);
    }


}
