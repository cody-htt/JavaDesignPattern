package JavaDesignPattern.TemplateMethodPattern;

public class LoginFlow {

    public void performLogin(LoginPage loginPage) {
        loginPage.loginWithCredential();
    }

}
