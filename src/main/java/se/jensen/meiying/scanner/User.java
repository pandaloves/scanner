package se.jensen.meiying.scanner;

// Övning 2: Inloggningsfunktion med User-klass

import java.util.Scanner;

public class User {
    private String username;
    private String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return this.username;
    }

    public String getPassword() {
        return this.password;
    }

    public static void main(String[] args) {
        User user = new User("Ruby", "ruby01");
        String originalUsername = user.getUsername();
        String originalPassword = user.getPassword();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your username: ");
        String username = scanner.nextLine();
        System.out.println("Enter your password:");
        String password = scanner.nextLine();
        if (username.equals(originalUsername) && password.equals(originalPassword)) {
            System.out.println("You have logged in successfullt!");
        } else {
            System.out.println("Wrong username or password!");
        }

        scanner.close();
    }
}
