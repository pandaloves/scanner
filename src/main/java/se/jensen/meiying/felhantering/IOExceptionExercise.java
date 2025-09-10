package se.jensen.meiying.felhantering;

// Övning 5: Kasta ett IOException själv

import java.io.IOException;
import java.util.Scanner;

public class IOExceptionExercise {
    public static void positiveNumber(int num) throws IOException {
        if (num < 0) {
            throw new IOException("Talet får inte vara negativt");
        }
        System.out.println(num + " is a positive number.");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Ange ett tal: ");
            int num = scanner.nextInt();
            positiveNumber(num);
        } catch (IOException e) {
            System.out.println("IOException error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Exception error: " + e.getMessage());
        } finally {
            scanner.close();
            System.out.println("Program terminated.");
        }
    }
}
