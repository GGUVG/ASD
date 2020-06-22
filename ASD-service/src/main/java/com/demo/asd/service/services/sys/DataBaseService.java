package com.demo.asd.service.services.sys;

import com.demo.asd.dao.sys.DataBaseDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class DataBaseService
{
    @Autowired
    public DataBaseDao dataBaseDao;

    /**
     * 获取数据库当前时间
     * @return
     */
    public LocalDateTime getDbDatetime()
    {
        return dataBaseDao.acquireNow();
    }
}
