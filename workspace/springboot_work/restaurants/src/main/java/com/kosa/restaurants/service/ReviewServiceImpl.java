package com.kosa.restaurants.service;

import com.kosa.restaurants.DO.Review;
import com.kosa.restaurants.mapper.ReviewMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewServiceImpl implements ReviewService{

    @Autowired
    private ReviewMapper mapper;
    @Override
    public Review saveReview(Review review) {
        mapper.save(review);
        return review;
    }

    @Override
    public int deleteReview(int review_id) {
        mapper.delete(review_id);
        return review_id;
    }

    @Override
    public List<Review> allReviews(int restaurant_id) {
        return mapper.getAll(restaurant_id);
    }
}
