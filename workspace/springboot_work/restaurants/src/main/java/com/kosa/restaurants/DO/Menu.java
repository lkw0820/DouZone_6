package com.kosa.restaurants.DO;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Menu {
    private int id;
    @JsonIgnore
    private int restaurant_id;
    private String name;
    private int price;
    private String createAt;
    private String updateAt;


    public Menu(int id, String name, int price, String createAt, String updateAt) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.createAt = createAt;
        this.updateAt = updateAt;
    }
}
