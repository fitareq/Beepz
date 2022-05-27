package com.example.beepz.services.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class OrderTrack {
    @SerializedName("orderTrackId")
    @Expose
    private Integer orderTrackId;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("details")
    @Expose
    private String details;
    @SerializedName("level")
    @Expose
    private Integer level;
    @SerializedName("image")
    @Expose
    private String image;

    public Integer getOrderTrackId() {
        return orderTrackId;
    }

    public void setOrderTrackId(Integer orderTrackId) {
        this.orderTrackId = orderTrackId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
