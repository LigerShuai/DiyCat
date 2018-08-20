package com.koala.diycat.model.statuses;

import com.google.gson.annotations.SerializedName;

/**
 * @author Liger
 * @date 2018/5/27 18:28
 */
public class User {

    /**
     * id : 5471012752
     * idstr : 5471012752
     * class : 1
     * screen_name : 魏成大器
     * name : 魏成大器
     * province : 14
     * city : 4
     * location : 山西 长治
     * description :
     * url :
     * profile_image_url : http://tva2.sinaimg.cn/crop.0.0.320.320.50/005YfOlajw8eo5c4cxlj3j308w08wq38.jpg
     * cover_image_phone : http://wx4.sinaimg.cn/crop.0.0.640.640.640/a1d3feably1fl9nr80k11j20hs0hsmze.jpg
     * profile_url : u/5471012752
     * domain :
     * weihao :
     * gender : f
     * followers_count : 55
     * friends_count : 148
     * pagefriends_count : 14
     * statuses_count : 45
     * favourites_count : 20
     * created_at : Sat Jan 10 08:50:48 +0800 2015
     * following : false
     * allow_all_act_msg : false
     * geo_enabled : true
     * verified : false
     * verified_type : -1
     * remark :
     * insecurity : {"sexual_content":false}
     * ptype : 0
     * allow_all_comment : true
     * avatar_large : http://tva2.sinaimg.cn/crop.0.0.320.320.180/005YfOlajw8eo5c4cxlj3j308w08wq38.jpg
     * avatar_hd : http://tva2.sinaimg.cn/crop.0.0.320.320.1024/005YfOlajw8eo5c4cxlj3j308w08wq38.jpg
     * verified_reason :
     * verified_trade :
     * verified_reason_url :
     * verified_source :
     * verified_source_url :
     * follow_me : false
     * like : false
     * like_me : false
     * online_status : 0
     * bi_followers_count : 19
     * lang : zh-cn
     * star : 0
     * mbtype : 0
     * mbrank : 0
     * block_word : 0
     * block_app : 0
     * credit_score : 80
     * user_ability : 2098176
     * urank : 9
     * story_read_state : -1
     * vclub_member : 0
     */

    @SerializedName("id")
    private long userId;

    @SerializedName("idstr")
    private String userIdStr;

    //用户昵称
    @SerializedName("screen_name")
    private String nickName;

    //友好显示名称
    @SerializedName("name")
    private String name;

    private String province;
    private String city;
    //用户所在地
    private String location;
    //用户个人描述
    private String description;

    //用户博客地址
    @SerializedName("url")
    private String blogUrl;

    //用户头像地址（中图），50×50像素
    @SerializedName("profile_image_url")
    private String avatarSmallUrl;

    //用户头像地址（大图），180×180像素
    @SerializedName("avatar_large")
    private String avatarLargeUrl;

    //用户头像地址（高清）
    @SerializedName("avatar_hd")
    private String avatarHdUrl;

    //用户的微博统一URL地址
    @SerializedName("profile_url")
    private String profileUrl;

    @SerializedName("cover_image_phone")
    private String cover_image_phone;

    //没有时不返回
    @SerializedName("cover_image")
    private String cover_image;

    //用户的个性化域名
    private String domain;
    //用户的微号
    private String weihao;
    //性别，m：男、f：女、n：未知
    private String gender;

    //粉丝数
    @SerializedName("followers_count")
    private int followers;

    //关注数
    @SerializedName("friends_count")
    private int friends;

    @SerializedName("pagefriends_count")
    private int pagefriends_count;

    @SerializedName("statuses_count")
    private int statuses_count;

    //收藏数
    @SerializedName("favourites_count")
    private int favourites;

    //用户创建（注册）时间
    @SerializedName("created_at")
    private String registerTime;

    //本人是否关注
    private boolean following;

    //是否允许所有人给我发私信
    @SerializedName("allow_all_act_msg")
    private boolean allowSecretMsg;

    //是否允许标识用户的地理位置
    @SerializedName("geo_enabled")
    private boolean geoEnabled;

    //是否是微博认证用户，即加V用户
    @SerializedName("verified")
    private boolean isVerified;

    @SerializedName("verified_type")
    private int verifiedType;

    //用户备注信息，只有在查询用户关系时才返回此字段
    private String remark;

    //是否允许所有人对我的微博进行评论
    @SerializedName("allow_all_comment")
    private boolean allowComment;

