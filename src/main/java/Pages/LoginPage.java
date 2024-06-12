package Pages;

import TestBase.WebTestBase;
import main.util.WaitUtil;
import main.util.WebDriverUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends WebTestBase
{
    @FindBy(id="username")
    WebElement loginUserNameTextbox;

    @FindBy(id="password")
    WebElement loginPasswordTextbox;

    @FindBy(name="login")
    WebElement loginBtn;

    @FindBy(xpath = "//strong[text()='ERROR']")
    WebElement ErrorElement;

    public LoginPage()
    {
        PageFactory.initElements(driver,this);
    }

    public void login(String userName,String password)
    {
        WebDriverUtil.sendkeysToElement(loginUserNameTextbox, userName);
        WebDriverUtil.sendkeysToElement(loginPasswordTextbox, password);
        WaitUtil.waitUntilElementToBeClickable(loginBtn);
    }

    public String getTextOfErrorElement()
    {
        return WebDriverUtil.getTextElement(ErrorElement);
    }
}
