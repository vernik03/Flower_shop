package com.flower_shop.accessories;

import com.flower_shop.Color;

public class Accessories {
    private AccessorieName name;
    private int price;
    private Color color;

    public Accessories(AccessorieName name, int price) {
        this.name = name;
        this.price = price;
    }

    public AccessorieName getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}
