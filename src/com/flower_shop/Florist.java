package com.flower_shop;

import  com.flowers.Flower;

public class Florist {
    public void sellFlower(Flower flower) {
        System.out.println("I sell " + flower.getName() + " " + flower.getColor() + " " + flower.getPrice());
    }

}
