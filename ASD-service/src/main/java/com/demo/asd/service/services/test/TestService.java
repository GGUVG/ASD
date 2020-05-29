package com.demo.asd.service.services.test;

import com.demo.asd.dao.test.TestDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {
    @Autowired
    public TestDao testDao;

    public String testConnectSQL()
    {
        return testDao.testConnectSQL();
    }
}
