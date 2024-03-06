package JavaDesignPattern.Models;

public abstract class User {

    protected String username;
    protected String password;

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
    
}
