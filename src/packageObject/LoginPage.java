package packageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {
    //**Web Elements**//
    By emailField = By.cssSelector("input[placeholder='מייל']");
    By passwordField = By.cssSelector("input[placeholder='סיסמה']");
    By enterBuyMeButton = By.cssSelector("button[type='submit']");
    By signUpButton = By.cssSelector("span[class='text-link theme']");
    By mailErrorMessage = By.cssSelector("#parsley-id-12");
    By passwordErrorMessage = By.cssSelector("#parsley-id-14");

    //**Constructors**//
    //Connect the page to a Web Driver
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    //**Methods**//

    //Fill the email field according to xml file
    public LoginPage setEmailField(String email) {
        writeText(emailField, email);
        return this;

    }

    //Fill the password field according to xml file
    public LoginPage setPasswordField(String password) {
        writeText(passwordField, password);
        return this;
    }

    //Click Enter Buyme button
    public void clickEnterBuyme() {
        clickButton(enterBuyMeButton);
    }

    //Opening signup page
    public void clickSignUpButton() {
        clickButton(signUpButton);
    }

    //Read the email error message
    public String readMailErrorMessage() {
        return readText(mailErrorMessage);
    }

    //read the password error message
    public String readPasswordErrorMessage() {
        return
                readText(passwordErrorMessage);
    }
}