    //认证原因
    @SerializedName("verified_reason")
    private String verified_reason;

    @SerializedName("follow_me")
    private boolean isFollowMe;

    //用户的在线状态，0：不在线、1：在线
    @SerializedName("online_status")
    private int onlineStatus;

    //用户的互粉数
    @SerializedName("bi_followers_count")
    private int mutualFollowers;

    //用户当前的语言版本，zh-cn：简体中文，zh-tw：繁体中文，en：英语
    private String lang;

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getUserIdStr() {
        return userIdStr;
    }

    public void setUserIdStr(String userIdStr) {
        this.userIdStr = userIdStr;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getBlogUrl() {
        return blogUrl;
    }

    public void setBlogUrl(String blogUrl) {
        this.blogUrl = blogUrl;
    }

    public String getAvatarSmallUrl() {
        return avatarSmallUrl;
    }

    public void setAvatarSmallUrl(String avatarSmallUrl) {
        this.avatarSmallUrl = avatarSmallUrl;
    }

    public String getAvatarLargeUrl() {
        return avatarLargeUrl;
    }

    public void setAvatarLargeUrl(String avatarLargeUrl) {
        this.avatarLargeUrl = avatarLargeUrl;
    }

    public String getAvatarHdUrl() {
        return avatarHdUrl;
    }

    public void setAvatarHdUrl(String avatarHdUrl) {
        this.avatarHdUrl = avatarHdUrl;
    }

    public String getProfileUrl() {
        return profileUrl;
    }

    public void setProfileUrl(String profileUrl) {
        this.profileUrl = profileUrl;
    }

    public String getCover_image_phone() {
        return cover_image_phone;
    }

    public void setCover_image_phone(String cover_image_phone) {
        this.cover_image_phone = cover_image_phone;
    }

    public String getCover_image() {
        return cover_image;
    }

    public void setCover_image(String cover_image) {
        this.cover_image = cover_image;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getWeihao() {
        return weihao;
    }

    public void setWeihao(String weihao) {
        this.weihao = weihao;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getFollowers() {
        return followers;
    }

    public void setFollowers(int followers) {
        this.followers = followers;
    }

    public int getFriends() {
        return friends;
    }

    public void setFriends(int friends) {
        this.friends = friends;
    }

    public int getPagefriends_count() {
        return pagefriends_count;
    }

    public void setPagefriends_count(int pagefriends_count) {
        this.pagefriends_count = pagefriends_count;
    }

    public int getStatuses_count() {
        return statuses_count;
    }

    public void setStatuses_count(int statuses_count) {
        this.statuses_count = statuses_count;
    }

    public int getFavourites() {
        return favourites;
    }

    public void setFavourites(int favourites) {
        this.favourites = favourites;
    }

    public String getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(String registerTime) {
        this.registerTime = registerTime;
    }

    public boolean isFollowing() {
        return following;
    }

    public void setFollowing(boolean following) {
        this.following = following;
    }

    public boolean isAllowSecretMsg() {
        return allowSecretMsg;
    }

    public void setAllowSecretMsg(boolean allowSecretMsg) {
        this.allowSecretMsg = allowSecretMsg;
    }

    public boolean isGeoEnabled() {
        return geoEnabled;
    }

    public void setGeoEnabled(boolean geoEnabled) {
        this.geoEnabled = geoEnabled;
    }

    public boolean isVerified() {
        return isVerified;
    }

    public void setVerified(boolean verified) {
        isVerified = verified;
    }

    public int getVerifiedType() {
        return verifiedType;
    }

    public void setVerifiedType(int verifiedType) {
        this.verifiedType = verifiedType;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public boolean isAllowComment() {
        return allowComment;
    }

    public void setAllowComment(boolean allowComment) {
        this.allowComment = allowComment;
    }

    public String getVerified_reason() {
        return verified_reason;
    }

    public void setVerified_reason(String verified_reason) {
        this.verified_reason = verified_reason;
    }

    public boolean isFollowMe() {
        return isFollowMe;
    }

    public void setFollowMe(boolean followMe) {
        isFollowMe = followMe;
    }

    public int getOnlineStatus() {
        return onlineStatus;
    }

    public void setOnlineStatus(int onlineStatus) {
        this.onlineStatus = onlineStatus;
    }

    public int getMutualFollowers() {
        return mutualFollowers;
    }

    public void setMutualFollowers(int mutualFollowers) {
        this.mutualFollowers = mutualFollowers;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }
}
