package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    //Elements
    @FindBy(xpath = "//*[@id=\"input-email\"]")
    public WebElement usernameBox;

    @FindBy(xpath = "//*[@id=\"input-password\"]")
    public WebElement passwordBox;

    @FindBy(xpath = "//*[@id=\"content\"]/div/div[2]/div/form/input")
    public WebElement loginBtn;
    //Action Methods

    public void setUsernameBox(String email){ usernameBox.sendKeys(email); }

    public void setPasswordBox(String pwd){ passwordBox.sendKeys(pwd); }

    public void clickLogin(){ loginBtn.click(); }
}
