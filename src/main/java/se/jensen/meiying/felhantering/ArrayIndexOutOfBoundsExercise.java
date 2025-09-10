package se.jensen.meiying.felhantering;

// Övning 3: ArrayIndexOutOfBoundsException

public class ArrayIndexOutOfBoundsExercise {
    public static void main(String[] args) {
        int[] arr = {2, 10, 3, 18, 90};

        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("No. " + (i + 1) + " is " + arr[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Fel: Du försökte nå ett index som inte finns i arrayen.");
        }
    }
}

