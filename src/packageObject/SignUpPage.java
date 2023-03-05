package packageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignUpPage extends BasePage {
    //**Elements**//
    By enterTextButton= By.cssSelector("span[data-ember-action='1837']");
    By firstNameField= By.cssSelector("#ember1866");
    By emailField=By.cssSelector("#ember1873");
            By passwordField=By.cssSelector("input#valPass");
            By passwordConfirmField=By.cssSelector("#ember1887");
            By termsRadioButton=By.cssSelector("#ember1893 .fill");
            By acceptMailRadioButton=By.cssSelector("#ember1898 .fill");
            By signUpButton= By.cssSelector("#ember1900");
            By termsText= By.cssSelector(("#ember1896 span[andiallelmwithtext='13']"));
            By acceptMailText= By.cssSelector("#ember1898");
            By signUpTitle= By.cssSelector("h1.bm-h1");
            By signUpSubTitle= By.cssSelector(".register-or-login");
            By mediasSubTitle= By.xpath("//div[@class='option easy']/p[@class='title']");
            By facebookButton= By.cssSelector("div[class='social-btn facebook']");
            By googleButton= By.cssSelector("div[class='social-btn google']");

        //**Constructors**//
            public SignUpPage(WebDriver driver) {
        super(driver);
    }
    //**Methods**//

    public SignUpPage setFirstName(String firstName){
            writeText(firstNameField, firstName);
        return this;
            }
            public SignUpPage setEmailField(String email){
                writeText(emailField, email);
                return this;
            }
            public SignUpPage setPasswordField(String password){
                writeText(passwordField, password);
                return this;
            }
            public SignUpPage setPasswordConfirmField(String password){
                writeText(passwordConfirmField, password);
                return this;
            }
            public SignUpPage clickTermsRadioButton(){
                checkIfChosen(termsRadioButton);
                return this;
            }
            public SignUpPage clickAcceptMailRadioButton(){
                checkIfChosen(acceptMailRadioButton);
                return this;
            }
            public SignUpPage clickSignUpButton(){
                clickButton(signUpButton);
                return this;
            }
            public SignUpPage enterBuymeTextButton(){
                clickButton(enterTextButton);
                return this;
            }
            public SignUpPage readTermsText(){
                readText(termsText);
                return this;
            }
            public SignUpPage readAcceptMailText(){
                readText(acceptMailText);
                return this;
            }
            public SignUpPage readSignUpTitle(){
                readText(signUpTitle);
                return this;
            }
            public SignUpPage readSignUpSubTitle(){
                readText(signUpSubTitle);
                return this;
            }
            public SignUpPage readMediaSubTitle(){
                readText(mediasSubTitle);
                return this;
            }
            public SignUpPage clickFacebookButton(){
                clickButton(facebookButton);
                return this;
            }
            public SignUpPage clickGoogleButton(){
                clickButton(googleButton);
                return this;
            }

}
