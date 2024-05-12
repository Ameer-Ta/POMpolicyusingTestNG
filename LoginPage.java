package pomPolicyUsingTestng.pomPolicyUsingTestng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBy(xpath="//a[normalize-space()='Sign in']") private WebElement signInButtonHomePage;
	@FindBy(xpath="(//input[@id='central-login-module-sign-mobile'])[2]")private WebElement mobileNumberField;
	@FindBy(xpath="(//span[@id='central-login-sign-in-with-password-span'])[2]") private WebElement SignWithPassword;
	@FindBy(xpath="(//input[@id='central-login-password'])[1]") private WebElement passwordField;
	@FindBy(xpath="(//a[@id='login-in-with-password'])[1]") private WebElement signInButton;
	@FindBy(xpath="(//div[@class='userprofile'])[1]")private WebElement myAccountButton;
	@FindBy(xpath="(//span[normalize-space()='My profile'])[1]")private WebElement myProfileButton;
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnHomePageSignInButton()
	{
		signInButtonHomePage.click();
	}
	public void enterMobileNum()
	{
		mobileNumberField.sendKeys("9502568722");
		
	}
	public void clickOnSignWithButton()
	{
		SignWithPassword.click();
	}
	public void enterPassword()
	{
		 passwordField.sendKeys("Yuhaan@241");
	}
	public void clickOnSignInButton()
	{
		 signInButton.click();
	}
	
	public void clickOnMyAccountButton()
	{
		myAccountButton.click();
		
	}
	public void clickOnMyProfileButton()
	{
		myProfileButton.click();
	}
}
