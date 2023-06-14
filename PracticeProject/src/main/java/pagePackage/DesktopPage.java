package pagePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class DesktopPage 
{
	WebDriver driver;
	public DesktopPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "(//*[@class='button-2 product-box-add-to-cart-button'])[1]")
	public WebElement FirstAddToCartBtn;
	
	@FindBy(xpath = "(//*[@value='Add to cart'])[1]")
	public WebElement AddToCartBtn;
	
	public void clickOnBtn()
	{
		FirstAddToCartBtn.click();
	}
	
	public void verifyButton()
	{
		Assert.assertTrue(AddToCartBtn.isDisplayed(), "Button is not visible");
	}


}
