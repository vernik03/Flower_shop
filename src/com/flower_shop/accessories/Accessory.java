package com.flower_shop.accessories;

import com.flower_shop.Color;

public class Accessory {
    protected AccessoryName name;
    protected Integer price;
    protected Color color;

    public Accessory(Color color) {
        setName();
        setColor(color);
        setPrice();
    }

    public void setPrice(){
        this.price = 0;
    }

    protected void setColor(Color color){ this.color = color;}

    protected void setName (){
        this.name = null;
    }

    public AccessoryName getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}
