package TestBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Driver;
import java.time.Duration;
import java.util.Properties;

import static main.util.WaitUtil.PAGE_LOAD;

public class WebTestBase
{
    public static Properties prop;
    public static WebDriver driver;

    public WebTestBase()
    {
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(System.getProperty("user.dir") + "/src/main/resources/properties/Config.properties");
        } catch (Exception e) {
            e.printStackTrace();
        }
        prop = new Properties();
        try {
            prop.load(fileInputStream);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void initialization()
    {
        String browserName = prop.getProperty("browser");

        if (browserName.equalsIgnoreCase("chrome"))
        {
            System.setProperty("WebDriver.chrome.driver", System.getProperty("user.dir") + "/src/main/resources/Browser/chromedriver.exe");
            driver = new ChromeDriver();
        }

        else if (browserName.equalsIgnoreCase("firefox"))
        {
            System.setProperty("WebDriver.firefox.driver", System.getProperty("user.dir") + "/src/main/resources/Browser/geckodriver.exe");
            driver = new FirefoxDriver();
        }
        else if (browserName.equalsIgnoreCase("edge"))
        {
            System.setProperty("WebDriver.edge.driver", System.getProperty("user.dir") + "/src/main/resources/Browser/msedgedriver.exe");
            driver = new EdgeDriver();
        }
        else
        {
           throw new RuntimeException("please select the correct browser name");
        }
        driver.get(prop.getProperty("url"));
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(PAGE_LOAD));
        driver.manage().deleteAllCookies();
    }
}

