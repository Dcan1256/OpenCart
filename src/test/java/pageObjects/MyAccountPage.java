package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BasePage {
    public MyAccountPage(WebDriver driver) {
        super(driver);
    }

    //Elements
    @FindBy(xpath = "//*[@id=\"content\"]/h2[1]")
    public WebElement myAccountTxt;

    @FindBy(xpath = "//*[@id=\"column-right\"]/div/a[13]")
    public WebElement logoutBtn;

    //Action Methods

    public boolean getMyAccountText(){
        try {
            return myAccountTxt.isDisplayed();
        }catch (Exception e){
            return false;
        }
    }

    public void clickLogout(){ logoutBtn.click(); }
}
