package com.demo.asd.service.bizs.test;

import com.demo.asd.service.services.test.TestService;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Getter
@Component
public class TestBiz {


    @Autowired
    public TestService testService;

    public String testConnectSQL()
    {
        return testService.testConnectSQL();
    }

    /*
    public PagingResponse<MdDealerResponse> fuzzyQuery(PagingRequest<MdDealerRequest> pag)
    {
        MdDealerCriteria criteria= BeanUtils.copy(pag.getCriteria(), this.criteriaClass);
        Pagination pagination = (Pagination)BeanUtils.copy(pag.getPagination(), Pagination.class);
        List<MdDealerBean> beans=mdDealerService.findPageFuzzyByMdDealer(criteria , pagination);
        long count=mdDealerService.fuzzyQueryCount(criteria);
        PagingResponse<MdDealerResponse> response = PageConverter.convert(pagination, MdDealerResponse.class, count, beans);
        return response;
    }
     */
}
