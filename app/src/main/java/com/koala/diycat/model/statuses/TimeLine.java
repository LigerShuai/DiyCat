package com.koala.diycat.model.statuses;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Weibo 时间线
 *
 * @author Liger
 * @date 2018/5/27 18:05
 */
public class TimeLine {

    @SerializedName("hasvisible")
    private boolean hasVisible;

    @SerializedName("total_number")
    private int totalNumber;

    @SerializedName("interval")
    private int interval;

    private List<Status> statuses;

    public boolean isHasVisible() {
        return hasVisible;
    }

    public void setHasVisible(boolean hasVisible) {
        this.hasVisible = hasVisible;
    }

    public int getTotalNumber() {
        return totalNumber;
    }

    public void setTotalNumber(int totalNumber) {
        this.totalNumber = totalNumber;
    }

    public int getInterval() {
        return interval;
    }

    public void setInterval(int interval) {
        this.interval = interval;
    }

    public List<Status> getStatuses() {
        return statuses;
    }

    public void setStatuses(List<Status> statuses) {
        this.statuses = statuses;
    }
}
