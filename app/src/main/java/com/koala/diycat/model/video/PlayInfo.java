package com.koala.diycat.model.video;

import java.util.List;

/**
 * 视频播放信息
 *
 * @author Liger
 * @date 2018/5/1 19:28
 */
public class PlayInfo {

    /**
     * height : 480
     * width : 854
     * urlList : [{"name":"aliyun","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=39206&resourceType=video&editionType=normal&source=aliyun","size":18735871},{"name":"qcloud","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=39206&resourceType=video&editionType=normal&source=qcloud","size":18735871},{"name":"ucloud","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=39206&resourceType=video&editionType=normal&source=ucloud","size":18735871}]
     * name : 标清
     * type : normal
     * url : http://baobab.kaiyanapp.com/api/v1/playUrl?vid=39206&resourceType=video&editionType=normal&source=aliyun
     */

    private int height;
    private int width;
    private String name;
    private String type;
    private String url;
    private List<UrlInfo> urlList;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public List<UrlInfo> getUrlList() {
        return urlList;
    }

    public void setUrlList(List<UrlInfo> urlList) {
        this.urlList = urlList;
    }

    public static class UrlInfo {
        /**
         * name : aliyun
         * url : http://baobab.kaiyanapp.com/api/v1/playUrl?vid=39206&resourceType=video&editionType=normal&source=aliyun
         * size : 18735871
         */

        private String name;
        private String url;
        private int size;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public int getSize() {
            return size;
        }

        public void setSize(int size) {
            this.size = size;
        }
    }
}
