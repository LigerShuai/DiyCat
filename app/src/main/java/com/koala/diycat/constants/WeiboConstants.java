package com.koala.diycat.constants;

/**
 * weibo 参数
 *
 * @author Liger
 * @date 2018/5/26 23:19
 */
public class WeiboConstants {
    public static final String APP_KEY = "2743460856";

    /**
     * 第三方应用可以使用自己的回调页。
     * 建议使用默认回调页：https://api.weibo.com/oauth2/default.html
     */
    public static final String REDIRECT_URL = "https://api.weibo.com/oauth2/default.html";

    /**
     * WeiboSDKDemo 应用对应的权限，第三方开发者一般不需要这么多，可直接设置成空即可。
     * 详情请查看 Demo 中对应的注释。
     */
    public static final String SCOPE =
            "email,direct_messages_read,direct_messages_write,"
                    + "friendships_groups_read,friendships_groups_write,statuses_to_me_read,"
                    + "follow_app_official_microblog," + "invitation_write";

//    public static final String SCOPE = "";
}
