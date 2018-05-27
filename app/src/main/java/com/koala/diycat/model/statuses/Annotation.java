package com.koala.diycat.model.statuses;

/**
 * @author Liger
 * @date 2018/5/27 18:43
 */
public class Annotation {

    /**
     * place : {"poiid":"B2094757D06AA7FA439F","title":"蓝天清水湾国际大酒店","type":"checkin"}
     * clientBlogId : iPhone-574C94F3-8660-44A9-9C87-712DC1AB7504
     */

    private Place place;
    private String clientBlogId;

    public Place getPlace() {
        return place;
    }

    public void setPlace(Place place) {
        this.place = place;
    }

    public String getClientBlogId() {
        return clientBlogId;
    }

    public void setClientBlogId(String clientBlogId) {
        this.clientBlogId = clientBlogId;
    }

    public static class Place {
        /**
         * poiid : B2094757D06AA7FA439F
         * title : 蓝天清水湾国际大酒店
         * type : checkin
         */

        private String poiid;
        private String title;
        private String type;

        public String getPoiid() {
            return poiid;
        }

        public void setPoiid(String poiid) {
            this.poiid = poiid;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }
    }
}
