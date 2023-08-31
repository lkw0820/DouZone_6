package com.kosa.restaurants.mapper;

import com.kosa.restaurants.DO.Menu;
import com.kosa.restaurants.DO.Restaurant;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface RestaurantMapper {
    public List<Restaurant> getAll();
    public Restaurant getOne(int id);
    public int save(Restaurant restaurant);
    public int menuSave(Menu menu);
    public int update(Restaurant restaurant);
    public int menuUpdate(Menu menu);
    public int delete(int id);
    public List<Menu> getMenus(int restaurant_id);
}
