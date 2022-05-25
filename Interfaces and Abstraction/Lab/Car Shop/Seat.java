public class Seat implements Car{
    private String model;
    private String color;
    private int horsePower;
    private String country;

    public Seat(String model, String color, int horsePower, String country) {
        this.model = model;
        this.color = color;
        this.horsePower = horsePower;
        this.country = country;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public Integer getHorsePower() {
        return horsePower;
    }

    @Override
    public String countryProduced() {
        return country;
    }

    @Override
    public String toString() {
       return  "This is " + model + " produced in " + country +" and have 4 tires";
    }
}
