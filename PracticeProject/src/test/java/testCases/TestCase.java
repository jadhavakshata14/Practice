package testCases;

import java.net.MalformedURLException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import basePackage.BaseConfigure;
import pagePackage.HomePage;
import pagePackage.DesktopPage;

public class TestCase extends BaseConfigure
{
	public HomePage wsp;
	public DesktopPage dp;
	WebDriver driver;
	
	@Parameters({"Port"})
	@BeforeMethod
	public void initialSetup(String Port) throws MalformedURLException
	{
		driver = setup(Port);
		wsp = new HomePage(driver);
		dp = new DesktopPage(driver);
	}
	
	@Test
	public void testScenario()
	{
		wsp.verifyHomePage();
		wsp.computerTabOperations();
		dp.clickOnBtn();
		dp.verifyButton();
	}
	

}
