package se.jensen.meiying.joptionpane;

// Mer övningar - OBS JOptionPane

import javax.swing.JOptionPane;

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
        System.out.println("Namn: " + namn + ", Ålder: " + ålder + ", Yrke: " + yrke);
    }

    public void setJob(String yrke) {
        this.yrke = yrke;
    }

    public static void main(String[] args) {
        String namn = JOptionPane.showInputDialog("Ange namn:");
        int ålder = Integer.parseInt(JOptionPane.showInputDialog("Ange ålder:"));
        String yrke = JOptionPane.showInputDialog("Ange yrke:");

        Person person = new Person(namn, ålder, yrke);
        person.printInfo();

        String answer = JOptionPane.showInputDialog("Bytt du yrket?");
        if (answer.equalsIgnoreCase("ja")) {
            String yrket = JOptionPane.showInputDialog("Ange ett nytt yrke: ");
            person.setJob(yrket);
            person.printInfo();
        } else {
            System.out.println("Du har inte bytt yrket.");
        }
    }
}