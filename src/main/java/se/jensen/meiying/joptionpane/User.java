package se.jensen.meiying.joptionpane;

// Mer övningar - OBS JOptionPane

import javax.swing.JOptionPane;

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

        String username = JOptionPane.showInputDialog("Enter your username: ");
        String password = JOptionPane.showInputDialog("Enter your password:");

        if (username.equals(originalUsername) && password.equals(originalPassword)) {
            System.out.println("You have logged in successfullt!");
        } else {
            System.out.println("Wrong username or password!");
        }
    }

}
