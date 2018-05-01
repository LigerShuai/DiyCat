package com.koala.diycat.model.video;

import java.util.List;

/**
 * https://github.com/jokermonn/-Api/blob/master/Eyepetizer.md#home
 *
 * @author Liger
 * @date 2018/5/1 17:26
 */
public class Video {

    /**
     * dataType : VideoBeanForClient
     * id : 85595
     * title : 天空 VS 雪地，山地车就该这么玩
     * description : 当山地车上加上降落伞，这奇妙的搭配让这个单纯的骑行视频变得与众不同！专业的山地车选手 Kilian Bron 在空中展示了他高超精湛的技巧，与友人 Eliot Nochez 的这场陆地与高空的竞赛，有够刺激！
     * library : DAILY
     * tags : [{"id":681,"name":"极限运动","actionUrl":"eyepetizer://tag/681/?title=%E6%9E%81%E9%99%90%E8%BF%90%E5%8A%A8","adTrack":null,"desc":"","bgPicture":"http://img.kaiyanapp.com/fa978756b844c4facbc08656a9916415.jpeg?imageMogr2/quality/60/format/jpg","headerImage":"http://img.kaiyanapp.com/fa978756b844c4facbc08656a9916415.jpeg?imageMogr2/quality/60/format/jpg","tagRecType":"IMPORTANT"},{"id":312,"name":"BMX","actionUrl":"eyepetizer://tag/312/?title=BMX","adTrack":null,"desc":null,"bgPicture":"http://img.kaiyanapp.com/c6d444083e5c71545a32d7137bba7556.jpeg?imageMogr2/quality/60","headerImage":"http://img.kaiyanapp.com/489070df80a1f699ef2b6c84cac13f21.jpeg?imageMogr2/quality/100","tagRecType":"NORMAL"},{"id":4,"name":"运动","actionUrl":"eyepetizer://tag/4/?title=%E8%BF%90%E5%8A%A8","adTrack":null,"desc":null,"bgPicture":"http://img.kaiyanapp.com/522d2216b5f8aca639c296d71ac78753.jpeg?imageMogr2/quality/100","headerImage":"http://img.kaiyanapp.com/522d2216b5f8aca639c296d71ac78753.jpeg?imageMogr2/quality/100","tagRecType":"NORMAL"}]
     * consumption : {"collectionCount":216,"shareCount":107,"replyCount":6}
     * resourceType : video
     * slogan : 高空与陆地，谁才是最后赢家？
     * mVideoProvider : {"name":"定制来源","alias":"CustomSrc","icon":""}
     * category : 运动
     * author : {"id":134,"icon":"http://img.kaiyanapp.com/fef7cdcd26a44f0a30902838320d6b52.jpeg","name":"GoPro","description":"用第一人称视角记录刺激的运动和温暖的生活。","link":"","latestReleaseTime":1524704409000,"videoNum":595,"adTrack":null,"follow":{"itemType":"author","itemId":134,"followed":false},"shield":{"itemType":"author","itemId":134,"shielded":false},"approvedNotReadyVideoCount":0,"ifPgc":true}
     * cover : {"feed":"http://img.kaiyanapp.com/8a1fa155b48a598342436ac35b27abc9.jpeg?imageMogr2/quality/60/format/jpg","detail":"http://img.kaiyanapp.com/8a1fa155b48a598342436ac35b27abc9.jpeg?imageMogr2/quality/60/format/jpg","blurred":"http://img.kaiyanapp.com/a4453f6ccfae100e207dbd703316548f.jpeg?imageMogr2/quality/60/format/jpg","sharing":null,"homepage":"http://img.kaiyanapp.com/8a1fa155b48a598342436ac35b27abc9.jpeg?imageView2/1/w/720/h/560/format/jpg/q/75|watermark/1/image/aHR0cDovL2ltZy5rYWl5YW5hcHAuY29tL2JsYWNrXzMwLnBuZw==/dissolve/100/gravity/Center/dx/0/dy/0|imageslim"}
     * playUrl : http://baobab.kaiyanapp.com/api/v1/playUrl?vid=85595&resourceType=video&editionType=default&source=aliyun
     * thumbPlayUrl : null
     * duration : 147
     * webUrl : {"raw":"http://www.eyepetizer.net/detail.html?vid=85595","forWeibo":"http://www.eyepetizer.net/detail.html?vid=85595"}
     * releaseTime : 1519294770000
     * playInfo : []
     * campaign : null
     * waterMarks : null
     * adTrack : null
     * type : NORMAL
     * titlePgc :
     * descriptionPgc :
     * remark : null
     * ifLimitVideo : false
     * idx : 0
     * shareAdTrack : null
     * favoriteAdTrack : null
     * webAdTrack : null
     * date : 1525050000000
     * promotion : null
     * label : null
     * labelList : []
     * descriptionEditor : 当山地车上加上降落伞，这奇妙的搭配让这个单纯的骑行视频变得与众不同！专业的山地车选手 Kilian Bron 在空中展示了他高超精湛的技巧，与友人 Eliot Nochez 的这场陆地与高空的竞赛，有够刺激！
     * collected : false
     * played : false
     * subtitles : []
     * lastViewTime : null
     * playlists : null
     * src : null
     */

