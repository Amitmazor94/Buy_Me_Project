package tests;

import com.relevantcodes.extentreports.LogStatus;
import org.junit.Test;

public class LoginTests extends BaseTest {

//**Constructors**//
    public LoginTests() throws Exception {
    }
    //**Methods**//
    //Check the login fields' error message
    @Test
    public void test05_checkLoginErrorMessages() throws InterruptedException {
        myTest = extent.startTest(Thread.currentThread().getStackTrace()[1].getMethodName());
        myTest.log(LogStatus.INFO, "Test Start: ");
        myTest.log(LogStatus.INFO, "Opening login page... ");
        homePageFlow.clickLoginButton();
        myTest.log(LogStatus.INFO, "Clicking enter buyme button... ");
        loginPage.clickEnterBuyme();
        myTest.log(LogStatus.INFO, "Assert Mail Error Message result and updating result in test report... ");
        loginPage.assertEquals(data.getMailErrorMessage(), loginPage.readMailErrorMessage());
    }
}
