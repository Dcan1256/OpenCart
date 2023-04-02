package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.AccountRegistrationPage;
import pageObjects.HomePage;

import java.util.Random;

public class TC_001_AccountRegistrationTest extends BaseClass {

    @Test(groups = {"Regression","Master"})
    void test_account_Registration(){
        try {
            logger.debug("application logs.....");
            logger.info("**** Starting logging for account registration test --> TC_001_AccountRegistrationTest ****");
            HomePage hp=new HomePage(driver);
            hp.clickMyAccount();
            logger.info("Clicked on My Account link");
            hp.clickRegister();
            logger.info("Clicked on Register Link");

            AccountRegistrationPage registrationPage=new AccountRegistrationPage(driver);
            logger.info("Providing customer data");
            registrationPage.txtFirstName.sendKeys("Dogan");

            registrationPage.txtLastName.sendKeys("Yormaz");

            Random random=new Random();

            int num=random.nextInt(9_999);

            registrationPage.txtEmail.sendKeys("DoganYormaz"+num+"@gmail.com");

            registrationPage.txtTelephone.sendKeys("123456789");

            registrationPage.txtPassword.sendKeys("Test@123");

            registrationPage.txtConfirmPassword.sendKeys("Test@123");

            registrationPage.chkdPolicy.click();
            logger.info("Policy box checked");

            registrationPage.btnContinue.click();
            logger.info("Clicking on continue button");

            logger.info("Validating the expected message");
            String confirmMsg = registrationPage.getConfirmationMsg();
            Thread.sleep(1000);

            Assert.assertEquals(confirmMsg,"Your Account Has Been Created!");

        }catch (Exception e){
            logger.error("Test Failed !!!");
            Assert.fail();
        }
        logger.info("**** Finishing logging for account registration test --> TC_001_AccountRegistrationTest ****");
    }
}
