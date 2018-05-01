package com.koala.diycat.model.video;

/**
 * 内容提供商信息
 *
 * @author Liger
 * @date 2018/5/1 17:44
 */
public class Cover {
    /**
     * feed : http://img.kaiyanapp.com/8a1fa155b48a598342436ac35b27abc9.jpeg?imageMogr2/quality/60/format/jpg
     * detail : http://img.kaiyanapp.com/8a1fa155b48a598342436ac35b27abc9.jpeg?imageMogr2/quality/60/format/jpg
     * blurred : http://img.kaiyanapp.com/a4453f6ccfae100e207dbd703316548f.jpeg?imageMogr2/quality/60/format/jpg
     * sharing : null
     * homepage : http://img.kaiyanapp.com/8a1fa155b48a598342436ac35b27abc9.jpeg?imageView2/1/w/720/h/560/format/jpg/q/75|watermark/1/image/aHR0cDovL2ltZy5rYWl5YW5hcHAuY29tL2JsYWNrXzMwLnBuZw==/dissolve/100/gravity/Center/dx/0/dy/0|imageslim
     */

    private String feed;
    private String detail;
    private String blurred;
    private Object sharing;
    private String homepage;

    public String getFeed() {
        return feed;
    }

    public void setFeed(String feed) {
        this.feed = feed;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getBlurred() {
        return blurred;
    }

    public void setBlurred(String blurred) {
        this.blurred = blurred;
    }

    public Object getSharing() {
        return sharing;
    }

    public void setSharing(Object sharing) {
        this.sharing = sharing;
    }

    public String getHomepage() {
        return homepage;
    }

    public void setHomepage(String homepage) {
        this.homepage = homepage;
    }
}