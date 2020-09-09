package com.demo.asd.service.services.sys;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.demo.asd.model.staff.StaffResponse;
import com.demo.asd.support.model.po.staff.StaffCriteria;
import org.springframework.stereotype.Service;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

@Service
public class UserContextService
{
    public StaffResponse getCurrentUserService(HttpServletRequest hReq) throws UnsupportedEncodingException {
        Cookie[] cookies=hReq.getCookies();
        StaffResponse staffResponse=new StaffResponse();
        for(Cookie cookie:cookies)
        {
            String checkStr="backStaffCookie";
            if(checkStr.equals(cookie.getName()))
            {
                String str1= URLDecoder.decode(cookie.getValue(), "UTF-8");
                JSONObject jsonObject = JSONObject.parseObject(str1);
                StaffCriteria staffCriteria=JSONObject.parseObject(jsonObject.toJSONString(),new TypeReference<StaffCriteria>() {});
                staffResponse.setStaffId(staffCriteria.getStaffId());
            }
        }
        return staffResponse;
    }
}
