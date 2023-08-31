package com.kosa.restaurants.service;

import com.kosa.restaurants.DO.Restaurant;
import org.springframework.stereotype.Service;

import java.util.List;


public interface RestaurantService {
    public List<Restaurant> allRestaurants();
    public Restaurant oneRestaurant(int id);
    public Restaurant saveRestaurant(Restaurant restaurant);
    public Restaurant updateRestaurant(Restaurant restaurant);
    public int deleteRestaurant(int id);

}
