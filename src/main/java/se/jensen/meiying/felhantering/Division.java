package se.jensen.meiying.felhantering;

// Övningar: Felhantering i Java
// Övning 1: Division med fel

import javax.swing.JOptionPane;

public class Division {
    public static void main(String[] args) {
        try {
            int num1 = Integer.parseInt(JOptionPane.showInputDialog("Prova divisionen. Ange ett nummer:"));
            int num2 = Integer.parseInt(JOptionPane.showInputDialog("Ange ett annat nummer:"));

            if (num2 == 0) {
                throw new ArithmeticException("Fel: Det går inte att dividera med noll.");

            }

            double result = (double) num1 / num2;
            JOptionPane.showMessageDialog(null, "Resultatet är: " + result);
        } catch (ArithmeticException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Ange ett heltal.");
        }
    }
}


