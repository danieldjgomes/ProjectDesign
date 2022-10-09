package com.travelReview.demo.model;

public class Image extends Media {

    private final String extension;

    public Image(String url, String title, MediaStatus status, String extension) {
        super(url, title, status);
        this.extension = extension;
    }
}
