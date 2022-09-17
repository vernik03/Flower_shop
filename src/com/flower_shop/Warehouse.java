package com.flower_shop;

import  com.flowers.Flower;
import  com.flowers.Name;

import java.util.HashMap;
import java.util.Map;

public class Warehouse {
    private Map<Name, Integer> flowers = new HashMap<Name,Integer>();

    public Warehouse() {
        for (Name name : Name.values()) {
            flowers.put(name, 0);
        }
    }

    public void addFlower(Flower flower) {
        flowers.put(flower.getName(), flowers.get(flower.getName()) + 1);
    }

    public void removeFlower(Flower flower) {
        if (flowers.get(flower.getName()) > 0) {
            flowers.put(flower.getName(), flowers.get(flower.getName()) - 1);
        }
    }

    public Integer getFlowerCount(Name name) {
        return flowers.get(name);
    }

    public void printFlowerCount() {
        for (Name name : Name.values()) {
            System.out.println(name + " " + flowers.get(name));
        }
    }
}
