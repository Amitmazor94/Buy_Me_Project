package packageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {
    //**Web Elements**//
    By loginButton= By.cssSelector(".notSigned");
    By amountField= By.cssSelector("span[title='סכום']");
    By amountValues= By.cssSelector("div[aria-label='סכום'] li[class='ember-view bm-select-option']");
    By regionField= By.cssSelector("span[title='אזור']");
    By regionValues= By.cssSelector("div[aria-label='אזור'] li[class='ember-view bm-select-option']");
    By categoryField= By.cssSelector("span[title='קטגוריה']");
    By searchButton=By.cssSelector("a[rel='nofollow']");
    By ninetyNineShekels= By.cssSelector("li[value='1']");
    By merkaz= By.cssSelector("li[value='11']");
    By lovedGifts=By.cssSelector("li[value='438']");
   By categoryOptions= By.cssSelector("div [aria-label='קטגוריה'] li[class='ember-view bm-select-option']");
   By ad = By.cssSelector("button polygon");

   //**Constructors**//
   //Connect the page to a Web Driver
    public HomePage(WebDriver driver) {
        super(driver);
    }

//**Methods**//
    //Click on the login button
    public HomePage clickLogin(){
        clickButton(loginButton);
        return this;
    }
    //Choose an amount
    public HomePage chooseAmount(){
        clickButton(amountField);
        clickButton(ninetyNineShekels);
        return this;
    }
    //Choose a region
    public HomePage chooseRegion(){
    clickButton(regionField);
    clickButton(merkaz);
    return this;
    }
    //Choose a category
    public HomePage chooseCategory(){
        clickButton(categoryField);
        clickButton(lovedGifts);
        return this;
    }
    //Click on the search button
    public HomePage clickSearchGift(){
        clickButton(searchButton);
        return this;
    }

    //Choose a random category
    public HomePage setCategoryField() throws InterruptedException {
        chooseFromList(categoryField, categoryOptions);
        return this;
    }
    //Choose a random amount
    public HomePage setAmountField() throws InterruptedException {
        chooseFromList(amountField, amountValues);
        return this;
    }
    //Choose a random region
    public HomePage setRegionField() throws InterruptedException {
        chooseFromList(regionField, regionValues);
        return this;
    }
    //Close popup on the homepage if it appears
    public HomePage closeHomepagePopup() throws InterruptedException {
        closePopup(ad);
        return this;
    }


}

