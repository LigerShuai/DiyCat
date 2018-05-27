package com.koala.diycat.model.statuses;

import java.util.List;

/**
 * 时间线状态
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
     * pic_urls : [{"thumbnail_pic":"http://wx3.sinaimg.cn/thumbnail/7326a63cly1frp6m822qaj22c0340qv6.jpg"},{"thumbnail_pic":"http://wx2.sinaimg.cn/thumbnail/7326a63cly1frp6lzba1tj23402c07wj.jpg"},{"thumbnail_pic":"http://wx4.sinaimg.cn/thumbnail/7326a63cly1frp6ly6m7cj20ty12mgrf.jpg"},{"thumbnail_pic":"http://wx1.sinaimg.cn/thumbnail/7326a63cly1frp6m07hnij21400u0176.jpg"},{"thumbnail_pic":"http://wx2.sinaimg.cn/thumbnail/7326a63cly1frp6lxchz8j22c02c0e82.jpg"},{"thumbnail_pic":"http://wx2.sinaimg.cn/thumbnail/7326a63cly1frp6lvzpxaj22c02c0b2b.jpg"}]
     * thumbnail_pic : http://wx3.sinaimg.cn/thumbnail/7326a63cly1frp6m822qaj22c0340qv6.jpg
     * bmiddle_pic : http://wx3.sinaimg.cn/bmiddle/7326a63cly1frp6m822qaj22c0340qv6.jpg
     * original_pic : http://wx3.sinaimg.cn/large/7326a63cly1frp6m822qaj22c0340qv6.jpg
     * geo : {"type":"Point","coordinates":[30.221045,120.14772]}
     * is_paid : false
     * mblog_vip_type : 0
     * user : {"id":1931912764,"idstr":"1931912764","class":1,"screen_name":"杭州市匿名网友小孙","name":"杭州市匿名网友小孙","province":"100","city":"1000","location":"其他","description":"🌸笑点高泪点低。","url":"","profile_image_url":"http://tvax2.sinaimg.cn/crop.0.0.751.751.50/7326a63cly8fres42hl4pj20kv0kvjss.jpg","cover_image":"http://ww2.sinaimg.cn/crop.0.227.980.300/7326a63cgw1dxyi7i7hhxj.jpg","cover_image_phone":"http://ww1.sinaimg.cn/crop.0.0.640.640.640/9d44112bjw1f1xl1c10tuj20hs0hs0tw.jpg","profile_url":"sunyiwen1116","domain":"sunyiwen1116","weihao":"","gender":"f","followers_count":894,"friends_count":384,"pagefriends_count":0,"statuses_count":571,"favourites_count":393,"createdAt":"Fri Feb 04 12:51:19 +0800 2011","following":false,"allow_all_act_msg":false,"geo_enabled":true,"verified":false,"verified_type":220,"remark":"","insecurity":{"sexual_content":false},"ptype":0,"allow_all_comment":true,"avatar_large":"http://tvax2.sinaimg.cn/crop.0.0.751.751.180/7326a63cly8fres42hl4pj20kv0kvjss.jpg","avatar_hd":"http://tvax2.sinaimg.cn/crop.0.0.751.751.1024/7326a63cly8fres42hl4pj20kv0kvjss.jpg","verified_reason":"","verified_trade":"","verified_reason_url":"","verified_source":"","verified_source_url":"","follow_me":false,"like":false,"like_me":false,"online_status":0,"bi_followers_count":291,"lang":"zh-cn","star":0,"mbtype":2,"mbrank":1,"block_word":0,"block_app":0,"credit_score":80,"user_ability":0,"cardid":"star_095","avatargj_id":"gj_vip_072","urank":33,"story_read_state":-1,"vclub_member":0}
     * annotations : [{"place":{"poiid":"B2094757D06AA7FA439F","title":"蓝天清水湾国际大酒店","type":"checkin"},"client_mblogid":"iPhone-574C94F3-8660-44A9-9C87-712DC1AB7504"},{"mapi_request":true}]
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

    private String createdAt;
    private long id;
    private String idstr;
    private String mid;
    private boolean canEdit;
    private String text;
    private int textLength;
    private int source_allowclick;
    private int sourceType;
    private String source;
    private boolean favorited;
    private boolean truncated;
    private String in_reply_to_status_id;
    private String in_reply_to_user_id;
    private String in_reply_to_screen_name;
    private String thumbnail_pic;
    private String bmiddle_pic;
    private String original_pic;
    private boolean is_paid;
    private int mblog_vip_type;
    private String picStatus;
    private int reposts_count;
    private int comments_count;
    private int attitudes_count;
    private int pending_approval_count;
    private boolean isLongText;
    private int mlevel;
    private long biz_feature;
    private int hasActionTypeCard;
    private int userType;
    private int more_info_type;
    private int positive_recom_flag;
    private int content_auth;
    private String gif_ids;
    private int is_show_bulletin;
    private int page_type;
    private String cardid;
    private String pic_video;

    private Geo geo;
    private User user;
    private Visible visible;
    private CommentManageInfo comment_manage_info;
    private List<PicUrls> pic_urls;
    private List<Annotation> annotations;
    private List<Integer> biz_ids;
    private List<?> darwin_tags;
    private List<?> hot_weibo_tags;
    private List<?> text_tag_tips;

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

    public String getIdstr() {
        return idstr;
    }

    public void setIdstr(String idstr) {
        this.idstr = idstr;
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

    public int getSource_allowclick() {
        return source_allowclick;
    }

    public void setSource_allowclick(int source_allowclick) {
        this.source_allowclick = source_allowclick;
    }

    public int getSourceType() {
        return sourceType;
    }

    public void setSourceType(int sourceType) {
        this.sourceType = sourceType;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
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

    public String getIn_reply_to_status_id() {
        return in_reply_to_status_id;
    }

    public void setIn_reply_to_status_id(String in_reply_to_status_id) {
        this.in_reply_to_status_id = in_reply_to_status_id;
    }

    public String getIn_reply_to_user_id() {
        return in_reply_to_user_id;
    }

    public void setIn_reply_to_user_id(String in_reply_to_user_id) {
        this.in_reply_to_user_id = in_reply_to_user_id;
    }

    public String getIn_reply_to_screen_name() {
        return in_reply_to_screen_name;
    }

    public void setIn_reply_to_screen_name(String in_reply_to_screen_name) {
        this.in_reply_to_screen_name = in_reply_to_screen_name;
    }

    public String getThumbnail_pic() {
        return thumbnail_pic;
    }

    public void setThumbnail_pic(String thumbnail_pic) {
        this.thumbnail_pic = thumbnail_pic;
    }

    public String getBmiddle_pic() {
        return bmiddle_pic;
    }

    public void setBmiddle_pic(String bmiddle_pic) {
        this.bmiddle_pic = bmiddle_pic;
    }

    public String getOriginal_pic() {
        return original_pic;
    }

    public void setOriginal_pic(String original_pic) {
        this.original_pic = original_pic;
    }

    public Geo getGeo() {
        return geo;
    }

    public void setGeo(Geo geo) {
        this.geo = geo;
    }

    public boolean isIs_paid() {
        return is_paid;
    }

    public void setIs_paid(boolean is_paid) {
        this.is_paid = is_paid;
    }

    public int getMblog_vip_type() {
        return mblog_vip_type;
    }

    public void setMblog_vip_type(int mblog_vip_type) {
        this.mblog_vip_type = mblog_vip_type;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getPicStatus() {
        return picStatus;
    }

    public void setPicStatus(String picStatus) {
        this.picStatus = picStatus;
    }

    public int getReposts_count() {
        return reposts_count;
    }

    public void setReposts_count(int reposts_count) {
        this.reposts_count = reposts_count;
    }

    public int getComments_count() {
        return comments_count;
    }

    public void setComments_count(int comments_count) {
        this.comments_count = comments_count;
    }

    public int getAttitudes_count() {
        return attitudes_count;
    }

    public void setAttitudes_count(int attitudes_count) {
        this.attitudes_count = attitudes_count;
    }

    public int getPending_approval_count() {
        return pending_approval_count;
    }

    public void setPending_approval_count(int pending_approval_count) {
        this.pending_approval_count = pending_approval_count;
    }

    public boolean isIsLongText() {
        return isLongText;
    }

    public void setIsLongText(boolean isLongText) {
        this.isLongText = isLongText;
    }

    public int getMlevel() {
        return mlevel;
    }

    public void setMlevel(int mlevel) {
        this.mlevel = mlevel;
    }

    public Visible getVisible() {
        return visible;
    }

    public void setVisible(Visible visible) {
        this.visible = visible;
    }

    public long getBiz_feature() {
        return biz_feature;
    }

    public void setBiz_feature(long biz_feature) {
        this.biz_feature = biz_feature;
    }

    public int getHasActionTypeCard() {
        return hasActionTypeCard;
    }

    public void setHasActionTypeCard(int hasActionTypeCard) {
        this.hasActionTypeCard = hasActionTypeCard;
    }

    public int getUserType() {
        return userType;
    }

    public void setUserType(int userType) {
        this.userType = userType;
    }

    public int getMore_info_type() {
        return more_info_type;
    }

    public void setMore_info_type(int more_info_type) {
        this.more_info_type = more_info_type;
    }

    public int getPositive_recom_flag() {
        return positive_recom_flag;
    }

    public void setPositive_recom_flag(int positive_recom_flag) {
        this.positive_recom_flag = positive_recom_flag;
    }

    public int getContent_auth() {
        return content_auth;
    }

    public void setContent_auth(int content_auth) {
        this.content_auth = content_auth;
    }

    public String getGif_ids() {
        return gif_ids;
    }

    public void setGif_ids(String gif_ids) {
        this.gif_ids = gif_ids;
    }

    public int getIs_show_bulletin() {
        return is_show_bulletin;
    }

    public void setIs_show_bulletin(int is_show_bulletin) {
        this.is_show_bulletin = is_show_bulletin;
    }

    public CommentManageInfo getComment_manage_info() {
        return comment_manage_info;
    }

    public void setComment_manage_info(CommentManageInfo comment_manage_info) {
        this.comment_manage_info = comment_manage_info;
    }

    public int getPage_type() {
        return page_type;
    }

    public void setPage_type(int page_type) {
        this.page_type = page_type;
    }

    public String getCardid() {
        return cardid;
    }

    public void setCardid(String cardid) {
        this.cardid = cardid;
    }

    public String getPic_video() {
        return pic_video;
    }

    public void setPic_video(String pic_video) {
        this.pic_video = pic_video;
    }

    public List<PicUrls> getPic_urls() {
        return pic_urls;
    }

    public void setPic_urls(List<PicUrls> pic_urls) {
        this.pic_urls = pic_urls;
    }

    public List<Annotation> getAnnotations() {
        return annotations;
    }

    public void setAnnotations(List<Annotation> annotations) {
        this.annotations = annotations;
    }

    public List<Integer> getBiz_ids() {
        return biz_ids;
    }

    public void setBiz_ids(List<Integer> biz_ids) {
        this.biz_ids = biz_ids;
    }

    public List<?> getDarwin_tags() {
        return darwin_tags;
    }

    public void setDarwin_tags(List<?> darwin_tags) {
        this.darwin_tags = darwin_tags;
    }

    public List<?> getHot_weibo_tags() {
        return hot_weibo_tags;
    }

    public void setHot_weibo_tags(List<?> hot_weibo_tags) {
        this.hot_weibo_tags = hot_weibo_tags;
    }

    public List<?> getText_tag_tips() {
        return text_tag_tips;
    }

    public void setText_tag_tips(List<?> text_tag_tips) {
        this.text_tag_tips = text_tag_tips;
    }

    public static class GeoBean {
        /**
         * type : Point
         * coordinates : [30.221045,120.14772]
         */

        private String type;
        private List<Double> coordinates;

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public List<Double> getCoordinates() {
            return coordinates;
        }

        public void setCoordinates(List<Double> coordinates) {
            this.coordinates = coordinates;
        }
    }

    public static class Visible {
        /**
         * type : 0
         * list_id : 0
         */

        private int type;
        private int list_id;

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }

        public int getList_id() {
            return list_id;
        }

        public void setList_id(int list_id) {
            this.list_id = list_id;
        }
    }

    public static class CommentManageInfo {
        /**
         * comment_permission_type : -1
         * approval_comment_type : 0
         */

        private int comment_permission_type;
        private int approval_comment_type;

        public int getComment_permission_type() {
            return comment_permission_type;
        }

        public void setComment_permission_type(int comment_permission_type) {
            this.comment_permission_type = comment_permission_type;
        }

        public int getApproval_comment_type() {
            return approval_comment_type;
        }

        public void setApproval_comment_type(int approval_comment_type) {
            this.approval_comment_type = approval_comment_type;
        }
    }

    public static class PicUrls {
        /**
         * thumbnail_pic : http://wx3.sinaimg.cn/thumbnail/7326a63cly1frp6m822qaj22c0340qv6.jpg
         */

        private String thumbnail_pic;

        public String getThumbnail_pic() {
            return thumbnail_pic;
        }

        public void setThumbnail_pic(String thumbnail_pic) {
            this.thumbnail_pic = thumbnail_pic;
        }
    }

}
