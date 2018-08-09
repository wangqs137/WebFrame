package org.smart4j.framework.util;

import org.apache.commons.lang3.ArrayUtils;

import java.util.Arrays;

/**
 * 数组工具类
 */
public final class ArrayUtil {

    public static <T> boolean isEmpty(T[] tArr){
        return ArrayUtils.isEmpty(tArr);
    }

    public static <T> boolean isNotEmpty(T[] tArr){
        return !isEmpty(tArr);
    }
}
