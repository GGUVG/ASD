package com.demo.asd.service.bizs.staff;

import com.alibaba.fastjson.*;
import com.demo.asd.beanUtils.BeanUtils;
import com.demo.asd.model.staff.StaffRequest;
import com.demo.asd.model.staff.StaffResponse;
import com.demo.asd.service.services.staff.StaffService;
import com.demo.asd.support.model.po.staff.StaffBean;
import com.demo.asd.support.model.po.staff.StaffCriteria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.Arrays;

/**
 * 调用asd-service模块/staffService
 * 有关员工业务逻辑处理
 * Created by chency on 2020-05-14.
 */
@Component
public class StaffBiz implements Serializable {
    @Autowired
    public StaffService staffService;


    public StaffResponse login(StaffRequest req) throws IllegalAccessException, InstantiationException {
        StaffCriteria criteria=new StaffCriteria();
        criteria.setStaffId(req.staffId);
        criteria.setStaffPassword(req.staffPassword);
        StaffBean ret=staffService.login(criteria);
        return BeanUtils.copy(ret,StaffResponse.class);
    }

    /**
     * 设置用户登录cookie
     */
    public void setLoginCookie(StaffResponse staffResp,HttpServletResponse hResp,HttpServletRequest hReq) throws UnsupportedEncodingException {
        String jsonString = JSONObject.toJSONString(staffResp);
        Cookie backStaffCookie=new Cookie("backStaffCookie", URLEncoder.encode(jsonString, "UTF-8"));
        backStaffCookie.setPath("/");
        hResp.addCookie(backStaffCookie);
    }

    //拿cookie换成bean
    public StaffBean getLoginCookie(HttpServletResponse hResp) throws UnsupportedEncodingException {
        return null;
    }

    /**
     * 移除用户登录的cookie
     * @param request
     * @param response
     */
    public void removeAuthCookie(HttpServletRequest request, HttpServletResponse response) {
        Cookie cookie = Arrays.stream(request.getCookies())
                .findFirst()
                .orElse(null);
        if (cookie != null) {
            cookie.setValue("");
            cookie.setMaxAge(0);
            cookie.setPath("/");
            response.addCookie(cookie);
        }
    }


}
