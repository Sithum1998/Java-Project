package cse.school.codejam;

import java.util.Scanner;

public class InputUtil {
    private final Scanner scanner;

    public InputUtil() {
        this.scanner = new Scanner(System.in);
    }

    public String readString(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }
}

   public double readDouble(String prompt) {
    while (true) {
        System.out.print(prompt);
        try {
            return Double.parseDouble(scanner.nextLine().trim());
        } catch (NumberFormatException e) {
            System.out.println("Invalid number. Try again.");
        }
    }
}

public int readInt(String prompt) {
    while (true) {
        System.out.print(prompt);
        try {
            return Integer.parseInt(scanner.nextLine().trim());
        } catch (NumberFormatException e) {
            System.out.println("Invalid integer. Try again.");
        }
    }
}
              public int readInt(String prompt) {
    while (true) {
        System.out.print(prompt);
        try {
            return Integer.parseInt(scanner.nextLine().trim());
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Enter a number.");
        }
    }
}
