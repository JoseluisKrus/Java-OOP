package CardsSuits;

public class Main {
    public static void main(String[] args) {
        System.out.println("Card Suits:");

        for (CardsSuits suit:CardsSuits.values()) {
            System.out.printf("Ordinal value: %d; Name value: %s%n",suit.getValue(), suit);
        }

    }
}
