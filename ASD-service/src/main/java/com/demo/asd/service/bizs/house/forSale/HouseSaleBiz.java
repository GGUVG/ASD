package com.demo.asd.service.bizs.house.forSale;

import com.alibaba.excel.metadata.BaseRowModel;
import com.alibaba.excel.support.ExcelTypeEnum;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.demo.asd.base.hierarchies.BaseBiz;
import com.demo.asd.base.hierarchies.BaseService;
import com.demo.asd.beanUtils.BeanUtils;
import com.demo.asd.excel.EasyExcelUtils;
import com.demo.asd.model.house.forSale.HouseSaleWithOwnerClientRequest;
import com.demo.asd.model.house.forSale.HouseSaleWithOwnerClientResponse;

import com.demo.asd.pagination.*;
import com.demo.asd.service.services.house.forSale.HouseSaleService;
import com.demo.asd.support.model.po.house.forSale.*;
import com.demo.asd.support.model.po.staff.StaffCriteria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 调用asd-service模块/houseSaleService
 * 有关售房业务逻辑处理
 * Created by chency on 2020-05-14.
 */
@Component
public class HouseSaleBiz extends BaseBiz<Long, HouseSaleWithOwnerClientBean, HouseSaleWithOwnerClientCriteria, HouseSaleWithOwnerClientRequest, HouseSaleWithOwnerClientResponse> {
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
        criteria.setTypeCode("HOUSE_TYPE");
        List<HouseSaleWithOwnerClientBean> beans=houseSaleService.findPageHouseForSale(criteria,pagination);
        long count=houseSaleService.CountfindPageHouseForSale(criteria);
        PagingResponse<HouseSaleWithOwnerClientResponse> response = PageConverter.convert(pagination, HouseSaleWithOwnerClientResponse.class, count, beans);
        return response;
    }

    public String exportFindPageHouseForSale(HttpServletResponse hRep,HttpServletRequest hReq, HouseSaleWithOwnerClientRequest condition) throws UnsupportedEncodingException
    {
        Cookie[] cookies=hReq.getCookies();
        for(Cookie cookie:cookies)
        {
            String checkStr="backStaffCookie";
            if(checkStr.equals(cookie.getName()))
            {
                String str1=URLDecoder.decode(cookie.getValue(), "UTF-8");
                JSONObject jsonObject = JSONObject.parseObject(str1);
                StaffCriteria staffCriteria=JSONObject.parseObject(jsonObject.toJSONString(),new TypeReference<StaffCriteria>() {});
                condition.setClientStaffId(staffCriteria.getStaffId());
            }
        }
        condition.setTypeCode("HOUSE_TYPE");
        DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        List<HouseSaleWithOwnerClientBean> beans=houseSaleService.findHouseForSale(condition);
        List<HouseSaleWithOwnerClientReportBean> reportBeans=BeanUtils.copyList(beans, HouseSaleWithOwnerClientReportBean.class);
        for(int i=0;i<beans.size();i++)
        {
            HouseSaleWithOwnerClientBean hB=beans.get(i);
            LocalDateTime time1= hB.getDealTime();
            if(time1 !=null)
            {
                HouseSaleWithOwnerClientReportBean hRB =reportBeans.get(i);
                hRB.setDealTime(df.format(time1));
            }
        }
        Map<String, List<? extends BaseRowModel>> map = new HashMap<>();
        map.put("HouseSaleWithClient", reportBeans);
        String fileName = new String(("买卖房源消息" + new SimpleDateFormat("yyyyMMddHHmmssSSS").format(new Date())).getBytes(), "UTF-8");
        EasyExcelUtils.createExcelStreamMutilByEaysExcel(hRep,fileName, map, ExcelTypeEnum.XLSX);
        return fileName;
    }

    @Override
    public BaseService<Long, HouseSaleWithOwnerClientBean, HouseSaleWithOwnerClientCriteria> getService() {
        return houseSaleService;
    }
}
