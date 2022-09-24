package com.flower_shop;

import  com.flowers.Flower;

import java.util.ArrayList;

public class Florist {


    public Bouquet makeBouquet(Warehouse warehouse, ArrayList<Flower> flowers) {
        Bouquet bouquet = new Bouquet();
        for (Flower flower : flowers) {
            if (warehouse.isAvaliable(flower)) {
                bouquet.addFlower(flower);
                warehouse.removeFlower(flower);
            }
        }
        return bouquet;
    }

}
