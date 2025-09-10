package se.jensen.meiying.felhantering;

// Övning 2: NullPointerException

public class NullPointerExercise {
    public static void main(String[] args) {
        String sentence = null;

        try {
            int length = sentence.length();
            System.out.println("The length of the sentence is: " + length);
        } catch (NullPointerException e) {
            System.out.println("Fel: Variabeln saknar ett värde (null).");
        }
    }
}
