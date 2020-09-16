package com.demo.asd.dataUtils;
import java.math.BigDecimal;

public class StringHelper
{
    public static boolean isValid(Object obj) {
        if (null == obj) {
            return false;
        }
        if (obj instanceof String) {
            return isValid(obj.toString());
        } else if (obj instanceof Integer) {
            if (Integer.parseInt(String.valueOf(obj)) <= 0) {
                return false;
            }
        } else if (obj instanceof BigDecimal) {
            int to = (DecimalUtils.toBigDecimal(String.valueOf(obj)))
                    .compareTo(DecimalUtils.toBigDecimal(0));
            if (to <= 0) {
                return false;
            }
        } else if (obj instanceof Long) {
            if (Long.valueOf(String.valueOf(obj)) <= 0) {
                return false;
            }
        }
        return true;
    }

    public static String addPreZero(String str, int totalLen) {
        if (isValid(str)) {
            while ((totalLen - str.length()) > 0) {
                str = "0" + str;
            }
        }
        return str;
    }

    public static String substractPreZero(String str) {
        if (isValid(str)) {
            while (str.startsWith("0")) {
                str = str.substring(1);
            }
        }
        return str;
    }
}