    /**
     * video 类型, 固定值: VideoBeanForClient
     */
    private String dataType;
    private int id;
    private String title;

    /**
     * 简易描述
     */
    private String description;
    /**
     * library : DAILY
     */
    private String library;
    private String resourceType;
    private String slogan;
    private String category;
    /**
     * 视频播放地址
     */
    private String playUrl;
    private String thumbPlayUrl;
    /**
     * 播放时长
     */
    private int duration;
    private WebUrl webUrl;
    private long releaseTime;
    private Object campaign;
    private Object waterMarks;
    private Object adTrack;
    private String type;
    private String titlePgc;
    private String descriptionPgc;
    private Object remark;
    private boolean ifLimitVideo;
    private int idx;
    private Object shareAdTrack;
    private Object favoriteAdTrack;
    private Object webAdTrack;
    private long date;
    private Object promotion;
    private Object label;
    private String descriptionEditor;
    private boolean collected;
    private boolean played;
    private Object lastViewTime;
    private Object playlists;
    private Object src;

    private List<Tags> tags;
    private List<PlayInfo> playInfo;
    private List<?> labelList;
    private List<?> subtitles;

    private Cover cover;
    private Consumption consumption;
    private VideoProvider mVideoProvider;
    private Author author;

    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLibrary() {
        return library;
    }

    public void setLibrary(String library) {
        this.library = library;
    }

    public Consumption getConsumption() {
        return consumption;
    }

    public void setConsumption(Consumption consumption) {
        this.consumption = consumption;
    }

    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public String getSlogan() {
        return slogan;
    }

    public void setSlogan(String slogan) {
        this.slogan = slogan;
    }

    public VideoProvider getVideoProvider() {
        return mVideoProvider;
    }

