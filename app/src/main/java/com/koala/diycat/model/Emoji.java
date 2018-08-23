package com.koala.diycat.model;

import java.util.LinkedHashMap;
import java.util.Map;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;

import com.koala.diycat.utils.BaseUtil;
import com.orhanobut.logger.Logger;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author Liger
 * @date 2018/8/23 21:32
 */

public class Emoji {

    private static final String EMOJIS_DIR = "emoji/";
    private static Map<String, String> mEmojiMap = new LinkedHashMap<>();

    static {
        mEmojiMap.put("[呵呵]", "hehe.png");
        mEmojiMap.put("[嘻嘻]", "xixi.png");
        mEmojiMap.put("[哈哈]", "haha.png");
        mEmojiMap.put("[爱你]", "aini.png");
        mEmojiMap.put("[挖鼻屎]", "wabishi.png");
        mEmojiMap.put("[吃惊]", "chijing.png");
        mEmojiMap.put("[晕]", "yun.png");
        mEmojiMap.put("[泪]", "lei.png");
        mEmojiMap.put("[馋嘴]", "chanzui.png");
        mEmojiMap.put("[抓狂]", "zhuakuang.png");
        mEmojiMap.put("[哼]", "heng.png");
        mEmojiMap.put("[可爱]", "keai.png");
        mEmojiMap.put("[怒]", "nu.png");
        mEmojiMap.put("[汗]", "han.png");
        mEmojiMap.put("[害羞]", "haixiu.png");
        mEmojiMap.put("[睡觉]", "shuijiao.png");
        mEmojiMap.put("[钱]", "qian.png");
        mEmojiMap.put("[偷笑]", "touxiao.png");
        mEmojiMap.put("[笑cry]", "xiaoku.png");
        mEmojiMap.put("[doge]", "doge.png");
        mEmojiMap.put("[喵喵]", "miao.png");
        mEmojiMap.put("[酷]", "d_ku.png");
        mEmojiMap.put("[衰]", "shuai.png");
        mEmojiMap.put("[闭嘴]", "bizui.png");
        mEmojiMap.put("[鄙视]", "bishi.png");
        mEmojiMap.put("[花心]", "huaxin.png");
        mEmojiMap.put("[鼓掌]", "guzhang.png");
        mEmojiMap.put("[悲伤]", "beishang.png");
        mEmojiMap.put("[思考]", "sikao.png");
        mEmojiMap.put("[生病]", "shengbing.png");
        mEmojiMap.put("[亲亲]", "qinqin.png");
        mEmojiMap.put("[怒骂]", "numa.png");
        mEmojiMap.put("[太开心]", "taikaixin.png");
        mEmojiMap.put("[懒得理你]", "landelini.png");
        mEmojiMap.put("[右哼哼]", "youhengheng.png");
        mEmojiMap.put("[左哼哼]", "zuohengheng.png");
        mEmojiMap.put("[嘘]", "xu.png");
        mEmojiMap.put("[委屈]", "weiqu.png");
        mEmojiMap.put("[吐]", "tu.png");
        mEmojiMap.put("[可怜]", "kelian.png");
        mEmojiMap.put("[打哈气]", "dahaqi.png");
        mEmojiMap.put("[挤眼]", "jiyan.png");
        mEmojiMap.put("[失望]", "shiwang.png");
        mEmojiMap.put("[顶]", "ding.png");
        mEmojiMap.put("[疑问]", "yiwen.png");
        mEmojiMap.put("[困]", "kun.png");
        mEmojiMap.put("[感冒]", "ganmao.png");
        mEmojiMap.put("[拜拜]", "baibai.png");
        mEmojiMap.put("[黑线]", "heixian.png");
        mEmojiMap.put("[阴险]", "yinxian.png");
        mEmojiMap.put("[打脸]", "dalian.png");
        mEmojiMap.put("[傻眼]", "shayan.png");
        mEmojiMap.put("[猪头]", "zhutou.png");
        mEmojiMap.put("[熊猫]", "xiongmao.png");
        mEmojiMap.put("[兔子]", "tuzi.png");
    }

    /**
     * 将数据源的 emoji 字符转换为对应 emoji 图片名字
     *
     * @param key "[兔子]"
     * @return "tuzi.png"
     */
    private static String getEmojiName(String key) {
        if (!TextUtils.isEmpty(key)) {
            return mEmojiMap.get(key);
        }
        return "";
    }

    /**
     * 根据文字转表情
     *
     * @param context
     * @param key     "[兔子]"
     * @param bound   emoji 大小
     * @return
     */
    public static Drawable text2Emoji(Context context, String key, int bound) {
        Drawable drawable = null;
        InputStream in = null;
        try {
            in = context.getAssets().open(EMOJIS_DIR + getEmojiName(key), AssetManager.ACCESS_STREAMING);
            drawable = Drawable.createFromStream(in, "");
        } catch (IOException e) {
            e.printStackTrace();
            Logger.wtf("open assets error: " + key, e);
        } finally {
            BaseUtil.closeIO(in);
        }
        if (drawable != null) {
            if (bound == 0) {
                drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
            } else {
                drawable.setBounds(0, 0, bound, bound);
            }
        }
        return drawable;
    }
}
