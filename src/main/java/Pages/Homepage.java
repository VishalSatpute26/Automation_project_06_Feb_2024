package Pages;

import TestBase.WebTestBase;
import main.util.ActionsUtil;
import main.util.DropDownUtil;
import main.util.WaitUtil;
import main.util.WebDriverUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Homepage extends WebTestBase
{
    @FindBy(xpath = "//button[@class='CloseButton__ButtonElement-sc-79mh24-0 irFqfi annapolis-CloseButton annapolis-close annapolis-ClosePosition--top-right']")
    WebElement closeNewAd;
    @FindBy(xpath="//a[@class='newsletter__close newsletter__trigger']")
    WebElement firstad;

    @FindBy(xpath = "//a[@class='user-controls__ul__li__a']")
    WebElement myAccountBtn;

    @FindBy(xpath = "//a[text()='Shop']")
    WebElement shopOption;

    @FindBy(xpath="(//ul[@class='sub-menu'])[2]//li/a")
    List <WebElement> allShopOptions;

    @FindBy(xpath = "//div[text()='500g Superior Coffee Bundle']")
    WebElement selectProductOption;

    @FindBy(xpath = "//div[text()='Ground']")
    WebElement radioOption;

    @FindBy(xpath = "//a[@class='newsletter__close newsletter__trigger']")
    WebElement lastad;

    @FindBy(xpath = "(//a[text()='Subscriptions'])[2]")
    WebElement SubscriptionsOption;

    @FindBy(xpath = "(//ul[@class='sub-menu'])[3]//li/a")
    List<WebElement> allSubscriptionsOption;


    @FindBy(xpath = "//a[text()='Brew Guides']")
    WebElement brewGuidesOption;
    @FindBy(xpath = "//ul[@class='filter_item-list filter_item-list--visible']")
    WebElement selectDropDown;

    @FindBy(xpath = "//button[text()='Find']")
    WebElement findBtn;

    @FindBy(xpath="//div[text()='All Articles']")
    WebElement optionFromDD;

    @FindBy(xpath = "//ul[@class='filter_item-list filter_item-list--visible']//child::li")
    List<WebElement> listOptionFromDD;

    @FindBy(xpath = "//a[text()='Our Story']")
    WebElement ourStoryOption;
    @FindBy(xpath = "(//ul[@class='sub-menu'])[1]//li/a")
    List<WebElement> listOfOurStoryOption;

    @FindBy(xpath = "(//a[@class='mini-cart'])[1]")
    WebElement addToCartOption;

    @FindBy(xpath = "//h1[text()='Find Campos Coffee Near You - Campos Coffee Finder']")
    WebElement cafeFinderOption;

    @FindBy(xpath = "//a[text()='Youtube']")
    WebElement goToChannel;


    public Homepage()
    {
        PageFactory.initElements(driver,this);
    }

    public void newAd()
    {
        WaitUtil.waitUntilElementToBeClickable(closeNewAd);
    }

    public void closeFirstAd()
    {
        WaitUtil.waitUntilElementToBeClickable(firstad);
    }
    public void clickOnMyAccountBtn()
    {
        WaitUtil.waitUntilElementToBeClickable(myAccountBtn);
    }
    public boolean myAccountIsDisplayed()
    {
        return WebDriverUtil.isElementDisplayed(myAccountBtn);
    }

    public void closeLastAd()
    {
        WaitUtil.waitUntilElementToBeClickable(lastad);
    }

    public void moveToWebElement()
    {
        WaitUtil.waitUntilElement(shopOption);
        ActionsUtil.moveToWebElement(shopOption);
    }


    public void selectShopOption(String option)
    {
        WaitUtil.waitUntilElement(shopOption);
        ActionsUtil.moveToWebElement(shopOption);

        WaitUtil.waitUntilElement(allShopOptions);
        ActionsUtil.selectRamdomOptionFromList(allShopOptions, option);
        WaitUtil.waitUntilElementToBeClickable(selectProductOption);
        WaitUtil.waitUntilElementToBeClickable(radioOption);

    }


    public void moveToSubscriptions()
    {
        WaitUtil.waitUntilElement(SubscriptionsOption);
        ActionsUtil.moveToWebElement(SubscriptionsOption);
    }


    public void SubscriptionsOptionSelect(String option)
    {
        WaitUtil.waitUntilElement(SubscriptionsOption);
        ActionsUtil.moveToWebElement(SubscriptionsOption);
        WaitUtil.waitUntilElementToBeClickable(SubscriptionsOption);
        ActionsUtil.selectRamdomOptionFromList(allSubscriptionsOption, option);

    }
    
    public void selectOurStoryOptions(String options)
    {
        WaitUtil.waitUntilElement(ourStoryOption);
        ActionsUtil.moveToOurStoryOption(ourStoryOption);
        WaitUtil.waitUntilElement(listOfOurStoryOption);
        ActionsUtil.selectRandomOptionFromOurStory(listOfOurStoryOption, options);

    }


    public void brewGuideOption()
    {
        WaitUtil.waitUntilElementToBeClickable(brewGuidesOption);
        WaitUtil.waitUntilElementToBeClickable(optionFromDD);
        DropDownUtil.optionFromDropDown(listOptionFromDD);
        WaitUtil.waitUntilElementToBeClickable(findBtn);


    }
    public void addToCart(String addToCart) throws InterruptedException {
        ActionsUtil.moveToAddToCart(addToCartOption);
        WaitUtil.waitUntilElementToBeClickable(addToCartOption);
        Thread.sleep(3000);
    }

    public void cafeFinder()
    {

        ActionsUtil.moveToSocialMedia(goToChannel);
        WaitUtil.waitUntilElementToBeClickable(goToChannel);


    }
}
