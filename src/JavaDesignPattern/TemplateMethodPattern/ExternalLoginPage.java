package JavaDesignPattern.TemplateMethodPattern;

import JavaDesignPattern.Models.CustomerModel;

public class ExternalLoginPage extends LoginPage<CustomerModel> {

    public ExternalLoginPage(CustomerModel user) {
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
