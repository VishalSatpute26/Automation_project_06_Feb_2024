package Pages;

import TestBase.WebTestBase;
import main.util.WaitUtil;
import org.openqa.selenium.WebElement;

public class OnboardingPage extends WebTestBase
{
    public static void selectProductOption(WebElement element)
    {
        WaitUtil.waitUntilElementToBeClickable(element);
    }




    public void closeLastAd(WebElement element)
    {
        WaitUtil.waitUntilElementToBeClickable(element);
    }
}
