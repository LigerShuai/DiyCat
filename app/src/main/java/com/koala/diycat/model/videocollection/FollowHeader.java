package com.koala.diycat.model.videocollection;

import java.util.List;

/**
 * @author Liger
 * @date 2018/5/1 21:00
 */
public class FollowHeader {

    private CoverHeader coverHeader;
    private List<String> iconList;
    private String description;

    public CoverHeader getCoverHeader() {
        return coverHeader;
    }

    public void setCoverHeader(CoverHeader coverHeader) {
        this.coverHeader = coverHeader;
    }

    public List<String> getIconList() {
        return iconList;
    }

    public void setIconList(List<String> iconList) {
        this.iconList = iconList;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
