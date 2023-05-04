package tests;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import data.Data;
import flows.*;
import org.apache.commons.io.FileUtils;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.w3c.dom.Document;
import packageObject.*;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;


public class BaseTest {
    //**Attributes**//
    static ExtentReports extent;
    public static ExtentTest myTest;
    private static String reportFilePath = "C:\\Users\\amit\\IdeaProjects\\Buy_Me_Project\\src\\data\\buymeTestReport.html";
    private static String browserConfig = "C:\\Users\\amit\\IdeaProjects\\Buy_Me_Project\\src\\data\\browser_config.xml";
    private static String chromeDriverPath = "C:\\Users\\amit\\IdeaProjects\\Buy_Me_Project\\src\\data\\chromedriver.exe";
    private static String fireFoxDriverPath = "C:\\Users\\amit\\IdeaProjects\\Buy_Me_Project\\src\\data\\geckodriver.exe";
    private String usersFilePath = "C:\\Users\\amit\\IdeaProjects\\Buy_Me_Project\\src\\data\\user_details.xml";
    private String expectedResultsPath = "C:\\Users\\amit\\IdeaProjects\\Buy_Me_Project\\src\\data\\expected_results.xml";
    private String blessingFilePath = "C:\\Users\\amit\\IdeaProjects\\Buy_Me_Project\\src\\data\\blessing_text.xml";
    private static String browserType = "browserType";
    private String websiteTag = "website";
    private String firstNameTag = "firstName";
    private String emailTag = "email";
    private String passwordTag = "password";
    private String confirmPasswordTag = "confirmPassword";
    private String usersEmailTag = "usersEmail";
    private String usersPasswordTag = "usersPassword";
    private String blessingTextTag = "blessingText";
    private String receiverNameTag = "receiverName";
    private String receiverMailTag = "receiverMail";
    private String senderNameTag = "senderName";
    private String expectedResultTest1Tag = "expectedResultTest1";
    private String expectedResultTest2Tag = "expectedResultTest2";
    private String expectedResultTest3Tag = "expectedResultTest3";
    private String expectedResultTest4Tag = "expectedResultTest4";
    static String imagePath = "C:\\Users\\amit\\IdeaProjects\\Buy_Me_Project\\src\\project_screenshots";
    private String buymeUrl = "https://buyme.co.il/";
    private String imageNameTag = "imageNameTag";
    public static WebDriver driver = null;
    static GiftPurchaseFlow giftPurchaseFlow;
    static HomePage homePage;
    static LoginPage loginPage;
    static SignUpPage signUpPage;
    static SignUpFlow signUpFlow;
    static LoginFlow loginFlow;
    static HomePageFlow homePageFlow;
    static ResultsPage resultsPage;
    static GiftPurchasePage giftPurchasePage;
    static ResultsPageFlow resultsPageFlow;
    static Data data;

    //Data Entities
    final String website = readFromFile(getWebsiteTag(), browserConfig);
    final String firstName = readFromFile(getFirstNameTag(), getUsersFilePath());
    final String email = readFromFile(getEmailTag(), getUsersFilePath());
    final String password = readFromFile(getPasswordTag(), getUsersFilePath());
    final String confirmPassword = readFromFile(getConfirmPasswordTag(), getUsersFilePath());
    final String usersEmail = readFromFile(getUsersEmailTag(), getUsersFilePath());
    final String usersPassword = readFromFile(getUsersPasswordTag(), getUsersFilePath());
    final String blessingText = readFromFile(getBlessingTextTag(), getBlessingFilePath());
    final String receiverName = readFromFile(getReceiverNameTag(), getBlessingFilePath());
    final String receiverMail = readFromFile(getReceiverMailTag(), getBlessingFilePath());
    final String senderName = readFromFile(getSenderNameTag(), getBlessingFilePath());
    final String chosenImage = "C:\\Users\\amit\\IdeaProjects\\Buy_Me_Project\\src\\project_screenshots\\" + readFromFile(getImageNameTag(), getBlessingFilePath());
    final String expectedResultTest_01 = readFromFile(getExpectedResultTest1Tag(), getExpectedResultsPath());
    final String expectedResultTest_02 = readFromFile(getExpectedResultTest2Tag(), getExpectedResultsPath());
    final String expectedResultTest_03 = readFromFile(getExpectedResultTest3Tag(), getExpectedResultsPath());
    final String expectedResultTest_04 = readFromFile(getExpectedResultTest4Tag(), getExpectedResultsPath());

