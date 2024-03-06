package JavaDesignPattern.TemplateMethodPattern;

import JavaDesignPattern.Models.Customer;

public class ExternalLoginPage extends LoginPage {

    public ExternalLoginPage(Customer user) {
        super(user);
    }

    @Override
    protected void inputUsername() {
        System.out.println("Username: " + user.getUsername());
    }

    @Override
    protected void inputPassword() {
        System.out.println("Password: " + user.getPassword());
    }

    @Override
    protected void clickLoginButton() {
        System.out.println("External login successful");
    }

    @Override
    protected void showUserDetails() {
        System.out.println(user);
    }
    
}
