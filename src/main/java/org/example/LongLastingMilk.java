package org.example;

import java.time.LocalDate;

public class LongLastingMilk extends Milk implements ExpirationChecker {

    private MilkType milkType;
    public LongLastingMilk(String name, int quantity, Date expirationDate) {
        super(name, quantity, expirationDate);
        this.milkType = MilkType.LONG_LASTING;

    }

    @Override
    public boolean isExpired() {
        Date date = new Date(2023,5,9);
        return date.getYear() > getExpirationDate().getYear() ||
                (date.getYear() == getExpirationDate().getYear() && date.getMonth() > getExpirationDate().getMonth()) ||
                (date.getYear() == getExpirationDate().getYear() && date.getMonth() == getExpirationDate().getMonth() && date.getDay() > getExpirationDate().getDay());
    }
}
