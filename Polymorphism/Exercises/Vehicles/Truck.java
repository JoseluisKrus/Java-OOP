import java.text.DecimalFormat;

public class Truck extends Vehicle{
    public static final double PLUS_CONSUMPTION = 1.6;
    public Truck(double fuelQuantity, double fuelConsumptionPerKm) {
        super(fuelQuantity, fuelConsumptionPerKm);
        setFuelConsumptionPerKm(getFuelConsumptionPerKm() + PLUS_CONSUMPTION);
    }
    @Override
    public void drive(double distance) {
        double fuelNeeded = getFuelConsumptionPerKm()*distance;
        if(fuelNeeded<=getFuelQuantity()){
            setFuelQuantity(getFuelQuantity() -fuelNeeded);
            DecimalFormat format = new DecimalFormat("0.#");
            System.out.println("Truck travelled " + format.format(distance)+" km");
        }else {
            System.out.println("Truck needs refueling");
        }
    }

    @Override
    public void refuel(double fuel) {
        setFuelQuantity(getFuelQuantity() + fuel*0.95);
    }
}
