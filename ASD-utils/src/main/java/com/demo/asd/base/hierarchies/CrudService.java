package com.demo.asd.base.hierarchies;

import com.demo.asd.base.ClassUtil;
import com.demo.asd.base.entity.BaseBean;
import com.demo.asd.base.entity.BaseCriteria;
import com.google.common.collect.Lists;
import java.util.List;
import org.apache.commons.collections4.CollectionUtils;

public abstract class CrudService<PK, E extends BaseBean, C extends BaseCriteria> {
    protected Class<E> entityClass = ClassUtil.getSuperClassGenericType(this.getClass(), 1);
    protected Class<C> criteriaClass = ClassUtil.getSuperClassGenericType(this.getClass(), 2);

    public CrudService() {
    }

    public E getBeanById(PK id) {
        return this.getCrudDao().getById(id);
    }

    public int saveBean(E bean) {
        return this.getCrudDao().save(bean);
    }

    public int updateBean(E bean) {
        return this.getCrudDao().update(bean);
    }

    public E findOneBean(C criteria) {
        List<E> beans = this.getCrudDao().query(criteria, 0, 1);
        return CollectionUtils.isEmpty(beans) ? null : (E) beans.get(0);
    }

    public List<E> findBeans(C criteria) {
        int pageSize = this.getDefaultPageSize();
        int offset = 0;
        List<E> ret = Lists.newArrayList();
        List part = null;

        do {
            part = this.getCrudDao().query(criteria, offset, pageSize);
            ret.addAll(part);
            offset += pageSize;
        } while(CollectionUtils.isNotEmpty(part));

        return ret;
    }

    public List<E> findBeans(C criteria, int offset, int limit) {
        return this.getCrudDao().query(criteria, offset, limit);
    }

    public int batchSave(List<E> beans) {
        return this.getCrudDao().batchSave(beans);
    }

    public int manyBatchSave(List<E> beans, int batchSize) {
        return CollectionUtils.isEmpty(beans) ? 0 : Lists.partition(beans, batchSize).stream().mapToInt((batch) -> {
            return this.getCrudDao().batchSave(batch);
        }).sum();
    }

    public int manyBatchSave(List<E> beans) {
        return this.manyBatchSave(beans, 100);
    }

    public long count(C criteria) {
        return this.getCrudDao().count(criteria);
    }

    public int getDefaultPageSize() {
        return 200;
    }

    protected abstract CrudDao<PK, E, C> getCrudDao();
}
