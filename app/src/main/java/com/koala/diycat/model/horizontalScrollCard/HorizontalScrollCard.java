package com.koala.diycat.model.horizontalScrollCard;

import java.util.List;

/**
 * @author Liger
 * @date 2018/5/1 19:57
 */
public class HorizontalScrollCard {

    /**
     * dataType : HorizontalScrollCard
     * itemList : [{"type":"banner2","data":{"dataType":"Banner","id":839,"title":"","description":"","image":"http://img.kaiyanapp.com/75192042d0bbf54b56b8893f7d2d7682.jpeg?imageMogr2/quality/60/format/jpg","actionUrl":"eyepetizer://webview/?title=%E5%8D%81%E4%BA%8C%E9%A1%B9%E5%B9%BF%E5%91%8A%E5%A4%A7%E5%A5%96%EF%BC%8C%E4%B8%8D%E6%80%95%E4%BD%A0%E6%89%BE%E4%B8%8D%E5%88%B0%E7%81%B5%E6%84%9F&url=http%3A%2F%2Fwww.eyepetizer.net%2Farticle.html%3Fnid%3D1168%26shareable%3Dtrue","adTrack":null,"shade":false,"label":{"text":"","card":"","detail":null},"labelList":[],"header":{"id":0,"title":null,"font":null,"subTitle":null,"subTitleFont":null,"textAlign":"left","cover":null,"label":null,"actionUrl":null,"labelList":null,"icon":null,"description":null}},"tag":null,"id":0,"adIndex":-1}]
     * count : 1
     */

    private String dataType;
    private int count;
    private List<HorizontalScrollCardBean> itemList;

    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public List<HorizontalScrollCardBean> getItemList() {
        return itemList;
    }

    public void setItemList(List<HorizontalScrollCardBean> itemList) {
        this.itemList = itemList;
    }

}
