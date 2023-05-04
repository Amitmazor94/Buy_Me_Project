package flows;

import org.openqa.selenium.WebDriver;
import packageObject.HomePage;
import packageObject.LoginPage;


public class SignUpFlow {
//**Attributes**//
    LoginPage loginPage;
    HomePage homePage;
    //**Constructors**//
    //Connect Web Driver to the relevant pages
    public SignUpFlow(WebDriver driver) {
        loginPage = new LoginPage(driver);
        homePage= new HomePage(driver);
    }
    //**Methods**//
    //Opening the signup page
    public void openSignUpPage(){
         homePage.clickLogin();
         loginPage.clickSignUpButton();
    }

}
