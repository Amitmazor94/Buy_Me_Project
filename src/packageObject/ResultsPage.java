package packageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ResultsPage extends BasePage {

    //**Attributes**//
    By businessItem = By.partialLinkText("Claro");
    By chooseItem = By.cssSelector("div .mx-12 button[type='button']");

    //**Constructors**//
    //Connect the page to a Web Driver
    public ResultsPage(WebDriver driver) {
        super(driver);
    }

    //**Methods**//
    //click on a business item
    public void clickBusinessItem() {
        clickButton(businessItem);
    }

    //Click on "Choose" button
    public void clickChooseItemButton() {
        clickButton(chooseItem);
    }
}
