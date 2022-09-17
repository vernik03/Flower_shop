package com.flowers;

import com.flower_shop.Color;

import java.time.LocalDate;
import java.time.Period;


public class Flower {
    private Name name;
    private Color color;
    private Integer price;
    private Integer height;
    private LocalDate delivery_date;

    public Flower(Name name, Color color, int price, int height, String delivery_date) {
        this.name = name;
        this.color = color;
        this.price = price;
        this.height = height;
        this.delivery_date = LocalDate.parse(delivery_date);
    }

    public Name getName() {return name;}

    public Color getColor() {
        return color;
    }

    public Integer getPrice() {
        return price;
    }

    public Integer getHeight() {return height;}

    public LocalDate getDeliveryDate() {return delivery_date;}

    public Integer getFreshness(){
        return Period.between(delivery_date, LocalDate.now()).getDays();
    }
}
