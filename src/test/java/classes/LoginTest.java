package classes;

import Pages.Homepage;
import Pages.LoginPage;
import Pages.MyAccountPage;
import Pages.OnboardingPage;
import TestBase.WebTestBase;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class LoginTest extends WebTestBase
{
    public Homepage homepage;
    public LoginPage loginPage;
    public MyAccountPage myAccountPage;

    public OnboardingPage onboardingPage;


public LoginTest(){
    super();
}
    @BeforeMethod
    public void beforeMethod()
    {
        initialization();
     homepage = new Homepage();
     loginPage=new LoginPage();
     myAccountPage=new MyAccountPage();
     onboardingPage=new OnboardingPage();


    }
    @Test(description = "Verify login with Valid username and Valid password")
    public void verifyLogin()
    {
        SoftAssert softAssert=new SoftAssert();
        homepage.closeFirstAd();
        homepage.clickOnMyAccountBtn();
        loginPage.login(prop.getProperty("Username"), prop.getProperty("Password"));
        softAssert.assertEquals(myAccountPage.getTextOfMyAccount(),"MY ACCOUNT", "Text should be MY ACCOUNT");
        softAssert.assertAll();
    }


   @Test(description = "Verify login with Valid username and Invalid password")
   public void verifyLoginWithValidUsernameAndInvalidPassword()
   {
       SoftAssert softAssert = new SoftAssert();
       homepage.closeFirstAd();
       homepage.clickOnMyAccountBtn();
       loginPage.login(prop.getProperty("Username"), prop.getProperty("InvalidPassword"));
       softAssert.assertEquals(loginPage.getTextOfErrorElement(), "ERROR", "Text should be ERROR");
       softAssert.assertAll();
   }


    @Test(description = "Verify mouse should be move to webElement")
    public void verifyMouseHoverAction() throws InterruptedException {
        SoftAssert softAssert = new SoftAssert();
        homepage.newAd();
        homepage.closeFirstAd();
        homepage.moveToWebElement();
        homepage.selectShopOption(prop.getProperty("selectShopOption"));
        Thread.sleep(5000);
        homepage.closeLastAd();
        softAssert.assertAll();
    }

    @Test(description = "Verify subscription option should be selected")
    public void verifySubscriptionOption() throws InterruptedException
    {
        SoftAssert softAssert = new SoftAssert();
        homepage.closeFirstAd();
        homepage.SubscriptionsOptionSelect(prop.getProperty("SubscriptionsOptionSelect"));
        homepage.closeLastAd();
        Thread.sleep(5000);
        softAssert.assertAll();

    }


     @Test(description = "Verify Brew Guides option should be selected")
     public void verifyBrewGuidesOption() throws InterruptedException
     {
         SoftAssert softAssert = new SoftAssert();
         homepage.closeFirstAd();
         homepage.brewGuideOption();
         Thread.sleep(7000);
         softAssert.assertAll();

     }




     @Test(description = "Verify Our Story should be selected")
     public void verifyOurStoryOption() throws InterruptedException {
         SoftAssert softAssert = new SoftAssert();
         homepage.closeFirstAd();
         homepage.selectOurStoryOptions(prop.getProperty("selectOurStoryOptions"));
         Thread.sleep(4000);
         softAssert.assertAll();
     }

    @Test(description = "Verify addToCart shuld be selected")
    public void verifyaddToCartOption() throws InterruptedException {
        SoftAssert softAssert = new SoftAssert();
        homepage.newAd();
        homepage.closeFirstAd();
        homepage.addToCart(prop.getProperty("addToCart"));
        homepage.closeLastAd();
        softAssert.assertAll();
    }

    @Test(description = "Verify cafeFinder shuld be selected")
    public void verifyCafeFinderOpion() throws InterruptedException
    {
        SoftAssert softAssert = new SoftAssert();
        homepage.closeFirstAd();
        homepage.cafeFinder();
        Thread.sleep(3000);
        softAssert.assertAll();
    }



    @AfterMethod
    public void afterMethod()
    {
     driver.close();
    }
}
