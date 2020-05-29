package com.demo.asd.api;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@PropertySource({"classpath:application.properties"})
@SpringBootApplication(scanBasePackages="com.demo.asd")
@MapperScan("com.demo.asd.dao")
public class ApplicationStart {

    public static void main( String[] args )
    {
        SpringApplication.run(ApplicationStart.class, args);
    }

}
