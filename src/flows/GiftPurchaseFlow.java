package flows;

import com.relevantcodes.extentreports.ExtentReports;
import org.openqa.selenium.WebDriver;
import packageObject.HomePage;
import packageObject.LoginPage;
import packageObject.ResultsPage;
import tests.BaseTest;

import static tests.BaseTest.myTest;

public class GiftPurchaseFlow {
    //**Attributes**//
    ExtentReports extents;
    HomePage homePage;
    LoginPage loginPage;
    ResultsPage resultsPage;
    LoginFlow loginFlow;
    HomePageFlow homePageFlow;
    ResultsPageFlow resultsPageFlow;

        //**Constructors**//
    //Connect Web Driver to the relevant pages
    public GiftPurchaseFlow(WebDriver driver) throws Exception {
        homePage=new HomePage(driver);
        loginPage= new LoginPage(driver);
        resultsPage= new ResultsPage(driver);
        loginFlow= new LoginFlow(driver);
        homePageFlow= new HomePageFlow(driver);
        resultsPageFlow= new ResultsPageFlow(driver);
    }

    //**Methods**//
    //Proceed to the Gift Purchase Page
    public void proceedToGiftPurchasePage() throws Exception {
        homePageFlow.clickLoginButton();
        loginFlow.loginUser();
        homePageFlow.searchGifts();
        resultsPageFlow.chooseGift();
    }

}
