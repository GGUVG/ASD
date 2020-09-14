package com.demo.asd.collectionUtils;

import com.demo.asd.beanUtils.BeanUtils;
import org.reflections.ReflectionUtils;

/**
 * 对实体类属性进行操作
 */
public class ObjectAttributeMethods
{
    public ObjectAttributeMethods(){

    }

    //循环初始化一个实体类
    public static <T>  T SetObjAttrNull(T t)
    {
        BeanUtils.instantiate(t.getClass());
        ReflectionUtils.getAllFields(t.getClass()).forEach(c->{
            try{
                c.setAccessible(true);
                c.set(t,null);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
                throw new RuntimeException();
            }
        });
        return t;
    }
}
