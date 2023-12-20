package id.ac.umn.if433.raden.muhammad.rafael.herdani;

public class User {
    private String name;
    private String email;
    private String password;

    User(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public String getName() {
        return this.name;
    }

    public String getEmail() {
        return this.email;
    }

    public String getPassword() {
        return this.password;
    }
}
