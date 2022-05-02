import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        List<Identifiable> citizens = new ArrayList<>();
        while (!input.equals("End")) {
            String[] tokens = input.split("\\s+");
            Identifiable citizen;
            if (tokens.length == 3) {
                citizen = new Citizen(tokens[0], Integer.parseInt(tokens[1]), tokens[2]);
            } else {
                citizen = new Robot(tokens[0], tokens[1]);
            }
            citizens.add(citizen);
            input = scanner.nextLine();
        }

        String fakeId = scanner.nextLine();
        for (Identifiable citizen : citizens) {
            if (citizen.getId().endsWith(fakeId)) {
                System.out.println(citizen.getId());
            }
        }
    }

}

