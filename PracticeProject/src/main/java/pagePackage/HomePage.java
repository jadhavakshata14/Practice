package pagePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class HomePage 
{
	WebDriver driver;
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[@alt='Tricentis Demo Web Shop']")
	public WebElement WebshopLogo;
	
	
	@FindBy(xpath = "//*[text()='Register']")
	public WebElement RegisterTab;
	
	@FindBy(xpath = "//*[text()='Log in']")
	public WebElement LogInTab;
	
	@FindBy(xpath = "(//*[text()='Shopping cart'])[1]")
	public WebElement ShoppingCartTab;
	
	@FindBy(xpath = "(//*[text()='Wishlist'])[1]")
	public WebElement WishlistTab;
	
	@FindBy(xpath = "(//*[@href='/computers'])[1]")
	public WebElement ComputerTab;
	
	@FindBy(xpath = "(//*[@href='/desktops'])[1]")
	public WebElement DesktopTab;
	
	public void verifyHomePage()
	{
		Assert.assertTrue(WebshopLogo.isDisplayed(), "Webshop logo is not visible");
		Assert.assertTrue(RegisterTab.isDisplayed(), "Register tab is not visible");
		Assert.assertTrue(LogInTab.isDisplayed(), "Log in tab is not visible");
		Assert.assertTrue(ShoppingCartTab.isDisplayed(), "Shopping cart tab is not visible");
		Assert.assertTrue(WishlistTab.isDisplayed(), "Wishlist tab is not visible");
	}
	
	public void computerTabOperations()
	{
		Actions act = new Actions(driver);
		act.moveToElement(ComputerTab).build().perform();
		DesktopTab.click();
	}

}
