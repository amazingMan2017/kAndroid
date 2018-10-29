package com.github.tifezh.kchart.utils;

import com.github.tifezh.kchart.App;


import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

/**
 * Description：数据检测类
 * Author: star
 * Email: guimingxing@163.com
 * Date: 2018-3-28  17:21
 */
public class ValueUtil {

    public static boolean isListNotEmpty(List<?> noteList) {
        return null != noteList && noteList.size() > 0;
    }

    public static boolean isListEmpty(List<?> noteList) {
        return null == noteList || noteList.size() == 0;
    }

    public static boolean isStrEmpty(String value) {
        if (null == value || "".equals(value.trim())) {
            return true;
        } else {
            // 判断是否全是全角空格
            value = value.replaceAll(" ", "").trim();
            if (null == value || "".equals(value.trim())) {
                return true;
            }
        }
        return false;
    }

    public static boolean isNotEmpty(Object object) {// 不为空方�?
        return null != object;
    }

    public static boolean isEmpty(Object object) {// 为空方法
        return null == object;
    }

    public static boolean isStrNotEmpty(String value) {
        if (null == value || "".equals(value.trim())) {
            return false;
        } else {
            // 判断是否全是全角空格
            value = value.replaceAll(" ", "").trim();
            if (null == value || "".equals(value.trim())) {
                return false;
            }
        }
        return true;
    }
    public static String getString(int resId) {
        if (null != App.getContext()) {
            return App.getContext().getString(resId);
        }
        return "";
    }

    //Double保留两位小数
    public static String doubleFormat(double value) {
        BigDecimal bd = new BigDecimal(value);
        bd = bd.setScale(2, RoundingMode.HALF_UP);
        return bd.toString();
    }
}
