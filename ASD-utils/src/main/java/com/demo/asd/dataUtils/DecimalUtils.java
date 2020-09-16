package com.demo.asd.dataUtils;

import org.apache.commons.lang3.StringUtils;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

/**
 * 对数字的一些操作
 * Create By chenCy 2020/09/16
 */
public final class DecimalUtils {
    private static final String THREE_FORMAT_PATTERN = "#0.###";

    public DecimalUtils() {
    }

    public static int compare(double d1, double d2) {
        double dd1 = round(d1);
        double dd2 = round(d2);
        if (dd1 > dd2) {
            return 1;
        } else {
            return dd1 == dd2 ? 0 : -1;
        }
    }

    public static double toDouble(BigDecimal value) {
        return value == null ? 0.0D : value.doubleValue();
    }

    public static int toInt(BigDecimal value) {
        return value == null ? 0 : value.intValue();
    }

    public static long toLong(BigDecimal value) {
        return value == null ? 0L : value.longValue();
    }

    public static double round(double value, int scale) {
        BigDecimal deci = BigDecimal.valueOf(value).setScale(scale, RoundingMode.HALF_UP);
        return deci.doubleValue();
    }

    public static double round(double value) {
        return round(value, 3);
    }

    public static double add(double d1, double d2) {
        return BigDecimal.valueOf(d1).add(BigDecimal.valueOf(d2)).doubleValue();
    }

    public static double subtract(double d1, double d2) {
        return BigDecimal.valueOf(d1).subtract(BigDecimal.valueOf(d2)).doubleValue();
    }

    public static double multiply(double d1, double d2) {
        return BigDecimal.valueOf(d1).multiply(BigDecimal.valueOf(d2)).doubleValue();
    }

    public static double divide(double d1, double d2) {
        return BigDecimal.valueOf(d1).divide(BigDecimal.valueOf(d2), 3, 6).doubleValue();
    }

    public static int toInt(double value) {
        double d = round(value, 0);
        return BigDecimal.valueOf(d).intValue();
    }

    public static String format(double value) {
        DecimalFormat df1 = new DecimalFormat("#0.###");
        return df1.format(value);
    }

    public static String format(BigDecimal value) {
        return format(value == null ? 0.0D : value.doubleValue());
    }

    public static BigDecimal add(BigDecimal d1, BigDecimal d2) {
        if (d1 == null && d2 == null) {
            return BigDecimal.ZERO;
        } else if (d1 == null) {
            return d2;
        } else {
            return d2 == null ? d1 : d1.add(d2);
        }
    }

    public static BigDecimal subtract(BigDecimal d1, BigDecimal d2) {
        if (d1 == null && d2 == null) {
            return BigDecimal.ZERO;
        } else if (d1 == null && d2 != null) {
            return BigDecimal.ZERO.subtract(d2);
        } else {
            return d2 == null && d1 != null ? d1 : d1.subtract(d2);
        }
    }

    public static BigDecimal multiply(BigDecimal d1, BigDecimal d2) {
        if (d1 == null && d2 == null) {
            return BigDecimal.ZERO;
        } else if (d1 == null && d2 != null) {
            return d2;
        } else {
            return d2 == null && d1 != null ? d1 : d1.multiply(d2);
        }
    }

    public static BigDecimal divide(BigDecimal d1, BigDecimal d2) {
        if (d1 == null && d2 == null) {
            throw new ArithmeticException("被除数为0");
        } else if (d1 == null) {
            return BigDecimal.ZERO;
        } else if (d2 == null) {
            throw new ArithmeticException("被除数为0");
        } else {
            return d1.divide(d2, 3, 6);
        }
    }

    public static BigDecimal toBigDecimal(double value) {
        return BigDecimal.valueOf(value);
    }

    public static BigDecimal toBigDecimal(int value) {
        return BigDecimal.valueOf((long) value);
    }

    public static BigDecimal toBigDecimal(long value) {
        return BigDecimal.valueOf(value);
    }

    public static BigDecimal toBigDecimal(String value) {
        return StringUtils.isBlank(value) ? new BigDecimal("0.00") : new BigDecimal(value);
    }
}
