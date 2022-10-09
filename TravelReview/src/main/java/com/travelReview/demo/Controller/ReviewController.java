package com.travelReview.demo.Controller;

import com.travelReview.demo.Service.ReviewService;
import com.travelReview.demo.model.Review;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(("/review"))
public class ReviewController {

    @Autowired
    private ReviewService reviewService;

    @GetMapping("/{packageId}")
    private Page<Review> searchForReviewByTextAndPackage(
            @RequestParam String text,
            @PathVariable Long packageId,
            Pageable pageable) {
        return reviewService.findAllByTextContainingAndPackageId(text, packageId, pageable);
    }

}
