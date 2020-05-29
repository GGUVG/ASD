package com.demo.asd.base.hierarchies;

import com.demo.asd.base.entity.BaseBean;
import com.demo.asd.base.entity.BaseCriteria;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CrudDao<PK, E extends BaseBean, C extends BaseCriteria> {
    E getById(PK id);

    int save(E entity);

    int update(E entity);

    int batchSave(List<E> entities);

    List<E> query(@Param("criteria") C criteria, @Param("offset") int offset, @Param("limit") int limit);

    long count(C criteria);
}
