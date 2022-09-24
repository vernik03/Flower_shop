package com.flower_shop;

import com.flower_shop.accessories.fastening.Ribbon;
import com.flower_shop.accessories.packing.PackingAccessory;
import com.flower_shop.accessories.packing.PackingTape;
import  com.flowers.Flower;
import com.flowers.Name;
import com.flowers.big.hydrangea.Macrophylla;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        Florist florist = new Florist();
        for (int i = 0; i < 5; i++) {
            warehouse.buyingFlowers("2022-09-23");
        }
        //warehouse.printFlowerCount();
        ArrayList<Flower> for_bouquet = new ArrayList<Flower>();
        for_bouquet.add(warehouse.getFlower(Name.SUNFLOWER_TEDDYBEAR, Color.YELLOW));
        for_bouquet.add(warehouse.getFlower(Name.SUNFLOWER_TEDDYBEAR, Color.YELLOW));
        for_bouquet.add(warehouse.getFlower(Name.CHRYSANTHEMUM_DUNE, Color.ORANGE));
        for_bouquet.add(warehouse.getFlower(Name.CHRYSANTHEMUM_DUNE, Color.ORANGE));
        for_bouquet.add(warehouse.getFlower(Name.CHRYSANTHEMUM_ANASTASIA, Color.YELLOW));
        for_bouquet.add(warehouse.getFlower(Name.CHRYSANTHEMUM_ANASTASIA, Color.YELLOW));
        for_bouquet.add(warehouse.getFlower(Name.GYPSOPHILA_ELEGANS, Color.WHITE));
        for_bouquet.add(warehouse.getFlower(Name.GYPSOPHILA_ELEGANS, Color.WHITE));
        for_bouquet.add(warehouse.getFlower(Name.GERBERA_HELIOS, Color.YELLOW));
        for_bouquet.add(warehouse.getFlower(Name.GERBERA_HELIOS, Color.ORANGE));
        for_bouquet.add(warehouse.getFlower(Name.GERBERA_HELIOS, Color.RED));

        //warehouse.printFlowerCount();
        Bouquet bouquet = florist.makeBouquet(warehouse, for_bouquet);
        bouquet.addAccessory(new PackingTape(Color.WHITE));
        bouquet.addAccessory(new Ribbon(Color.YELLOW));
        bouquet.printBouquet();
        //warehouse.printFlowerCount();

    }
}
