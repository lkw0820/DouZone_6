package com.kosa.restaurants.controller;

import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import com.kosa.restaurants.DO.Review;
import com.kosa.restaurants.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class ReviewController {

    @Autowired
    private ReviewService service;

    @PostMapping("/review")
    public ResponseEntity<Review> createReview(@RequestBody Review review){
        //System.out.println(review);
        Review savedReview=service.saveReview(review);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(savedReview.getId())
                .toUri();
        return ResponseEntity.created(location).build();
    }

    @DeleteMapping("/review/{id}")
    public ResponseEntity<Integer> deleteReview(@PathVariable int id){
        int delId = service.deleteReview(id);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(delId)
                .toUri();
        return ResponseEntity.created(location).build();
    }
    @GetMapping("/restaurant/{id}/reviews")
    public ResponseEntity reviews(@PathVariable int id){
        List<Review> reviews=service.allReviews(id);
//        SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter
//                .filterOutAllExcept("id","content","score","created_at");
//        FilterProvider filterProvider = new SimpleFilterProvider().addFilter("ReviewInfo",filter);
//
//        MappingJacksonValue mapping = new MappingJacksonValue(reviews);
//        mapping.setFilters(filterProvider);

        double tot=0.0;
        for(Review review:reviews){
            tot+=review.getScore();
        }
        double avg=tot/reviews.size();
        Map result = new HashMap<String,Object>();
        result.put("avgScore",avg);
        result.put("reviews",reviews);
        ResponseEntity entity = new ResponseEntity<>(result, HttpStatus.OK);
        return entity;
    }
}
