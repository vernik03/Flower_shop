package com.flowers.middle.rose;

import com.flower_shop.Color;
import com.flowers.Name;

public class CherryLove extends Rose {
    public CherryLove(Color color, Integer height, String delivery_date) {
        super(color, height, delivery_date);
    }
    public void setName(){
        this.name = Name.ROSE_CHERRYLOVE;
    }

    public void setColor(Color color){
        if (color == Color.WHITE) {
            this.color = color;
        } else {
            throw new IllegalArgumentException("Color is not valid");
        }
    }

    public void setPrice(){
        this.price = 450;
    }
}
