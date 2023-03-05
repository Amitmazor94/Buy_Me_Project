package packageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {
    //**Web Elements**//
    By emailField = By.cssSelector("input[id='ember1839']");
    By passwordField = By.cssSelector("input[id='ember1846']");
    By enterBuyMeButton = By.cssSelector("#ember1855");
    By signUpButton = By.cssSelector("span[data-ember-action='1834']");
    By rememberMeCeckBox = By.cssSelector("#ember1852 .icon circle.fill");
    By forgotPasswordTextButton = By.cssSelector("u[data-ember-action='1854']");
    By facebookLoginButton = By.cssSelector("div[data-ember-action='1835']");
    By googleLoginButton = By.cssSelector("div[data-ember-action='1836']");
    By xButton = By.cssSelector("#times");
    By accessButton = By.cssSelector("div[aria-label='לפתיחה תפריט להתאמה אישית']");

    public LoginPage(WebDriver driver) {
        super(driver);
    }


    //**Page Methods**//
    public LoginPage setEmailField(String email) {
        writeText(emailField, email);
        return this;

    }

    public LoginPage setPasswordField(String password){
        writeText(passwordField, password);
        return this;
    }


}

