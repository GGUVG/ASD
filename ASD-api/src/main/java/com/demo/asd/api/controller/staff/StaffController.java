package com.demo.asd.api.controller.staff;

import com.alibaba.fastjson.JSONObject;
import com.demo.asd.dataResult.DataResult;
import com.demo.asd.dataResult.DataResults;
import com.demo.asd.model.staff.StaffRequest;
import com.demo.asd.model.staff.StaffResponse;
import com.demo.asd.service.bizs.staff.StaffBiz;
import com.demo.asd.support.model.po.staff.StaffBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.Objects;

@Validated
@RestController
@RequestMapping(value="/v1/staff")
public class StaffController {

    @Autowired
    public StaffBiz staffBiz;

    @PostMapping("/staffLogin")
    public DataResult<StaffResponse> staffLogin(@RequestBody StaffRequest req,HttpServletResponse hRep,HttpServletRequest hReq) throws InstantiationException, IllegalAccessException, UnsupportedEncodingException {
        StaffResponse rep=staffBiz.login(req);
        if(rep!=null)
        {
            staffBiz.setLoginCookie(rep,hRep, hReq);
            return DataResults.ok(rep);
        }else
        return DataResults.fail("用户不存在或密码错误");
    }

    @PostMapping("/getCookieLogin")
    public DataResult<StaffBean> getCookieLogin(@RequestBody StaffRequest req, HttpServletResponse hRep, HttpServletRequest hReq) throws InstantiationException, IllegalAccessException, UnsupportedEncodingException {
        StaffResponse rep=staffBiz.login(req);
        if(rep!=null)
        {
            return DataResults.ok(staffBiz.getLoginCookie(hRep));
        }else
            return DataResults.fail("?");
    }


}
