package JavaDesignPattern.StrategyPattern;

import JavaDesignPattern.Models.User;

public class LoginFlowController<T extends User> {
    private final LoginStrategy<T> loginStrategy;

    public LoginFlowController(LoginStrategy<T> loginStrategy) {
        this.loginStrategy = loginStrategy;
    }

    public void performLogin(T user) {
        loginStrategy.loginWithCredential(user);
    }

}
