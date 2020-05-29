package com.demo.asd.dao.staff;
import com.demo.asd.support.model.po.staff.StaffBean;
import com.demo.asd.support.model.po.staff.StaffCriteria;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
@Mapper

public interface StaffDao {
    public StaffBean login(@Param("criteria")StaffCriteria criteria);

}
