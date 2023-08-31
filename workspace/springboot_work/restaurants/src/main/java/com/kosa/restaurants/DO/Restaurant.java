package com.kosa.restaurants.DO;

import com.fasterxml.jackson.annotation.JsonFilter;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonFilter("RestInfo")
public class Restaurant {
    private int id;
    private String name;
    private String address;
    private String createAt;
    private String updateAt;
    private List<Menu> menus;
    private List<Review> reviews;

    @Override
    public String toString() {
        return "Restaurant{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", createAt='" + createAt + '\'' +
                ", updateAt='" + updateAt + '\'' +
                ", menus=" + menus +
                ", reviews=" + reviews +
                '}';
    }

    public Restaurant(int id, String name, String address, String createAt, String updateAt){
        this.id=id;
        this.name=name;
        this.address=address;
        this.createAt=createAt;
        this.updateAt=updateAt;
    }
//    public Restaurant(int id, String name, String address,String createAt, String updateAt,Menu menu){
//        this.id=id;
//        this.name=name;
//        this.address=address;
//        this.createAt=createAt;
//        this.updateAt=updateAt;
//        /this.menus=menu;
//    }
}
