package com.flower_shop;

import  com.flowers.Flower;

public class Florist {


    public Bouquet makeBouquet(Warehouse warehouse, Flower[] flowers) {
        Bouquet bouquet = new Bouquet();
        for (Flower flower : flowers) {
            if (warehouse.getFlowerCount(flower.getName()) > 0) {
                bouquet.addFlower(flower);
                warehouse.removeFlower(flower);
            }
        }
        return bouquet;
    }

}
