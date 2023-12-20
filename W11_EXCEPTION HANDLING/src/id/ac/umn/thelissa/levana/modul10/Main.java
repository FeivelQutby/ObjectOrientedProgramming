package id.ac.umn.thelissa.levana.modul10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import exceptions.AuthenticationException;
import exceptions.ExcessiveFailedLoginException;

public class Main {
    private static List<User> listOfUser = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        initialize();

        while (true) {
            System.out.println("1. Login");
            System.out.println("2. Sign Up");
            System.out.println("3. Exit");
            System.out.print("Pilihan : ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    try {
                        handleLogin();
                    } catch (AuthenticationException | ExcessiveFailedLoginException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 2:
                    handleSignUp();
                    break;
                case 3:
                    System.out.println("Terima kasih!");
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }
    }

    private static void initialize() {
        User newUser = new User("John", "Doe", 'M', "Jl. Merpati No. 1 RT 1 RW 1, Banten", "admin", "admin");
        listOfUser.add(newUser);
    }

    private static void handleLogin() throws AuthenticationException, ExcessiveFailedLoginException {
        for (int attempt = 1; attempt <= 3; attempt++) {
            System.out.print("Username: ");
            String username = scanner.nextLine();
            System.out.print("Password: ");
            String password = scanner.nextLine();

            boolean loginSuccessful = false;

            for (User user : listOfUser) {
                try {
                    loginSuccessful = user.login(username, password);
                    if (loginSuccessful) {
                        System.out.println(user.greetring());
                        return;
                    }
                } catch (ExcessiveFailedLoginException e) {
                    System.out.println(e.getMessage());
                    throw e;
                }
            }
            System.out.println("Username / password salah");
        }
        throw new AuthenticationException();
    }

    private static void handleSignUp() {
        System.out.print("Nama Depan : ");
        String firstName = scanner.nextLine();
        System.out.print("Nama Belakang : ");
        String lastName = scanner.nextLine();
        System.out.print("Jenis Kelamin (M/F) : ");
        char gender = scanner.nextLine().charAt(0);
        System.out.print("Alamat : ");
        String address = scanner.nextLine();

        String username;
        do {
            System.out.print("Username : ");
            username = scanner.nextLine();
        } while (!isValidUsername(username));

        String password;
        do {
            System.out.print("Password : ");
            password = scanner.nextLine();
        } while (!isValidPassword(password));

        User newUser = new User(firstName, lastName, gender, address, username, password);
        listOfUser.add(newUser);
        System.out.println("Sign up berhasil!");
    }

    private static boolean isValidPassword(String password) {
        if (password.length() < 6 || password.length() > 16) {
            System.out.println("Password harus memiliki panjang antara 6 dan 16 karakter.");
            return false;
        }

        if (!password.matches(".*[A-Z].*")) {
            System.out.println("Password harus mengandung setidaknya satu huruf besar.");
            return false;
        }

        if (!password.matches(".*\\d.*")) {
            System.out.println("Password harus mengandung setidaknya satu angka.");
            return false;
        }

        return true;
    }

    private static boolean isValidUsername(String username) {
        if (username.length() < 8) {
            System.out.println("Username harus memiliki panjang minimal 8 karakter.");
            return false;
        }
        return true;
    }
}
