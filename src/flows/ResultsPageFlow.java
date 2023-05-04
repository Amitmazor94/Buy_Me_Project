package flows;

import org.openqa.selenium.WebDriver;
import packageObject.ResultsPage;

public class ResultsPageFlow {
//**Attributes**//
    ResultsPage resultsPage;

    //**Constructors**//
    //Connect Web Driver to the relevant pages
    public ResultsPageFlow(WebDriver driver){
        resultsPage= new ResultsPage(driver);
    }

    //**Methods**//
    //Choose a gift from the search result and then click on an optional payment method
    public void chooseGift(){
        resultsPage.clickBusinessItem();
        resultsPage.clickChooseItemButton();
    }
}
