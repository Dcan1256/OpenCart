package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckOutPage extends BasePage{
    public CheckOutPage(WebDriver driver) {
        super(driver);
    }

    //Elements
    @FindBy(xpath = "//*[@id=\"content\"]/form/div/table/tbody/tr[1]/td[5]")
    public WebElement firstProductPrice;

    @FindBy(xpath = "//*[@id=\"content\"]/form/div/table/tbody/tr[2]/td[5]")
    public WebElement secondProductPrice;

    @FindBy(xpath = "//*[@id=\"content\"]/div[2]/div/table/tbody/tr[2]/td[2]")
    public WebElement ecoTax;

    @FindBy(xpath = "//*[@id=\"content\"]/div[2]/div/table/tbody/tr[3]/td[2]")
    public WebElement vatTax;

    @FindBy(xpath = "//*[@id=\"content\"]/div[2]/div/table/tbody/tr[4]/td[2]")
    public WebElement total;
    //Action Methods
    public double getFirstPrice(){
        Double price= Double.valueOf(firstProductPrice.getText().substring(firstProductPrice.getText().indexOf("$")));
        return price;
    }


}
