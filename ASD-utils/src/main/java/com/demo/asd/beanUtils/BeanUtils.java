package com.demo.asd.beanUtils;

import org.apache.commons.collections4.CollectionUtils;
import org.springframework.cglib.beans.BeanCopier;
import org.springframework.cglib.core.Converter;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;


public class BeanUtils {
    public BeanUtils() {
    }

    public static <T> T copy(Object obj, Class<T> targetClass) {
        if (obj == null) {
            return null;
        } else {
            T target = instantiate(targetClass);
            BeanCopier copier = BeanCopier.create(obj.getClass(), targetClass, false);
            copier.copy(obj, target, (Converter)null);
            return target;
        }
    }

    public static void copy(Object obj, Object targetObj) {
        Asserts.isTrue(obj != null, "The source must not be null");
        Asserts.isTrue(targetObj != null, "The target must not be null");
        BeanCopier copier = BeanCopier.create(obj.getClass(), targetObj.getClass(), false);
        copier.copy(obj, targetObj, (Converter)null);
    }

    public static <T> List<T> copyList(List<?> objs, Class<T> targetClass) {
        if (CollectionUtils.isEmpty(objs)) {
            return Collections.emptyList();
        } else {
            List<T> result = new ArrayList(objs.size());
            Iterator var3 = objs.iterator();

            while(var3.hasNext()) {
                Object data = var3.next();
                result.add(copy(data, targetClass));
            }

            return result;
        }
    }

    public static <T> T instantiate(Class<T> clazz) {
        Asserts.isTrue(clazz != null, "The class must not be null");

        try {
            return clazz.newInstance();
        } catch (Exception var2) {
            throw new SystemException("instantiate class#" + clazz + " error", var2);
        }
    }

    public static Object forceGetFieldValue(Object target, String fieldName) {
        return forceGetFieldValue(target, forceGetField(target.getClass(), fieldName));
    }

    public static Object forceGetFieldValue(Object target, Field field) {
        if (target == null) {
            return null;
        } else {
            try {
                return field.get(target);
            } catch (Exception var3) {
                throw new RuntimeException("get object#" + target + "'s field#" + field + " error", var3);
            }
        }
    }

    public static Field forceGetField(Class clazz, String fieldName) {
        try {
            Field f = clazz.getDeclaredField(fieldName);
            f.setAccessible(true);
            return f;
        } catch (Exception var3) {
            throw new RuntimeException("get clazz#" + clazz + "'s field#" + fieldName + " error", var3);
        }
    }

    public static Object forceGetFieldValueDeeply(Object target, String fieldName) {
        if (target != null && Object.class != target.getClass()) {
            Object value = null;
            Class clazz = target.getClass();

            do {
                try {
                    Field f = forceGetField(clazz, fieldName);
                    value = forceGetFieldValue(target, f);
                } catch (Exception var8) {
                } finally {
                    clazz = clazz.getSuperclass();
                }
            } while(value == null && Object.class != clazz);

            return value;
        } else {
            return null;
        }
    }
}
