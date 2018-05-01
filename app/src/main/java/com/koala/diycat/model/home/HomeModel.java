package com.koala.diycat.model.home;

/**
 * @author Liger
 * @date 2018/5/1 19:44
 */
public class HomeModel {

    /**
     "count":15,
     "total":0,
     "nextPageUrl":"http://baobab.kaiyanapp.com/api/v4/tabs/selected?date=1524963600000&num=2&page=2",
     "adExist":false,
     "date":1525136400000,
     "nextPublishTime":1525222800000,
     "dialog":null,
     "topIssue":null,
     "refreshCount":0,
     "lastStartId":0
     */

    private HomeData homeData;
    private int count;
    private String nextPageUrl;
    private boolean adExist;
    private long date;
    private long nextPublishTime;
    private int refreshCount;
    private int lastStartId;

    public HomeData getHomeData() {
        return homeData;
    }

    public void setHomeData(HomeData homeData) {
        this.homeData = homeData;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getNextPageUrl() {
        return nextPageUrl;
    }

    public void setNextPageUrl(String nextPageUrl) {
        this.nextPageUrl = nextPageUrl;
    }

    public boolean isAdExist() {
        return adExist;
    }

    public void setAdExist(boolean adExist) {
        this.adExist = adExist;
    }

    public long getDate() {
        return date;
    }

    public void setDate(long date) {
        this.date = date;
    }

    public long getNextPublishTime() {
        return nextPublishTime;
    }

    public void setNextPublishTime(long nextPublishTime) {
        this.nextPublishTime = nextPublishTime;
    }

    public int getRefreshCount() {
        return refreshCount;
    }

    public void setRefreshCount(int refreshCount) {
        this.refreshCount = refreshCount;
    }

    public int getLastStartId() {
        return lastStartId;
    }

    public void setLastStartId(int lastStartId) {
        this.lastStartId = lastStartId;
    }
}
