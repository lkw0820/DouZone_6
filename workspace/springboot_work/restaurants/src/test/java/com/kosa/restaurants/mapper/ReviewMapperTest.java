package com.kosa.restaurants.mapper;

import com.kosa.restaurants.DO.Review;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
@TestPropertySource(locations = "classpath:application.yml")
class ReviewMapperTest {

    @Autowired
    private ReviewMapper mapper;

    @Test
    void save() {
        Review review = new Review();
        review.setRestaurant_id(1);
        review.setContent("soso");
        review.setScore(5);
        mapper.save(review);
    }
//    @Test
//    void all(){
//        System.out.println(mapper.getAll(1));
//    }
}