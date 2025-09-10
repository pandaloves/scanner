package se.jensen.meiying.scanner;

// Övning 1: Person-objekt och användning av Scanner

import java.util.Scanner;

public class Person {
    private String namn;
    private int ålder;
    private String yrke;

    public Person(String namn, int ålder, String yrke) {
        this.namn = namn;
        this.ålder = ålder;
        this.yrke = yrke;
    }

    public void printInfo() {
        System.out.println("Namn: " + namn + ", " + "Ålder: " + ålder + ", " + "Yrke: " + yrke);
    }

    public void setJob(String yrke) {
        this.yrke = yrke;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ange namn:");
        String namn = scanner.nextLine();
        System.out.println("Ange ålder:");
        int ålder = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Ange yrke:");
        String yrke = scanner.nextLine();
        Person person = new Person(namn, ålder, yrke);
        person.printInfo();
        System.out.println("Vill du byta yrket?");
        String answer = scanner.nextLine();
        if (answer.equalsIgnoreCase("ja")) {
            System.out.println("Ange ett nytt yrke");
            String yrket = scanner.nextLine();
            person.setJob(yrket);
            person.printInfo();
        } else {
            System.out.println("Du har inte bytt yrket.");
        }

        scanner.close();
    }

}
