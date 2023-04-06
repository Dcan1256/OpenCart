package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    //Elements
    @FindBy(xpath = "//*[@id=\"top-links\"]/ul/li[2]/a/span[1]")
    public WebElement lnkMyAccount;

    @FindBy(xpath = "//*[@id=\"top-links\"]/ul/li[2]/ul/li[1]/a")
    public WebElement lnkRegister;

    @FindBy(xpath = "//*[@id=\"top-links\"]/ul/li[2]/ul/li[2]/a")
    public WebElement lnkLogin;

    @FindBy(xpath = "//*[@id=\"search\"]/input")
    public WebElement searchBox;

    @FindBy(xpath = "//*[@id=\"search\"]/span/button")
    public WebElement searchBtn;
    //Action Methods
    public void clickMyAccount(){
        lnkMyAccount.click();
    }

    public void clickRegister(){
        lnkRegister.click();
    }

    public void clickLogin(){ lnkLogin.click(); }

    public void doSearch(String search){
        searchBox.sendKeys(search);
        searchBtn.click();
    }
}
