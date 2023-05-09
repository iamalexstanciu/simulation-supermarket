package org.example;

public class Shovel extends Product {


    private ShovelDimension shovelDimension;
    private ShovelMaterial shovelMaterial;

    public Shovel(String name, int quantity, ShovelMaterial shovelMaterial, ShovelDimension shovelDimension) {
        super(name, quantity);
        this.shovelDimension = shovelDimension;
        this.shovelMaterial = shovelMaterial;
        this.setProductType(ProductType.SHOVEL);
    }

    public ShovelDimension getShovelDimension() {
        return shovelDimension;
    }

    public ShovelMaterial getShovelMaterial() {
        return shovelMaterial;
    }
}
