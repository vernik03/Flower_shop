package com.flower_shop;

import  com.flowers.Flower;

import java.util.ArrayList;

public class Bouquet {
    ArrayList<Flower> flowers;
    private Integer price;

    public Bouquet( ) {
        this.flowers = new ArrayList<>();
        this.price = 0;
    }

    public Bouquet( ArrayList<Flower> flowers) {
        this.flowers = flowers;
        this.price = 0;
        for (Flower flower : flowers) {
            this.price += flower.getPrice();
        }
    }

    public  ArrayList<Flower> getFlowers() {
        return flowers;
    }

    public Integer getPrice() {
        return price;
    }

    public void printBouquet() {
        System.out.println("Bouquet price: " + price);
        for (Flower flower : flowers) {
            System.out.println(flower.getName() + " " + flower.getColor() + " " + flower.getPrice());
        }
    }

    public void addFlower(Flower flower) {
        flowers.add(flower);
        price += flower.getPrice();
    }


    public  void sortByFreshness(){
        flowers.sort((o1, o2) -> o1.getFreshness().compareTo(o2.getFreshness()));
    }

    public Flower getFlowerByLength(int length_min, int length_max){
        ArrayList<Flower> res_flowers = new ArrayList<>();
        for (Flower flower : flowers) {
            if (flower.getHeight() >= length_min && flower.getHeight() <= length_max) {
                res_flowers.add(flower);
            }
        }
        if (res_flowers.size() > 0) {
            return res_flowers.get(0);
        }
        return null;
    }

}
