package com.koala.diycat.model.video;

/**
 * video 互动信息
 *
 * @author Liger
 * @date 2018/5/1 17:49
 */
public class Consumption {
    /*
     * collectionCount : 216
     * shareCount : 107
     * replyCount : 6
     */

    /**
     * 收藏次数
     */
    private int collectionCount;
    /**
     * 分享次数
     */
    private int shareCount;
    /**
     * 回复次数
     */
    private int replyCount;

    public int getCollectionCount() {
        return collectionCount;
    }

    public void setCollectionCount(int collectionCount) {
        this.collectionCount = collectionCount;
    }

    public int getShareCount() {
        return shareCount;
    }

    public void setShareCount(int shareCount) {
        this.shareCount = shareCount;
    }

    public int getReplyCount() {
        return replyCount;
    }

    public void setReplyCount(int replyCount) {
        this.replyCount = replyCount;
    }
}