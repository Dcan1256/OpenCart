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

    @FindBy(xpath = "//*[@id=\"content\"]/div[2]/div[1]/div/div[3]/button[1]")
    public WebElement product1;


    @FindBy(xpath = "//*[@id=\"content\"]/div[2]/div[2]/div/div[3]/button[1]")
    public WebElement product2;


    @FindBy(xpath = "//*[@id=\"content\"]/div[2]/div[3]/div/div[3]/button[1]")
    public WebElement product3;



    @FindBy(xpath = "//*[@id=\"content\"]/div[2]/div[4]/div/div[3]/button[1]")
    public WebElement product4;

    @FindBy(xpath = "//*[@id=\"cart\"]/button")
    public WebElement cartBtn;

    @FindBy(xpath = "//*[@id=\"cart\"]/ul/li[2]/div/p/a[1]")
    public WebElement viewCartBtn;



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

    public void addingBasicProduct() throws InterruptedException {
        product1.click();
        Thread.sleep(1000);
        product2.click();
        Thread.sleep(1000);
    }

    public void goToCart(){
        cartBtn.click();
        viewCartBtn.click();
    }
}
