package com.koala.diycat.model.statuses;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * 微博
 *
 * @author Liger
 * @date 2018/5/27 18:06
 */
public class Status {
    /**
     * createdAt : Sun May 27 00:00:17 +0800 2018
     * id : 4244077614488317
     * idstr : 4244077614488317
     * mid : 4244077614488317
     * canEdit : false
     * text : 大学同学的婚礼最容易让人感慨时间的流逝但却丝毫看不到岁月在大家脸上留下痕迹。聊起来都还是老样子。还是大学里稚嫩的笑脸。美好[心] http://t.cn/z8UAhFN ​
     * textLength : 146
     * source_allowclick : 0
     * sourceType : 2
     * source : <a href="http://weibo.com/" rel="nofollow">iPhone客户端</a>
     * favorited : false
     * truncated : false
     * in_reply_to_status_id :
     * in_reply_to_user_id :
     * in_reply_to_screen_name :
     * pic_urls : [{"thumbnail_pic":"http://wx3.sinaimg.cn/thumbnail/7326a63cly1frp6m822qaj22c0340qv6.jpg"},{"thumbnail_pic":"http://wx2.sinaimg
     * .cn/thumbnail/7326a63cly1frp6lzba1tj23402c07wj.jpg"},{"thumbnail_pic":"http://wx4.sinaimg.cn/thumbnail/7326a63cly1frp6ly6m7cj20ty12mgrf
     * .jpg"},{"thumbnail_pic":"http://wx1.sinaimg.cn/thumbnail/7326a63cly1frp6m07hnij21400u0176.jpg"},{"thumbnail_pic":"http://wx2.sinaimg
     * .cn/thumbnail/7326a63cly1frp6lxchz8j22c02c0e82.jpg"},{"thumbnail_pic":"http://wx2.sinaimg.cn/thumbnail/7326a63cly1frp6lvzpxaj22c02c0b2b.jpg"}]
     * thumbnail_pic : http://wx3.sinaimg.cn/thumbnail/7326a63cly1frp6m822qaj22c0340qv6.jpg
     * bmiddle_pic : http://wx3.sinaimg.cn/bmiddle/7326a63cly1frp6m822qaj22c0340qv6.jpg
     * original_pic : http://wx3.sinaimg.cn/large/7326a63cly1frp6m822qaj22c0340qv6.jpg
     * geo : {"type":"Point","coordinates":[30.221045,120.14772]}
     * is_paid : false
     * mblog_vip_type : 0
     * user : {"id":1931912764,"idstr":"1931912764","class":1,"screen_name":"杭州市匿名网友小孙","name":"杭州市匿名网友小孙","province":"100","city":"1000",
     * "location":"其他","description":"🌸笑点高泪点低。","url":"","profile_image_url":"http://tvax2.sinaimg
     * .cn/crop.0.0.751.751.50/7326a63cly8fres42hl4pj20kv0kvjss.jpg","cover_image":"http://ww2.sinaimg.cn/crop.0.227.980.300/7326a63cgw1dxyi7i7hhxj
     * .jpg","cover_image_phone":"http://ww1.sinaimg.cn/crop.0.0.640.640.640/9d44112bjw1f1xl1c10tuj20hs0hs0tw.jpg","profile_url":"sunyiwen1116",
     * "domain":"sunyiwen1116","weihao":"","gender":"f","followers_count":894,"friends_count":384,"pagefriends_count":0,"statuses_count":571,
     * "favourites_count":393,"createdAt":"Fri Feb 04 12:51:19 +0800 2011","following":false,"allow_all_act_msg":false,"geo_enabled":true,
     * "verified":false,"verified_type":220,"remark":"","insecurity":{"sexual_content":false},"ptype":0,"allow_all_comment":true,
     * "avatar_large":"http://tvax2.sinaimg.cn/crop.0.0.751.751.180/7326a63cly8fres42hl4pj20kv0kvjss.jpg","avatar_hd":"http://tvax2.sinaimg
     * .cn/crop.0.0.751.751.1024/7326a63cly8fres42hl4pj20kv0kvjss.jpg","verified_reason":"","verified_trade":"","verified_reason_url":"",
     * "verified_source":"","verified_source_url":"","follow_me":false,"like":false,"like_me":false,"online_status":0,"bi_followers_count":291,
     * "lang":"zh-cn","star":0,"mbtype":2,"mbrank":1,"block_word":0,"block_app":0,"credit_score":80,"user_ability":0,"cardid":"star_095",
     * "avatargj_id":"gj_vip_072","urank":33,"story_read_state":-1,"vclub_member":0}
     * annotations : [{"place":{"poiid":"B2094757D06AA7FA439F","title":"蓝天清水湾国际大酒店","type":"checkin"},
     * "client_mblogid":"iPhone-574C94F3-8660-44A9-9C87-712DC1AB7504"},{"mapi_request":true}]
     * picStatus : 0:1,1:1,2:1,3:1,4:1,5:1
     * reposts_count : 46
     * comments_count : 3
     * attitudes_count : 4
     * pending_approval_count : 0
     * isLongText : false
     * mlevel : 0
     * visible : {"type":0,"list_id":0}
     * biz_ids : [100101]
     * biz_feature : 4294967300
     * hasActionTypeCard : 0
     * darwin_tags : []
     * hot_weibo_tags : []
     * text_tag_tips : []
     * userType : 0
     * more_info_type : 0
     * positive_recom_flag : 0
     * content_auth : 0
     * gif_ids :
     * is_show_bulletin : 2
     * comment_manage_info : {"comment_permission_type":-1,"approval_comment_type":0}
     * page_type : 32
     * cardid : star_028
     * pic_video : 5:004vW64Cjx07kM3S787u010f0100bAHU0k01
     */

