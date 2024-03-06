package JavaDesignPattern.StrategyPattern;

import JavaDesignPattern.Models.User;

public class InternalLoginPage implements LoginStrategy {

    @Override
    public void loginWithCredential(User admin) {
        System.out.println("Desc: Internal login strategy");
        System.out.println("1. Username: " + admin.getUsername());
        System.out.println("2. Password: " + admin.getUsername());
        System.out.println("3. Click checkbox save login session");
        System.out.println("4. Internal login successful");
        System.out.println(admin);
    }

}