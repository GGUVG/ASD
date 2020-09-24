package com.demo.asd.dao.sys;

import com.demo.asd.base.hierarchies.CrudDao;
import com.demo.asd.support.model.po.sys.CodeItemBean;
import com.demo.asd.support.model.po.sys.CodeItemCriteria;
import com.demo.asd.support.model.po.sys.CodeItemPkBean;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper
public interface CodeItemDao extends CrudDao<CodeItemPkBean, CodeItemBean, CodeItemCriteria>
{
    //根据typeCode跟itemCode获取码表
    public List<CodeItemBean> getCodeItemList(@Param("criteria") CodeItemCriteria criteria);
}
