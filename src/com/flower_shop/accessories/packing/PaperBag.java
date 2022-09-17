package com.flower_shop.accessories.packing;

import com.flower_shop.Color;
import com.flower_shop.accessories.AccessoryName;
import com.flower_shop.accessories.Accessory;

public class PaperBag extends PackingAccessory {
    public PaperBag(Color color) {
        super(color);
    }

    public void setName(){
        this.name = AccessoryName.PAPER_BAG;
    }

    public void setPrice(){ this.price = 40;}
}
