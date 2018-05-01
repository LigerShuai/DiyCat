package com.koala.diycat.model.videocollection;

import java.util.List;

/**
 * @author Liger
 * @date 2018/5/1 20:20
 */
public class CoverHeader {
    /**
     * id : 296
     * title : null
     * font : normal
     * subTitle : null
     * subTitleFont : null
     * textAlign : middle
     * cover : http://img.kaiyanapp.com/fffe19ee24e548bcf24912ee39d6df96.jpeg?imageMogr2/quality/60/format/jpg
     * label : {"text":"","card":"","detail":null}
     * actionUrl : eyepetizer://webview/?title=%E5%BC%95%E7%88%86%E5%88%9B%E6%84%8F%EF%BC%81%E8%BF%99%E4%BA%9B%E5%B9%BF%E5%91%8A%E8%B6%85%E4%BC%9A%E7%8E%A9&url=http%3A%2F%2Fwww.eyepetizer.net%2Fvideos_article.html%3Fnid%3D296%26shareable%3Dtrue
     * labelList : [{"text":"","actionUrl":null}]
     */

    private int id;
    private Object title;
    private String font;
    private Object subTitle;
    private Object subTitleFont;
    private String textAlign;
    private String cover;
    private LabelBean label;
    private String actionUrl;
    private List<LabelListBean> labelList;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Object getTitle() {
        return title;
    }

    public void setTitle(Object title) {
        this.title = title;
    }

    public String getFont() {
        return font;
    }

    public void setFont(String font) {
        this.font = font;
    }

    public Object getSubTitle() {
        return subTitle;
    }

    public void setSubTitle(Object subTitle) {
        this.subTitle = subTitle;
    }

    public Object getSubTitleFont() {
        return subTitleFont;
    }

    public void setSubTitleFont(Object subTitleFont) {
        this.subTitleFont = subTitleFont;
    }

    public String getTextAlign() {
        return textAlign;
    }

    public void setTextAlign(String textAlign) {
        this.textAlign = textAlign;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public LabelBean getLabel() {
        return label;
    }

    public void setLabel(LabelBean label) {
        this.label = label;
    }

    public String getActionUrl() {
        return actionUrl;
    }

    public void setActionUrl(String actionUrl) {
        this.actionUrl = actionUrl;
    }

    public List<LabelListBean> getLabelList() {
        return labelList;
    }

    public void setLabelList(List<LabelListBean> labelList) {
        this.labelList = labelList;
    }

    public static class LabelBean {
        /**
         * text :
         * card :
         * detail : null
         */

        private String text;
        private String card;
        private Object detail;

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }

        public String getCard() {
            return card;
        }

        public void setCard(String card) {
            this.card = card;
        }

        public Object getDetail() {
            return detail;
        }

        public void setDetail(Object detail) {
            this.detail = detail;
        }
    }

    public static class LabelListBean {
        /**
         * text :
         * actionUrl : null
         */

        private String text;
        private Object actionUrl;

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }

        public Object getActionUrl() {
            return actionUrl;
        }

        public void setActionUrl(Object actionUrl) {
            this.actionUrl = actionUrl;
        }
    }
}

