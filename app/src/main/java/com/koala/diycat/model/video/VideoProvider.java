package com.koala.diycat.model.video;

/**
 * 内容提供商信息
 *
 * @author Liger
 * @date 2018/5/1 17:42
 */
public class VideoProvider {
    /**
     * name : 定制来源
     * alias : CustomSrc
     * icon :
     */

    private String name;
    private String alias;
    private String icon;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }
}