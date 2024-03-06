package JavaDesignPattern.TemplateMethodPattern;

import JavaDesignPattern.Models.User;

public abstract class LoginPage<T extends User> {
    protected T user;

    public LoginPage(T user) {
        this.user = user;
    }

    public final void loginWithCredential() {
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