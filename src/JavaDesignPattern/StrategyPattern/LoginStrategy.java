package JavaDesignPattern.StrategyPattern;

import JavaDesignPattern.Models.User;

public interface LoginStrategy<T extends User> {
    void loginWithCredential(T credential);

}