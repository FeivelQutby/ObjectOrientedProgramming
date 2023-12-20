package id.ac.umn.thelissa.levana.modul10;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Formatter;
import exceptions.ExcessiveFailedLoginException;
import exceptions.InvalidPropertyException;

public class User {
    private String firstName;
    private String lastName;
    private Character gender;
    private String address;
    private String userName;
    private String password;
    private MessageDigest digest;

    private static final int maxLoginAttempt = 3;
    private static int loginAttempt;

    private String hash(String strToHash) {
        try {
            digest = MessageDigest.getInstance("SHA-256");
            byte[] hash = digest.digest(strToHash.getBytes(StandardCharsets.UTF_8));
            return bytesToHex(hash);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return "";
    }

    private String bytesToHex(byte[] bytes) {
        Formatter formatter = new Formatter();
        for (byte b : bytes) {
            formatter.format("%02x", b);
        }
        String hexString = formatter.toString();
        formatter.close();
        return hexString;
    }

    public User(String firstName, String lastName, Character gender, String address, String userName, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.address = address;
        this.userName = userName;
        this.password = hash(password);
    }

    public boolean login(String username, String password) throws ExcessiveFailedLoginException {
        if (this.userName.equals(username)) {
            if (loginAttempt == maxLoginAttempt) {
                loginAttempt++;
                throw new ExcessiveFailedLoginException();
            } else if (loginAttempt > maxLoginAttempt) {
                throw new ExcessiveFailedLoginException("Anda telah mencapai batas login!");
            }

            if (this.password.equals(hash(password))) {
                loginAttempt = 0;
                return true;
            } else {
                loginAttempt++;
            }
        }
        return false;
    }

    public String greetring() {
        String greet = "Selamat Datang! ";
        switch (gender) {
            case 'M':
                greet += "Tuan ";
                break;
            case 'F':
                greet += "Nona ";
                break;
        }
        greet += this.firstName + " " + this.lastName;
        return greet;
    }

    public String getUserName() {
        return userName;
    }
}
