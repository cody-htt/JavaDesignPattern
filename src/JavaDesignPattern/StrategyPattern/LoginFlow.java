package JavaDesignPattern.StrategyPattern;

import JavaDesignPattern.Models.User;

public class LoginFlow {
    private final LoginStrategy loginStrategy;
    private final User user;

    public LoginFlow(LoginStrategy loginStrategy, User user) {
        this.loginStrategy = loginStrategy;
        this.user = user;
    }

    public void performLogin() {
        loginStrategy.loginWithCredential(user);
    }

}
