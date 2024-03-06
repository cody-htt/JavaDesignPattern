package JavaDesignPattern.TemplateMethodPattern;

import JavaDesignPattern.Models.User;

public abstract class LoginPage {
    protected User user;

    public LoginPage(User user) {
        this.user = user;
    }

    protected final void loginWithCredential() {
        inputUsername();
        inputPassword();
        clickLoginButton();
        showUserDetails();
    }

    protected abstract void inputUsername();

    protected abstract void inputPassword();

    protected abstract void clickLoginButton();

    protected abstract void showUserDetails();
}