package com.demo.asd.dao.welfare;

import com.demo.asd.base.hierarchies.CrudDao;
import com.demo.asd.pagination.Pagination;
import com.demo.asd.support.model.po.welfare.WelfareArticleExBean;
import com.demo.asd.support.model.po.welfare.WelfareArticleExCriteria;
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
    //图片分页查询
    public List<WelfareImgExBean> findImgByPage(@Param("criteria") WelfareImgExCriteria criteria, @Param("pagination")Pagination pagination);

    //图片分页查询计数
    public Long countFindImgByPage(@Param("criteria")WelfareImgExCriteria criteria);

    //图片不分页查询
    public List<WelfareImgExBean> findImgNoPage(@Param("criteria")WelfareImgExCriteria criteria);

    //文章分页查询
    public List<WelfareArticleExBean> findArticleByPage(@Param("criteria")WelfareArticleExCriteria criteria,@Param("pagination")Pagination pagination);

    //图片分页查询计数
    public Long countFindArticleByPage(@Param("criteria")WelfareArticleExCriteria criteria);

    //图片不分页查询
    public List<WelfareImgExBean> findArticleNoPage(@Param("criteria")WelfareArticleExCriteria criteria);
}
