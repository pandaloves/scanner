package se.jensen.meiying.felhantering;

// Övning 7: Felhantering preventivt

import java.util.Scanner;

public class FelhanteringPreventivtExercise {
    private static boolean isValidInteger(String str) {
        str = str.trim();

        if (str.isEmpty()) {
            return false;
        }

        int startIndex = 0;
        if (str.charAt(0) == '-') {
            if (str.length() == 1) {
                return false;
            }
            startIndex = 1;
        }

        for (int i = startIndex; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        boolean continueProgram = true;
        Scanner scanner = new Scanner(System.in);

        while (continueProgram) {
            System.out.println("Ange ett tal:");
            String input = scanner.nextLine();

            if (input == null || input.trim().isEmpty()) {
                System.out.println("Du måste skriva in ett tal.");
            } else if (isValidInteger(input)) {
                int num = Integer.parseInt(input.trim());
                System.out.println(num + " är ett heltal.");
                continueProgram = false;
            } else {
                System.out.println("Fel: '" + input + "' är inte ett heltal.");
            }
        }
        scanner.close();
    }
}