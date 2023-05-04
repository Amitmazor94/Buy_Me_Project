package packageObject;

import com.relevantcodes.extentreports.LogStatus;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.Random;


import static tests.BaseTest.*;

public class BasePage {
    //**Attributes**//
    public WebDriver driver = null;
    public WebDriverWait wait;


    //**Constructors**//
    //Connect Web Driver to the relevant pages
    public BasePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(65));
    }

    public BasePage() {

    }

    //**Methods**
    //Text Writing
    public void writeText(By elementLocation, String text) {
        waitVisibility(elementLocation);
        driver.findElement(elementLocation).clear();
        driver.findElement(elementLocation).sendKeys(text);
    }

    //Get URL
    public String readPagesUrl() {
        return
                driver.getCurrentUrl();
    }

    //Click on a button
    public void clickButton(By elementLocation) {
        waitVisibility(elementLocation);
        driver.findElement(elementLocation).click();
    }

    //Text Reading
    public String readText(By elementLocation) {
        waitVisibility(elementLocation);
        return
                driver.findElement(elementLocation).getText();
    }

    //Check if element is displayed
    public boolean verifyExistence(By elementLocation) {
        waitVisibility(elementLocation);
        return
                driver.findElement(elementLocation).isDisplayed();


    }


    //Check if the element hasn't already chosen
    public void checkIfChosen(By elementLocation) {
        waitVisibility(elementLocation);
        WebElement element = driver.findElement(elementLocation);
        boolean selectedElement = element.isSelected();
        System.out.println(selectedElement);
        if (!selectedElement)
            element.click();

    }

    //Select a dropdown value by its index
    public void selectByIndex(By elementLocation, int index) {
        waitVisibility(elementLocation);
        WebElement combo = driver.findElement(elementLocation);
        Select selectIndex = new Select(combo);
        selectIndex.selectByIndex(index);

    }
    //Select a dropdown value by its text
    public void selectByText(By elementLocation, String text) {
        waitVisibility(elementLocation);
        WebElement combo = driver.findElement(elementLocation);
        Select selectText = new Select(combo);
        selectText.selectByValue(text);


    }

    //Find a list of an elements
    public List<WebElement> findListOfElements(By elementLocation) {
        waitVisibility(elementLocation);
        List<WebElement> elements = driver.findElements(elementLocation);
        return elements;
    }

    //Clicking on a dropdown and choose a random element from a list
    public void chooseFromList(By elementLocation, By elementValues) throws InterruptedException {
        waitVisibility(elementLocation);
        clickButton(elementLocation);
        waitVisibility(elementValues);
        List<WebElement> values = findListOfElements(elementValues);
        int rand = 0;
        int max = values.size();
        Random random = new Random();
        do {
            rand = random.nextInt(max);
        } while (rand < 1);
        values.get(rand).click();
    }


    //Waiting for an element to be displayed
    public void waitVisibility(By by) {

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    //Waiting for URL
    public void waitForUrl(String url) {
        try {
            wait.until(ExpectedConditions.urlToBe(url));
        } catch (TimeoutException e) {

        }
    }

    //check if the Actual Result equals to the Expected Result
    public void assertEquals(String expectedResult, String actualResult) throws InterruptedException {

        try {
            Thread.sleep(1000);
            Assert.assertEquals(expectedResult, actualResult);
            myTest.log(LogStatus.PASS, "Succeeded" + myTest.addScreenCapture(takeScreenShot(getImagePath() + "\\" + System.currentTimeMillis())));

        } catch (AssertionError e) {
            myTest.log(LogStatus.FAIL, "An error occurred" + myTest.addScreenCapture(takeScreenShot(getImagePath() + "\\" + System.currentTimeMillis())));
        }
    }

    //check if the Actual Result doesn't equal to the Expected Result
    public void assertNotEquals(String unexpectedResult, String actualResult) throws InterruptedException {
        try {
            Thread.sleep(1000);
            Assert.assertNotEquals(unexpectedResult, actualResult);
            myTest.log(LogStatus.PASS, "Succeeded" + myTest.addScreenCapture(takeScreenShot(getImagePath() + "\\" + System.currentTimeMillis())));
        } catch (AssertionError e) {
            myTest.log(LogStatus.FAIL, "An error occurred" + myTest.addScreenCapture(takeScreenShot(getImagePath() + "\\" + System.currentTimeMillis())));
        }
    }

    //uploading a picture
    public void uploadPicture(String picturePath, By elementLocation) {
        driver.findElement(elementLocation).sendKeys(picturePath);
    }

    //Closing advertisement
    public void closePopup(By elementLocation) throws InterruptedException {

        if (driver.findElement(elementLocation).isDisplayed()) {
            clickButton(elementLocation);
        } else {
        }
    }
}



