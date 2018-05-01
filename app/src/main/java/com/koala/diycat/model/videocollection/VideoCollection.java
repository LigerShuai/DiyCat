package com.koala.diycat.model.videocollection;

import com.koala.diycat.model.video.Video;

import java.util.List;

/**
 * VideoCollectionWithCover and VideoCollectionWithHeader
 *
 * @author Liger
 * @date 2018/5/1 20:20
 */
public class VideoCollection {

    /**
     * {
     * "dataType":"ItemCollection",
     * "coverHeader":Object{...},
     * "itemList":Array[5],
     * "count":5,
     * "adTrack":null
     * }
     */

    private String dataType;
    private List<Video> videoList;
    private int count;
    private Object adTrack;

    private CoverHeader coverHeader;
    private FollowHeader followHeader;


    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public CoverHeader getCoverHeader() {
        return coverHeader;
    }

    public void setCoverHeader(CoverHeader coverHeader) {
        this.coverHeader = coverHeader;
    }

    public List<Video> getVideoList() {
        return videoList;
    }

    public void setVideoList(List<Video> videoList) {
        this.videoList = videoList;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Object getAdTrack() {
        return adTrack;
    }

    public void setAdTrack(Object adTrack) {
        this.adTrack = adTrack;
    }

    public FollowHeader getFollowHeader() {
        return followHeader;
    }

    public void setFollowHeader(FollowHeader followHeader) {
        this.followHeader = followHeader;
    }
}

