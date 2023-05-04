package packageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GiftPurchasePage extends BasePage {
    //**Attributes**//
    By someoneElseRadio = By.cssSelector("div[gtm='למישהו אחר']");
    By receiverNameField = By.cssSelector("div input[maxlength='25']");
    By selectEventOptions = By.cssSelector("li[class= 'ember-view bm-select-option']");
    By selectEventField = By.cssSelector("span[aria-haspopup='listbox']");
    By blessingField = By.cssSelector("textarea[rows='4']");
    By uploadPicButton = By.cssSelector("input[type='file']");
    By continuePart1Button = By.cssSelector("button[type='submit']");
    By sendNowRadio = By.cssSelector("div[class='ember-view button button-now selected']");
    By emailButton = By.cssSelector("svg[gtm='method-email']");
    By emailField = By.cssSelector("#email");
    By senderNameField = By.cssSelector("input[placeholder='שם שולח המתנה']");
    By continuePart2Button = By.cssSelector("button[type='submit']");
    By pageTitle = By.cssSelector(".bm-h1");
    By paymentButtonText = By.cssSelector("button[type='submit']");

    //**Constructors**//
    //Connect the page to a Web Driver
    public GiftPurchasePage(WebDriver driver) {
        super(driver);
    }

    //**Methods**//
    //Returns the payment button's text
    public String readPaymentButtonText() {
        return readText(paymentButtonText);
    }

    //Returns the text of the page's title
    public String readPagesTitle() {
        return
                readText(pageTitle);
    }

    // Click on someone else's button
    public GiftPurchasePage clickSomeoneElseRadio() {
        clickButton(someoneElseRadio);
        return this;

    }

    //Click on send now's button
    public GiftPurchasePage clickSendNowRadio() {
        clickButton(sendNowRadio);
        return this;
    }

    //Fill receiver name's field according to the value in xml file
    public GiftPurchasePage setReceiverNameField(String receiverName) {
        writeText(receiverNameField, receiverName);
        return this;
    }

    //Fill blessing field according to the value in xml file
    public GiftPurchasePage setBlessingField(String blessingText) {
        writeText(blessingField, blessingText);
        return this;
    }

    //Click on the continue button on the first part of the purchase process
    public GiftPurchasePage clickContinuePart1Button() {
        clickButton(continuePart1Button);
        return this;
    }

    //Click on the Email option
    public GiftPurchasePage clickEmailButton() {
        clickButton(emailButton);
        return this;
    }

    //Fill email field according to the value in xml file
    public GiftPurchasePage setEmailField(String receiverMail) {
        writeText(emailField, receiverMail);
        return this;
    }

    ////Fill sender's field according to the value in xml file
    public GiftPurchasePage setSenderNameField(String senderName) {
        writeText(senderNameField, senderName);
        return this;
    }

    //Click on the continue button on the second part of the purchase process
    public GiftPurchasePage clickContinuePart2Button() {
        clickButton(continuePart2Button);
        return this;
    }
    //Choose a random value from the event's dropdown field
    public GiftPurchasePage setEventField() throws InterruptedException {
        chooseFromList(selectEventField, selectEventOptions);
        return this;
    }
    //Upload a picture upload field
    public GiftPurchasePage setPictureField(String image) throws InterruptedException {
        uploadPicture(image, uploadPicButton);
        Thread.sleep(5000);
        return this;
    }

}
