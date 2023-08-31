package com.kosa.restaurants.service;

import com.kosa.restaurants.DO.Review;

import java.util.List;

public interface ReviewService {

    public Review saveReview(Review review);

    public int deleteReview(int review_id);

    public List<Review> allReviews(int restaurant_id);
}
