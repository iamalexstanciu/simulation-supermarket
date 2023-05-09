package org.example;

import java.util.UUID;

public abstract class Product {
    private ProductType productType;
    private String name;
    private UUID id;
    private int quantity;

    public Product(String name, int quantity) {
        this.productType = null;
        this.name = name;
        this.id = UUID.randomUUID();
        this.quantity = quantity;
    }

    public ProductType getProductType() {
        return productType;
    }

    public void setProductType(ProductType productType) {
        this.productType = productType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
