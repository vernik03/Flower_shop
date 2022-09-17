package com.flowers.big;

import com.flowers.Color;
import com.flowers.Flower;
import com.flowers.Name;

import java.time.LocalDate;

public class BigFlower extends Flower
{
    public BigFlower(Name name, Color color, int price, int height, String delivery_date) {
        super(name, color, price, height, delivery_date);
    }
}