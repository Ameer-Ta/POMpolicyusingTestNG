package pomPolicyUsingTestng.pomPolicyUsingTestng;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class ValidatePolicyUserName {

	WebDriver driver;
	LoginPage login;
	MyAccountPage myacc;

	@BeforeClass
	public void lanuchPolicyBazar()
	{
		driver= new ChromeDriver();
		driver.get("https://www.policybazaar.com/");
		driver.manage().window().maximize();
		login= new LoginPage(driver);
		myacc = new MyAccountPage(driver);
	}

	@BeforeMethod
	public void loginToPolicyBazar()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		login.clickOnHomePageSignInButton();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		login.enterMobileNum();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		login.clickOnSignWithButton();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		login.enterPassword();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		login.clickOnSignInButton();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		login.clickOnMyAccountButton();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		login.clickOnMyProfileButton();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));

		Set<String>allWindowID=driver.getWindowHandles();
		List<String>id= new ArrayList(allWindowID);
		driver.switchTo().window(id.get(1));
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));


	}
	@Test
	private void verifyUserName() {
		String expUN="Ameer Mohammad";
		String actualUN= myacc.getActualUserName();
		Assert.assertEquals(actualUN, expUN,"TC failed actual and exp are not matching");

	}

	@AfterMethod
	private void logOutFromPolicyBazar() {
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));

		myacc.LogoutButton();

	}

	@AfterClass
	private void closeBrowser() {
		driver.quit();

	}


}