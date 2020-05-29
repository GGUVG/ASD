package com.demo.asd.beanUtils;
/**
    *我真的是日了cookie了
    *create by chenCy 2020-05-22
    Json与对象的互转，Cookie的相关操作
 **/
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.List;

public class JSONUtils {
    public static final ObjectMapper MAPPER = new ObjectMapper();

    public static String objectToJson(Object o) {
        try
        {
            String string = MAPPER.writeValueAsString(o);
            return string;
        } catch (JsonProcessingException e) { e.printStackTrace();}
        return null;
    }

    public static <T> T jsonToObject(String jsonData, Class<T> beanType) {
        try {
            T t = MAPPER.readValue(jsonData, beanType);
            return t;
        } catch (Exception e) {e.printStackTrace();}
        return null;
    }

    public static <T> List<T> jsonToList(String jsonData, Class<T> beanType) {
        JavaType javaType = MAPPER.getTypeFactory().constructParametricType(List.class, beanType);
        try {
            List<T> list = MAPPER.readValue(jsonData, javaType);
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
    //http://www.manongjc.com/article/59156.html
}
