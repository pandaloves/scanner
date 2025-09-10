package se.jensen.meiying.scanner;

// Övning: Skapa en enkel räknemaskin med Java

import java.util.Scanner;

public class Calculate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean continueCalculating = true;
        while (continueCalculating) {
            System.out.println("Choose and enter a number among 1, 2, 3 or 4 to choose an operation:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");

            int answer = scanner.nextInt();
            if (answer >= 1 && answer <= 4) {
                System.out.println("Enter the first number: ");
                int num1 = scanner.nextInt();
                System.out.println("Enter the second number: ");
                int num2 = scanner.nextInt();
                double result = 0;

                try {
                    switch (answer) {
                        case 1:
                            result = num1 + num2;
                            break;
                        case 2:
                            result = num1 - num2;
                            break;
                        case 3:
                            result = num1 * num2;
                            break;
                        case 4:
                            if (num2 != 0) {
                                result = num1 / num2;
                            } else {
                                throw new ArithmeticException("The second number cannot be zero because division by zero is not allowed.");
                            }
                            break;
                    }

                    System.out.println("The result is: " + result);
                } catch (ArithmeticException e) {
                    System.out.println(e.getMessage());
                }
            } else if (answer == 5) {
                System.out.println("Exited the calculator. Welcome back!");
                continueCalculating = false;
            } else {
                System.out.println("Wrong input. Please try again.");
            }
        }
        scanner.close();
    }
}
