package JavaDesignPattern.TemplateMethodPattern;

import JavaDesignPattern.Models.User;

public class LoginFlowController {

    public <T extends User> void performLogin(LoginPage<T> loginPage) {
        loginPage.loginWithCredential();
    }

}
