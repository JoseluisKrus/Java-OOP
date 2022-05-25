public class Seat extends CarImpl implements Sellable{
    private Double price;
    public Seat(String model, String color, int horsePower, String country, Double price) {
        super(model, color, horsePower, country);
        this.price = price;
    }


    @Override
    public Double getPrice() {
        return this.price;
    }

    @Override
    public String toString() {
        return getModel() +" sells for " + getPrice();
    }
}
