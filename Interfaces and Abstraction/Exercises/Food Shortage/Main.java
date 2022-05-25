import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Citizen citizen;
        Rebel rebel;
        List<Citizen> citizens= new LinkedList<>();
        List<Rebel> rebels = new LinkedList<>();
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i <n ; i++) {
            String [] input = scanner.nextLine().split(" ");

            if (input.length==4){
                citizen = new Citizen(input[0], Integer.parseInt(input[1]),input[2],input[3]);
                citizens.add(citizen);
            }else {
                rebel = new Rebel(input[0], Integer.parseInt(input[1]),input[2]);
                rebels.add(rebel);
            }
        }

        String command = scanner.nextLine();
        int sumOfFoodCitizen = 0;
        int sumOfFoodRebels =0;
        while (!command.equals("End")){
            for (Citizen c: citizens) {
                if(c.getName().equals(command)){
                    c.buyFood();
                    sumOfFoodCitizen=c.getFood();
                }
            }
            for (Rebel r: rebels) {
                if(r.getName().equals(command)){
                    r.buyFood();
                    sumOfFoodRebels=r.getFood();
                }
            }
            command = scanner.nextLine();
        }
        System.out.println(sumOfFoodCitizen+sumOfFoodRebels);

    }
}


