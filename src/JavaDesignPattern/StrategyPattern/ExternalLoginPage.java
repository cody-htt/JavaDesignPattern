package JavaDesignPattern.StrategyPattern;

import JavaDesignPattern.Models.CustomerModel;

public class ExternalLoginPage implements LoginStrategy<CustomerModel> {

    @Override
    public void loginWithCredential(CustomerModel customer) {
        System.out.println("Desc: External login strategy");
        System.out.println("1. Username: " + customer.getUsername());
        System.out.println("2. Password: " + customer.getPassword());
        System.out.println("3. Click save login details");
        System.out.println("4. External login successful");
        System.out.println(customer);
    }

}