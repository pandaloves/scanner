package se.jensen.meiying.felhantering;

// Övning 6: Multi-catch

import java.io.IOException;
import java.util.Scanner;

public class MultiCatchExercise {
    public static void positiveNumber(int num) throws IOException, ArithmeticException {
        if (num < 0) {
            throw new IOException("The number cannot be negative.");
        }
        if (num == 0) {
            throw new ArithmeticException("The number cannot be zero.");
        }

        double result = (double) 2 / num;
        System.out.println(num + " is a positive number. The result is: " + result);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter a number: ");
            int num = scanner.nextInt();
            positiveNumber(num);

        } catch (IOException | ArithmeticException e) {
            System.out.println("IOException error: " + e.getMessage());

        } catch (Exception e) {
            System.out.println("Exception error: " + e.getMessage());

        } finally {
            scanner.close();
            System.out.println("Program terminated.");
        }
    }
}
