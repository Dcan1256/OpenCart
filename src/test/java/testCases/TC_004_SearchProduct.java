package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.HomePage;
import pageObjects.SearchPage;

import java.util.ResourceBundle;

public class TC_004_SearchProduct extends BaseClass {

    ResourceBundle rb;
    @Test
    public void testSearchFunction(){
        try {
            rb=ResourceBundle.getBundle("config");
            HomePage hp=new HomePage(driver);
            hp.doSearch(rb.getString("product"));
            SearchPage sp=new SearchPage(driver);

            String expected = "Search - "+rb.getString("product");
            String actual = sp.getSearchedText();

            //System.out.println(actual+"   "+expected);
            Assert.assertEquals(actual,expected);
        }catch (Exception e){
            Assert.fail();
        }
    }
}
