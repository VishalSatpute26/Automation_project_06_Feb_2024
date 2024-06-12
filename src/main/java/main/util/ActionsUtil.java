package main.util;

import TestBase.WebTestBase;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class ActionsUtil extends WebTestBase
{
    public static Actions actions;
      public static void moveToWebElement(WebElement element)
  {
      actions = new Actions(driver);
      actions.moveToElement(element)
            .build()
            .perform();
  }
  public static void selectRamdomOptionFromList(List<WebElement> elementList, String opt)
  {
      for (WebElement element:elementList)
      {
          if (element.getText().equalsIgnoreCase(opt))
          {
              element.click();
              break;
          }
      }
  }
public static void scrollToElement(WebElement element)
{
    JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
    javascriptExecutor.executeScript("window.scrollBy(0,700)");
}


    public static void moveToSubscriptions(WebElement element)
    {
        actions = new Actions(driver);
        actions.moveToElement(element)
                .build()
                .perform();
    }
    public static void selectRamdomOptionFromSubscription(List<WebElement> elementList, String opt)
    {
        for (WebElement element:elementList)
        {
            if (element.getText().equalsIgnoreCase(opt))
            {
                element.click();
                break;
            }
        }
    }

    public static void moveToOurStoryOption(WebElement element) {
        actions = new Actions(driver);
        actions.moveToElement(element)
                .build()
                .perform();
    }
    public static void selectRandomOptionFromOurStory(List<WebElement> elementList, String option)
    {

        for (WebElement element : elementList)
        {
            if(element.getText().equalsIgnoreCase(option))
            {
                element.click();
            }
        }
    }

    public static void moveToAddToCart(WebElement element)
    {
        actions = new Actions(driver);
        actions.moveToElement(element)
                .build()
                .perform();
    }


    public static void moveToSocialMedia(WebElement goToChannel)
    {
         JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("window.scrollBy(0,1200)");

    }
}


