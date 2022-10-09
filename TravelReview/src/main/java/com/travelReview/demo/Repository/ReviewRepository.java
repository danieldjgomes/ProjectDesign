package com.travelReview.demo.Repository;

import com.travelReview.demo.model.Review;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReviewRepository extends ElasticsearchRepository<Review, Long> {
    Page<Review> findAllByTextContainingAndPackageId(String text, Long packageId, Pageable pageable);

}
