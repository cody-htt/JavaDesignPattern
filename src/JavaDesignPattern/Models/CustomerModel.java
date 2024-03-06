package JavaDesignPattern.Models;

public class CustomerModel extends User {

    private final String firstName;
    private final String lastName;
    private final String email;
    private final String phone;

    public CustomerModel(String firstName, String lastName, String email, String phone) {
        this.username = "customer";
        this.password = "customer123";
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "CustomerModel{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

}
