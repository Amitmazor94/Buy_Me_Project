package tests;


import com.relevantcodes.extentreports.LogStatus;
import org.junit.Test;


public class SignUpTests extends BaseTest {

    //**Constructors**//
    public SignUpTests() throws Exception {
        super();
    }
    //**Methods**//
    //Registration sanity test
    @Test
    public void Test01_operateRegistration() throws InterruptedException {
        myTest = extent.startTest(Thread.currentThread().getStackTrace()[1].getMethodName());
        myTest.log(LogStatus.INFO, "Test Start: ");
        myTest.log(LogStatus.INFO, "Opening Sign Up page... ");
        signUpFlow.openSignUpPage();
        myTest.log(LogStatus.INFO, "Operating registration... ");
        signUpPage.setFirstName(firstName);
        signUpPage.setEmailField(email);
        signUpPage.setPasswordField(password);
        signUpPage.setPasswordConfirmField(confirmPassword);
        signUpPage.clickTermsRadioButton();
        signUpPage.clickSignUpButton();
        myTest.log(LogStatus.INFO, "Waiting for Feedback... ");
        Thread.sleep(4000);
        myTest.log(LogStatus.INFO, "Assert result and updating result in test report... ");
        homePage.assertEquals(expectedResultTest_01, homePage.readPagesUrl());
    }

}
