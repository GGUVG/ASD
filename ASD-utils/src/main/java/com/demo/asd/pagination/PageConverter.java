package com.demo.asd.pagination;

import com.demo.asd.base.entity.BaseBean;
import com.demo.asd.base.entity.BaseCriteria;
import com.demo.asd.beanUtils.BeanUtils;

import java.util.List;

public abstract class PageConverter {
    public PageConverter() {
    }

    public static <T> PagingResponse<T> convert(Pagination pagination, Class<T> respClass, long count, List<? extends BaseBean> rows) throws InstantiationException, IllegalAccessException {
        Pagination newPaging = (Pagination) BeanUtils.copy(pagination, Pagination.class);
        newPaging.setTotalSize((int)count);
        PagingResponse<T> response = new PagingResponse();
        response.setPagination(newPaging);
        response.setRows(BeanUtils.copyList(rows, respClass));
        return response;
    }

    public static <T> PagingResponse<T> convert(Pagination pagination, Class<T> respClass, PagingResult result) throws IllegalAccessException, InstantiationException {
        Pagination newPaging = (Pagination)BeanUtils.copy(pagination, Pagination.class);
        newPaging.setTotalSize((int)result.getTotalCount());
        PagingResponse<T> response = new PagingResponse();
        response.setPagination(newPaging);
        response.setRows(BeanUtils.copyList(result.getRows(), respClass));
        return response;
    }

    public static <T extends BaseCriteria> PagingCriteria<T> convertCriteria(PagingRequest request, Class<T> criteriaClass) throws IllegalAccessException, InstantiationException {
        Pagination pagination = (Pagination)BeanUtils.copy(request.getPagination(), Pagination.class);
        PagingCriteria criteria = new PagingCriteria();
        criteria.setCriteria((BaseCriteria)BeanUtils.copy(request.getCriteria(), criteriaClass));
        criteria.setPagination(pagination);
        criteria.setAutoCount(true);
        return criteria;
    }
}
