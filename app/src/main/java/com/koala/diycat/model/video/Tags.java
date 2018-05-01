package com.koala.diycat.model.video;

/**
 * 视频标签
 *
 * @author Liger
 * @date 2018/5/1 19:23
 */
public class Tags {
    /**
     * id : 681
     * name : 极限运动
     * actionUrl : eyepetizer://tag/681/?title=%E6%9E%81%E9%99%90%E8%BF%90%E5%8A%A8
     * adTrack : null
     * desc :
     * bgPicture : http://img.kaiyanapp.com/fa978756b844c4facbc08656a9916415.jpeg?imageMogr2/quality/60/format/jpg
     * headerImage : http://img.kaiyanapp.com/fa978756b844c4facbc08656a9916415.jpeg?imageMogr2/quality/60/format/jpg
     * tagRecType : IMPORTANT
     */

    private int id;
    private String name;
    private String actionUrl;
    private Object adTrack;
    private String desc;
    private String bgPicture;
    private String headerImage;
    private String tagRecType;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getActionUrl() {
        return actionUrl;
    }

    public void setActionUrl(String actionUrl) {
        this.actionUrl = actionUrl;
    }

    public Object getAdTrack() {
        return adTrack;
    }

    public void setAdTrack(Object adTrack) {
        this.adTrack = adTrack;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getBgPicture() {
        return bgPicture;
    }

    public void setBgPicture(String bgPicture) {
        this.bgPicture = bgPicture;
    }

    public String getHeaderImage() {
        return headerImage;
    }

    public void setHeaderImage(String headerImage) {
        this.headerImage = headerImage;
    }

    public String getTagRecType() {
        return tagRecType;
    }

    public void setTagRecType(String tagRecType) {
        this.tagRecType = tagRecType;
    }
}