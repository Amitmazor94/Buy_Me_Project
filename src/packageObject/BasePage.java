package packageObject;

import jdk.dynalink.beans.StaticClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.w3c.dom.Document;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.time.Duration;
public class BasePage {
    //**Attributes**//
   public WebDriver driver= null;
   public WebDriverWait wait;



    //**Constructor**
   public BasePage(WebDriver driver){
       this.driver=driver;
       wait =new WebDriverWait(driver , Duration.ofSeconds(65));
   }

//**Methods**
    //Text Writing
    public void writeText(By elementLocation, String text){
       waitVisibility(elementLocation);
    driver.findElement(elementLocation).clear();
    driver.findElement(elementLocation).sendKeys();
    }


    //Click on a button
    public void clickButton(By elementLocation) {
       waitVisibility(elementLocation);
        driver.findElement(elementLocation).click();
    }

    //Text Reading
    public void readText(By elementLocation){
       waitVisibility(elementLocation);
       driver.findElement(elementLocation).getText();
    }
    //Check if element is displayed
    public boolean verifyExistence(By elementLocation){
       waitVisibility(elementLocation);
       return
       driver.findElement(elementLocation).isDisplayed();

    }
    //Check if the element is enabled
    public boolean checkIfEnabled(By elementLocation){
       waitVisibility(elementLocation);
       return
               driver.findElement(elementLocation).isEnabled();
    }

    //Check if the element hasn't already chosen
    public void checkIfChosen(By elementLocation){
       waitVisibility(elementLocation);
      WebElement element= driver.findElement(elementLocation);
      boolean selectedElement= element.isSelected();
      if(!selectedElement)
          return;
          element.click();

    }

    //Waiting for an element to be displayed
    public void waitVisibility(By by){
       try{
           Thread.sleep(1500);
       } catch (InterruptedException e) {
           e.printStackTrace();
       }
       wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }

            }





/*
public static String readFromFile(String keyData, String filePath) throws Exception{
        File xmlFile= new File(filePath);
        DocumentBuilderFactory dbFactory= DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder= dbFactory.newDocumentBuilder();
        Document doc= dBuilder.parse(xmlFile);
        doc.getDocumentElement().normalize();
        return doc.getElementsByTagName(keyData).item(0).getTextContent();

        }

public static void setUpBrowser(String keyData)throws Exception{
        String browser= readFromFile("browserType", browserFile);
        switch(browser){
        case "Chrome":  path= chromePath;
        driver= (WebDriver) new ChromeDriver(); break;
        case "Fire Fox": path= fireFoxPath;
        driver= (WebDriver) new FirefoxDriver(); break;
default:
        System.out.println("no browser was detected");
        }

 */