package com.kosa.restaurants.mapper;

import com.kosa.restaurants.DO.Restaurant;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
@TestPropertySource(locations = "classpath:application.yml")
class RestaurantMapperTest {

    @Autowired
    private RestaurantMapper mapper;
//    @Test
//    void getAll() {
//        List<Restaurant> lists=mapper.getAll();
//        for(Restaurant restaurant : lists){
//            System.out.println(restaurant);
//        }
//    }


//    @Test
//    void getOne(){
//        System.out.println(mapper.getOne(1));
//    }

    @Test
    void save(){
        Restaurant rest = new Restaurant();
        rest.setName("맛집1");
        rest.setAddress("incheon");
        mapper.save(rest);
    }
}