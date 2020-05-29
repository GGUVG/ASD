package com.demo.asd.dao.test;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Mapper
public interface TestDao {
    public String testConnectSQL();
}
