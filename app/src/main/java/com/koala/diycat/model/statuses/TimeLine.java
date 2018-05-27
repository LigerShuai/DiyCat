package com.koala.diycat.model.statuses;

import java.util.List;

/**
 *  Weibo 时间线
 *
 * @author Liger
 * @date 2018/5/27 18:05
 */
public class TimeLine {
    private boolean hasvisible;
    private int previousCursor;
    private int nextCursor;
    private int totalNumber;
    private int interval;
    private List<Status> statuses;

    public boolean isHasvisible() {
        return hasvisible;
    }

    public void setHasvisible(boolean hasvisible) {
        this.hasvisible = hasvisible;
    }

    public int getPreviousCursor() {
        return previousCursor;
    }

    public void setPreviousCursor(int previousCursor) {
        this.previousCursor = previousCursor;
    }

    public int getNextCursor() {
        return nextCursor;
    }

    public void setNextCursor(int nextCursor) {
        this.nextCursor = nextCursor;
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
