package com.demo.asd.service.bizs.house.forRent;

import com.alibaba.excel.metadata.BaseRowModel;
import com.alibaba.excel.support.ExcelTypeEnum;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.demo.asd.base.hierarchies.BaseBiz;
import com.demo.asd.base.hierarchies.BaseService;
import com.demo.asd.beanUtils.BeanUtils;
import com.demo.asd.excel.EasyExcelUtils;
import com.demo.asd.model.house.forRent.HouseRentExRequest;
import com.demo.asd.model.house.forRent.HouseRentExResponse;
import com.demo.asd.pagination.PageConverter;
import com.demo.asd.pagination.Pagination;
import com.demo.asd.pagination.PagingRequest;
import com.demo.asd.pagination.PagingResponse;
import com.demo.asd.service.services.house.forRent.HouseRentService;
import com.demo.asd.support.model.po.house.forRent.HouseRentExBean;
import com.demo.asd.support.model.po.house.forRent.HouseRentExCriteria;
import com.demo.asd.support.model.po.house.forRent.HouseRentExExcelBean;
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
 * 调用asd-service模块/houseRentService
 * 有关租赁业务逻辑处理
 * Created by chency on 2020-06-19.
 */
@Component
public class HouseRentBiz extends BaseBiz<Long, HouseRentExBean, HouseRentExCriteria, HouseRentExRequest, HouseRentExResponse> {
    @Autowired
    public HouseRentService houseRentService;

    public PagingResponse<HouseRentExResponse> findPageHouseForRent(PagingRequest<HouseRentExRequest> pag, HttpServletRequest hReq) throws IllegalAccessException, InstantiationException, UnsupportedEncodingException {
        HouseRentExCriteria criteria=BeanUtils.copy(pag.getCriteria(), this.criteriaClass);
        Cookie[] cookies=hReq.getCookies();
        for(Cookie cookie:cookies)
        {
            String checkStr="backStaffCookie";
            if(checkStr.equals(cookie.getName()))
            {
            String str1=URLDecoder.decode(cookie.getValue(), "UTF-8");
            JSONObject jsonObject = JSONObject.parseObject(str1);
            StaffCriteria staffCriteria=JSONObject.parseObject(jsonObject.toJSONString(),new TypeReference<StaffCriteria>() {});
            criteria.setClientStaffId(staffCriteria.getStaffId());
            }
        }
        Pagination pagination =BeanUtils.copy(pag.getPagination(), Pagination.class);
        criteria.setTypeCode("HOUSE_TYPE");
        List<HouseRentExBean> beans=houseRentService.findPageHouseForRent(criteria,pagination);
        long count=houseRentService.CountfindPageHouseForRent(criteria);
        PagingResponse<HouseRentExResponse> response = PageConverter.convert(pagination, HouseRentExResponse.class, count, beans);
        return response;
    }

    public String exportFindHouseForRent(HttpServletResponse hRep,HttpServletRequest hReq, HouseRentExRequest condition) throws UnsupportedEncodingException
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
        List<HouseRentExBean> beans=houseRentService.findHouseForRentRequest(condition);
        List<HouseRentExExcelBean> reportBeans=BeanUtils.copyList(beans, HouseRentExExcelBean.class);
        for(int i=0;i<beans.size();i++)
        {
            HouseRentExBean rentExBean=beans.get(i);
            LocalDateTime lastDealTime1= rentExBean.getLastDealTime();
            LocalDateTime lastEnd1=rentExBean.getLastEnd();
            if(lastDealTime1 !=null && lastEnd1 !=null)//不存在交易时间或租赁到期时间其中之一为空的情况
            {
                HouseRentExExcelBean exReportBean =reportBeans.get(i);
                exReportBean.setLastDealTime(df.format(lastDealTime1));
                exReportBean.setLastEnd(df.format(lastEnd1));
            }
        }
        Map<String, List<? extends BaseRowModel>> map = new HashMap<>();
        map.put("HouseRentEx", reportBeans);
        String fileName = new String(("租赁房源消息" + new SimpleDateFormat("yyyyMMddHHmmssSSS").format(new Date())).getBytes(), "UTF-8");
        EasyExcelUtils.createExcelStreamMutilByEaysExcel(hRep,fileName, map, ExcelTypeEnum.XLSX);
        return fileName;
    }

    @Override
    public BaseService<Long, HouseRentExBean, HouseRentExCriteria> getService()
    {
        return houseRentService;
    }
}
