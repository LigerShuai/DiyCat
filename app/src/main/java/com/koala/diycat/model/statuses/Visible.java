package com.koala.diycat.model.statuses;

import com.google.gson.annotations.SerializedName;

/**
 *
 * @author Liger
 * @date 2018/8/20 22:43
 */
public class Visible {
    /**
     * type : 0
     * list_id : 0
     */

    //0：普通微博，1：私密微博，3：指定分组微博，4：密友微博
    private int type;

    //分组的组号
    @SerializedName("list_id")
    private int listId;

    public int getType() {
        return type;
    }

    public int getListId() {
        return listId;
    }
}
