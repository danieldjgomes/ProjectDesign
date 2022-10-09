package com.travelReview.demo.Controller;

import com.travelReview.demo.Repository.ReviewRepository;
import com.travelReview.demo.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Collections;
import java.util.UUID;

@Component
public class StartUp {

    @Autowired
    private ReviewRepository reviewRepository;

    @EventListener(ContextRefreshedEvent.class)
    public void FillDataBase() {
        Review review = new Review();
        review.setPackageId(1L);
        review.setText("Muito Bom!");
        review.setRate(10);
        review.setUserId(1L);
        review.setMedias(Collections.singletonList(new Video("http:videoService.cloud/" + UUID.randomUUID(), "Viagem", MediaStatus.APPROVED, 50d, 60d, new Resolution(1080d, 720d))));

        Review review2 = new Review();
        review.setPackageId(1L);
        review.setText("Odiei, tem muitos problemas durante a viagem");
        review.setRate(0);
        review.setUserId(2L);
        review.setMedias(Arrays.asList(new Image("http:blob.cloud/" + UUID.randomUUID(), "Problemas no Hotel", MediaStatus.APPROVED, "jpg"), new Image("http:blob.cloud/" + UUID.randomUUID(), "Problemas com malas", MediaStatus.APPROVED, "png")));

        reviewRepository.save(review);
        reviewRepository.save(review2);
    }
}
