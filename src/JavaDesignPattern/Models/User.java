package JavaDesignPattern.Models;

public abstract class User {

    protected String username;
    protected String password;

    public abstract String getUsername();

    public abstract String getPassword();

    public abstract String toString();

}
