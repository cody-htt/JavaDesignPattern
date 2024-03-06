package JavaDesignPattern.Tests;

import JavaDesignPattern.TemplateMethodPattern.ExternalLoginPage;
import JavaDesignPattern.TemplateMethodPattern.InternalLoginPage;
import JavaDesignPattern.TemplateMethodPattern.LoginFlow;

public class TestTemplateMethodPattern extends BaseTest {

    public static void main(String[] args) {
        TestStrategyPattern test = new TestStrategyPattern();

        InternalLoginPage internalLoginPage = new InternalLoginPage(test.getInternalUser());
        ExternalLoginPage externalLoginPage = new ExternalLoginPage(test.getExternalUser());

        LoginFlow loginFlow = new LoginFlow();

        loginFlow.performLogin(internalLoginPage);
        System.out.println("\n===================================\n");
        loginFlow.performLogin(externalLoginPage);

    }
}