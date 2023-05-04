package tests;

import com.relevantcodes.extentreports.LogStatus;
import org.junit.Test;

public class ResultsPageTests extends BaseTest {
//**Constructors**//
    public ResultsPageTests() throws Exception {
    }
//**Methods**//
    //Check the business selection
    @Test
    public void test03_pickBusiness() throws Exception {
        myTest = extent.startTest(Thread.currentThread().getStackTrace()[1].getMethodName());
        myTest.log(LogStatus.INFO,"Test Start: ");
        myTest.log(LogStatus.INFO,"Opening login page... ");
        homePageFlow.clickLoginButton();
        myTest.log(LogStatus.INFO,"Login with an exist user... ");
        loginFlow.loginUser();
        myTest.log(LogStatus.INFO,"Searching for a gift... ");
        homePageFlow.searchGifts();
        myTest.log(LogStatus.INFO,"Selecting an item... ");
        resultsPage.clickBusinessItem();
        resultsPage.clickChooseItemButton();
        myTest.log(LogStatus.INFO, "Assert result and updating result in test report... ");
        resultsPage.assertEquals(expectedResultTest_03, giftPurchasePage.readPagesTitle());
    }

}
