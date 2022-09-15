package com.flowers;

public class Flower {
    private String name;
    private String color;
    private int price;

    public Flower(String name, String color, int price) {
        this.name = name;
        this.color = color;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getPrice() {
        return price;
    }
}
