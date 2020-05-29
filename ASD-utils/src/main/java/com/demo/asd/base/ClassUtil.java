package com.demo.asd.base;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.net.URI;
import java.net.URL;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZonedDateTime;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.apache.commons.lang3.ClassUtils;
public abstract class ClassUtil {
    public static final Map<Class<?>, Class<?>> primitiveMap = new HashMap(9);

    public ClassUtil() {
    }

    public static Class getSuperClassGenericType(final Class<?> clazz, final int index) {
        Type genType = clazz.getGenericSuperclass();
        if (!(genType instanceof ParameterizedType)) {
            return Object.class;
        } else {
            Type[] params = ((ParameterizedType)genType).getActualTypeArguments();
            if (index < params.length && index >= 0) {
                return !(params[index] instanceof Class) ? Object.class : (Class)params[index];
            } else {
                return Object.class;
            }
        }
    }

    private static boolean _isSimpleValueType(Class<?> clazz) {
        return ClassUtils.isPrimitiveOrWrapper(clazz) || clazz.isEnum() || CharSequence.class.isAssignableFrom(clazz) || Number.class.isAssignableFrom(clazz) || Date.class.isAssignableFrom(clazz) || URI.class == clazz || URL.class == clazz || Locale.class == clazz || Class.class == clazz;
    }

    public static boolean isSimpleValueType(Class<?> clazz) {
        return _isSimpleValueType(clazz);
    }

    public static boolean isPrimitive(Class<?> clazz) {
        if (primitiveMap.containsKey(clazz)) {
            return true;
        } else {
            return clazz.isEnum() || clazz.isPrimitive() || _isSimpleValueType(clazz);
        }
    }

    public static Class<?> getElementType(Class<?> target, String fieldName) {
        Class elementTypeClass = null;

        try {
            Type type = target.getDeclaredField(fieldName).getGenericType();
            ParameterizedType t = (ParameterizedType)type;
            String classStr = t.getActualTypeArguments()[0].toString().replace("class ", "");
            elementTypeClass = Thread.currentThread().getContextClassLoader().loadClass(classStr);
        } catch (NoSuchFieldException | SecurityException | ClassNotFoundException var7) {
            try {
                elementTypeClass = getElementTypeUppercase(target, fieldName);
            } catch (Exception var6) {
                throw new RuntimeException("get fieldName[" + fieldName + "] error", var6);
            }
        }

        return elementTypeClass;
    }

    public static Class<?> getElementTypeUppercase(Class<?> target, String fieldName) {
        Class elementTypeClass = null;

        try {
            Type type = target.getDeclaredField(fieldName.substring(0, 1).toUpperCase() + fieldName.substring(1)).getGenericType();
            ParameterizedType t = (ParameterizedType)type;
            String classStr = t.getActualTypeArguments()[0].toString().replace("class ", "");
            elementTypeClass = Thread.currentThread().getContextClassLoader().loadClass(classStr);
            return elementTypeClass;
        } catch (NoSuchFieldException | SecurityException | ClassNotFoundException var6) {
            throw new RuntimeException("get fieldName[" + fieldName + "] error", var6);
        }
    }

    static {
        primitiveMap.put(String.class, String.class);
        primitiveMap.put(Boolean.class, Boolean.TYPE);
        primitiveMap.put(Byte.class, Byte.TYPE);
        primitiveMap.put(Character.class, Character.TYPE);
        primitiveMap.put(Double.class, Double.TYPE);
        primitiveMap.put(Float.class, Float.TYPE);
        primitiveMap.put(Integer.class, Integer.TYPE);
        primitiveMap.put(Long.class, Long.TYPE);
        primitiveMap.put(Short.class, Short.TYPE);
        primitiveMap.put(Date.class, Date.class);
        primitiveMap.put(LocalDate.class, LocalDate.class);
        primitiveMap.put(LocalDateTime.class, LocalDateTime.class);
        primitiveMap.put(OffsetDateTime.class, OffsetDateTime.class);
        primitiveMap.put(ZonedDateTime.class, ZonedDateTime.class);
        primitiveMap.put(Class.class, Class.class);
        primitiveMap.put(Locale.class, Locale.class);
        primitiveMap.put(URI.class, URI.class);
        primitiveMap.put(URL.class, URL.class);
    }
}
