package com.demo.asd.service.bizs.client;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.demo.asd.base.hierarchies.BaseBiz;
import com.demo.asd.base.hierarchies.BaseService;
import com.demo.asd.beanUtils.BeanUtils;
import com.demo.asd.model.client.forSale.ClientSaleRequest;
import com.demo.asd.model.client.forSale.ClientSaleResponse;
import com.demo.asd.pagination.PageConverter;
import com.demo.asd.pagination.Pagination;
import com.demo.asd.pagination.PagingRequest;
import com.demo.asd.pagination.PagingResponse;
import com.demo.asd.service.services.client.ClientForSaleService;
import com.demo.asd.support.model.po.client.forSale.ClientSaleBean;
import com.demo.asd.support.model.po.client.forSale.ClientSaleCriteria;
import com.demo.asd.support.model.po.staff.StaffCriteria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.List;

@Component
public class CLientForSaleBiz extends BaseBiz<Long, ClientSaleBean, ClientSaleCriteria, ClientSaleRequest, ClientSaleResponse>
{
    @Autowired
    public ClientForSaleService clientForSaleService;

    public PagingResponse<ClientSaleResponse> findPageClientSale(PagingRequest<ClientSaleRequest> pag, HttpServletRequest hReq) throws UnsupportedEncodingException, IllegalAccessException, InstantiationException {
        ClientSaleCriteria criteria= BeanUtils.copy(pag.getCriteria(), this.criteriaClass);
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
        List<ClientSaleBean> beans=clientForSaleService.findClientSale(criteria,pagination);
        long count=clientForSaleService.countFindClientSale(criteria);
        PagingResponse<ClientSaleResponse> response = PageConverter.convert(pagination, ClientSaleResponse.class, count, beans);
        return response;
    }

    @Override
    public BaseService<Long, ClientSaleBean, ClientSaleCriteria> getService()
    {
        return clientForSaleService;
    }
}
