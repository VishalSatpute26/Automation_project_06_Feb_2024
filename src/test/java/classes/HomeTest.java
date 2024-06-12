package classes;

import Pages.Homepage;
import Pages.LoginPage;
import Pages.MyAccountPage;
import TestBase.WebTestBase;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HomeTest extends WebTestBase
{
    public Homepage homepage;
    public LoginPage loginPage;
    public MyAccountPage myAccountPage;


    public HomeTest()
    {
        super();
    }
    @BeforeMethod
    public void beforeMethod()
    {
        initialization();
        homepage = new Homepage();
        loginPage=new LoginPage();
        myAccountPage=new MyAccountPage();

    }

    @Test(description = "verify My Account btn is display on home page")
    public void verifyMyAcccountBtnDisplayed()
    {
        SoftAssert softAssert=new SoftAssert();
        homepage.closeFirstAd();
        softAssert.assertTrue(homepage.myAccountIsDisplayed(),"My Account btn should be display");
        softAssert.assertAll();
    }


    @Test(description = "verify mouseHover action on shop")
    public void verifyMouseHoverAction() throws InterruptedException {
        SoftAssert softAssert = new SoftAssert();
        homepage.closeFirstAd();
        homepage.moveToWebElement();
        homepage.selectShopOption(prop.getProperty("allShopOptions"));
        homepage.selectShopOption(prop.getProperty("selectShopOption"));
        homepage.selectShopOption(prop.getProperty("selectProductOption"));

        softAssert.assertAll();


    }

}
