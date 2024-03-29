package JavaDesignPattern.Tests;


import JavaDesignPattern.Models.Admin;
import JavaDesignPattern.Models.Customer;

public class BaseTest {

    private final Admin internalUser;
    private final Customer externalUser;

    public BaseTest() {
        internalUser = new Admin("ID-123", "DEP-123", "Admin");
        externalUser = new Customer("John", "Doe", "John.Doe@email.com", "123456789");
    }

    public Admin getInternalUser() {
        return internalUser;
    }

    public Customer getExternalUser() {
        return externalUser;
    }
}
