package tests;

import com.relevantcodes.extentreports.LogStatus;
import org.junit.Test;

public class GiftPurchaseTests extends BaseTest {

    //**Constructors**//
    public GiftPurchaseTests() throws Exception {
    }

    //**Methods**//
    //Gift purchase sanity test
    @Test
    public void Test04_giftPurchaseProcess() throws Exception {
        myTest = extent.startTest(Thread.currentThread().getStackTrace()[1].getMethodName());
        myTest.log(LogStatus.INFO,"Test Start: ");
        myTest.log(LogStatus.INFO,"Proceeding to gifts purchase page...");
        giftPurchaseFlow.proceedToGiftPurchasePage();
        myTest.log(LogStatus.INFO,"Filling part 1... ");
        giftPurchasePage.clickSomeoneElseRadio();
        giftPurchasePage.setReceiverNameField(receiverName);
        giftPurchasePage.setEventField();
        giftPurchasePage.setBlessingField(blessingText);
        giftPurchasePage.setPictureField(chosenImage);
        giftPurchasePage.clickContinuePart1Button();
        myTest.log(LogStatus.INFO,"Filling part 2... ");
        giftPurchasePage.clickSendNowRadio();
        giftPurchasePage.clickEmailButton();
        giftPurchasePage.setEmailField(receiverMail);
        giftPurchasePage.setSenderNameField(senderName);
        giftPurchasePage.clickContinuePart2Button();
        myTest.log(LogStatus.INFO, "Assert result and updating result in test report... ");
        giftPurchasePage.assertEquals(expectedResultTest_04, giftPurchasePage.readPaymentButtonText());

    }
}
