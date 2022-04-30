public class PriceCalculator {
    private double pricePerDay;
    private int days;
    private Season seasons;
    private Discount discount;

    public PriceCalculator(double pricePerDay, int days, Season seasons, Discount discount) {
        this.pricePerDay = pricePerDay;
        this.days = days;
        this.seasons = seasons;
        this.discount = discount;
    }
    public double calculatePrice(){
        return  (pricePerDay * seasons.getMultiplayer()) * days * (1-discount.getDiscount());
    }
}
