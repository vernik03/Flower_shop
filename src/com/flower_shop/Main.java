package com.flower_shop;

import com.flowers.Color;
import  com.flowers.Flower;
import com.flowers.Name;

public class Main {

    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        Florist florist = new Florist();
        Flower[] flowers = new Flower[9];
        flowers[0] = new Flower(Name.ROSE_AKITO, Color.RED, 100, 10, "2022-09-10");
        flowers[1] = new Flower(Name.ROSE_ALOHA, Color.YELLOW, 120, 13, "2022-09-12");
        flowers[2] = new Flower(Name.ROSE_AMSTERDAM, Color.ORANGE, 130, 8, "2022-09-15");

        flowers[3] = new Flower(Name.TULIP_BREST, Color.RED, 50, 8, "2022-09-10");
        flowers[4] = new Flower(Name.TULIP_CUMMINS, Color.YELLOW, 40, 5, "2022-09-12");
        flowers[5] = new Flower(Name.TULIP_GABRIELLA, Color.PINK, 30, 4, "2022-09-15");

        flowers[6] = new Flower(Name.EUSTOMA_CORELLI, Color.RED, 50, 8, "2022-09-10");
        flowers[7] = new Flower(Name.EUSTOMA_ECHO, Color.YELLOW, 40, 5, "2022-09-12");
        flowers[8] = new Flower(Name.EUSTOMA_MARIACHI, Color.PINK, 30, 4, "2022-09-15");


        for (Flower flower : flowers) {
            warehouse.addFlower(flower);
        }
        //warehouse.printFlowerCount();
        Bouquet bouquet = florist.makeBouquet(warehouse, flowers);
        bouquet.printBouquet();
        //warehouse.printFlowerCount();

    }
}
