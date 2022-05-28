package com.example.beepz.services.model;

public class TrackerModel {
    private String name;
    private int circleNormal;
    private int circleColored;
    private int imageNormal;
    private int imageColored;

    public TrackerModel(String name, int circleNormal, int circleColored, int imageNormal, int imageColored) {
        this.name = name;
        this.circleNormal = circleNormal;
        this.circleColored = circleColored;
        this.imageNormal = imageNormal;
        this.imageColored = imageColored;
    }

    public String getName() {
        return name;
    }

    public int getCircleNormal() {
        return circleNormal;
    }

    public int getCircleColored() {
        return circleColored;
    }

    public int getImageNormal() {
        return imageNormal;
    }

    public int getImageColored() {
        return imageColored;
    }
}
