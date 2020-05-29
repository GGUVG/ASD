package com.demo.asd.base.hierarchies;

import com.demo.asd.base.ClassUtil;
import com.demo.asd.base.entity.BaseBean;
import com.demo.asd.base.entity.BaseCriteria;
import com.demo.asd.base.entity.BaseRequest;
import com.demo.asd.base.entity.BaseResponse;
import com.demo.asd.beanUtils.BeanUtils;
import com.demo.asd.pagination.Pagination;
import com.demo.asd.pagination.PagingRequest;
import com.demo.asd.pagination.PagingResponse;
import com.demo.asd.pagination.PageConverter;
import java.util.List;
public abstract class BaseBiz<PK, E extends BaseBean, C extends BaseCriteria, RQ extends BaseRequest,
        RP extends BaseResponse>
{
    public Class<E> entityClass = ClassUtil.getSuperClassGenericType(this.getClass(), 1);
    public Class<C> criteriaClass = ClassUtil.getSuperClassGenericType(this.getClass(), 2);
    public Class<RQ> reqClass = ClassUtil.getSuperClassGenericType(this.getClass(), 3);
    public Class<RP> respClass = ClassUtil.getSuperClassGenericType(this.getClass(), 4);

    public BaseBiz() {
    }

    public abstract BaseService<PK, E, C> getService();

    public PagingResponse<RP> findPaging(PagingRequest<RQ> paging) throws IllegalAccessException, InstantiationException {
        C criteria = (C) BeanUtils.copy(paging.getCriteria(), this.criteriaClass);
        Pagination pagination = (Pagination)BeanUtils.copy(paging.getPagination(), Pagination.class);
        List<E> beans = this.getService().findBeans(criteria, pagination.getOffset(), pagination.getPageSize());
        long count = this.getService().count(criteria);
        PagingResponse<RP> response = PageConverter.convert(pagination, this.respClass, count, beans);
        return response;
    }

    public List<RP> findByCriteria(RQ criteria) {
        C cri = (C) BeanUtils.copy(criteria, this.criteriaClass);
        List<E> beans = this.getService().findBeans(cri);
        return BeanUtils.copyList(beans, this.respClass);
    }

    public RP getById(PK id) {
        E bean = this.getService().getBeanById(id);
        return (RP) BeanUtils.copy(bean, this.respClass);
    }

}
