package org.example;

import java.time.LocalDate;

public abstract class Milk extends Product{

    private Date expirationDate;
    private LongLastingMilk longLastingMilk;
    private  RegularMilk regularMilk;

    public Milk(String name, int quantity, Date expirationDate) {
        super(name, quantity);
        this.expirationDate = expirationDate;
        this.setProductType(ProductType.MILK);


    }

    public Date getExpirationDate() {
        return expirationDate;
    }


}