    //**Constructors**//
    public BaseTest() throws Exception {

    }

    //**Methods**//
    //Getters And Setters
    public void setWebsiteTag(String websiteTag) {
        this.websiteTag = websiteTag;
    }

    public void setFirstNameTag(String firstNameTag) {
        this.firstNameTag = firstNameTag;
    }

    public void setEmailTag(String emailTag) {
        this.emailTag = emailTag;
    }

    public void setPasswordTag(String passwordTag) {
        this.passwordTag = passwordTag;
    }

    public void setConfirmPasswordTag(String confirmPasswordTag) {
        this.confirmPasswordTag = confirmPasswordTag;
    }

    public void setUsersEmailTag(String usersEmailTag) {
        this.usersEmailTag = usersEmailTag;
    }

    public void setUsersPasswordTag(String usersPasswordTag) {
        this.usersPasswordTag = usersPasswordTag;
    }

    public void setBlessingTextTag(String blessingTextTag) {
        this.blessingTextTag = blessingTextTag;
    }

    public void setReceiverNameTag(String receiverNameTag) {
        this.receiverNameTag = receiverNameTag;
    }

    public void setReceiverMailTag(String receiverMailTag) {
        this.receiverMailTag = receiverMailTag;
    }

    public void setSenderNameTag(String senderNameTag) {
        this.senderNameTag = senderNameTag;
    }

    public void setReportFilePath(String reportFilePath) {
        this.reportFilePath = reportFilePath;
    }

    public void setBrowserConfig(String browserConfig) {
        this.browserConfig = browserConfig;
    }

    public void setChromeDriverPath(String chromeDriverPath) {
        this.chromeDriverPath = chromeDriverPath;
    }

    public void setFireFoxDriverPath(String fireFoxDriverPath) {
        this.fireFoxDriverPath = fireFoxDriverPath;
    }

    public void setUsersFilePath(String usersFilePath) {
        this.usersFilePath = usersFilePath;
    }

    public void setBlessingFilePath(String blessingFilePath) {
        this.blessingFilePath = blessingFilePath;
    }

    public void setBrowserType(String browserType) {
        this.browserType = browserType;
    }

