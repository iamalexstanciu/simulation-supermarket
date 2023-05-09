package org.example;

import java.time.LocalDate;

public class RegularMilk extends Milk implements ExpirationChecker {
    private MilkType milkType;
    public RegularMilk(ProductType productType, String name, int quantity, Date expirationDate) {
        super(name, quantity, expirationDate);
        this.milkType = MilkType.REGULAR;
    }

    @Override
    public boolean isExpired() {
        Date date = new Date(2023,5,9);
        return date.getMonth() > getExpirationDate().getMonth() ||
                (date.getMonth() > getExpirationDate().getMonth() && date.getDay() > getExpirationDate().getDay());
    }
}
