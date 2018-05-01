package com.koala.diycat.model.home;

import com.koala.diycat.model.horizontalScrollCard.HorizontalScrollCard;
import com.koala.diycat.model.textheader.TextHeaderOrFooter;
import com.koala.diycat.model.video.Video;
import com.koala.diycat.model.videocollection.VideoCollection;

/**
 * @author Liger
 * @date 2018/5/1 17:22
 */
public class HomeData {

    /**
     * 6种数据类型. video,videoCollectionWithCover,videoCollectionOfFollow,textHeader,textFooter,horizontalScrollCard
     */
    private String type;
    private int tag;
    private int id;
    private int adIndex;

    private Video video;
    private TextHeaderOrFooter headerOrFooter;
    private VideoCollection videoCollection;
    private HorizontalScrollCard horizontalScrollCard;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getTag() {
        return tag;
    }

    public void setTag(int tag) {
        this.tag = tag;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAdIndex() {
        return adIndex;
    }

    public void setAdIndex(int adIndex) {
        this.adIndex = adIndex;
    }

    public Video getVideo() {
        return video;
    }

    public void setVideo(Video video) {
        this.video = video;
    }

    public TextHeaderOrFooter getHeaderOrFooter() {
        return headerOrFooter;
    }

    public void setHeaderOrFooter(TextHeaderOrFooter headerOrFooter) {
        this.headerOrFooter = headerOrFooter;
    }

    public VideoCollection getVideoCollection() {
        return videoCollection;
    }

    public void setVideoCollection(VideoCollection videoCollection) {
        this.videoCollection = videoCollection;
    }

    public HorizontalScrollCard getHorizontalScrollCard() {
        return horizontalScrollCard;
    }

    public void setHorizontalScrollCard(HorizontalScrollCard horizontalScrollCard) {
        this.horizontalScrollCard = horizontalScrollCard;
    }
}
