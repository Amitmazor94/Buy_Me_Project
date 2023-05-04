package tests;

import com.relevantcodes.extentreports.LogStatus;
import org.junit.Test;


public class HomePageTests extends BaseTest {


    //**Constructors**//
    public HomePageTests() throws Exception {

    }

    //**Methods**//
//Search gifts sanity test
@Test
    public void test02_checkSearchGiftProcess() throws Exception {
    myTest = extent.startTest(Thread.currentThread().getStackTrace()[1].getMethodName());
    myTest.log(LogStatus.INFO,"Test Start: ");
    myTest.log(LogStatus.INFO,"Clicking on the signup button...");
    homePageFlow.clickLoginButton();
    myTest.log(LogStatus.INFO,"Logging in with a user...");
    loginFlow.loginUser();
    String homepageUrl= homePage.readPagesUrl();
    myTest.log(LogStatus.INFO,"current page's url: "+homepageUrl);
    myTest.log(LogStatus.INFO,"Setting the filter fields...");
    homePage.closeHomepagePopup();
    homePage.setAmountField();
    homePage.setRegionField();
    homePage.setCategoryField();
    homePage.clickSearchGift();
    myTest.log(LogStatus.INFO, "Assert result and updating result in test report... ");
    Thread.sleep(2000);
    resultsPage.assertNotEquals(homepageUrl, resultsPage.readPagesUrl() );

}
}
