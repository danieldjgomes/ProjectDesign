package com.travelReview.demo.model;

import lombok.Data;

@Data
public abstract class Media {

    private String url;
    private String title;

    public Media(String url, String title, MediaStatus status) {
        this.url = url;
        this.title = title;
        this.status = status;
    }

    private MediaStatus status;


}
