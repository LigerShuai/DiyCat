package com.koala.diycat.utils;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Spannable;
import android.util.Log;


import com.koala.diycat.model.Emoji;
import com.koala.diycat.widget.EmojiSpan;
import com.orhanobut.logger.Logger;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Liger
 * @date 2018/8/23 21:39
 */
public class StringUtils {

    //    private static Pattern mEmojiPattern = Pattern.compile("\\[([\u4e00-\u9fa5\\w])+\\]");
    private static Pattern mEmojiPattern = Pattern.compile("\\[([\u4e00-\u9fa5\\w])+\\]");

    /**
     * 将 text 转换为 emoji
     *
     * @param context
     * @param text
     * @param bound   emoji 图片大小
     * @return
     */
    public static Spannable getEmojiSpan(Context context, Spannable text, int bound) {
        Matcher matcher = mEmojiPattern.matcher(text);
        Log.d("shuai", "getEmojiSpan: " + text + " " + matcher.find());
        while (matcher.find()) {
            // 获取匹配到的具体字符
            String key = matcher.group();
            // 匹配字符串的开始位置
            int start = matcher.start();
            Drawable drawable = Emoji.text2Emoji(context, key, bound);
            if (drawable == null) {
                break;
            }
            EmojiSpan emojiSpan = new EmojiSpan(drawable);
            text.setSpan(emojiSpan, start, start + key.length(), Spannable.SPAN_INCLUSIVE_EXCLUSIVE);
            Log.d("shuai2", text + "");
            return text;
        }
        return text;
    }
}
