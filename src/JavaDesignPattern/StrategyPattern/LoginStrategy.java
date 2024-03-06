package JavaDesignPattern.StrategyPattern;

import JavaDesignPattern.Models.User;

public interface LoginStrategy {
    void loginWithCredential(User credential);

}