package com.koala.diycat.model.statuses;

import java.util.List;

/**
 * @author Liger
 * @date 2018/5/27 18:33
 */
public class Geo {

    /**
     * type : Point
     * coordinates : [30.221045,120.14772]
     */

    private String type;
    private List<Double> coordinates;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<Double> getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(List<Double> coordinates) {
        this.coordinates = coordinates;
    }
}
