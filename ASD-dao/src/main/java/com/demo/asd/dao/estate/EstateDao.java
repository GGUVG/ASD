package com.demo.asd.dao.estate;

import com.demo.asd.base.hierarchies.CrudDao;
import com.demo.asd.support.model.po.estate.EstateBean;
import com.demo.asd.support.model.po.estate.EstateCriteria;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper
public interface EstateDao extends CrudDao<Long, EstateBean, EstateCriteria>
{
    public List<EstateBean> findEstateList(@Param("criteria")EstateCriteria criteria);
}
