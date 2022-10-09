package com.travelReview.demo.Service;

import com.travelReview.demo.Repository.ReviewRepository;
import com.travelReview.demo.model.Review;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class ReviewService {

    @Autowired
    private ReviewRepository reviewRepository;

    public Page<Review> findAllByTextContainingAndPackageId(String text, Long packageId, Pageable pageable) {
        return reviewRepository.findAllByTextContainingAndPackageId(text, packageId, pageable);
    }
}
