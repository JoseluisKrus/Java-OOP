package restaurant;

import java.math.BigDecimal;

public class Dessert extends Food{
    private double calorie;

    public Dessert(String name, BigDecimal price, double grams, double calorie) {
        super(name, price, grams);
        this.calorie = calorie;
    }

    public double getCalorie() {
        return calorie;
    }
}
