package pomPolicyUsingTestng.pomPolicyUsingTestng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccountPage {
	@FindBy(xpath="(//div[@class='textCapitalize sc-ckVGcZ kWpXlQ'])[1]") private WebElement userName;
	@FindBy(xpath="(//p[normalize-space()='Logout'])[1]") private WebElement logOutButton;

	public MyAccountPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public String getActualUserName()
	{
		String actualUN= userName.getText();
		return actualUN;
	}
	public void LogoutButton()
	{
		logOutButton.click();
	}

}
