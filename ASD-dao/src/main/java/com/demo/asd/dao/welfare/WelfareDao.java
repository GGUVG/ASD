package com.demo.asd.dao.welfare;

import com.demo.asd.base.hierarchies.CrudDao;
import com.demo.asd.pagination.Pagination;
import com.demo.asd.support.model.po.welfare.WelfareImgExBean;
import com.demo.asd.support.model.po.welfare.WelfareImgExCriteria;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper
public interface WelfareDao extends CrudDao<Long, WelfareImgExBean, WelfareImgExCriteria>
{
    //分页查询
    public List<WelfareImgExBean> findByPage(@Param("criteria") WelfareImgExCriteria criteria, @Param("pagination")Pagination pagination);

    //分页查询计数
    public Long countFindByPage(@Param("criteria")WelfareImgExCriteria criteria);

    //不分页查询
    public List<WelfareImgExBean> findNoPage(@Param("criteria")WelfareImgExCriteria criteria);
}
