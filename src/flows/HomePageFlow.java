package flows;


import org.openqa.selenium.WebDriver;
import packageObject.HomePage;


public class HomePageFlow {
    //**Attributes**//
    HomePage homePage;


    //**Constructors**//
    //Connect Web Driver to the relevant pages
    public HomePageFlow(WebDriver driver) throws Exception {
        homePage= new HomePage(driver);

    }
    //**Methods**//
    //Click on the Login Button in the Home Page
    public void clickLoginButton(){

        homePage.clickLogin();

    }
    //Set the filter filters field and click on Search button
    public void searchGifts() throws InterruptedException {
        homePage.closeHomepagePopup();
        homePage.chooseAmount();
        homePage.chooseRegion();
        homePage.chooseCategory();
        homePage.clickSearchGift();

    }

}
