import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Vehicle> vehicles = new LinkedList<>();
        String [] carInfo = scanner.nextLine().split(" ");
        Vehicle car = new Car(Double.parseDouble(carInfo[1]), Double.parseDouble(carInfo[2]));
        vehicles.add(car);
        String [] truckInfo = scanner.nextLine().split(" ");
        Vehicle truck = new Truck(Double.parseDouble(truckInfo[1]), Double.parseDouble(truckInfo[2]));
        vehicles.add(truck);
        int n= Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String [] commands = scanner.nextLine().split(" ");
            if(commands[0].equals("Drive")){
                if(commands[1].equals("Car")){
                    vehicles.get(0).drive(Double.parseDouble(commands[2]));
                }else {
                    vehicles.get(1).drive(Double.parseDouble(commands[2]));
                }
            }else {
                if(commands[1].equals("Car")){
                    vehicles.get(0).refuel(Double.parseDouble(commands[2]));
                }else {
                    vehicles.get(1).refuel(Double.parseDouble(commands[2]));
                }
            }
        }

        for (Vehicle v :vehicles) {
            System.out.printf("%s: %.2f\n",v.getClass().getName(), v.getFuelQuantity());
        }

    }
}
