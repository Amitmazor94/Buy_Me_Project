package flows;

import org.openqa.selenium.WebDriver;
import packageObject.HomePage;
import packageObject.LoginPage;
import packageObject.ResultsPage;
import tests.BaseTest;
import tests.HomePageTests;

public class LoginFlow {
//**Attributes**//
    HomePage homePage;
    LoginPage loginPage;
    BaseTest baseTest;
    ResultsPage resultsPage;

    //**Constructors**//
    //Connect Web Driver to the relevant pages
    public LoginFlow(WebDriver driver) throws Exception {
      homePage= new HomePage(driver);
      loginPage= new LoginPage(driver);
      resultsPage= new ResultsPage(driver);
      baseTest= new BaseTest();

        
    }

   //**Methods**//
    //Fill login fields and click login button
public void loginUser() throws Exception {
    loginPage.setEmailField(BaseTest.readFromFile(baseTest.getUsersEmailTag(), baseTest.getUsersFilePath()));
    loginPage.setPasswordField(BaseTest.readFromFile(baseTest.getUsersPasswordTag(), baseTest.getUsersFilePath()));
    loginPage.clickEnterBuyme();
    loginPage.waitForUrl(baseTest.getBuymeUrl());

}

}
