package testCases;

import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.CheckOutPage;
import pageObjects.HomePage;

public class TC_005_AddingIntoCartTest extends BaseClass {

    @Test
    public void addingToCartWithoutSearch() {
        try {
            HomePage hp = new HomePage(driver);
            hp.addingBasicProduct();
            Thread.sleep(1000);
            hp.goToCart();
            Thread.sleep(1000);
            CheckOutPage cp=new CheckOutPage(driver);
            Double price1= Double.valueOf(cp.firstProductPrice.getText().substring(1));
            System.out.println(price1);
            Double price2= Double.valueOf(cp.secondProductPrice.getText().substring(1));
            System.out.println(price2);
            Double ecoTax=Double.valueOf(cp.ecoTax.getText().substring(1));
            System.out.println(ecoTax);
            Double vatTax=Double.valueOf(cp.vatTax.getText().substring(1));
            System.out.println(vatTax);
            Double expectedTotal=Double.valueOf(cp.total.getText().substring(1));
            System.out.println(expectedTotal);
            Double actualTotal=price1+price2;

            Assert.assertEquals(actualTotal,expectedTotal);


        } catch (Exception e) {
            Assert.fail();
        }
    }

}
