package com.koala.diycat.model.video;

/**
 * 视频作者信息
 *
 * @author Liger
 * @date 2018/5/1 19:20
 */
public class Author {
    /**
     * id : 134
     * icon : http://img.kaiyanapp.com/fef7cdcd26a44f0a30902838320d6b52.jpeg
     * name : GoPro
     * description : 用第一人称视角记录刺激的运动和温暖的生活。
     * link :
     * latestReleaseTime : 1524704409000
     * videoNum : 595
     * adTrack : null
     * follow : {"itemType":"author","itemId":134,"followed":false}
     * shield : {"itemType":"author","itemId":134,"shielded":false}
     * approvedNotReadyVideoCount : 0
     * ifPgc : true
     */

    private int id;
    private String icon;
    private String name;
    private String description;
    private String link;
    private long latestReleaseTime;
    private int videoNum;
    private Object adTrack;
    private FollowBean follow;
    private ShieldBean shield;
    private int approvedNotReadyVideoCount;
    private boolean ifPgc;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public long getLatestReleaseTime() {
        return latestReleaseTime;
    }

    public void setLatestReleaseTime(long latestReleaseTime) {
        this.latestReleaseTime = latestReleaseTime;
    }

    public int getVideoNum() {
        return videoNum;
    }

    public void setVideoNum(int videoNum) {
        this.videoNum = videoNum;
    }

    public Object getAdTrack() {
        return adTrack;
    }

    public void setAdTrack(Object adTrack) {
        this.adTrack = adTrack;
    }

    public FollowBean getFollow() {
        return follow;
    }

    public void setFollow(FollowBean follow) {
        this.follow = follow;
    }

    public ShieldBean getShield() {
        return shield;
    }

    public void setShield(ShieldBean shield) {
        this.shield = shield;
    }

    public int getApprovedNotReadyVideoCount() {
        return approvedNotReadyVideoCount;
    }

    public void setApprovedNotReadyVideoCount(int approvedNotReadyVideoCount) {
        this.approvedNotReadyVideoCount = approvedNotReadyVideoCount;
    }

    public boolean isIfPgc() {
        return ifPgc;
    }

    public void setIfPgc(boolean ifPgc) {
        this.ifPgc = ifPgc;
    }

    public static class FollowBean {
        /**
         * itemType : author
         * itemId : 134
         * followed : false
         */

        private String itemType;
        private int itemId;
        private boolean followed;

        public String getItemType() {
            return itemType;
        }

        public void setItemType(String itemType) {
            this.itemType = itemType;
        }

        public int getItemId() {
            return itemId;
        }

        public void setItemId(int itemId) {
            this.itemId = itemId;
        }

        public boolean isFollowed() {
            return followed;
        }

        public void setFollowed(boolean followed) {
            this.followed = followed;
        }
    }

    public static class ShieldBean {
        /**
         * itemType : author
         * itemId : 134
         * shielded : false
         */

        private String itemType;
        private int itemId;
        private boolean shielded;

        public String getItemType() {
            return itemType;
        }

        public void setItemType(String itemType) {
            this.itemType = itemType;
        }

        public int getItemId() {
            return itemId;
        }

        public void setItemId(int itemId) {
            this.itemId = itemId;
        }

        public boolean isShielded() {
            return shielded;
        }

        public void setShielded(boolean shielded) {
            this.shielded = shielded;
        }
    }
}