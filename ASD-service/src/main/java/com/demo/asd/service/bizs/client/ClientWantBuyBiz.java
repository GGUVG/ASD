package com.demo.asd.service.bizs.client;

import com.alibaba.excel.metadata.BaseRowModel;
import com.alibaba.excel.support.ExcelTypeEnum;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.demo.asd.base.hierarchies.BaseBiz;
import com.demo.asd.base.hierarchies.BaseService;
import com.demo.asd.beanUtils.BeanUtils;
import com.demo.asd.excel.EasyExcelUtils;
import com.demo.asd.model.client.wantBuy.ClientWantBuyExRequest;
import com.demo.asd.model.client.wantBuy.ClientWantBuyExResponse;
import com.demo.asd.pagination.PageConverter;
import com.demo.asd.pagination.Pagination;
import com.demo.asd.pagination.PagingRequest;
import com.demo.asd.pagination.PagingResponse;
import com.demo.asd.service.services.client.ClientWantBuyService;
import com.demo.asd.support.model.po.client.wantBuy.ClientWantBuyExBean;
import com.demo.asd.support.model.po.client.wantBuy.ClientWantBuyExCriteria;
import com.demo.asd.support.model.po.client.wantBuy.ClientWantBuyExcelExBean;
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
public class ClientWantBuyBiz extends BaseBiz<Long, ClientWantBuyExBean, ClientWantBuyExCriteria, ClientWantBuyExRequest, ClientWantBuyExResponse>
{
    @Autowired
    public ClientWantBuyService clientWantBuyService;

    public PagingResponse<ClientWantBuyExResponse> findPageClientWantBuy(PagingRequest<ClientWantBuyExRequest> pag, HttpServletRequest hReq) throws UnsupportedEncodingException, IllegalAccessException, InstantiationException
    {
        ClientWantBuyExCriteria criteria= BeanUtils.copy(pag.getCriteria(), this.criteriaClass);
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
        List<ClientWantBuyExBean> beans=clientWantBuyService.findClientWantBuyByPage(criteria,pagination);
        long count=clientWantBuyService.countFindClientWantBuyByPage(criteria);
        PagingResponse<ClientWantBuyExResponse> response = PageConverter.convert(pagination, ClientWantBuyExResponse.class, count, beans);
        return response;
    }

    public String exportFindCLientWantBuy(HttpServletResponse hRep, HttpServletRequest hReq, ClientWantBuyExRequest condition) throws UnsupportedEncodingException
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
        List<ClientWantBuyExBean> beans=clientWantBuyService.findClientWantBuy(condition);
        List<ClientWantBuyExcelExBean> reportBeans=BeanUtils.copyList(beans, ClientWantBuyExcelExBean.class);
        Map<String, List<? extends BaseRowModel>> map = new HashMap<>();
        map.put("CLientWantBuyEx", reportBeans);
        String fileName = new String(("意向买房客户信息" + new SimpleDateFormat("yyyyMMddHHmmssSSS").format(new Date())).getBytes(), "UTF-8");
        EasyExcelUtils.createExcelStreamMutilByEaysExcel(hRep,fileName, map, ExcelTypeEnum.XLSX);
        return fileName;
    }

    @Override
    public BaseService<Long, ClientWantBuyExBean, ClientWantBuyExCriteria> getService()
    {
        return clientWantBuyService;
    }
}
