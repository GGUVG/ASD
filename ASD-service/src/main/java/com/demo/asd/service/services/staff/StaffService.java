package com.demo.asd.service.services.staff;

import com.demo.asd.dao.staff.StaffDao;
import com.demo.asd.support.model.po.staff.StaffBean;
import com.demo.asd.support.model.po.staff.StaffCriteria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 * 调用asd-dao模块/staffDao Mapper
 * Created by chency on 2020-05-14.
 */
@Service
public class StaffService {
    @Autowired
    public StaffDao staffDao;

    public StaffBean login(StaffCriteria criteria)
    {
        return staffDao.login(criteria);
    }
}
