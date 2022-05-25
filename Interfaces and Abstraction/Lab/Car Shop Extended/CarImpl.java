public class CarImpl implements Car{
    private String model;
    private String color;
    private int horsePower;
    private String country;

    public CarImpl(String model, String color, int horsePower, String country) {
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


    public String toString() {
        return  String.format("This is %s produced in %s and have %d tires",getModel(),countryProduced(),TIRES);
    }
}
