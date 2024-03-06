package JavaDesignPattern.Tests;

import JavaDesignPattern.Models.Admin;
import JavaDesignPattern.Models.Customer;
import JavaDesignPattern.StrategyPattern.*;

public class TestStrategyPattern extends BaseTest {

    public static void main(String[] args) {
        TestStrategyPattern test = new TestStrategyPattern();

        InternalLoginPage internalLoginPage = new InternalLoginPage();
        ExternalLoginPage externalLoginPage = new ExternalLoginPage();

        LoginFlowController<Admin> internalLogin = new LoginFlowController<>(internalLoginPage);
        internalLogin.performLogin(test.getInternalUser());

        System.out.println("\n===================================\n");

        LoginFlowController<Customer> externalLogin = new LoginFlowController<>(externalLoginPage);
        externalLogin.performLogin(test.getExternalUser());
    }
}