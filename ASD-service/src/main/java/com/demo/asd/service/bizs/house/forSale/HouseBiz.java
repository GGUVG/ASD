package com.demo.asd.service.bizs.house.forSale;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.demo.asd.base.hierarchies.BaseBiz;
import com.demo.asd.base.hierarchies.BaseService;
import com.demo.asd.beanUtils.BeanUtils;
import com.demo.asd.model.house.forSale.HouseSaleWithOwnerClientRequest;
import com.demo.asd.model.house.forSale.HouseSaleWithOwnerClientResponse;
import com.demo.asd.pagination.*;
import com.demo.asd.service.services.house.HouseSaleService;
import com.demo.asd.support.model.po.house.forSale.*;
import com.demo.asd.support.model.po.staff.StaffCriteria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.List;
import org.slf4j.Logger;
/**
 * 调用asd-service模块/houseSaleService
 * 有关售房业务逻辑处理
 * Created by chency on 2020-05-14.
 */
@Component
public class HouseBiz extends BaseBiz<Long, HouseSaleWithOwnerClientBean, HouseSaleWithOwnerClientCriteria, HouseSaleWithOwnerClientRequest, HouseSaleWithOwnerClientResponse> {
    @Autowired
    public HouseSaleService houseSaleService;

    public PagingResponse<HouseSaleWithOwnerClientResponse> findPageHouseForSale(PagingRequest<HouseSaleWithOwnerClientRequest> pag, HttpServletRequest hReq) throws IllegalAccessException, InstantiationException, UnsupportedEncodingException {
        HouseSaleWithOwnerClientCriteria criteria=BeanUtils.copy(pag.getCriteria(), this.criteriaClass);
        Cookie[] cookies=hReq.getCookies();
        for(Cookie cookie:cookies)
        {
            String checkStr="backStaffCookie";
            if(checkStr.equals(cookie.getName()))//if(checkStr==cookie.getName())判断会失败,String类型别用==
            {
            String str1=URLDecoder.decode(cookie.getValue(), "UTF-8");
            JSONObject jsonObject = JSONObject.parseObject(str1);
            StaffCriteria staffCriteria=JSONObject.parseObject(jsonObject.toJSONString(),new TypeReference<StaffCriteria>() {});
            criteria.setClientStaffId(staffCriteria.getStaffId());
            }
        }
        Pagination pagination =BeanUtils.copy(pag.getPagination(), Pagination.class);
        List<HouseSaleWithOwnerClientBean> beans=houseSaleService.findPageHouseForSale(criteria,pagination);
        long count=houseSaleService.CountfindPageHouseForSale(criteria);
        PagingResponse<HouseSaleWithOwnerClientResponse> response = PageConverter.convert(pagination, HouseSaleWithOwnerClientResponse.class, count, beans);
        return response;
    }

    @Override
    public BaseService<Long, HouseSaleWithOwnerClientBean, HouseSaleWithOwnerClientCriteria> getService() {
        return houseSaleService;
    }
}
