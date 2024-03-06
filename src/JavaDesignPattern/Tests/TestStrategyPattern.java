package JavaDesignPattern.Tests;

import JavaDesignPattern.StrategyPattern.*;

public class TestStrategyPattern extends BaseTest {

    public static void main(String[] args) {
        TestStrategyPattern test = new TestStrategyPattern();

        InternalLoginPage internalLoginPage = new InternalLoginPage();
        ExternalLoginPage externalLoginPage = new ExternalLoginPage();

        LoginFlow internalLogin = new LoginFlow(internalLoginPage, test.getInternalUser());
        internalLogin.performLogin();

        System.out.println("\n===================================\n");

        LoginFlow externalLogin = new LoginFlow(externalLoginPage, test.getInternalUser());
        externalLogin.performLogin();
    }
}