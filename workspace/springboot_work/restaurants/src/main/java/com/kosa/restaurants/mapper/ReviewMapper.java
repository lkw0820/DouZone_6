package com.kosa.restaurants.mapper;

import com.kosa.restaurants.DO.Review;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ReviewMapper {
    public int save(Review review);
    public int delete(int review_id);
    public List<Review> getAll(int restaurant_id);
}
