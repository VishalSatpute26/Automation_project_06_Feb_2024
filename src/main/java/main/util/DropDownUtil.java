package main.util;

import TestBase.WebTestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;


public class DropDownUtil extends WebTestBase {

    public static void optionFromDropDown(List<WebElement> optionFromDropDown)
    {

        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
        javascriptExecutor.executeScript("window.scrollBy(0,500)");


        for (WebElement element : optionFromDropDown)
        {
            if (element.getText().trim().equalsIgnoreCase("Coffee of the Month"))
            {
                element.click();
                break;
            }


        }

    }
}
