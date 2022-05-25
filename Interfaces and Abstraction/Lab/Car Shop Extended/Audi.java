public class Audi extends CarImpl implements Rentable{
    private Integer minRentDay;
    private Double pricePerDay;
    public Audi(String model, String color, int horsePower, String country, Integer minRentDay, Double pricePerDay) {
        super(model, color, horsePower, country);
        this.minRentDay = minRentDay;
        this.pricePerDay = pricePerDay;
    }


    @Override
    public Integer getMinRentDay() {
        return minRentDay;
    }

    @Override
    public Double getPricePerDay() {
        return getPricePerDay();
    }


    public String toString() {
        return String.format("Minimum rental period of %d days. Price per day %f",minRentDay,pricePerDay);
    }
}
