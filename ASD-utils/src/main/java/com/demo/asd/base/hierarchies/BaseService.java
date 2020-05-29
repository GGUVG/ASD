package com.demo.asd.base.hierarchies;

import com.demo.asd.base.entity.BaseBean;
import com.demo.asd.base.entity.BaseCriteria;

public abstract class BaseService<PK, E extends BaseBean, C extends BaseCriteria> extends CrudService<PK, E, C>
{
    public BaseService() {
    }
}
