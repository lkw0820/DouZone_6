package com.kosa.restaurants.DO;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
//@JsonFilter("ReviewInfo")
//@JsonIgnoreProperties(value = {"restaurant_id"})
public class Review {
    private int id;
    private String content;
    private float score;
    private String created_at;
    //@JsonIgnore
    private int restaurant_id;
}
