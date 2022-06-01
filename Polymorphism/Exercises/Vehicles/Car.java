import java.text.DecimalFormat;

public class Car extends  Vehicle{
    public static final double PLUS_CONSUMPTION = 0.9;
    public Car(double fuelQuantity, double fuelConsumptionPerKm) {
        super(fuelQuantity, fuelConsumptionPerKm);
        setFuelConsumptionPerKm(getFuelConsumptionPerKm() + PLUS_CONSUMPTION);
    }

    @Override
    public void drive(double distance) {
        double fuelNeeded = getFuelConsumptionPerKm()*distance;
        if(fuelNeeded<=getFuelQuantity()){
            setFuelQuantity(getFuelQuantity() -fuelNeeded);
            DecimalFormat format = new DecimalFormat("0.#");
            System.out.println("Car travelled " + format.format(distance)+" km");
        }else {
            System.out.println("Car needs refueling");
        }

    }
}
