package JavaDesignPattern.Tests;

import JavaDesignPattern.TemplateMethodPattern.ExternalLoginPage;
import JavaDesignPattern.TemplateMethodPattern.InternalLoginPage;
import JavaDesignPattern.TemplateMethodPattern.LoginFlowController;

public class TestTemplateMethodPattern extends BaseTest {

    public static void main(String[] args) {
        TestStrategyPattern test = new TestStrategyPattern();

        InternalLoginPage internalLoginPage = new InternalLoginPage(test.getInternalUser());
        ExternalLoginPage externalLoginPage = new ExternalLoginPage(test.getExternalUser());

        LoginFlowController loginFlowController = new LoginFlowController();

        loginFlowController.performLogin(internalLoginPage);
        System.out.println("\n===================================\n");
        loginFlowController.performLogin(externalLoginPage);
    }
}