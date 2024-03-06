package JavaDesignPattern.TemplateMethodPattern;

import JavaDesignPattern.Models.Admin;

public class InternalLoginPage extends LoginPage<Admin> {

    public InternalLoginPage(Admin user) {
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
        System.out.println("Internal login successful");
    }

    @Override
    protected void showUserDetails() {
        System.out.println(user);
    }

}