    @SerializedName("created_at")
    private String createdAt;

    //微博 ID
    private long id;

    @SerializedName("idstr")
    private String idStr;
    private String mid;

    @SerializedName("can_edit")
    private boolean canEdit;

    private String text;
    private int textLength;

    //来源
    private String source;

    @SerializedName("source_allowclick")
    private int allowClick;

    @SerializedName("source_type")
    private int sourceType;

    //是否已收藏
    private boolean favorited;

    //是否被截断
    private boolean truncated;

    //缩略图片地址，没有时不返回此字段
    @SerializedName("thumbnail_pic")
    private String thumbnailPic;

    //中等尺寸图片地址，没有时不返回此字段
    @SerializedName("bmiddle_pic")
    private String bmiddlePic;

    //原始图片地址，没有时不返回此字段
    @SerializedName("original_pic")
    private String originalPic;

    //转发数
    @SerializedName("repostsCount")
    private int reposts;

    //评论数
    @SerializedName("comments_count")
    private int comments;

    //表态数
    @SerializedName("attitudes_count")
    private int attitudes;

    private Visible visible;

    //地理信息
    private Geo geo;

    //微博作者的用户信息
    private User user;

    //被转发的原微博信息字段，当该微博为转发微博时返回
    @SerializedName("retweeted_status")
    private Status retweetedStatus;

    /* 以下为根据返回数据，新添加的属性 */

    private List<PicUrl> mPicUrls;

    @SerializedName("isLongText")
    private boolean isLongText;

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getIdStr() {
        return idStr;
    }

    public void setIdStr(String idStr) {
        this.idStr = idStr;
    }

    public String getMid() {
        return mid;
    }

    public void setMid(String mid) {
        this.mid = mid;
    }

    public boolean isCanEdit() {
        return canEdit;
    }

    public void setCanEdit(boolean canEdit) {
        this.canEdit = canEdit;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getTextLength() {
        return textLength;
    }

    public void setTextLength(int textLength) {
        this.textLength = textLength;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public int getAllowClick() {
        return allowClick;
    }

    public void setAllowClick(int allowClick) {
        this.allowClick = allowClick;
    }

    public int getSourceType() {
        return sourceType;
    }

    public void setSourceType(int sourceType) {
        this.sourceType = sourceType;
    }

    public boolean isFavorited() {
        return favorited;
    }

    public void setFavorited(boolean favorited) {
        this.favorited = favorited;
    }

    public boolean isTruncated() {
        return truncated;
    }

    public void setTruncated(boolean truncated) {
        this.truncated = truncated;
    }

    public String getThumbnailPic() {
        return thumbnailPic;
    }

    public void setThumbnailPic(String thumbnailPic) {
        this.thumbnailPic = thumbnailPic;
    }

    public String getBmiddlePic() {
        return bmiddlePic;
    }

    public void setBmiddlePic(String bmiddlePic) {
        this.bmiddlePic = bmiddlePic;
    }

    public String getOriginalPic() {
        return originalPic;
    }

    public void setOriginalPic(String originalPic) {
        this.originalPic = originalPic;
    }

    public int getReposts() {
        return reposts;
    }

    public void setReposts(int reposts) {
        this.reposts = reposts;
    }

    public int getComments() {
        return comments;
    }

    public void setComments(int comments) {
        this.comments = comments;
    }

    public int getAttitudes() {
        return attitudes;
    }

    public void setAttitudes(int attitudes) {
        this.attitudes = attitudes;
    }

    public Visible getVisible() {
        return visible;
    }

    public void setVisible(Visible visible) {
        this.visible = visible;
    }

    public Geo getGeo() {
        return geo;
    }

    public void setGeo(Geo geo) {
        this.geo = geo;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Status getRetweetedStatus() {
        return retweetedStatus;
    }

    public void setRetweetedStatus(Status retweetedStatus) {
        this.retweetedStatus = retweetedStatus;
    }

    public List<PicUrl> getPicUrls() {
        return mPicUrls;
    }

    public void setPicUrls(List<PicUrl> picUrls) {
        mPicUrls = picUrls;
    }

    public boolean isLongText() {
        return isLongText;
    }

    public void setLongText(boolean longText) {
        isLongText = longText;
    }

    private static class PicUrl {
        /**
         * thumbnail_pic : http://wx3.sinaimg.cn/thumbnail/7326a63cly1frp6m822qaj22c0340qv6.jpg
         */

        @SerializedName("thumbnail_pic")
        private String thumbnailPic;

        public String getThumbnailPic() {
            return thumbnailPic;
        }
    }
}
