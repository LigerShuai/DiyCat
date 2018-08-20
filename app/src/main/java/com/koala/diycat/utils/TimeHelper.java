package com.koala.diycat.utils;

import android.text.TextUtils;
import android.util.Log;

import com.blankj.utilcode.util.TimeUtils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * @author Liger
 * @date 2018/8/20 22:43
 */
public class TimeHelper {

    /**
     * 将发微博的时间按如下方式转换
     *
     * @param createAt Thu Aug 20 18:05:49 +0800 2018
     * @return 如果小于 1 秒钟内，显示刚刚
     * 在 1 分钟内，显示 XXX秒前
     * 在 1 小时内，显示 XXX分钟前
     * 在 1 小时外的今天内，显示今天15:32
     * 如果是昨天的，显示昨天15:32
     * 其余显示 2018-08-20
     */
    public static String getCreateTime(String createAt) {
        if (TextUtils.isEmpty(createAt)) {
            return "";
        }
        SimpleDateFormat dateFormat = new SimpleDateFormat("EEE MMM dd HH:mm:ss zzz yyyy", Locale.US);
        Date date = null;
        try {
            date = dateFormat.parse(createAt);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        String formatDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US).format(date);
        String createTime = TimeUtils.getFriendlyTimeSpanByNow(formatDate);
        Log.d("TimeHelper", "getCreateTime: createAt = " + createAt + " 转换为 " + createTime);
        return createTime;
    }
}
