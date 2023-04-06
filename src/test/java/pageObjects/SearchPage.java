package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends BasePage{
    public SearchPage(WebDriver driver) {
        super(driver);
    }

    //Elements
    @FindBy(xpath = "//*[@id=\"content\"]/div[3]")
    public WebElement searchResults;

    @FindBy(xpath = "//*[@id=\"content\"]/h1")
    public WebElement searchText;
    //Action Methods
    public String getSearchedText(){
        return searchText.getText();
    }
}
