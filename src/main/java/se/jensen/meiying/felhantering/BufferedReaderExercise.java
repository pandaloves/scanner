package se.jensen.meiying.felhantering;

// Övning 4: Checked exception (överkurs)

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class BufferedReaderExercise {
    public static void main(String[] args) {
        // String filePath = "pom.xml";
        String filePath = "test.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Filen kan inte hitas.");
        } catch (IOException e) {
            System.out.println("I/O fel.");
        }
    }
}
