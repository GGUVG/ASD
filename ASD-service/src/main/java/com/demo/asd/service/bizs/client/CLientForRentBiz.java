package com.demo.asd.service.bizs.client;

import com.demo.asd.base.hierarchies.BaseBiz;
import com.demo.asd.base.hierarchies.BaseService;
import com.demo.asd.beanUtils.BeanUtils;
import com.demo.asd.model.client.forRent.ClientRentRequest;
import com.demo.asd.model.client.forRent.ClientRentResponse;
import com.demo.asd.pagination.PageConverter;
import com.demo.asd.pagination.Pagination;
import com.demo.asd.pagination.PagingRequest;
import com.demo.asd.pagination.PagingResponse;
import com.demo.asd.service.services.client.ClientForRentService;
import com.demo.asd.support.model.po.client.forRent.ClientRentBean;
import com.demo.asd.support.model.po.client.forRent.ClientRentCriteria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;
import java.util.List;

@Component
public class CLientForRentBiz extends BaseBiz<Long, ClientRentBean, ClientRentCriteria, ClientRentRequest, ClientRentResponse>
{
    @Autowired
    public ClientForRentService clientForRentService;

    public PagingResponse<ClientRentResponse> findPageClientRent(PagingRequest<ClientRentRequest> pag, HttpServletRequest hReq) throws UnsupportedEncodingException, IllegalAccessException, InstantiationException {
        ClientRentCriteria criteria= BeanUtils.copy(pag.getCriteria(), this.criteriaClass);
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
        List<ClientRentBean> beans=clientForRentService.findClientRent(criteria,pagination);
        long count=clientForRentService.countFindClientRent(criteria);
        PagingResponse<ClientRentResponse> response = PageConverter.convert(pagination, ClientRentResponse.class, count, beans);
        return response;
    }

    @Override
    public BaseService<Long, ClientRentBean, ClientRentCriteria> getService()
    {
        return clientForRentService;
    }
}
