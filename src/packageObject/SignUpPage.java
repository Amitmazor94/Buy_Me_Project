package packageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignUpPage extends BasePage {
    //**Attributes**//

    By firstNameField = By.cssSelector("input[placeholder='שם פרטי']");
    By emailField = By.cssSelector("input[placeholder='מייל']");
    By passwordField = By.cssSelector("input[placeholder='סיסמה']");
    By passwordConfirmField = By.cssSelector("input[placeholder='אימות סיסמה']");
    By termsRadioButton = By.cssSelector("span[class='circle']");
    By signUpButton = By.cssSelector("button[gtm='הרשמה ל-BUYME']");

    //**Constructors**//
    //Connect the page to a Web Driver
    public SignUpPage(WebDriver driver) {
        super(driver);
    }

    //**Methods**//
    //Fill the first name field according to xml file
    public SignUpPage setFirstName(String firstName) {
        writeText(firstNameField, firstName);
        return this;
    }
    //Fill the email name field according to xml file
    public SignUpPage setEmailField(String email) {
        writeText(emailField, email);
        return this;
    }
    //Fill the password field according to xml file
    public SignUpPage setPasswordField(String password) {
        writeText(passwordField, password);
        return this;
    }
    //Fill the password confirmation field according to xml file
    public SignUpPage setPasswordConfirmField(String confirmPassword) {
        writeText(passwordConfirmField, confirmPassword);
        return this;
    }
//Click Terms and condition radio button
    public SignUpPage clickTermsRadioButton() {
        checkIfChosen(termsRadioButton);
        return this;
    }

    //Click signup button
    public SignUpPage clickSignUpButton() {
        clickButton(signUpButton);
        return this;
    }
}
