package com.demo.asd.service.bizs.client;

import com.alibaba.excel.metadata.BaseRowModel;
import com.alibaba.excel.support.ExcelTypeEnum;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.demo.asd.base.hierarchies.BaseBiz;
import com.demo.asd.base.hierarchies.BaseService;
import com.demo.asd.beanUtils.BeanUtils;
import com.demo.asd.excel.EasyExcelUtils;
import com.demo.asd.model.client.wantRent.ClientWantRentExRequest;
import com.demo.asd.model.client.wantRent.ClientWantRentExResponse;
import com.demo.asd.pagination.PageConverter;
import com.demo.asd.pagination.Pagination;
import com.demo.asd.pagination.PagingRequest;
import com.demo.asd.pagination.PagingResponse;
import com.demo.asd.service.services.client.ClientWantRentService;
import com.demo.asd.support.model.po.client.wantRent.ClientWantRentExBean;
import com.demo.asd.support.model.po.client.wantRent.ClientWantRentExCriteria;
import com.demo.asd.support.model.po.client.wantRent.ClientWantRentExcelExBean;
import com.demo.asd.support.model.po.staff.StaffCriteria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class ClientWantRentBiz extends BaseBiz<Long, ClientWantRentExBean, ClientWantRentExCriteria, ClientWantRentExRequest, ClientWantRentExResponse>
{
    @Autowired
    public ClientWantRentService clientWantRentService;

    public PagingResponse<ClientWantRentExResponse> findPageClientWantRent(PagingRequest<ClientWantRentExRequest> pag, HttpServletRequest hReq) throws UnsupportedEncodingException, IllegalAccessException, InstantiationException
    {
        ClientWantRentExCriteria criteria= BeanUtils.copy(pag.getCriteria(), this.criteriaClass);
        Cookie[] cookies=hReq.getCookies();
        /*
        for(Cookie cookie:cookies)
        {
            String checkStr="backStaffCookie";
            if(checkStr.equals(cookie.getName()))
            {
                String str1= URLDecoder.decode(cookie.getValue(), "UTF-8");
                JSONObject jsonObject = JSONObject.parseObject(str1);
                StaffCriteria staffCriteria=JSONObject.parseObject(jsonObject.toJSONString(),new TypeReference<StaffCriteria>() {});
                criteria.setClientStaffId(staffCriteria.getStaffId());
            }
        }

         */
        criteria.setClientStaffId((long) 1);
        Pagination pagination =BeanUtils.copy(pag.getPagination(), Pagination.class);
        List<ClientWantRentExBean> beans=clientWantRentService.findClientWantRentByPage(criteria,pagination);
        long count=clientWantRentService.countFindClientWantRentByPage(criteria);
        PagingResponse<ClientWantRentExResponse> response = PageConverter.convert(pagination, ClientWantRentExResponse.class, count, beans);
        return response;
    }

    public String exportFindCLientWantRent(HttpServletResponse hRep, HttpServletRequest hReq, ClientWantRentExRequest condition) throws UnsupportedEncodingException
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
        List<ClientWantRentExBean> beans=clientWantRentService.findClientWantRentRequest(condition);
        List<ClientWantRentExcelExBean> reportBeans=BeanUtils.copyList(beans, ClientWantRentExcelExBean.class);
        Map<String, List<? extends BaseRowModel>> map = new HashMap<>();
        map.put("ClientWantRentEx", reportBeans);
        String fileName = new String(("意向租房客户信息" + new SimpleDateFormat("yyyyMMddHHmmssSSS").format(new Date())).getBytes(), "UTF-8");
        EasyExcelUtils.createExcelStreamMutilByEaysExcel(hRep,fileName, map, ExcelTypeEnum.XLSX);
        return fileName;
    }

    @Override
    public BaseService<Long, ClientWantRentExBean, ClientWantRentExCriteria> getService()
    {
        return clientWantRentService;
    }
}
