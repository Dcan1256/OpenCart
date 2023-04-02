package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ResourceBundle;

public class AccountRegistrationPage extends BasePage {
    public AccountRegistrationPage(WebDriver driver) {
        super(driver);
    }

    //Elements
    @FindBy(xpath = "//*[@id=\"input-firstname\"]")
    public WebElement txtFirstName;

    @FindBy(xpath = "//*[@id=\"input-lastname\"]")
    public WebElement txtLastName;

    @FindBy(xpath = "//*[@id=\"input-email\"]")
    public WebElement txtEmail;

    @FindBy(xpath = "//*[@id=\"input-telephone\"]")
    public WebElement txtTelephone;

    @FindBy(xpath = "//*[@id=\"input-password\"]")
    public WebElement txtPassword;

    @FindBy(xpath = "//*[@id=\"input-confirm\"]")
    public WebElement txtConfirmPassword;

    @FindBy(xpath = "//*[@id=\"content\"]/form/div/div/input[1]")
    public WebElement chkdPolicy;

    @FindBy(xpath = "//*[@id=\"content\"]/form/div/div/input[2]")
    public WebElement btnContinue;

    @FindBy(xpath = "//*[@id=\"content\"]/h1")
    public WebElement msgConfirmation;

    //Action Methods
    public String getConfirmationMsg(){
        try {
            return msgConfirmation.getText();
        }catch (Exception e){
            return e.getMessage();
        }
    }
}
