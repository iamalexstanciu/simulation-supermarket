package org.example;

public class Truck extends Product {

    private int numberOfWheels;

    public Truck(String name, int quantity, int numberOfWheels) {
        super(name, quantity);
        this.numberOfWheels = numberOfWheels;
        this.setProductType(ProductType.TRUCK);
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }
}
