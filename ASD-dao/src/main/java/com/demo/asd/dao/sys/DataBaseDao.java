package com.demo.asd.dao.sys;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
@Component
@Mapper
public interface DataBaseDao
{
    public LocalDateTime acquireNow();
}
