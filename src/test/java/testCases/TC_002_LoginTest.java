package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;

import java.util.ResourceBundle;

public class TC_002_LoginTest extends BaseClass {

    @Test(groups = {"Sanity","Master"})
    public void loginTest(){
        try {
            logger.info("**** Starting TC_002_LoginTest ****");
            HomePage hp=new HomePage(driver);
            logger.info("**** Clicking on my account button ****");
            hp.clickMyAccount();
            logger.info("**** Clicking on login button ****");
            hp.clickLogin();


            LoginPage lp=new LoginPage(driver);
            logger.info("**** Entering user email ****");
            lp.setUsernameBox(rb.getString("username")); // valid email from config.properties file
            logger.info("**** Entering user password ****");
            lp.setPasswordBox(rb.getString("password")); // valid password from config.properties file
            logger.info("**** Clicking login button ****");
            lp.clickLogin();

            MyAccountPage mp=new MyAccountPage(driver);
            boolean actualResult=mp.getMyAccountText();
            logger.info("**** Validating the actual and expected result ****");
            Assert.assertEquals(actualResult,true);
        }catch (Exception e){
            logger.info("**** Test Failed ****");
            Assert.fail();
        }

        logger.info("**** Ending TC_002_LoginTest ****");
    }
}
