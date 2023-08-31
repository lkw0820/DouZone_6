package com.kosa.restaurants.controller;

import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import com.kosa.restaurants.DO.Restaurant;
import com.kosa.restaurants.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
public class RestaurantController {

    @Autowired
    private RestaurantService service;

    @GetMapping("/restaurants")
    public MappingJacksonValue restaurants(){
        List<Restaurant> restaurants = service.allRestaurants();
        SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter
                .filterOutAllExcept("id","name","address","createAt","updateAt");
        FilterProvider filterProvider = new SimpleFilterProvider().addFilter("RestInfo",filter);

        MappingJacksonValue mapping = new MappingJacksonValue(restaurants);
        mapping.setFilters(filterProvider);
        return mapping;
    }

    @GetMapping("/restaurant/{id}")
    public MappingJacksonValue restaurant(@PathVariable int id){
        Restaurant restaurant = service.oneRestaurant(id);
        restaurant.getMenus();
        SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter
                .filterOutAllExcept("id","name","address","createAt","updateAt","menus");
        FilterProvider filterProvider = new SimpleFilterProvider().addFilter("RestInfo",filter);
        MappingJacksonValue mapping = new MappingJacksonValue(restaurant);
        mapping.setFilters(filterProvider);
        return mapping;
    }

    @PostMapping("/restaurant")
    public ResponseEntity<Restaurant> createRestaurant(@RequestBody Restaurant restaurant){
        //System.out.println(restaurant);
        Restaurant savedRestaurant = service.saveRestaurant(restaurant);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(savedRestaurant.getId())
                .toUri(); //만든 유저 객체 정보를 보여주기 위해서 uri를 만들어 줌

        return ResponseEntity.created(location).build();
    }

    @PutMapping("/restaurant/{id}")
    public ResponseEntity<Restaurant> updateRestaurant(@PathVariable int id, @RequestBody Restaurant restaurant){
        restaurant.setId(id);
        System.out.println(restaurant);
        Restaurant updatedRestaurant = service.updateRestaurant(restaurant);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(updatedRestaurant.getId())
                .toUri();

        return ResponseEntity.created(location).build();
    }

    @DeleteMapping("/restaurant/{id}")
    public ResponseEntity<Integer> deleteRestaurant(@PathVariable int id){
        int delId = service.deleteRestaurant(id);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(delId)
                .toUri();
        return ResponseEntity.created(location).build();
    }


}
