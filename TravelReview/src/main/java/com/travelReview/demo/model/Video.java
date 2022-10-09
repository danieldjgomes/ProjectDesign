package com.travelReview.demo.model;

import lombok.Data;

@Data
public class Video extends Media {

    private Double length;
    private Double frameRate;
    private Resolution resolution;

    public Video(String url, String title, MediaStatus status, Double length, Double frameRate, Resolution resolution) {
        super(url, title, status);
        this.length = length;
        this.frameRate = frameRate;
        this.resolution = resolution;
    }
}
