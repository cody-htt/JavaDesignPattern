package JavaDesignPattern.Tests;


import JavaDesignPattern.Models.AdminModel;
import JavaDesignPattern.Models.CustomerModel;

public class BaseTest {

    private final AdminModel internalUser;
    private final CustomerModel externalUser;

    public BaseTest() {
        internalUser = new AdminModel("I-123", "D-123", "Admin");
        externalUser = new CustomerModel("John", "Doe", "customer@email.com",  "123456789");
    }

    public AdminModel getInternalUser() {
        return internalUser;
    }

    public CustomerModel getExternalUser() {
        return externalUser;
    }
}
