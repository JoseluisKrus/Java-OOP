import java.util.Scanner;

public class Rhombus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n  = Integer.parseInt(scanner.nextLine());


        printOutput(printRhombus(n));

    }

    private static void printOutput(String printRhombus) {
        System.out.println(printRhombus);
    }

    private static String printRhombus(int size) {
        StringBuilder output = new StringBuilder();
        for (int r = 1; r <= size; r++) {
            output.append(printLine(size-r, r)).append(System.lineSeparator());
        }
        for (int r = size-1; r >= 1; r--) {
            output.append(printLine(size-r, r)).append(System.lineSeparator());
        }


        return output.toString();
    }

    private static String printLine(int spaces, int stars) {
        return " ".repeat(Math.max(0, spaces)) +
                "* ".repeat(Math.max(0, stars));
    }
}