    public void setBuymeUrl(String buymeUrl) {
        this.buymeUrl = buymeUrl;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public void setImageNameTag(String imageNameTag) {
        this.senderNameTag = imageNameTag;
    }

    public void setExpectedResultsPath(String expectedResultsPath) {
        this.expectedResultsPath = expectedResultsPath;
    }

    public void setExpectedResultTest1Tag(String expectedResultTest1Tag) {
        this.expectedResultTest1Tag = expectedResultTest1Tag;
    }

    public void setExpectedResultTest2Tag(String expectedResultTest2Tag) {
        this.expectedResultTest2Tag = expectedResultTest2Tag;
    }

    public void setExpectedResultTest3Tag(String expectedResultTest3Tag) {
        this.expectedResultTest3Tag = expectedResultTest3Tag;
    }

    public void setExpectedResultTest4Tag(String expectedResultTest4Tag) {
        this.expectedResultTest4Tag = expectedResultTest4Tag;
    }

    public String getWebsiteTag() {
        return websiteTag;
    }

    public String getFirstNameTag() {
        return firstNameTag;
    }

    public String getEmailTag() {
        return emailTag;
    }

    public String getPasswordTag() {
        return passwordTag;
    }

    public String getConfirmPasswordTag() {
        return confirmPasswordTag;
    }

    public String getUsersEmailTag() {

        return usersEmailTag;
    }

    public String getUsersPasswordTag() {

        return usersPasswordTag;
    }

    public String getBlessingTextTag() {
        return blessingTextTag;
    }

    public String getReceiverNameTag() {
        return receiverNameTag;
    }

    public String getReceiverMailTag() {
        return receiverMailTag;
    }

    public String getSenderNameTag() {
        return senderNameTag;
    }

    public String getReportFilePath() {
        return reportFilePath;
    }

    public String getBrowserConfig() {
        return browserConfig;
    }

    public String getChromeDriverPath() {
        return chromeDriverPath;
    }

    public String getFireFoxDriverPath() {
        return fireFoxDriverPath;
    }

    public String getUsersFilePath() {
        return usersFilePath;
    }

    public String getBlessingFilePath() {
        return blessingFilePath;
    }

    public String getBrowserType() {
        return browserType;
    }

    public String getBuymeUrl() {
        return buymeUrl;
    }

    public String getImageNameTag() {
        return imageNameTag;
    }

    public String getExpectedResultsPath() {
        return expectedResultsPath;
    }

    public String getExpectedResultTest1Tag() {
        return expectedResultTest1Tag;
    }

    public String getExpectedResultTest2Tag() {
        return expectedResultTest2Tag;
    }

    public String getExpectedResultTest3Tag() {
        return expectedResultTest3Tag;
    }

    public String getExpectedResultTest4Tag() {
        return expectedResultTest4Tag;
    }

    public static String getImagePath() {
        System.out.println(imagePath + " Amit");
        return imagePath;
    }

    //Web driver and report initialization+ reset page objects
    @BeforeClass
    public static void browserSetup() throws Exception {
        String browser = readFromFile(browserType, browserConfig);
        extent = new ExtentReports(reportFilePath);
        myTest = extent.startTest("Buyme Test Run");

        switch (browser) {
            case "Chrome":
                System.setProperty("webdriver.chrome.driver", chromeDriverPath);
                ChromeOptions options = new ChromeOptions();
                options.addArguments("--remote-allow-origins=*");
                driver = new ChromeDriver(options);
                driver.manage().window().maximize();
                break;
            case "FireFox":
                System.setProperty("webdriver.gecko.driver", fireFoxDriverPath);
                driver = new FirefoxDriver();
                driver.manage().window().maximize();
                break;
            default:
                System.out.println("The legal browsers are only Chrome or FireFox");
        }

        signUpFlow = new SignUpFlow(driver);
        loginFlow = new LoginFlow(driver);
        giftPurchaseFlow = new GiftPurchaseFlow(driver);
        signUpPage = new SignUpPage(driver);
        loginPage = new LoginPage(driver);
        homePage = new HomePage(driver);
        resultsPage = new ResultsPage(driver);
        giftPurchasePage = new GiftPurchasePage(driver);
        homePageFlow = new HomePageFlow(driver);
        resultsPageFlow = new ResultsPageFlow(driver);
        data = new Data();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    //Open Buyme website
    @Before
    public void openSite() {
        driver.get(website);
    }

    //Read From File
    public static String readFromFile(String keyData, String filePath) throws Exception {
        File xmlFile = new File(filePath);
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        Document doc = dBuilder.parse(xmlFile);
        doc.getDocumentElement().normalize();
        return doc.getElementsByTagName(keyData).item(0).getTextContent();


    }

    //Take a screenshot
    public static String takeScreenShot(String ImagePath) {

        TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
        File screenShotFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
        File destinationFile = new File(ImagePath + ".png");
        try {
            FileUtils.copyFile(screenShotFile, destinationFile);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return ImagePath + ".png";
    }


    //Close driver, Generate the test Report end automatically open it
    @AfterClass
    public static void closeDriverAndReports() throws IOException {
        driver.close();
        driver.quit();
        extent.flush();
        Desktop.getDesktop().browse(new File(reportFilePath).toURI());

    }
}
