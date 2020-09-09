package com.demo.asd.service.bizs.sys;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.demo.asd.model.staff.StaffResponse;
import com.demo.asd.service.services.sys.UserContextService;
import com.demo.asd.support.model.po.staff.StaffCriteria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

@Component
public class UserBiz
{
    @Autowired
    public UserContextService userContextService;

    //获取登陆者信息
    public StaffResponse getCurrentUser(HttpServletRequest hReq) throws UnsupportedEncodingException
    {
        return userContextService.getCurrentUserService(hReq);
    }
}
