package org.example;

public class Main {
    public static void main(String[] args) {
        SupermarketManager sm = new SupermarketManager();
        Product milk = new LongLastingMilk("Zuzu", 10, new Date(2023, 7, 4));
        Product shovel = new Shovel("Loapata Magica", 11, ShovelMaterial.ALLUMINIUM, ShovelDimension.NORMAL );
        Product truck = new Truck("Iveco", 4, 8);
        sm.addProducts(milk);
        sm.addProducts(shovel);
        sm.addProducts(truck);
        sm.getNumberOfSourMilk();
        sm.getStatusOfGoods();
    }
}