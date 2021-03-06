package com.fenghj.android.utilslibrary;

/**
 * 判断双击工具类
 * <p>Created by Fenghj on 2017/8/8.</p>
 */

public class DoubleClickUtils {
    private DoubleClickUtils() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    private static long lastClickTime;
    /**
     * 判断是否快速点击多次，双击
     *
     * @return {@code true}: 双击<br>{@code false}: 单击
     */
    public static boolean isDoubleClick() {
        return isDoubleClick(500);
    }

    /**
     * 判断是否快速点击多次，双击
     * @param doubleTime  自定义判断双击的时间间隔，单位ms
     * @return {@code true}: 双击<br>{@code false}: 单击
     */
    public static boolean isDoubleClick(int doubleTime) {
        long currentTime = System.currentTimeMillis();
        long time = currentTime - lastClickTime;
        if (0 < time && time < doubleTime) {
            return true;
        }
        lastClickTime = currentTime;
        return false;
    }
}
