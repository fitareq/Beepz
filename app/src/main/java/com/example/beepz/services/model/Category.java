package com.example.beepz.services.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Category {
    @SerializedName("categoryId")
    @Expose
    private Integer categoryId;
    @SerializedName("categoryName")
    @Expose
    private String categoryName;
    @SerializedName("icon")
    @Expose
    private String icon;
    @SerializedName("details")
    @Expose
    private String details;

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
}
