package main.util;

import TestBase.WebTestBase;
import org.openqa.selenium.WebElement;

import java.util.List;

public class WebDriverUtil extends WebTestBase
{
    public static void sendkeysToElement(WebElement element, String text)
    {
        element.sendKeys(text);
    }

    public static String getTextElement(WebElement element)
    {
        return element.getText();
    }

    public static boolean isElementDisplayed(WebElement element)
    {
        return element.isDisplayed();
    }

}
