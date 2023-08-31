package com.kosa.restaurants.service;

import com.kosa.restaurants.DO.Menu;
import com.kosa.restaurants.DO.Restaurant;
import com.kosa.restaurants.DO.UserNotFoundException;
import com.kosa.restaurants.mapper.RestaurantMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class RestaurantServiceImpl implements RestaurantService{

    @Autowired
    private RestaurantMapper mapper;
    @Override
    public List<Restaurant> allRestaurants() {
        return mapper.getAll();
    }

    @Override
    public Restaurant oneRestaurant(int id) {
        if(mapper.getOne(id)==null){
            throw new UserNotFoundException(String.format("ID[%s] Not Found",id));
        }
        return mapper.getOne(id);
    }

    @Transactional
    @Override
    public Restaurant saveRestaurant(Restaurant restaurant) {
        mapper.save(restaurant);
        for(Menu menu:restaurant.getMenus()){
            menu.setRestaurant_id(restaurant.getId());
            mapper.menuSave(menu);
        }
        return restaurant;
    }

    @Transactional
    @Override
    public Restaurant updateRestaurant(Restaurant restaurant) {
        System.out.println(restaurant);
        if(mapper.getOne(restaurant.getId())==null){
            throw new UserNotFoundException(String.format("ID[%s] Not Found",restaurant.getId()));
        }
        mapper.update(restaurant);
        int cnt=0;
        for(Menu Upmenu : restaurant.getMenus()){

            for(Menu menu : mapper.getMenus(restaurant.getId())){
                if(Upmenu.getId()==menu.getId()){
                    mapper.menuUpdate(Upmenu);
                    cnt++;
                }
            }
            if(cnt==0){
                System.out.println("업데이트 할 메뉴가 없으므로 메뉴를 추가 합니다.");
                Upmenu.setRestaurant_id(restaurant.getId());
                mapper.menuSave(Upmenu);
            }
            cnt=0;
        }
        return restaurant;
    }

    @Override
    public int deleteRestaurant(int id) {
        mapper.delete(id);
        return id;
    }
}
