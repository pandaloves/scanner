package se.jensen.meiying.scanner;

// Övning: Använd Scanner

import java.util.Scanner;

public class Question {
    private String förnamn;
    private String efternamn;
    private int favoritnummer;

    public Question(String förnamn, String efternamn, int favoritnummer) {
        this.förnamn = förnamn;
        this.efternamn = efternamn;
        this.favoritnummer = favoritnummer;
    }

    public void printAnswer() {
        System.out.println("Förnamn: " + förnamn + ", Efternamn: " + efternamn + ", favoritenummer: " + favoritnummer);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ange förnamnet: ");
        String förnamn = scanner.nextLine();
        System.out.println("Ange efternamn: ");
        String efternamn = scanner.nextLine();
        System.out.println("Ange favoritnummer: ");
        int favoritnummer = scanner.nextInt();
        Question question = new Question(förnamn, efternamn, favoritnummer);
        question.printAnswer();
    }
}