    public void setVideoProvider(VideoProvider videoProvider) {
        this.mVideoProvider = videoProvider;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Cover getCover() {
        return cover;
    }

    public void setCover(Cover cover) {
        this.cover = cover;
    }

    public String getPlayUrl() {
        return playUrl;
    }

    public void setPlayUrl(String playUrl) {
        this.playUrl = playUrl;
    }

    public String getThumbPlayUrl() {
        return thumbPlayUrl;
    }

    public void setThumbPlayUrl(String thumbPlayUrl) {
        this.thumbPlayUrl = thumbPlayUrl;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public WebUrl getWebUrl() {
        return webUrl;
    }

    public void setWebUrl(WebUrl webUrl) {
        this.webUrl = webUrl;
    }

    public long getReleaseTime() {
        return releaseTime;
    }

    public void setReleaseTime(long releaseTime) {
        this.releaseTime = releaseTime;
    }

    public Object getCampaign() {
        return campaign;
    }

    public void setCampaign(Object campaign) {
        this.campaign = campaign;
    }

    public Object getWaterMarks() {
        return waterMarks;
    }

    public void setWaterMarks(Object waterMarks) {
        this.waterMarks = waterMarks;
    }

    public Object getAdTrack() {
        return adTrack;
    }

    public void setAdTrack(Object adTrack) {
        this.adTrack = adTrack;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTitlePgc() {
        return titlePgc;
    }

    public void setTitlePgc(String titlePgc) {
        this.titlePgc = titlePgc;
    }

    public String getDescriptionPgc() {
        return descriptionPgc;
    }

    public void setDescriptionPgc(String descriptionPgc) {
        this.descriptionPgc = descriptionPgc;
    }

    public Object getRemark() {
        return remark;
    }

    public void setRemark(Object remark) {
        this.remark = remark;
    }

    public boolean isIfLimitVideo() {
        return ifLimitVideo;
    }

    public void setIfLimitVideo(boolean ifLimitVideo) {
        this.ifLimitVideo = ifLimitVideo;
    }

    public int getIdx() {
        return idx;
    }

    public void setIdx(int idx) {
        this.idx = idx;
    }

    public Object getShareAdTrack() {
        return shareAdTrack;
    }

    public void setShareAdTrack(Object shareAdTrack) {
        this.shareAdTrack = shareAdTrack;
    }

    public Object getFavoriteAdTrack() {
        return favoriteAdTrack;
    }

    public void setFavoriteAdTrack(Object favoriteAdTrack) {
        this.favoriteAdTrack = favoriteAdTrack;
    }

    public Object getWebAdTrack() {
        return webAdTrack;
    }

    public void setWebAdTrack(Object webAdTrack) {
        this.webAdTrack = webAdTrack;
    }

    public long getDate() {
        return date;
    }

    public void setDate(long date) {
        this.date = date;
    }

    public Object getPromotion() {
        return promotion;
    }

    public void setPromotion(Object promotion) {
        this.promotion = promotion;
    }

    public Object getLabel() {
        return label;
    }

    public void setLabel(Object label) {
        this.label = label;
    }

    public String getDescriptionEditor() {
        return descriptionEditor;
    }

    public void setDescriptionEditor(String descriptionEditor) {
        this.descriptionEditor = descriptionEditor;
    }

    public boolean isCollected() {
        return collected;
    }

    public void setCollected(boolean collected) {
        this.collected = collected;
    }

    public boolean isPlayed() {
        return played;
    }

    public void setPlayed(boolean played) {
        this.played = played;
    }

    public Object getLastViewTime() {
        return lastViewTime;
    }

    public void setLastViewTime(Object lastViewTime) {
        this.lastViewTime = lastViewTime;
    }

    public Object getPlaylists() {
        return playlists;
    }

    public void setPlaylists(Object playlists) {
        this.playlists = playlists;
    }

    public Object getSrc() {
        return src;
    }

    public void setSrc(Object src) {
        this.src = src;
    }

    public List<Tags> getTags() {
        return tags;
    }

    public void setTags(List<Tags> tags) {
        this.tags = tags;
    }

    public List<PlayInfo> getPlayInfo() {
        return playInfo;
    }

    public void setPlayInfo(List<PlayInfo> playInfo) {
        this.playInfo = playInfo;
    }

    public List<?> getLabelList() {
        return labelList;
    }

    public void setLabelList(List<?> labelList) {
        this.labelList = labelList;
    }

    public List<?> getSubtitles() {
        return subtitles;
    }

    public void setSubtitles(List<?> subtitles) {
        this.subtitles = subtitles;
    }

    /**
     * 网页链接
     */
    public static class WebUrl {
        /**
         * raw : http://www.eyepetizer.net/detail.html?vid=85595
         * forWeibo : http://www.eyepetizer.net/detail.html?vid=85595
         */

        private String raw;
        private String forWeibo;

        public String getRaw() {
            return raw;
        }

        public void setRaw(String raw) {
            this.raw = raw;
        }

        public String getForWeibo() {
            return forWeibo;
        }

        public void setForWeibo(String forWeibo) {
            this.forWeibo = forWeibo;
        }
    }

}
