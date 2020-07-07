package com.demo.asd.service.bizs.client;

import com.alibaba.excel.metadata.BaseRowModel;
import com.alibaba.excel.support.ExcelTypeEnum;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.demo.asd.base.hierarchies.BaseBiz;
import com.demo.asd.base.hierarchies.BaseService;
import com.demo.asd.beanUtils.BeanUtils;
import com.demo.asd.excel.EasyExcelUtils;
import com.demo.asd.model.client.forSale.ClientSaleRequest;
import com.demo.asd.model.client.forSale.ClientSaleResponse;
import com.demo.asd.pagination.PageConverter;
import com.demo.asd.pagination.Pagination;
import com.demo.asd.pagination.PagingRequest;
import com.demo.asd.pagination.PagingResponse;
import com.demo.asd.service.services.client.ClientForSaleService;
import com.demo.asd.support.model.po.client.forSale.ClientSaleBean;
import com.demo.asd.support.model.po.client.forSale.ClientSaleCriteria;
import com.demo.asd.support.model.po.client.forSale.ClientSaleExcelBean;
import com.demo.asd.support.model.po.staff.StaffCriteria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class CLientForSaleBiz extends BaseBiz<Long, ClientSaleBean, ClientSaleCriteria, ClientSaleRequest, ClientSaleResponse>
{
    @Autowired
    public ClientForSaleService clientForSaleService;

    public PagingResponse<ClientSaleResponse> findPageClientSale(PagingRequest<ClientSaleRequest> pag, HttpServletRequest hReq) throws UnsupportedEncodingException, IllegalAccessException, InstantiationException {
        ClientSaleCriteria criteria= BeanUtils.copy(pag.getCriteria(), this.criteriaClass);
        Cookie[] cookies=hReq.getCookies();
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
        Pagination pagination =BeanUtils.copy(pag.getPagination(), Pagination.class);
        List<ClientSaleBean> beans=clientForSaleService.findClientSaleByPage(criteria,pagination);
        long count=clientForSaleService.countFindClientSale(criteria);
        PagingResponse<ClientSaleResponse> response = PageConverter.convert(pagination, ClientSaleResponse.class, count, beans);
        return response;
    }

    public String exportFindCLientSale(HttpServletResponse hRep, HttpServletRequest hReq, ClientSaleRequest condition) throws UnsupportedEncodingException
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
        DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        List<ClientSaleBean> beans=clientForSaleService.findClientSaleRequest(condition);
        List<ClientSaleExcelBean> reportBeans=BeanUtils.copyList(beans, ClientSaleExcelBean.class);
        Map<String, List<? extends BaseRowModel>> map = new HashMap<>();
        map.put("HouseRentEx", reportBeans);
        String fileName = new String(("放售房源客户信息" + new SimpleDateFormat("yyyyMMddHHmmssSSS").format(new Date())).getBytes(), "UTF-8");
        EasyExcelUtils.createExcelStreamMutilByEaysExcel(hRep,fileName, map, ExcelTypeEnum.XLSX);
        return fileName;
    }

    @Override
    public BaseService<Long, ClientSaleBean, ClientSaleCriteria> getService()
    {
        return clientForSaleService;
    }
}
